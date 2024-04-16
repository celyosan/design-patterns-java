package com.lcide.course.patterns.creational.factorymethod;

public class CashPaymentConcreteProduct implements PaymentProduct {

	@Override
	public boolean doPayment() {
		System.out.println("Pagando al contado");
		return true;
		
	}

}
