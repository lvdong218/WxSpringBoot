package com.personnal.wxBackground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 评审计划表
 * @TableName review_plan
 */
@TableName(value ="review_plan")
public class ReviewPlan implements Serializable {
    /**
     * id(计划评审ID)
     */
    @TableId
    private String id;

    /**
     * 计划名称名称
     */
    private String name;

    /**
     * 年度
     */
    private String year;

    /**
     * 个人报名开始时间
     */
    private Date personStartTime;

    /**
     * 个人报名结束时间
     */
    private Date personEndTime;

    /**
     * 退回修改开始时间
     */
    private Date editStartTime;

    /**
     * 退回修改结束时间
     */
    private Date editEndTime;

    /**
     * 单位初审开始时间
     */
    private Date orgStartTime;

    /**
     * 单位初审结束时间
     */
    private Date orgEndTime;

    /**
     * 在线交费开始时间
     */
    private Date payStartTime;

    /**
     * 在线交费结束时间
     */
    private Date payEndTime;

    /**
     * 资格复审开始时间
     */
    private Date qualificationStartTime;

    /**
     * 资格复审结束时间
     */
    private Date qualificationEndTime;

    /**
     * 发布人ID
     */
    private String authorId;

    /**
     * 状态（0：关闭计划，1：开启计划，-1 计划关闭 ）
     */
    private Integer status;

    /**
     * 进度状态
     */
    private Integer scheduleStatus;

    /**
     * 助理级分数线
     */
    private Double assistantScoreLine;

    /**
     * 助理级分数线（系统外）
     */
    private Double assistantScoreLineOutside;

    /**
     * 中级分数线
     */
    private Double intermediateScoreLine;

    /**
     * 中级分数线（系统外）
     */
    private Double intermediateScoreLineOutside;

    /**
     * 高级或副高级分数线
     */
    private Double advancedScoreLine;

    /**
     * 高级或副高级分数线（系统外）
     */
    private Double advancedScoreLineOutside;

    /**
     * 删除管理员id
     */
    private String delAdminId;

    /**
     * 是否可以禁用(11:成绩公示、12:已结束))
     */
    private Integer dis;

    /**
     * 是否可以修改(0：不可修改，1：可修改)
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
     * 计划类型 1-职称评审计划 2-职称认定计划 3-专家认定计划
     */
    private Integer planType;

    /**
     * 开启单位权限 1为开启 0为 未开启
     */
    private Integer unitPermissionStatus;

    /**
     * 员级分数线
     */
    private Double memberScoreLine;

    /**
     * 员级分数线（系统外）
     */
    private Double memberScoreLineOutside;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id(计划评审ID)
     */
    public String getId() {
        return id;
    }

    /**
     * id(计划评审ID)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 计划名称名称
     */
    public String getName() {
        return name;
    }

    /**
     * 计划名称名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 年度
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 个人报名开始时间
     */
    public Date getPersonStartTime() {
        return personStartTime;
    }

    /**
     * 个人报名开始时间
     */
    public void setPersonStartTime(Date personStartTime) {
        this.personStartTime = personStartTime;
    }

    /**
     * 个人报名结束时间
     */
    public Date getPersonEndTime() {
        return personEndTime;
    }

    /**
     * 个人报名结束时间
     */
    public void setPersonEndTime(Date personEndTime) {
        this.personEndTime = personEndTime;
    }

    /**
     * 退回修改开始时间
     */
    public Date getEditStartTime() {
        return editStartTime;
    }

    /**
     * 退回修改开始时间
     */
    public void setEditStartTime(Date editStartTime) {
        this.editStartTime = editStartTime;
    }

    /**
     * 退回修改结束时间
     */
    public Date getEditEndTime() {
        return editEndTime;
    }

    /**
     * 退回修改结束时间
     */
    public void setEditEndTime(Date editEndTime) {
        this.editEndTime = editEndTime;
    }

    /**
     * 单位初审开始时间
     */
    public Date getOrgStartTime() {
        return orgStartTime;
    }

    /**
     * 单位初审开始时间
     */
    public void setOrgStartTime(Date orgStartTime) {
        this.orgStartTime = orgStartTime;
    }

    /**
     * 单位初审结束时间
     */
    public Date getOrgEndTime() {
        return orgEndTime;
    }

    /**
     * 单位初审结束时间
     */
    public void setOrgEndTime(Date orgEndTime) {
        this.orgEndTime = orgEndTime;
    }

