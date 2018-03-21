package com.wxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerAApplication.class, args);
	}
}
