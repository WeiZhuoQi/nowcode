package com.nowcode.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @author 魏卓其
 * @create 2022-08-18 17:31
 */
@Configuration
public class TestConfig {
    @Bean
    //方法名就是bean的名
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    }
}
