package com.lzm.mybatisAuto.service.impl;

import com.lzm.mybatisAuto.entity.User;
import com.lzm.mybatisAuto.mapper.UserMapper;
import com.lzm.mybatisAuto.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzm
 * @since 2022-01-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
