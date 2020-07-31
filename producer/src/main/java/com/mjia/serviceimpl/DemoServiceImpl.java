package com.mjia.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjia.api.DemoService;

/**
 * @author mqjia
 * @date 2020/7/30 17:02
 * @Description
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.err.println("Say hello demo");
    }
}
