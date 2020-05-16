package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.client.config.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ribbon-app", configuration = RibbonConfiguration.class)
public class RibbonExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonExampleApplication.class, args);
	}

}
