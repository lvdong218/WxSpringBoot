package com.personnal.wxBackground.mapper;

import com.personnal.wxBackground.entity.ExpertRatingSheet;
import com.personnal.wxBackground.vo.ExpertRatingSheetExcel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author IMQW
* @description 针对表【expert_rating_sheet(专家评分表)】的数据库操作Mapper
* @createDate 2022-12-28 10:41:34
* @Entity wxBackground.entity.ExpertRatingSheet
*/
public interface ExpertRatingSheetMapper extends BaseMapper<ExpertRatingSheet> {

    List<ExpertRatingSheetExcel> export();
}




