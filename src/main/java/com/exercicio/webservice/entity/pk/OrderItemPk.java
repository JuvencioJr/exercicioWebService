package com.exercicio.webservice.entity.pk;

import java.io.Serializable;

import com.exercicio.webservice.entity.Order;
import com.exercicio.webservice.entity.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="Product_Id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="Order_Id")
	private Order order;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
