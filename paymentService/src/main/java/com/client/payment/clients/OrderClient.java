package com.client.payment.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "orderService")
public interface OrderClient {

	@RequestMapping("/orders/hello")
	public String sayHello();

}
