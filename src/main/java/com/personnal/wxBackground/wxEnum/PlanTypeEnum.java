package com.personnal.wxBackground.wxEnum;

/**
 * 年度评审计划类型enum
 */
public enum PlanTypeEnum {
    UNKNOWN_PLAN("未知计划",0),REVIEW_TITLE_PLAN("职称评审计划",1),PROFESSIONAL_ITLE_RECOGNITION_PLAN("职称认定计划",2), EXPER_IDENTIFICATION_PLAN("专家认定计划",3);
    private String name;
    private Integer code;
    PlanTypeEnum(String name, Integer code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
