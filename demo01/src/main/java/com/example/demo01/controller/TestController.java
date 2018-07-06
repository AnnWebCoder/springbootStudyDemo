package com.example.demo01.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/30
 */
@RestController
public class TestController {

    @RequestMapping(value = "/demoTest")
    public String demoTest(@RequestParam String test){
        return "进来了";
    }
}
