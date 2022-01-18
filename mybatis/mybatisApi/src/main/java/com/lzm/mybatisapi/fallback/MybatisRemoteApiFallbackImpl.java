package com.lzm.mybatisapi.fallback;

import com.lzm.common.vo.Result;
import com.lzm.mybatisapi.MybatisRemoteApi;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author hejinwu
 */
@Slf4j
@Component
public class MybatisRemoteApiFallbackImpl implements MybatisRemoteApi {

    @Setter
    private Throwable cause;


    @Override
    public Result<String> test() {
        return Result.error("123");
    }
}
