package com.lzm.mybatisapi.factory;

import com.lzm.mybatisapi.MybatisRemoteApi;
import com.lzm.mybatisapi.fallback.MybatisRemoteApiFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author scott
 * @date 2020/05/22
 */
@Component
public class MybatisRemoteApiFallbackFactory implements FallbackFactory<MybatisRemoteApi> {

    @Override
    public MybatisRemoteApiFallbackImpl create(Throwable throwable) {
        MybatisRemoteApiFallbackImpl remoteUserServiceFallback = new MybatisRemoteApiFallbackImpl();
        remoteUserServiceFallback.setCause(throwable);
        return remoteUserServiceFallback;
    }


}
