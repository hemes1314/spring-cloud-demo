package com.wubin.hello.service.impl;

import com.wubin.hello.service.IGirlService;
import org.springframework.stereotype.Service;

@Service
public class GirlServiceImpl implements IGirlService {

    @Override
    public String sayHello() {
        return "hello girl";
    }
}
