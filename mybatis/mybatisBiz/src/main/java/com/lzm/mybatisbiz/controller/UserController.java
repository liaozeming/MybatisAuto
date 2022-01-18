package com.lzm.mybatisbiz.controller;



import com.lzm.common.vo.GlobalReturnCode;
import com.lzm.common.vo.Result;
import com.lzm.mybatisbiz.entity.User;
import com.lzm.mybatisbiz.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzm
 * @since 2022-01-11
 */
@RestController
@RequestMapping("/user")
@Validated
@Slf4j
@Api(value = "AppletController", tags = "客户端方小程序相关")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "test")
    @GetMapping("/test")
    public Result<String> test() {
        return Result.okk("GlobalReturnCode.SC_OK_200.toString()");
    }


    //查询用户
    @ApiOperation(value = "getUser")
    @GetMapping("/getUser")
    public Result<User> getUser(@RequestParam Long id) {
        User user = userService.getById(id);
        return Result.okk(user);
    }
}
