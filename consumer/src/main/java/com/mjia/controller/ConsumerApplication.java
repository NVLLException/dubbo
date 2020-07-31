package com.mjia.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @author mqjia
 * @date 2020/7/31 15:01
 * @Description
 */

@ServletComponentScan
@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class ConsumerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ConsumerApplication.class);
    }
}
