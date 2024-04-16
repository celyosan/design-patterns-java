package com.lcide.course.patterns.creational.abstractfactory;

public interface PaymentMethodAbstractProduct {

	PaymentMethodType getPaymentMethod();
	String doPayment ();
}
