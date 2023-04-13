package com.o.order.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Order {
	@Id
	private String orderId;
	
	private String userId;
	private List<Cart> cart;
	private double total;
	private String orderStatus;
	private List<Address> address;

}
