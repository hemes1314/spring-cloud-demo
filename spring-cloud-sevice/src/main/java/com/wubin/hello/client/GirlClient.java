package com.wubin.hello.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "girl-service")
public interface GirlClient {

    @GetMapping("/hello")
    public String sayHello();
}
