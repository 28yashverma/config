package com.client.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

	@GetMapping("/delivery")
	public String getDelivery() {
		return "Order Delivered";
	}

}
