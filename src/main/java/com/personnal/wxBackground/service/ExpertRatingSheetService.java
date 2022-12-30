package com.personnal.wxBackground.service;

import com.personnal.wxBackground.entity.ExpertRatingSheet;
import com.personnal.wxBackground.utils.ResultResponseUtils;
import com.personnal.wxBackground.vo.ExpertRatingSheetExcel;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
* @author IMQW
* @description 针对表【expert_rating_sheet(专家评分表)】的数据库操作Service
* @createDate 2022-12-28 10:41:34
*/
public interface ExpertRatingSheetService extends IService<ExpertRatingSheet> {

    List<ExpertRatingSheetExcel> export();

    ResultResponseUtils excute(MultipartFile file);

}
