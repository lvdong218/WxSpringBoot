package com.personnal.wxBackground.service.impl;

import com.personnal.wxBackground.bean.WxRole;
import com.personnal.wxBackground.mapper.WxRoleMapper;
import com.personnal.wxBackground.service.WxRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 59394
* @description 针对表【wx_role(角色表)】的数据库操作Service实现
* @createDate 2022-04-10 10:26:52
*/
@Service
public class WxRoleServiceImpl
    implements WxRoleService{

    @Autowired
    WxRoleMapper wxRoleMapper;
    @Override
    public List<WxRole> getRole(Long id) {
        List<WxRole> result = new ArrayList<WxRole>();
        WxRole wxRole=wxRoleMapper.queryAllById(id);
        result.add(wxRole);
        return result;
    }
}




