package com.mjia.serviceimpl;

import com.mjia.service.DemoService;

/**
 * @author mqjia
 * @date 2020/7/30 17:02
 * @Description
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.err.println("Say hello demo");
    }
}
