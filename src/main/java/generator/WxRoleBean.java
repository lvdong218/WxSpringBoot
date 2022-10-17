package generator;

import java.io.Serializable;
import lombok.Data;

/**
 * wx_role
 * @author 
 */
@Data
public class WxRoleBean implements Serializable {
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
    private String roleCode;

    /**
     * 角色父id
     */
    private Long parentId;

    /**
     * 创建时间
     */
    private Long createTime;

    private static final long serialVersionUID = 1L;
}