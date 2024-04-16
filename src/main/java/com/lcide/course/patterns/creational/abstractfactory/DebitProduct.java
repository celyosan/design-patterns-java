package com.lcide.course.patterns.creational.abstractfactory;

public class DebitProduct implements PaymentMethodAbstractProduct {	

	@Override
	public String doPayment() {
		return "Pago a débito";
	}

	@Override
	public PaymentMethodType getPaymentMethod() {
		return PaymentMethodType.DEBIT;
	}

}
