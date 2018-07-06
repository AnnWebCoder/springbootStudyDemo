package com.example.demo01.domain;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 拦截器实体类
 * @author: Ann
 * @date: 2018/6/30
 */
public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Object sessionUser = request.getSession().getAttribute("_session_user");
        if (sessionUser == null) {
            return false;
        }
        return true;
    }
}
