package com.wxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class CloudZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZipkinServerApplication.class, args);
	}
}
