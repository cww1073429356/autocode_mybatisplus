package com.cc.config;

import com.cc.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: jinjinwen
 * @description: mvc 配置静态
 * @date: 2021-01-19 16:46
 **/
@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    /**
     * description:配置非static等静态资源
     *
     * @param
     * @return
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("MyWebMvcConfigurerAdapter.addResourceHandlers");
        registry.addResourceHandler("/a/**").addResourceLocations("classpath:/a/");
    }

    /**
     * description: 配置转发直接读取html
     *
     * @param
     * @return
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("login").setViewName("login.html");
    }

    /**
     * description:设置拦截器
     * addPathPatterns 需要拦截的
     * excludePathPatterns 被忽略的
     * @param registry
     * @return
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
