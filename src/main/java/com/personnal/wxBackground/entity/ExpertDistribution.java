package com.personnal.wxBackground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 专家分配表
 * @TableName expert_distribution
 */
@TableName(value ="expert_distribution")
public class ExpertDistribution implements Serializable {
    /**
     * 专家ID
     */
    @TableId
    private String expertId;

    /**
     * 用户信息ID
     */
    @TableId
    private String userInfoId;

    /**
     * 批次（专家评审批次ID）
     */
    @TableId
    private String batch;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 专家ID
     */
    public String getExpertId() {
        return expertId;
    }

    /**
     * 专家ID
     */
    public void setExpertId(String expertId) {
        this.expertId = expertId;
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
     * 批次（专家评审批次ID）
     */
    public String getBatch() {
        return batch;
    }

    /**
     * 批次（专家评审批次ID）
     */
    public void setBatch(String batch) {
        this.batch = batch;
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
        ExpertDistribution other = (ExpertDistribution) that;
        return (this.getExpertId() == null ? other.getExpertId() == null : this.getExpertId().equals(other.getExpertId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getBatch() == null ? other.getBatch() == null : this.getBatch().equals(other.getBatch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpertId() == null) ? 0 : getExpertId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getBatch() == null) ? 0 : getBatch().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expertId=").append(expertId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", batch=").append(batch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}