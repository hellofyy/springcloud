package com.demo.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaApplication.class, args);
	}
}
