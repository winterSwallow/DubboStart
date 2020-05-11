package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.ApiService;
import com.dubbo.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private ApiService apiService;

    @Override
    public String sayHello(String name) {
        return apiService.sayHello(name);
    }
}
