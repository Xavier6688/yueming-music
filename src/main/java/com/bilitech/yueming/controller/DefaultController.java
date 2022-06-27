package com.bilitech.yueming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huang Xianming
 * @date 2022-06-27-20:09
 */

@RequestMapping("/hello")
@RestController
public class DefaultController {

    @GetMapping
    public String sayHello(){
        return "Welcome to YuemingMusic!";
    }
}
