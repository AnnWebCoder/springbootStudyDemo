package com.example.demo02.controller;

import com.example.demo02.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.wangh.springboot_security.model.Msg;

/**
 * @description:
 * @author: Ann
 * @date: 2018/7/1
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("标题", "内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }
}
