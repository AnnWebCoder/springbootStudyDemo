package com.example.demo01.config;

import com.example.demo01.domain.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @description: SessionInterceptor拦截器配置类
 * @author: Ann
 * @date: 2018/6/30
 */
@Configuration
public class SessionConfiguration extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }
}
