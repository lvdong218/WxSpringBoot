package com.personnal.wxBackground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 专家库管理表
 * @TableName expert_management
 */
@TableName(value ="expert_management")
public class ExpertManagement implements Serializable {
    /**
     * id(专家库ID)
     */
    @TableId
    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 专家姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 民族
     */
    private String nation;

    /**
     * 身份证号
     */
    private String numId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 工作单位
     */
    private String employer;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 专业技术职称
     */
    private String technicalTitle;

    /**
     * 取得时间
     */
    private Date getTime;

    /**
     * 证书等级
     */
    private String highestTitle;

    /**
     * 工作部门
     */
    private String workDept;

    /**
     * 分支专业
     */
    private String branchMajor;

    /**
     * 专家图片
     */
    private String imgPath;

    /**
     * 学历
     */
    private String education;

    /**
     * 从事专业
     */
    private String engagedProfessional;

    /**
     * 现职务（岗位）
     */
    private String presentPost;

    /**
     * 银行账户
     */
    private String bankAccount;

    /**
     * 开户行
     */
    private String bankOfDeposit;

    /**
     * 开户行联行号
     */
    private String bankNumber;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 状态（0：启用，1：禁用）
     */
    private Integer status;

    /**
     * 审核状态（0：未提交，1：待审核，2：已通过，-1：已驳回）
     */
    private Integer auditStatus;

    /**
     * 驳回原因
     */
    private String rejection;

    /**
     * 参评次数
     */
    private String frequency;

    /**
     * 是否录入人脸（1：是，0：否）
     */
    private Integer facestatus;

    /**
     * 单位性质
     */
    private Integer ident;

    /**
     * 用户info id
     */
    private String userInfoId;

    /**
     * 用户对应计划id
     */
    private String planId;

    /**
     * 专家参评时间 yyyy-MM-dd 以,进行间隔
     */
    private String evaluationTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id(专家库ID)
     */
    public String getId() {
        return id;
    }

    /**
     * id(专家库ID)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 用户id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 专家姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 专家姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 身份证号
     */
    public String getNumId() {
        return numId;
    }

    /**
     * 身份证号
     */
    public void setNumId(String numId) {
        this.numId = numId;
    }

    /**
     * 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 工作单位
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * 工作单位
     */
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    /**
     * 出生年月
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生年月
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 专业技术职称
     */
    public String getTechnicalTitle() {
        return technicalTitle;
    }

