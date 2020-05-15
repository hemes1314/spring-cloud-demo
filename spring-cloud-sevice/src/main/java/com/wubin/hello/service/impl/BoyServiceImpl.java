package com.wubin.hello.service.impl;

import com.wubin.hello.client.GirlClient;
import com.wubin.hello.service.IBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoyServiceImpl implements IBoyService {

    @Autowired
    private GirlClient girlService;

    @Override
    public String sayHello() {
        return girlService.sayHello();
    }
}
