package com.personnal.wxBackground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息详情表
 * @TableName user_information
 */
@TableName(value ="user_information")
public class UserInformation implements Serializable {
    /**
     * id
     */
    @TableId
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户账号ID
     */
    private String userId;

    /**
     * 身份证号
     */
    private String idcardno;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 头像
     */
    private String photoPath;

    /**
     * 申报单位ID
     */
    private String deptId;

    /**
     * 申报级别
     */
    private String declarationLevel;

    /**
     * 申报专业ID
     */
    private String majorId;

    /**
     * 分支专业ID
     */
    private String majorBranchId;

    /**
     * 专业拟评资格ID
     */
    private String majorReviewId;

    /**
     * 类别ID
     */
    private String categoryId;

    /**
     * 方向ID
     */
    private String diretionId;

    /**
     * 申报方式
     */
    private String declarationMethod;

    /**
     * 评审计划ID
     */
    private String planId;

    /**
     * 用户信息提交时间
     */
    private Date submitTime;

    /**
     * 置顶（0：未置顶，1：已置顶）
     */
    private Integer isTop;

    /**
     * 状态（整体状态，-1：驳回，0：未提交，1：已提交
     */
    private Integer status;

    /**
     * 删除管理员id
     */
    private String delAdminId;

    /**
     * 是否可以禁用(0：不可删除，1：可删除)
     */
    private Integer dis;

    /**
     * 是否可以修改(0：不可删除，1：可删除)
     */
    private Integer edit;

    /**
     * 是否可以删除(0：不可删除，1：可删除)
     */
    private Integer del;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 初审状态（-2:退回，-1：驳回，0：待审核，1：通过,2:提交至复审）
     */
    private Integer initialReviewStatus;

    /**
     * 脱敏退回状态（0：未退回，1：退回）
     */
    private Integer desensitizationReturnState;

    /**
     * 脱敏状态（0：未脱敏，1：已脱敏）
     */
    private Integer desensitizationState;

    /**
     * 复审状态（-1：驳回，0：待通过，1：通过）
     */
    private Integer reviewStatus;

    /**
     * 破格状态（0：不破格，1：破格）
     */
    private Integer exceptionalState;

    /**
     * 专家评审状态（-2:退回，-1：驳回，0：待审核，1：通过）
     */
    private Integer expertReviewState;

    /**
     * 退回原因
     */
    private String reasonForReturn;

    /**
     * 驳回原因
     */
    private String reasonForRejection;

    /**
     * 初审合格判定状态(0：不合格，1：合格)
     */
    private Integer initialQualifiedStatus;

    /**
     * 初审不合格判定内容
     */
    private String initialQualifiedContent;

    /**
     * 复审合格判定状态（0：不合格，1：合格）
     */
    private Integer reviewQualifiedStatus;

    /**
     * 复审不合格判定内容
     */
    private String reviewQualifiedContent;

    /**
     * 破格确认状态
     */
    private Integer exceptionallyConfirmed;

    /**
     * 头像脱敏路径
     */
    private String desPhotoPath;

    /**
     * 转换状态，是否已将附件转换为图片 0未进行转换 1转换完成
     */
    private Integer transformStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 用户账号ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户账号ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 身份证号
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * 身份证号
     */
    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    /**
     * 手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 头像
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * 头像
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    /**
     * 申报单位ID
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 申报单位ID
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * 申报级别
     */
    public String getDeclarationLevel() {
        return declarationLevel;
    }

    /**
     * 申报级别
     */
    public void setDeclarationLevel(String declarationLevel) {
        this.declarationLevel = declarationLevel;
    }

    /**
     * 申报专业ID
     */
    public String getMajorId() {
        return majorId;
    }

    /**
     * 申报专业ID
     */
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    /**
     * 分支专业ID
     */
    public String getMajorBranchId() {
        return majorBranchId;
    }

    /**
     * 分支专业ID
     */
    public void setMajorBranchId(String majorBranchId) {
        this.majorBranchId = majorBranchId;
    }

