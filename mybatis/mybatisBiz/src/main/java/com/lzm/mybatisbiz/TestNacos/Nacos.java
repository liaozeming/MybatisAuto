package com.lzm.mybatisbiz.TestNacos;

import com.lzm.common.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lzm
 * @create: 2022-01-18 00:46
 **/
@RestController
@RequestMapping("/nacos")
@Validated
@Slf4j
@Api(value = "Nacos", tags = "Nacos")
public class Nacos {

    @Value("${weixin.test}")
    private String test;

    @ApiOperation(value = "testNacos")
    @GetMapping("/testNacos")
    public Result<String> testNacos() {

        return Result.okk(test);
    }
}
