package com.wubin.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/5.
 */
@RestController
public class HelloController {


    @RequestMapping(value="/hello", method =RequestMethod.GET)
    public String say() {
        return "Hello Spring Zuul!";
    }
}