    /**
     * 在线交费开始时间
     */
    public Date getPayStartTime() {
        return payStartTime;
    }

    /**
     * 在线交费开始时间
     */
    public void setPayStartTime(Date payStartTime) {
        this.payStartTime = payStartTime;
    }

    /**
     * 在线交费结束时间
     */
    public Date getPayEndTime() {
        return payEndTime;
    }

    /**
     * 在线交费结束时间
     */
    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    /**
     * 资格复审开始时间
     */
    public Date getQualificationStartTime() {
        return qualificationStartTime;
    }

    /**
     * 资格复审开始时间
     */
    public void setQualificationStartTime(Date qualificationStartTime) {
        this.qualificationStartTime = qualificationStartTime;
    }

    /**
     * 资格复审结束时间
     */
    public Date getQualificationEndTime() {
        return qualificationEndTime;
    }

    /**
     * 资格复审结束时间
     */
    public void setQualificationEndTime(Date qualificationEndTime) {
        this.qualificationEndTime = qualificationEndTime;
    }

    /**
     * 发布人ID
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * 发布人ID
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    /**
     * 状态（0：关闭计划，1：开启计划，-1 计划关闭 ）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0：关闭计划，1：开启计划，-1 计划关闭 ）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 进度状态
     */
    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    /**
     * 进度状态
     */
    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    /**
     * 助理级分数线
     */
    public Double getAssistantScoreLine() {
        return assistantScoreLine;
    }

    /**
     * 助理级分数线
     */
    public void setAssistantScoreLine(Double assistantScoreLine) {
        this.assistantScoreLine = assistantScoreLine;
    }

    /**
     * 助理级分数线（系统外）
     */
    public Double getAssistantScoreLineOutside() {
        return assistantScoreLineOutside;
    }

    /**
     * 助理级分数线（系统外）
     */
    public void setAssistantScoreLineOutside(Double assistantScoreLineOutside) {
        this.assistantScoreLineOutside = assistantScoreLineOutside;
    }

    /**
     * 中级分数线
     */
    public Double getIntermediateScoreLine() {
        return intermediateScoreLine;
    }

    /**
     * 中级分数线
     */
    public void setIntermediateScoreLine(Double intermediateScoreLine) {
        this.intermediateScoreLine = intermediateScoreLine;
    }

    /**
     * 中级分数线（系统外）
     */
    public Double getIntermediateScoreLineOutside() {
        return intermediateScoreLineOutside;
    }

    /**
     * 中级分数线（系统外）
     */
    public void setIntermediateScoreLineOutside(Double intermediateScoreLineOutside) {
        this.intermediateScoreLineOutside = intermediateScoreLineOutside;
    }

    /**
     * 高级或副高级分数线
     */
    public Double getAdvancedScoreLine() {
        return advancedScoreLine;
    }

    /**
     * 高级或副高级分数线
     */
    public void setAdvancedScoreLine(Double advancedScoreLine) {
        this.advancedScoreLine = advancedScoreLine;
    }

    /**
     * 高级或副高级分数线（系统外）
     */
    public Double getAdvancedScoreLineOutside() {
        return advancedScoreLineOutside;
    }

    /**
     * 高级或副高级分数线（系统外）
     */
    public void setAdvancedScoreLineOutside(Double advancedScoreLineOutside) {
        this.advancedScoreLineOutside = advancedScoreLineOutside;
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
     * 是否可以禁用(11:成绩公示、12:已结束))
     */
    public Integer getDis() {
        return dis;
    }

    /**
     * 是否可以禁用(11:成绩公示、12:已结束))
     */
    public void setDis(Integer dis) {
        this.dis = dis;
    }

    /**
     * 是否可以修改(0：不可修改，1：可修改)
     */
    public Integer getEdit() {
        return edit;
    }

    /**
     * 是否可以修改(0：不可修改，1：可修改)
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
     * 计划类型 1-职称评审计划 2-职称认定计划 3-专家认定计划
     */
    public Integer getPlanType() {
        return planType;
    }

    /**
     * 计划类型 1-职称评审计划 2-职称认定计划 3-专家认定计划
     */
    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    /**
     * 开启单位权限 1为开启 0为 未开启
     */
    public Integer getUnitPermissionStatus() {
        return unitPermissionStatus;
    }

    /**
     * 开启单位权限 1为开启 0为 未开启
     */
    public void setUnitPermissionStatus(Integer unitPermissionStatus) {
        this.unitPermissionStatus = unitPermissionStatus;
    }

