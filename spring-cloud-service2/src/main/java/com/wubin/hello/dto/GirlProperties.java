package com.wubin.hello.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/5.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupSize;

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
