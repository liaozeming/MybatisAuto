package com.lzm.consumerdubbo.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.entity.UserAddress;
import dubbo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: lzm
 * @create: 2022-01-26 06:31
 **/
@Component
@RestController
@RequestMapping("/order")
public class OrderController {
    @Reference//引用远程提供者服务
    UserService userService;

    @GetMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam String userID) {
        //查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);

        System.out.println("当前接收到的userId=> "+userID);
        System.out.println("**********");
        System.out.println("查询到的所有地址为：");
        for (UserAddress userAddress : userAddressList) {
            //打印远程服务地址的信息
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }
}
