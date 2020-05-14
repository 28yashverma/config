package com.client.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TABLE")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	private String orderNo;
	private String orderName;
	private String orderStatus;
	private String orderPlacedBy;
	private Boolean isOrderCancelled;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderPlacedBy() {
		return orderPlacedBy;
	}

	public void setOrderPlacedBy(String orderPlacedBy) {
		this.orderPlacedBy = orderPlacedBy;
	}

	public Boolean getIsOrderCancelled() {
		return isOrderCancelled;
	}

	public void setIsOrderCancelled(Boolean isOrderCancelled) {
		this.isOrderCancelled = isOrderCancelled;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNo=" + orderNo + ", orderStatus=" + orderStatus
				+ ", orderPlacedBy=" + orderPlacedBy + ", isOrderCancelled=" + isOrderCancelled + "]";
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

}
