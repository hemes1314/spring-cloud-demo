package com.wubin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//服务提供方
@EnableDiscoveryClient
@SpringBootApplication
public class CumputeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumputeServiceApplication.class, args);
	}
}
