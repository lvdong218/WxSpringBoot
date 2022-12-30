package com.personnal.wxBackground.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personnal.wxBackground.entity.UserInformation;
import com.personnal.wxBackground.mapper.UserInformationMapper;
import com.personnal.wxBackground.service.UserInformationService;
import org.springframework.stereotype.Service;

/**
* @author IMQW
* @description 针对表【user_information(用户信息详情表)】的数据库操作Service实现
* @createDate 2022-12-28 18:07:53
*/
@Service
public class UserInformationServiceImpl extends ServiceImpl<UserInformationMapper, UserInformation>
    implements UserInformationService {

}




