package com.personnal.wxBackground.mapper;

import com.personnal.wxBackground.bean.WxRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 59394
* @description 针对表【wx_role(角色表)】的数据库操作Mapper
* @createDate 2022-04-10 10:26:52
* @Entity com.personnal.wxBackground.bean.WxRole
*/
@Mapper
public interface WxRoleMapper {
    WxRole queryAllById(Long id);
}




