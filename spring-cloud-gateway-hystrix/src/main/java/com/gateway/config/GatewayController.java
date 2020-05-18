package com.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
public class GatewayController {
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
		        .route(p -> p
		            .path("/get")
		            .filters(f -> f.addRequestHeader("Hello", "World").
		            		hystrix(c -> c.setName("HTTP Bin Service")))
		            .uri("http://httpbin.org:80"))
		        .route(p -> p
			            .path("/orders/hello")
			            .filters(f -> f.addRequestHeader("Hello", "World")
			            		.hystrix(c -> c.setName("orderService")))
			            .uri("http://localhost:8091"))
		        .route(p -> p
		                .host("*.hystrix.com")
		                .filters(f -> f.hystrix(config -> config.setName("mycmd")))
		                .uri("http://httpbin.org:80")).
		            build();
	}
	
}
