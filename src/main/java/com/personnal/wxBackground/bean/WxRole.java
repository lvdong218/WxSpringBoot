package com.personnal.wxBackground.bean;

import java.io.Serializable;

import com.personnal.wxBackground.annotate.ValidDate;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 角色表
 * @TableName wx_role
 */
@Data
public class WxRole implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色code
     */
    @NotNull(message = "角色code不能为空")
    private String roleCode;

    /**
     * 角色父id
     */
    private Long parentId;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 子角色
     */
    private WxRole childRole;

    private static final long serialVersionUID = 1L;
}