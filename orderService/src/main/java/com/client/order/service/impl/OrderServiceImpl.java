package com.client.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.client.order.model.Order;
import com.client.order.repository.OrderRepo;
import com.client.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Override
	@Transactional
	public Order save(Order order) {
		return orderRepo.save(order);
	}

}