    /**
     * 员级分数线
     */
    public Double getMemberScoreLine() {
        return memberScoreLine;
    }

    /**
     * 员级分数线
     */
    public void setMemberScoreLine(Double memberScoreLine) {
        this.memberScoreLine = memberScoreLine;
    }

    /**
     * 员级分数线（系统外）
     */
    public Double getMemberScoreLineOutside() {
        return memberScoreLineOutside;
    }

    /**
     * 员级分数线（系统外）
     */
    public void setMemberScoreLineOutside(Double memberScoreLineOutside) {
        this.memberScoreLineOutside = memberScoreLineOutside;
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
        ReviewPlan other = (ReviewPlan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getPersonStartTime() == null ? other.getPersonStartTime() == null : this.getPersonStartTime().equals(other.getPersonStartTime()))
            && (this.getPersonEndTime() == null ? other.getPersonEndTime() == null : this.getPersonEndTime().equals(other.getPersonEndTime()))
            && (this.getEditStartTime() == null ? other.getEditStartTime() == null : this.getEditStartTime().equals(other.getEditStartTime()))
            && (this.getEditEndTime() == null ? other.getEditEndTime() == null : this.getEditEndTime().equals(other.getEditEndTime()))
            && (this.getOrgStartTime() == null ? other.getOrgStartTime() == null : this.getOrgStartTime().equals(other.getOrgStartTime()))
            && (this.getOrgEndTime() == null ? other.getOrgEndTime() == null : this.getOrgEndTime().equals(other.getOrgEndTime()))
            && (this.getPayStartTime() == null ? other.getPayStartTime() == null : this.getPayStartTime().equals(other.getPayStartTime()))
            && (this.getPayEndTime() == null ? other.getPayEndTime() == null : this.getPayEndTime().equals(other.getPayEndTime()))
            && (this.getQualificationStartTime() == null ? other.getQualificationStartTime() == null : this.getQualificationStartTime().equals(other.getQualificationStartTime()))
            && (this.getQualificationEndTime() == null ? other.getQualificationEndTime() == null : this.getQualificationEndTime().equals(other.getQualificationEndTime()))
            && (this.getAuthorId() == null ? other.getAuthorId() == null : this.getAuthorId().equals(other.getAuthorId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getScheduleStatus() == null ? other.getScheduleStatus() == null : this.getScheduleStatus().equals(other.getScheduleStatus()))
            && (this.getAssistantScoreLine() == null ? other.getAssistantScoreLine() == null : this.getAssistantScoreLine().equals(other.getAssistantScoreLine()))
            && (this.getAssistantScoreLineOutside() == null ? other.getAssistantScoreLineOutside() == null : this.getAssistantScoreLineOutside().equals(other.getAssistantScoreLineOutside()))
            && (this.getIntermediateScoreLine() == null ? other.getIntermediateScoreLine() == null : this.getIntermediateScoreLine().equals(other.getIntermediateScoreLine()))
            && (this.getIntermediateScoreLineOutside() == null ? other.getIntermediateScoreLineOutside() == null : this.getIntermediateScoreLineOutside().equals(other.getIntermediateScoreLineOutside()))
            && (this.getAdvancedScoreLine() == null ? other.getAdvancedScoreLine() == null : this.getAdvancedScoreLine().equals(other.getAdvancedScoreLine()))
            && (this.getAdvancedScoreLineOutside() == null ? other.getAdvancedScoreLineOutside() == null : this.getAdvancedScoreLineOutside().equals(other.getAdvancedScoreLineOutside()))
            && (this.getDelAdminId() == null ? other.getDelAdminId() == null : this.getDelAdminId().equals(other.getDelAdminId()))
            && (this.getDis() == null ? other.getDis() == null : this.getDis().equals(other.getDis()))
            && (this.getEdit() == null ? other.getEdit() == null : this.getEdit().equals(other.getEdit()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPlanType() == null ? other.getPlanType() == null : this.getPlanType().equals(other.getPlanType()))
            && (this.getUnitPermissionStatus() == null ? other.getUnitPermissionStatus() == null : this.getUnitPermissionStatus().equals(other.getUnitPermissionStatus()))
            && (this.getMemberScoreLine() == null ? other.getMemberScoreLine() == null : this.getMemberScoreLine().equals(other.getMemberScoreLine()))
            && (this.getMemberScoreLineOutside() == null ? other.getMemberScoreLineOutside() == null : this.getMemberScoreLineOutside().equals(other.getMemberScoreLineOutside()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getPersonStartTime() == null) ? 0 : getPersonStartTime().hashCode());
        result = prime * result + ((getPersonEndTime() == null) ? 0 : getPersonEndTime().hashCode());
        result = prime * result + ((getEditStartTime() == null) ? 0 : getEditStartTime().hashCode());
        result = prime * result + ((getEditEndTime() == null) ? 0 : getEditEndTime().hashCode());
        result = prime * result + ((getOrgStartTime() == null) ? 0 : getOrgStartTime().hashCode());
        result = prime * result + ((getOrgEndTime() == null) ? 0 : getOrgEndTime().hashCode());
        result = prime * result + ((getPayStartTime() == null) ? 0 : getPayStartTime().hashCode());
        result = prime * result + ((getPayEndTime() == null) ? 0 : getPayEndTime().hashCode());
        result = prime * result + ((getQualificationStartTime() == null) ? 0 : getQualificationStartTime().hashCode());
        result = prime * result + ((getQualificationEndTime() == null) ? 0 : getQualificationEndTime().hashCode());
        result = prime * result + ((getAuthorId() == null) ? 0 : getAuthorId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getScheduleStatus() == null) ? 0 : getScheduleStatus().hashCode());
        result = prime * result + ((getAssistantScoreLine() == null) ? 0 : getAssistantScoreLine().hashCode());
        result = prime * result + ((getAssistantScoreLineOutside() == null) ? 0 : getAssistantScoreLineOutside().hashCode());
        result = prime * result + ((getIntermediateScoreLine() == null) ? 0 : getIntermediateScoreLine().hashCode());
        result = prime * result + ((getIntermediateScoreLineOutside() == null) ? 0 : getIntermediateScoreLineOutside().hashCode());
        result = prime * result + ((getAdvancedScoreLine() == null) ? 0 : getAdvancedScoreLine().hashCode());
        result = prime * result + ((getAdvancedScoreLineOutside() == null) ? 0 : getAdvancedScoreLineOutside().hashCode());
        result = prime * result + ((getDelAdminId() == null) ? 0 : getDelAdminId().hashCode());
        result = prime * result + ((getDis() == null) ? 0 : getDis().hashCode());
        result = prime * result + ((getEdit() == null) ? 0 : getEdit().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        result = prime * result + ((getUnitPermissionStatus() == null) ? 0 : getUnitPermissionStatus().hashCode());
        result = prime * result + ((getMemberScoreLine() == null) ? 0 : getMemberScoreLine().hashCode());
        result = prime * result + ((getMemberScoreLineOutside() == null) ? 0 : getMemberScoreLineOutside().hashCode());
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
        sb.append(", year=").append(year);
        sb.append(", personStartTime=").append(personStartTime);
        sb.append(", personEndTime=").append(personEndTime);
        sb.append(", editStartTime=").append(editStartTime);
        sb.append(", editEndTime=").append(editEndTime);
        sb.append(", orgStartTime=").append(orgStartTime);
        sb.append(", orgEndTime=").append(orgEndTime);
        sb.append(", payStartTime=").append(payStartTime);
        sb.append(", payEndTime=").append(payEndTime);
        sb.append(", qualificationStartTime=").append(qualificationStartTime);
        sb.append(", qualificationEndTime=").append(qualificationEndTime);
        sb.append(", authorId=").append(authorId);
        sb.append(", status=").append(status);
        sb.append(", scheduleStatus=").append(scheduleStatus);
        sb.append(", assistantScoreLine=").append(assistantScoreLine);
        sb.append(", assistantScoreLineOutside=").append(assistantScoreLineOutside);
        sb.append(", intermediateScoreLine=").append(intermediateScoreLine);
        sb.append(", intermediateScoreLineOutside=").append(intermediateScoreLineOutside);
        sb.append(", advancedScoreLine=").append(advancedScoreLine);
        sb.append(", advancedScoreLineOutside=").append(advancedScoreLineOutside);
        sb.append(", delAdminId=").append(delAdminId);
        sb.append(", dis=").append(dis);
        sb.append(", edit=").append(edit);
        sb.append(", del=").append(del);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", planType=").append(planType);
        sb.append(", unitPermissionStatus=").append(unitPermissionStatus);
        sb.append(", memberScoreLine=").append(memberScoreLine);
        sb.append(", memberScoreLineOutside=").append(memberScoreLineOutside);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}