package com.example.demo01.controller;

import com.example.demo01.domain.ResultEntity;
import com.example.demo01.util.ResultUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/22
 */
@RestController
@CrossOrigin
public class UserController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResultEntity<String> test() {
        return ResultUtil.success("成功了");
    }

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

}
