package com.dubbo.consumer.controller;

import com.dubbo.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService productService;

    @RequestMapping("/hello")
    public String sayHello(String name){
        return productService.sayHello(name);
    }
}
