package com.firstpixel.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.firstpixel.domain.enums.PaymentState;

@Entity
public class PaymentSlip extends Payment{
	private static final long serialVersionUID = 1L;
	
	private Date paymentDate;
	private Date paymentExpireDate;
	
	public PaymentSlip() {}

	public PaymentSlip(Integer id, PaymentState state, OrderData order, Date paymentDate, Date paymentExpireDate) {
		super(id, state, order);
		this.setPaymentDate(paymentDate);
		this.setPaymentExpireDate(paymentExpireDate);
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getPaymentExpireDate() {
		return paymentExpireDate;
	}

	public void setPaymentExpireDate(Date paymentExpireDate) {
		this.paymentExpireDate = paymentExpireDate;
	}
	
	
	
	
	
}
