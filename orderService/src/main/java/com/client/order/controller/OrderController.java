package com.client.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.order.model.Order;
import com.client.order.repository.OrderRepo;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderRepo orderRepo;

	@GetMapping("/hello")
	public String sayHello() {
		return "Saying hello from order controller..";
	}

	@GetMapping("/createOrder")
	public ResponseEntity<Order> createOrder() {
		Order order = new Order();
		order.setOrderName("Burrito");
		order.setOrderNo("12");
		order.setOrderPlacedBy("Demo name");
		order.setOrderStatus("Placed");
		order.setIsOrderCancelled(false);

		orderRepo.save(order);

		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}

}
