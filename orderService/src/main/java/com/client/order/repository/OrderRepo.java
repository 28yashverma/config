package com.client.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.order.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
