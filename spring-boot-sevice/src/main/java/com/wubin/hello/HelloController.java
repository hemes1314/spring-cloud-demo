package com.wubin.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/5.
 */
@RestController
public class HelloController {

    @Value("${girl.cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value="/hello", method =RequestMethod.GET)
    public String say() {
//      return "Hello Spring Boot!";
    	return content+"@_@"+girlProperties.getCupSize()+"/"+girlProperties.getAge();
    }
}
