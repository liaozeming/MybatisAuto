package com.lzm.mybatisAuto;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@SpringBootApplication
@MapperScan(value = {"com.lzm.mybatisAuto.mapper"})
public class MybatisAutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisAutoApplication.class, args);
    }

}
