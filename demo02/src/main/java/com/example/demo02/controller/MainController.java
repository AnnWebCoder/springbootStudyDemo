package com.example.demo02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Ann
 * @date: 2018/7/1
 */
@RestController
public class MainController {

    @RequestMapping("index")
    public String index(){
        return "进来了";
    }
}
