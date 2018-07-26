package com.baidu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评分菜单和列表控制器
 */
@RestController
public class HelloWorldController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String showMenu(){
        return "hello_world";
    }


}
