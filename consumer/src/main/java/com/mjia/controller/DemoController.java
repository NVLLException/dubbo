package com.mjia.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mjia.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqjia
 * @date 2020/7/31 14:59
 * @Description
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    /** 之前是@Reference(version="1.0.0") 为什么无法注入，去掉(version="1.0.0")就好了*/
    @Reference
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public void sayHello() {
        demoService.sayHello();
    }
}
