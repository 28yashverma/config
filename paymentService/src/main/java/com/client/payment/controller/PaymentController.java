package com.client.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.payment.clients.OrderClient;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private OrderClient orderClient;

	@GetMapping("/hello")
	public String getHello() {
		return orderClient.sayHello();
	}

}
