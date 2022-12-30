package com.personnal.wxBackground.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 专家批次表
 * @TableName expert_batch
 */
@TableName(value ="expert_batch")
public class ExpertBatch implements Serializable {
    /**
     * 专家ID
     */
    @TableId
    private String expertId;

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
        ExpertBatch other = (ExpertBatch) that;
        return (this.getExpertId() == null ? other.getExpertId() == null : this.getExpertId().equals(other.getExpertId()))
            && (this.getBatch() == null ? other.getBatch() == null : this.getBatch().equals(other.getBatch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpertId() == null) ? 0 : getExpertId().hashCode());
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
        sb.append(", batch=").append(batch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}