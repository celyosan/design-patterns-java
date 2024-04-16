package com.lcide.course.patterns.creational.factorymethod;

/**
 * Objeto concreto
 * @author lcide
 *
 */
public class GooglePaymentConcreteProduct implements PaymentProduct {

	@Override
	public boolean doPayment() {
		System.out.println("Pagando con google payment");
		return true;
		
	}

}
