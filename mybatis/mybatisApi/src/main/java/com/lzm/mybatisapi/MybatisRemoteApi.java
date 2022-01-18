package com.lzm.mybatisapi;

import com.lzm.common.vo.Result;
import com.lzm.mybatisapi.factory.MybatisRemoteApiFallbackFactory;
import com.lzm.mybatisapi.fallback.MybatisRemoteApiFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(contextId = "MybatisRemoteApi", value = "MybatisBiz", fallback = MybatisRemoteApiFallbackImpl.class, fallbackFactory = MybatisRemoteApiFallbackFactory.class)
public interface MybatisRemoteApi {

    @GetMapping("/user/test")
    Result<String> test();
}
