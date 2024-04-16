package com.lcide.course.patterns.creational.abstractfactory;

public class CreditProduct implements PaymentMethodAbstractProduct {

	@Override
	public String doPayment() {
		return "Pago a crédito";
	}

	@Override
	public PaymentMethodType getPaymentMethod() {
		return PaymentMethodType.CREDIT;
	}

}
