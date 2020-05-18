package com.client.delivery.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

	private Logger log = LoggerFactory.getLogger(DeliveryController.class);

	@GetMapping("/delivery")
	public String getDelivery() {
		log.info(Marker.ANY_NON_NULL_MARKER, "Initialising call to delivery service");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			log.error(Marker.ANY_MARKER, e.getLocalizedMessage());
		}
		
		return "Order Delivered";
	}

}
