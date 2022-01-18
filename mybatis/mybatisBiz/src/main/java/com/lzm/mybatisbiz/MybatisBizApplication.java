package com.lzm.mybatisbiz;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.lzm")
@EnableDiscoveryClient
@MapperScan(value = {"com.lzm.mybatisBiz.mapper"})
@EnableFeignClients
public class MybatisBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisBizApplication.class, args);
    }

}
