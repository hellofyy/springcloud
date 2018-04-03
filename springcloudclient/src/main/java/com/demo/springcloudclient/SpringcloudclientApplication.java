package com.demo.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudclientApplication.class, args);
	}

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
	public String   home(String name){

 	    return "hi,"+name+",i am from port "+port;
    }


}
