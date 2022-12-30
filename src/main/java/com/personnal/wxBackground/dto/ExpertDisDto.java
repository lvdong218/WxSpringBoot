package com.personnal.wxBackground.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.io.Serializable;

@Data
public class ExpertDisDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Excel(name = "id")
    private String id;

    @Excel(name = "被审人身份证")
    private String idcardno;

    @Excel(name = "被审人名称")
    private Integer name;

    @Excel(name = "专家身份证")
    private String expertIdcard;

    @Excel(name = "专家名称")
    private String expertName;

    @Excel(name = "批次id")
    private String batchId;

    @Excel(name = "批次名称")
    private String batchStr;

}
