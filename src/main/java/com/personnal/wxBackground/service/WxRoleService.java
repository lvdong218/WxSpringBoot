package com.personnal.wxBackground.service;

import com.personnal.wxBackground.bean.WxRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 59394
* @description 针对表【wx_role(角色表)】的数据库操作Service
* @createDate 2022-04-10 10:26:52
*/
public interface WxRoleService {
    /**
     *
     * @return
     */
    List<WxRole> getRole(Long id);
}
