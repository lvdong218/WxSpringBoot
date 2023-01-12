package com.personnal.wxBackground.service.impl;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personnal.wxBackground.dto.ExpertDisDto;
import com.personnal.wxBackground.entity.*;
import com.personnal.wxBackground.mapper.ExpertRatingSheetMapper;
import com.personnal.wxBackground.service.*;
import com.personnal.wxBackground.utils.ResultResponseUtils;
import com.personnal.wxBackground.vo.ExpertRatingSheetExcel;
import com.personnal.wxBackground.wxEnum.PlanTypeEnum;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
* @author IMQW
* @description 针对表【expert_rating_sheet(专家评分表)】的数据库操作Service实现
* @createDate 2022-12-28 10:41:34
*/
@Service
public class ExpertRatingSheetServiceImpl extends ServiceImpl<ExpertRatingSheetMapper, ExpertRatingSheet>
    implements ExpertRatingSheetService {

    @Resource
    ReviewPlanService reviewPlanService;

    @Resource
    ExpertRatingSheetMapper expertRatingSheetMapper;

    @Resource
    UserInformationService userInformationService;

    @Resource
    ExpertManagementService expertManagementService;

    @Resource
    ExpertDistributionService expertDistributionService;

    @Resource
    ExpertBatchService expertBatchService;

    @Override
    public List<ExpertRatingSheetExcel> export() {
        return expertRatingSheetMapper.export();
    }

    @Override
    public ResultResponseUtils excute(MultipartFile file){
        ImportParams importParams = new ImportParams();
        importParams.setHeadRows(2);
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(1);
        List<ExpertDisDto> list = null;
        try {
            list = ExcelImportUtil.importExcel(file.getInputStream(), ExpertDisDto.class, importParams);if (list == null || list.size() == 0) {
                return ResultResponseUtils.fail();
            }
            List<ReviewPlan> reviewPlans = reviewPlanService.list(
                new LambdaQueryWrapper<ReviewPlan>().eq(ReviewPlan::getStatus,1)
                    .eq(ReviewPlan::getPlanType, PlanTypeEnum.REVIEW_TITLE_PLAN.getCode())
            );
            if(reviewPlans==null || reviewPlans.size()==0){
                return ResultResponseUtils.fail();
            }
            ReviewPlan reviewPlan = reviewPlans.get(0);
            //新分配
            List<ExpertDisDto> newDis = list.stream().map(l->{
                if(StringUtils.isEmpty(l.getId())){
                    return l;
                }else{
                    return null;
                }
            }).filter(a->a!=null).collect(Collectors.toList());

            //获取用户信息
            List<String> idcards = newDis.stream().map(n->n.getIdcardno()).collect(Collectors.toList());
            Map<String,List<UserInformation>> us = userInformationService.list(new LambdaQueryWrapper<UserInformation>()
                .in(UserInformation::getIdcardno,idcards)
                .eq(UserInformation::getPlanId,reviewPlan.getId())
            ).stream().collect(Collectors.groupingBy(UserInformation::getIdcardno));

            //专家信息
            List<String> expertIdcards = newDis.stream().map(n->n.getExpertIdcard()).collect(Collectors.toList());
            Map<String,List<ExpertManagement>> ems = expertManagementService.list(new LambdaQueryWrapper<ExpertManagement>()
                .in(ExpertManagement::getNumId,expertIdcards)
            ).stream().collect(Collectors.groupingBy(ExpertManagement::getNumId));
            //遍历插入expert_batch
            Map<String, Set<String>> batchMap = new HashMap<String, Set<String>>();

            List<ExpertDistribution> distributions = new ArrayList<ExpertDistribution>();
            List<ExpertRatingSheet> expertRatingSheets = new ArrayList<ExpertRatingSheet>();
            //遍历生成对应数据
            newDis.forEach(n->{
                //生成需批量插入数据
                ExpertDistribution expertDistribution = new ExpertDistribution();
                ExpertManagement e = ems.get(n.getExpertIdcard()).get(0);
                UserInformation u = us.get(n.getIdcardno()).get(0);
                expertDistribution.setExpertId(e.getId());
                expertDistribution.setBatch(n.getBatchId());
                expertDistribution.setUserInfoId(u.getId());
                distributions.add(expertDistribution);
//                expertDistributionService.remove();
                ExpertRatingSheet expertRatingSheet = new ExpertRatingSheet();
                expertRatingSheet.setId(UUID.randomUUID().toString());
                expertRatingSheet.setExpertId(e.getUserid());
                expertRatingSheet.setCreateTime(new Date());
                expertRatingSheet.setStatus(1);
                expertRatingSheet.setUserInfoId(u.getId());
                expertRatingSheets.add(expertRatingSheet);
                if(batchMap.containsKey(e.getId())){
                    batchMap.get(e.getId()).add(n.getBatchId());
                }else{
                    Set<String> s = new HashSet<String>();
                    s.add(n.getBatchId());
                    batchMap.put(e.getId(),s);
                }
            });

            if(expertRatingSheets!=null && expertRatingSheets.size()>0){
                this.saveBatch(expertRatingSheets);
            }

            if(distributions!=null && distributions.size()>0){
                expertDistributionService.saveBatch(distributions);
            }

            //删除 并重新插入
            batchMap.entrySet().forEach(b->{
                expertBatchService.remove(new LambdaQueryWrapper<ExpertBatch>()
                .eq(ExpertBatch::getExpertId,b.getKey())
                .in(ExpertBatch::getBatch,b.getValue())
                );
                List<ExpertBatch> expertBatches = b.getValue().stream().map(v->{
                    ExpertBatch expertBatch = new ExpertBatch();
                    expertBatch.setBatch(v);
                    expertBatch.setExpertId(b.getKey());
                    return expertBatch;
                }).collect(Collectors.toList());
                expertBatchService.saveBatch(expertBatches);
            });

            //之前数据
            List<ExpertDisDto> oldDis = list.stream().map(l->{
                if(!StringUtils.isEmpty(l.getId())){
                    return l;
                }else{
                    return null;
                }
            }).filter(a->a!=null).collect(Collectors.toList());


            List<String> idcardOlds = oldDis.stream().map(n->n.getIdcardno()).collect(Collectors.toList());
            Map<String,List<UserInformation>> uOlds = userInformationService.list(new LambdaQueryWrapper<UserInformation>()
                    .in(UserInformation::getIdcardno,idcardOlds)
                    .eq(UserInformation::getPlanId,reviewPlan.getId())
            ).stream().collect(Collectors.groupingBy(UserInformation::getIdcardno));


            List<String> expertIdcardOlds = oldDis.stream().map(n->n.getExpertIdcard()).collect(Collectors.toList());
            Map<String,List<ExpertManagement>> emOlds = expertManagementService.list(new LambdaQueryWrapper<ExpertManagement>()
                    .in(ExpertManagement::getNumId,expertIdcardOlds)
            ).stream().collect(Collectors.groupingBy(ExpertManagement::getNumId));

            //遍历插入expert_batch
            Map<String, Set<String>> batchOldMap = new HashMap<String, Set<String>>();

            List<ExpertDistribution> distributionOlds = new ArrayList<ExpertDistribution>();
            List<ExpertRatingSheet> expertRatingSheetOlds = new ArrayList<ExpertRatingSheet>();
            //遍历生成对应数据
            oldDis.forEach(n->{
                //生成需批量插入数据
                ExpertDistribution expertDistribution = new ExpertDistribution();
                ExpertManagement e = emOlds.get(n.getExpertIdcard()).get(0);
                UserInformation u = uOlds.get(n.getIdcardno()).get(0);
                expertDistribution.setExpertId(e.getId());
                expertDistribution.setBatch(n.getBatchId());
                expertDistribution.setUserInfoId(u.getId());
                distributionOlds.add(expertDistribution);
//                expertDistributionService.remove();
                ExpertRatingSheet expertRatingSheet = new ExpertRatingSheet();
                expertRatingSheet.setId(n.getId());
                expertRatingSheet.setExpertId(e.getUserid());
                expertRatingSheet.setCreateTime(new Date());
                expertRatingSheet.setStatus(1);
                expertRatingSheet.setUserInfoId(u.getId());
                expertRatingSheetOlds.add(expertRatingSheet);
                if(batchOldMap.containsKey(e.getId())){
                    batchOldMap.get(e.getId()).add(n.getBatchId());
                }else{
                    Set<String> s = new HashSet<String>();
                    s.add(n.getBatchId());
                    batchOldMap.put(e.getId(),s);
                }
            });

            //删除 并重新插入
            batchOldMap.entrySet().forEach(b->{
                expertBatchService.remove(new LambdaQueryWrapper<ExpertBatch>()
                        .eq(ExpertBatch::getExpertId,b.getKey())
                        .in(ExpertBatch::getBatch,b.getValue())
                );
                List<ExpertBatch> expertBatches = b.getValue().stream().map(v->{
                    ExpertBatch expertBatch = new ExpertBatch();
                    expertBatch.setBatch(v);
                    expertBatch.setExpertId(b.getKey());
                    return expertBatch;
                }).collect(Collectors.toList());
                expertBatchService.saveBatch(expertBatches);
            });

            if(expertRatingSheets!=null && expertRatingSheets.size()>0){
                this.saveOrUpdateBatch(expertRatingSheets);
            }

            if(distributions!=null && distributions.size()>0){
                expertDistributionService.saveOrUpdateBatch(distributions);
            }

        } catch (Exception e) {
            log.error("上传文件错误{}",e);
        }

        return ResultResponseUtils.success();
    }
}




