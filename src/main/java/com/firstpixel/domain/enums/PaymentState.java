package com.firstpixel.domain.enums;

public enum PaymentState {

	PENDING(1, "Pending"),
	PAYED(2, "Payed"),
	CANCELED(3, "Canceled");
	
	private int cod;
	private String description;
	
	private PaymentState(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod() {
		return this.cod;
	}
	public String getDescription() {
		return this.description;
	}
	
	public static PaymentState toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		for (PaymentState c: PaymentState.values()) {
			if (cod.equals(c.getCod())) {
				return c;
			}
		}
		throw new IllegalArgumentException("Invalid ID: "+ cod);
	}
}
