package com.client.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.client.payment.clients.OrderClient;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private OrderClient orderClient;
	
	@Autowired
	private WebClient.Builder webClient;

	@GetMapping("/hello")
	public String getHello() {
		return orderClient.sayHello();
	}
	
	@GetMapping("/payment")
	public String getPayment() {
		
		String isProductDelivered = webClient.build()
		.get()
		.uri("http://localhost:8093/deliveries/delivery")
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		System.out.println(isProductDelivered);
		
		return "Payment is Received";
	}

}
