package com.personnal.wxBackground.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 专家评分表
 * @TableName expert_rating_sheet
 */
@Data
public class ExpertRatingSheetExcel implements Serializable {

    /**
     * id
     */
    private String id;

    /**
     * 被审人身份证
     */
    private String idcardno;

    /**
     * 被审人名称
     */
    private String name;


    /**
     * 专家名称
     */
    private String expertIdcard;

    /**
     * 专家名称
     */
    private String expertName;

    /**
     * 批次id
     */
    private String batchId;

    /**
     * 批次名称
     */
    private String batchStr;

}