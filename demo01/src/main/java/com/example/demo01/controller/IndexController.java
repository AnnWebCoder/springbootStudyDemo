package com.example.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description: 前台页面路由控制
 * @author: Ann
 * @date: 2018/6/24
 */
@RestController
public class IndexController {
    /**
     * 配置thymeleaf
     *
     * @param mv
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView mv) {
        return mv;
    }

    /**
     * 配置thymeleaf
     *
     * @param mv
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(ModelAndView mv) {
        return mv;
    }
}
