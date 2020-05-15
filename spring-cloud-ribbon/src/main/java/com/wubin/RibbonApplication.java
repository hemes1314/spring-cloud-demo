package com.wubin;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 将微服务注册到服务发现组件
// @EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonApplication {

	@Bean
	@LoadBalanced //注解开启均衡负载能力
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**负载策略
	 * @return
	 */
	@Bean
	public IRule myRule(){
		//return new RoundRobinRule();//轮询
		//return new RetryRule();//重试
		return new BestAvailableRule();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
}
