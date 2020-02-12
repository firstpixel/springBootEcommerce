package com.firstpixel.domain.enums;
	
public enum CustomerType {

	INDIVIDUAL(1, "Pessoa Física"),
	COMPANY(2, "Pessoa Jurídica");
	
	private int cod;
	private String description;
	
	private CustomerType(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod() {
		return this.cod;
	}
	public String getDescription() {
		return this.description;
	}
	
	public static CustomerType toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		for (CustomerType c: CustomerType.values()) {
			if (cod.equals(c.getCod())) {
				return c;
			}
		}
		throw new IllegalArgumentException("Invalid ID: "+ cod);
	}
	
}

