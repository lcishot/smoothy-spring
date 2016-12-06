package com.smoothy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/4.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello "+"now:"+new Date();
    }
}
