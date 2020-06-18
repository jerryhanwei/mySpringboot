package com.han.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new MySessionInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                "/gotoLoginPage",            //登录
                "/**/*.html",            //html静态资源
                "/**/*.js",              //js静态资源
                "/**/*.css",             //css静态资源
                "/",
                "/getLoginInfo"
        );
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("");
    }
}