    /**
     * 专业拟评资格ID
     */
    public String getMajorReviewId() {
        return majorReviewId;
    }

    /**
     * 专业拟评资格ID
     */
    public void setMajorReviewId(String majorReviewId) {
        this.majorReviewId = majorReviewId;
    }

    /**
     * 类别ID
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 类别ID
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 方向ID
     */
    public String getDiretionId() {
        return diretionId;
    }

    /**
     * 方向ID
     */
    public void setDiretionId(String diretionId) {
        this.diretionId = diretionId;
    }

    /**
     * 申报方式
     */
    public String getDeclarationMethod() {
        return declarationMethod;
    }

    /**
     * 申报方式
     */
    public void setDeclarationMethod(String declarationMethod) {
        this.declarationMethod = declarationMethod;
    }

    /**
     * 评审计划ID
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 评审计划ID
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 用户信息提交时间
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 用户信息提交时间
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 置顶（0：未置顶，1：已置顶）
     */
    public Integer getIsTop() {
        return isTop;
    }

    /**
     * 置顶（0：未置顶，1：已置顶）
     */
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    /**
     * 状态（整体状态，-1：驳回，0：未提交，1：已提交
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（整体状态，-1：驳回，0：未提交，1：已提交
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 删除管理员id
     */
    public String getDelAdminId() {
        return delAdminId;
    }

    /**
     * 删除管理员id
     */
    public void setDelAdminId(String delAdminId) {
        this.delAdminId = delAdminId;
    }

    /**
     * 是否可以禁用(0：不可删除，1：可删除)
     */
    public Integer getDis() {
        return dis;
    }

    /**
     * 是否可以禁用(0：不可删除，1：可删除)
     */
    public void setDis(Integer dis) {
        this.dis = dis;
    }

    /**
     * 是否可以修改(0：不可删除，1：可删除)
     */
    public Integer getEdit() {
        return edit;
    }

    /**
     * 是否可以修改(0：不可删除，1：可删除)
     */
    public void setEdit(Integer edit) {
        this.edit = edit;
    }

    /**
     * 是否可以删除(0：不可删除，1：可删除)
     */
    public Integer getDel() {
        return del;
    }