    /**
     * 专业技术职称
     */
    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle;
    }

    /**
     * 取得时间
     */
    public Date getGetTime() {
        return getTime;
    }

    /**
     * 取得时间
     */
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    /**
     * 证书等级
     */
    public String getHighestTitle() {
        return highestTitle;
    }

    /**
     * 证书等级
     */
    public void setHighestTitle(String highestTitle) {
        this.highestTitle = highestTitle;
    }

    /**
     * 工作部门
     */
    public String getWorkDept() {
        return workDept;
    }

    /**
     * 工作部门
     */
    public void setWorkDept(String workDept) {
        this.workDept = workDept;
    }

    /**
     * 分支专业
     */
    public String getBranchMajor() {
        return branchMajor;
    }

    /**
     * 分支专业
     */
    public void setBranchMajor(String branchMajor) {
        this.branchMajor = branchMajor;
    }

    /**
     * 专家图片
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * 专家图片
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 从事专业
     */
    public String getEngagedProfessional() {
        return engagedProfessional;
    }

    /**
     * 从事专业
     */
    public void setEngagedProfessional(String engagedProfessional) {
        this.engagedProfessional = engagedProfessional;
    }

    /**
     * 现职务（岗位）
     */
    public String getPresentPost() {
        return presentPost;
    }

    /**
     * 现职务（岗位）
     */
    public void setPresentPost(String presentPost) {
        this.presentPost = presentPost;
    }

    /**
     * 银行账户
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 银行账户
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 开户行
     */
    public String getBankOfDeposit() {
        return bankOfDeposit;
    }

    /**
     * 开户行
     */
    public void setBankOfDeposit(String bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit;
    }

    /**
     * 开户行联行号
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * 开户行联行号
     */
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    /**
     * 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 状态（0：启用，1：禁用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0：启用，1：禁用）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 审核状态（0：未提交，1：待审核，2：已通过，-1：已驳回）
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态（0：未提交，1：待审核，2：已通过，-1：已驳回）
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 驳回原因
     */
    public String getRejection() {
        return rejection;
    }

    /**
     * 驳回原因
     */
    public void setRejection(String rejection) {
        this.rejection = rejection;
    }

    /**
     * 参评次数
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * 参评次数
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * 是否录入人脸（1：是，0：否）
     */
    public Integer getFacestatus() {
        return facestatus;
    }

    /**
     * 是否录入人脸（1：是，0：否）
     */
    public void setFacestatus(Integer facestatus) {
        this.facestatus = facestatus;
    }

    /**
     * 单位性质
     */
    public Integer getIdent() {
        return ident;
    }

    /**
     * 单位性质
     */
    public void setIdent(Integer ident) {
        this.ident = ident;
    }

    /**
     * 用户info id
     */
    public String getUserInfoId() {
        return userInfoId;
    }

    /**
     * 用户info id
     */
    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 用户对应计划id
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 用户对应计划id
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 专家参评时间 yyyy-MM-dd 以,进行间隔
     */
    public String getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * 专家参评时间 yyyy-MM-dd 以,进行间隔
     */
    public void setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ExpertManagement other = (ExpertManagement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getNumId() == null ? other.getNumId() == null : this.getNumId().equals(other.getNumId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmployer() == null ? other.getEmployer() == null : this.getEmployer().equals(other.getEmployer()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getTechnicalTitle() == null ? other.getTechnicalTitle() == null : this.getTechnicalTitle().equals(other.getTechnicalTitle()))
            && (this.getGetTime() == null ? other.getGetTime() == null : this.getGetTime().equals(other.getGetTime()))
            && (this.getHighestTitle() == null ? other.getHighestTitle() == null : this.getHighestTitle().equals(other.getHighestTitle()))
            && (this.getWorkDept() == null ? other.getWorkDept() == null : this.getWorkDept().equals(other.getWorkDept()))
            && (this.getBranchMajor() == null ? other.getBranchMajor() == null : this.getBranchMajor().equals(other.getBranchMajor()))
            && (this.getImgPath() == null ? other.getImgPath() == null : this.getImgPath().equals(other.getImgPath()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getEngagedProfessional() == null ? other.getEngagedProfessional() == null : this.getEngagedProfessional().equals(other.getEngagedProfessional()))
            && (this.getPresentPost() == null ? other.getPresentPost() == null : this.getPresentPost().equals(other.getPresentPost()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getBankOfDeposit() == null ? other.getBankOfDeposit() == null : this.getBankOfDeposit().equals(other.getBankOfDeposit()))
            && (this.getBankNumber() == null ? other.getBankNumber() == null : this.getBankNumber().equals(other.getBankNumber()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()))
            && (this.getRejection() == null ? other.getRejection() == null : this.getRejection().equals(other.getRejection()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getFacestatus() == null ? other.getFacestatus() == null : this.getFacestatus().equals(other.getFacestatus()))
            && (this.getIdent() == null ? other.getIdent() == null : this.getIdent().equals(other.getIdent()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getEvaluationTime() == null ? other.getEvaluationTime() == null : this.getEvaluationTime().equals(other.getEvaluationTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getNumId() == null) ? 0 : getNumId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmployer() == null) ? 0 : getEmployer().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getTechnicalTitle() == null) ? 0 : getTechnicalTitle().hashCode());
        result = prime * result + ((getGetTime() == null) ? 0 : getGetTime().hashCode());
        result = prime * result + ((getHighestTitle() == null) ? 0 : getHighestTitle().hashCode());
        result = prime * result + ((getWorkDept() == null) ? 0 : getWorkDept().hashCode());
        result = prime * result + ((getBranchMajor() == null) ? 0 : getBranchMajor().hashCode());
        result = prime * result + ((getImgPath() == null) ? 0 : getImgPath().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getEngagedProfessional() == null) ? 0 : getEngagedProfessional().hashCode());
        result = prime * result + ((getPresentPost() == null) ? 0 : getPresentPost().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getBankOfDeposit() == null) ? 0 : getBankOfDeposit().hashCode());
        result = prime * result + ((getBankNumber() == null) ? 0 : getBankNumber().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
        result = prime * result + ((getRejection() == null) ? 0 : getRejection().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getFacestatus() == null) ? 0 : getFacestatus().hashCode());
        result = prime * result + ((getIdent() == null) ? 0 : getIdent().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getEvaluationTime() == null) ? 0 : getEvaluationTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", nation=").append(nation);
        sb.append(", numId=").append(numId);
        sb.append(", mobile=").append(mobile);
        sb.append(", phone=").append(phone);
        sb.append(", employer=").append(employer);
        sb.append(", birthday=").append(birthday);
        sb.append(", technicalTitle=").append(technicalTitle);
        sb.append(", getTime=").append(getTime);
        sb.append(", highestTitle=").append(highestTitle);
        sb.append(", workDept=").append(workDept);
        sb.append(", branchMajor=").append(branchMajor);
        sb.append(", imgPath=").append(imgPath);
        sb.append(", education=").append(education);
        sb.append(", engagedProfessional=").append(engagedProfessional);
        sb.append(", presentPost=").append(presentPost);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", bankOfDeposit=").append(bankOfDeposit);
        sb.append(", bankNumber=").append(bankNumber);
        sb.append(", remarks=").append(remarks);
        sb.append(", status=").append(status);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", rejection=").append(rejection);
        sb.append(", frequency=").append(frequency);
        sb.append(", facestatus=").append(facestatus);
        sb.append(", ident=").append(ident);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", planId=").append(planId);
        sb.append(", evaluationTime=").append(evaluationTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}