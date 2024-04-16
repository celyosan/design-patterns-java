package com.lcide.course.patterns.creational.factorymethod;

public class CardPaymentConcreteProduct implements PaymentProduct {

	@Override
	public boolean doPayment() {
		System.out.println("Pagando con tarjeta de crédito");
		return true;
		
	}

}
