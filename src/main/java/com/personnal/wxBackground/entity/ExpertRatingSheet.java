package com.personnal.wxBackground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 专家评分表
 * @TableName expert_rating_sheet
 */
@TableName(value ="expert_rating_sheet")
public class ExpertRatingSheet implements Serializable {
    /**
     * id
     */
    @TableId
    private String id;

    /**
     * 用户信息ID
     */
    private String userInfoId;

    /**
     * 专家ID（sys_user中的ID）
     */
    private String expertId;

    /**
     * 分值
     */
    private Double score;

    /**
     * 评分理由
     */
    private String reason;

    /**
     * 状态（1：已评分，0：未评分）
     */
    private Integer status;

    /**
     * 主要贡献分值
     */
    private Double mainScore;

    /**
     * 作品成果分值
     */
    private Double resultsScore;

    /**
     * 能力水平分值
     */
    private Double abilityScore;

    /**
     * 理论水平分值
     */
    private Double theoryScore;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * 用户信息ID
     */
    public String getUserInfoId() {
        return userInfoId;
    }

    /**
     * 用户信息ID
     */
    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 专家ID（sys_user中的ID）
     */
    public String getExpertId() {
        return expertId;
    }

    /**
     * 专家ID（sys_user中的ID）
     */
    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    /**
     * 分值
     */
    public Double getScore() {
        return score;
    }

    /**
     * 分值
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 评分理由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 评分理由
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 状态（1：已评分，0：未评分）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（1：已评分，0：未评分）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 主要贡献分值
     */
    public Double getMainScore() {
        return mainScore;
    }

    /**
     * 主要贡献分值
     */
    public void setMainScore(Double mainScore) {
        this.mainScore = mainScore;
    }

    /**
     * 作品成果分值
     */
    public Double getResultsScore() {
        return resultsScore;
    }

    /**
     * 作品成果分值
     */
    public void setResultsScore(Double resultsScore) {
        this.resultsScore = resultsScore;
    }

    /**
     * 能力水平分值
     */
    public Double getAbilityScore() {
        return abilityScore;
    }

    /**
     * 能力水平分值
     */
    public void setAbilityScore(Double abilityScore) {
        this.abilityScore = abilityScore;
    }

    /**
     * 理论水平分值
     */
    public Double getTheoryScore() {
        return theoryScore;
    }

    /**
     * 理论水平分值
     */
    public void setTheoryScore(Double theoryScore) {
        this.theoryScore = theoryScore;
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
        ExpertRatingSheet other = (ExpertRatingSheet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getExpertId() == null ? other.getExpertId() == null : this.getExpertId().equals(other.getExpertId()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMainScore() == null ? other.getMainScore() == null : this.getMainScore().equals(other.getMainScore()))
            && (this.getResultsScore() == null ? other.getResultsScore() == null : this.getResultsScore().equals(other.getResultsScore()))
            && (this.getAbilityScore() == null ? other.getAbilityScore() == null : this.getAbilityScore().equals(other.getAbilityScore()))
            && (this.getTheoryScore() == null ? other.getTheoryScore() == null : this.getTheoryScore().equals(other.getTheoryScore()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getExpertId() == null) ? 0 : getExpertId().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMainScore() == null) ? 0 : getMainScore().hashCode());
        result = prime * result + ((getResultsScore() == null) ? 0 : getResultsScore().hashCode());
        result = prime * result + ((getAbilityScore() == null) ? 0 : getAbilityScore().hashCode());
        result = prime * result + ((getTheoryScore() == null) ? 0 : getTheoryScore().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", expertId=").append(expertId);
        sb.append(", score=").append(score);
        sb.append(", reason=").append(reason);
        sb.append(", status=").append(status);
        sb.append(", mainScore=").append(mainScore);
        sb.append(", resultsScore=").append(resultsScore);
        sb.append(", abilityScore=").append(abilityScore);
        sb.append(", theoryScore=").append(theoryScore);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}