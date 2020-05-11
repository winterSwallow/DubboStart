package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.ApiService;

@Service
public class ProviderServiceImpl implements ApiService {

    @Override
    public String sayHello(String name) {
        return name +",Hello World!";
    }
}
