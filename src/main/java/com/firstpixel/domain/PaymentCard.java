package com.firstpixel.domain;

import javax.persistence.Entity;

import com.firstpixel.domain.enums.PaymentState;

@Entity
public class PaymentCard extends Payment{
	private static final long serialVersionUID = 1L;
	
	private Integer numberOfInstallments;
	
	public PaymentCard() {}

	public PaymentCard(Integer id, PaymentState state, CustomerOrder order, Integer numberOfInstallments) {
		super(id, state, order);
		
		this.setNumberOfInstallments(numberOfInstallments);
		
	}

	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Integer numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}

	
}
