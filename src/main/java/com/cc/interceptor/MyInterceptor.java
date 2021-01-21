package com.cc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: jinjinwen
 * @description: 拦截器
 * @date: 2021-01-19 17:15
 **/
public class MyInterceptor implements HandlerInterceptor {
    /**
    * description: 主要逻辑：在handler之前执⾏：抽取handler中的冗余代码
    * @return
    * @param 
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器preHandle");
        return true;
    }
    /**
    * description: 在handler之后执⾏:进⼀步的响应定制
    * @return
    * @param
    */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
