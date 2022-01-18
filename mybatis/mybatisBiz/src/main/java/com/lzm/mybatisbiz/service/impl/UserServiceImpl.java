package com.lzm.mybatisbiz.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzm.mybatisbiz.entity.User;
import com.lzm.mybatisbiz.mapper.UserMapper;
import com.lzm.mybatisbiz.service.IUserService;
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
