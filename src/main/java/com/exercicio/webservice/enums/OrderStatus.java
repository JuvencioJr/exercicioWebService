package com.exercicio.webservice.enums;

public enum OrderStatus{

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	

	private int cod;
	
	private OrderStatus(int cod) {
		this.cod=cod;
	}

	public int getCode() {
		return cod;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode()==code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid orderstatus code!");
	}
	
}