    /**
     * 是否可以删除(0：不可删除，1：可删除)
     */
    public void setDel(Integer del) {
        this.del = del;
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
     * 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 初审状态（-2:退回，-1：驳回，0：待审核，1：通过,2:提交至复审）
     */
    public Integer getInitialReviewStatus() {
        return initialReviewStatus;
    }

    /**
     * 初审状态（-2:退回，-1：驳回，0：待审核，1：通过,2:提交至复审）
     */
    public void setInitialReviewStatus(Integer initialReviewStatus) {
        this.initialReviewStatus = initialReviewStatus;
    }

    /**
     * 脱敏退回状态（0：未退回，1：退回）
     */
    public Integer getDesensitizationReturnState() {
        return desensitizationReturnState;
    }

    /**
     * 脱敏退回状态（0：未退回，1：退回）
     */
    public void setDesensitizationReturnState(Integer desensitizationReturnState) {
        this.desensitizationReturnState = desensitizationReturnState;
    }

    /**
     * 脱敏状态（0：未脱敏，1：已脱敏）
     */
    public Integer getDesensitizationState() {
        return desensitizationState;
    }

    /**
     * 脱敏状态（0：未脱敏，1：已脱敏）
     */
    public void setDesensitizationState(Integer desensitizationState) {
        this.desensitizationState = desensitizationState;
    }

    /**
     * 复审状态（-1：驳回，0：待通过，1：通过）
     */
    public Integer getReviewStatus() {
        return reviewStatus;
    }

    /**
     * 复审状态（-1：驳回，0：待通过，1：通过）
     */
    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * 破格状态（0：不破格，1：破格）
     */
    public Integer getExceptionalState() {
        return exceptionalState;
    }

    /**
     * 破格状态（0：不破格，1：破格）
     */
    public void setExceptionalState(Integer exceptionalState) {
        this.exceptionalState = exceptionalState;
    }

    /**
     * 专家评审状态（-2:退回，-1：驳回，0：待审核，1：通过）
     */
    public Integer getExpertReviewState() {
        return expertReviewState;
    }

    /**
     * 专家评审状态（-2:退回，-1：驳回，0：待审核，1：通过）
     */
    public void setExpertReviewState(Integer expertReviewState) {
        this.expertReviewState = expertReviewState;
    }

    /**
     * 退回原因
     */
    public String getReasonForReturn() {
        return reasonForReturn;
    }

    /**
     * 退回原因
     */
    public void setReasonForReturn(String reasonForReturn) {
        this.reasonForReturn = reasonForReturn;
    }

    /**
     * 驳回原因
     */
    public String getReasonForRejection() {
        return reasonForRejection;
    }

    /**
     * 驳回原因
     */
    public void setReasonForRejection(String reasonForRejection) {
        this.reasonForRejection = reasonForRejection;
    }

    /**
     * 初审合格判定状态(0：不合格，1：合格)
     */
    public Integer getInitialQualifiedStatus() {
        return initialQualifiedStatus;
    }

    /**
     * 初审合格判定状态(0：不合格，1：合格)
     */
    public void setInitialQualifiedStatus(Integer initialQualifiedStatus) {
        this.initialQualifiedStatus = initialQualifiedStatus;
    }

    /**
     * 初审不合格判定内容
     */
    public String getInitialQualifiedContent() {
        return initialQualifiedContent;
    }

    /**
     * 初审不合格判定内容
     */
    public void setInitialQualifiedContent(String initialQualifiedContent) {
        this.initialQualifiedContent = initialQualifiedContent;
    }

    /**
     * 复审合格判定状态（0：不合格，1：合格）
     */
    public Integer getReviewQualifiedStatus() {
        return reviewQualifiedStatus;
    }

    /**
     * 复审合格判定状态（0：不合格，1：合格）
     */
    public void setReviewQualifiedStatus(Integer reviewQualifiedStatus) {
        this.reviewQualifiedStatus = reviewQualifiedStatus;
    }

    /**
     * 复审不合格判定内容
     */
    public String getReviewQualifiedContent() {
        return reviewQualifiedContent;
    }

    /**
     * 复审不合格判定内容
     */
    public void setReviewQualifiedContent(String reviewQualifiedContent) {
        this.reviewQualifiedContent = reviewQualifiedContent;
    }

    /**
     * 破格确认状态
     */
    public Integer getExceptionallyConfirmed() {
        return exceptionallyConfirmed;
    }

    /**
     * 破格确认状态
     */
    public void setExceptionallyConfirmed(Integer exceptionallyConfirmed) {
        this.exceptionallyConfirmed = exceptionallyConfirmed;
    }

    /**
     * 头像脱敏路径
     */
    public String getDesPhotoPath() {
        return desPhotoPath;
    }

    /**
     * 头像脱敏路径
     */
    public void setDesPhotoPath(String desPhotoPath) {
        this.desPhotoPath = desPhotoPath;
    }

    /**
     * 转换状态，是否已将附件转换为图片 0未进行转换 1转换完成
     */
    public Integer getTransformStatus() {
        return transformStatus;
    }

    /**
     * 转换状态，是否已将附件转换为图片 0未进行转换 1转换完成
     */
    public void setTransformStatus(Integer transformStatus) {
        this.transformStatus = transformStatus;
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
        UserInformation other = (UserInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIdcardno() == null ? other.getIdcardno() == null : this.getIdcardno().equals(other.getIdcardno()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getPhotoPath() == null ? other.getPhotoPath() == null : this.getPhotoPath().equals(other.getPhotoPath()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeclarationLevel() == null ? other.getDeclarationLevel() == null : this.getDeclarationLevel().equals(other.getDeclarationLevel()))
            && (this.getMajorId() == null ? other.getMajorId() == null : this.getMajorId().equals(other.getMajorId()))
            && (this.getMajorBranchId() == null ? other.getMajorBranchId() == null : this.getMajorBranchId().equals(other.getMajorBranchId()))
            && (this.getMajorReviewId() == null ? other.getMajorReviewId() == null : this.getMajorReviewId().equals(other.getMajorReviewId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getDiretionId() == null ? other.getDiretionId() == null : this.getDiretionId().equals(other.getDiretionId()))
            && (this.getDeclarationMethod() == null ? other.getDeclarationMethod() == null : this.getDeclarationMethod().equals(other.getDeclarationMethod()))
            && (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getIsTop() == null ? other.getIsTop() == null : this.getIsTop().equals(other.getIsTop()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelAdminId() == null ? other.getDelAdminId() == null : this.getDelAdminId().equals(other.getDelAdminId()))
            && (this.getDis() == null ? other.getDis() == null : this.getDis().equals(other.getDis()))
            && (this.getEdit() == null ? other.getEdit() == null : this.getEdit().equals(other.getEdit()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getInitialReviewStatus() == null ? other.getInitialReviewStatus() == null : this.getInitialReviewStatus().equals(other.getInitialReviewStatus()))
            && (this.getDesensitizationReturnState() == null ? other.getDesensitizationReturnState() == null : this.getDesensitizationReturnState().equals(other.getDesensitizationReturnState()))
            && (this.getDesensitizationState() == null ? other.getDesensitizationState() == null : this.getDesensitizationState().equals(other.getDesensitizationState()))
            && (this.getReviewStatus() == null ? other.getReviewStatus() == null : this.getReviewStatus().equals(other.getReviewStatus()))
            && (this.getExceptionalState() == null ? other.getExceptionalState() == null : this.getExceptionalState().equals(other.getExceptionalState()))
            && (this.getExpertReviewState() == null ? other.getExpertReviewState() == null : this.getExpertReviewState().equals(other.getExpertReviewState()))
            && (this.getReasonForReturn() == null ? other.getReasonForReturn() == null : this.getReasonForReturn().equals(other.getReasonForReturn()))
            && (this.getReasonForRejection() == null ? other.getReasonForRejection() == null : this.getReasonForRejection().equals(other.getReasonForRejection()))
            && (this.getInitialQualifiedStatus() == null ? other.getInitialQualifiedStatus() == null : this.getInitialQualifiedStatus().equals(other.getInitialQualifiedStatus()))
            && (this.getInitialQualifiedContent() == null ? other.getInitialQualifiedContent() == null : this.getInitialQualifiedContent().equals(other.getInitialQualifiedContent()))
            && (this.getReviewQualifiedStatus() == null ? other.getReviewQualifiedStatus() == null : this.getReviewQualifiedStatus().equals(other.getReviewQualifiedStatus()))
            && (this.getReviewQualifiedContent() == null ? other.getReviewQualifiedContent() == null : this.getReviewQualifiedContent().equals(other.getReviewQualifiedContent()))
            && (this.getExceptionallyConfirmed() == null ? other.getExceptionallyConfirmed() == null : this.getExceptionallyConfirmed().equals(other.getExceptionallyConfirmed()))
            && (this.getDesPhotoPath() == null ? other.getDesPhotoPath() == null : this.getDesPhotoPath().equals(other.getDesPhotoPath()))
            && (this.getTransformStatus() == null ? other.getTransformStatus() == null : this.getTransformStatus().equals(other.getTransformStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIdcardno() == null) ? 0 : getIdcardno().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getPhotoPath() == null) ? 0 : getPhotoPath().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeclarationLevel() == null) ? 0 : getDeclarationLevel().hashCode());
        result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
        result = prime * result + ((getMajorBranchId() == null) ? 0 : getMajorBranchId().hashCode());
        result = prime * result + ((getMajorReviewId() == null) ? 0 : getMajorReviewId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getDiretionId() == null) ? 0 : getDiretionId().hashCode());
        result = prime * result + ((getDeclarationMethod() == null) ? 0 : getDeclarationMethod().hashCode());
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getIsTop() == null) ? 0 : getIsTop().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelAdminId() == null) ? 0 : getDelAdminId().hashCode());
        result = prime * result + ((getDis() == null) ? 0 : getDis().hashCode());
        result = prime * result + ((getEdit() == null) ? 0 : getEdit().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getInitialReviewStatus() == null) ? 0 : getInitialReviewStatus().hashCode());
        result = prime * result + ((getDesensitizationReturnState() == null) ? 0 : getDesensitizationReturnState().hashCode());
        result = prime * result + ((getDesensitizationState() == null) ? 0 : getDesensitizationState().hashCode());
        result = prime * result + ((getReviewStatus() == null) ? 0 : getReviewStatus().hashCode());
        result = prime * result + ((getExceptionalState() == null) ? 0 : getExceptionalState().hashCode());
        result = prime * result + ((getExpertReviewState() == null) ? 0 : getExpertReviewState().hashCode());
        result = prime * result + ((getReasonForReturn() == null) ? 0 : getReasonForReturn().hashCode());
        result = prime * result + ((getReasonForRejection() == null) ? 0 : getReasonForRejection().hashCode());
        result = prime * result + ((getInitialQualifiedStatus() == null) ? 0 : getInitialQualifiedStatus().hashCode());
        result = prime * result + ((getInitialQualifiedContent() == null) ? 0 : getInitialQualifiedContent().hashCode());
        result = prime * result + ((getReviewQualifiedStatus() == null) ? 0 : getReviewQualifiedStatus().hashCode());
        result = prime * result + ((getReviewQualifiedContent() == null) ? 0 : getReviewQualifiedContent().hashCode());
        result = prime * result + ((getExceptionallyConfirmed() == null) ? 0 : getExceptionallyConfirmed().hashCode());
        result = prime * result + ((getDesPhotoPath() == null) ? 0 : getDesPhotoPath().hashCode());
        result = prime * result + ((getTransformStatus() == null) ? 0 : getTransformStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", userId=").append(userId);
        sb.append(", idcardno=").append(idcardno);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", photoPath=").append(photoPath);
        sb.append(", deptId=").append(deptId);
        sb.append(", declarationLevel=").append(declarationLevel);
        sb.append(", majorId=").append(majorId);
        sb.append(", majorBranchId=").append(majorBranchId);
        sb.append(", majorReviewId=").append(majorReviewId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", diretionId=").append(diretionId);
        sb.append(", declarationMethod=").append(declarationMethod);
        sb.append(", planId=").append(planId);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", isTop=").append(isTop);
        sb.append(", status=").append(status);
        sb.append(", delAdminId=").append(delAdminId);
        sb.append(", dis=").append(dis);
        sb.append(", edit=").append(edit);
        sb.append(", del=").append(del);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", initialReviewStatus=").append(initialReviewStatus);
        sb.append(", desensitizationReturnState=").append(desensitizationReturnState);
        sb.append(", desensitizationState=").append(desensitizationState);
        sb.append(", reviewStatus=").append(reviewStatus);
        sb.append(", exceptionalState=").append(exceptionalState);
        sb.append(", expertReviewState=").append(expertReviewState);
        sb.append(", reasonForReturn=").append(reasonForReturn);
        sb.append(", reasonForRejection=").append(reasonForRejection);
        sb.append(", initialQualifiedStatus=").append(initialQualifiedStatus);
        sb.append(", initialQualifiedContent=").append(initialQualifiedContent);
        sb.append(", reviewQualifiedStatus=").append(reviewQualifiedStatus);
        sb.append(", reviewQualifiedContent=").append(reviewQualifiedContent);
        sb.append(", exceptionallyConfirmed=").append(exceptionallyConfirmed);
        sb.append(", desPhotoPath=").append(desPhotoPath);
        sb.append(", transformStatus=").append(transformStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}