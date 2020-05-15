package com.wubin.hello.backend;

import com.wubin.hello.client.GirlClient;
import com.wubin.hello.dto.BoyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/3/5.
 */
@RestController
public class HelloController {

    @Autowired
    private Registration registration; // 服务注册

    @Autowired
    private DiscoveryClient client; // 服务发现客户端

    @Value("${girl.cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private BoyProperties boyProperties;

    @Autowired
    private GirlClient girlClient;

    @RequestMapping(value="/hello", method =RequestMethod.GET)
    public String say() {
//      return "Hello Spring Boot!";
        return "["+serviceInstance().getServiceId()+"]"+content
                +"---->"+girlClient.sayHello();
    }

    private ServiceInstance serviceInstance() {
        List<ServiceInstance> list = client.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            for(ServiceInstance itm : list){
                if(itm.getPort() == 8881)
                    return itm;
            }
        }
        return null;
    }
}
