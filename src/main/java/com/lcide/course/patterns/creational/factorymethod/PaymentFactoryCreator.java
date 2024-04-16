package com.lcide.course.patterns.creational.factorymethod;

/**
 * con el método de fabricación, devolviendo un obj Product
 * @author lcide
 *
 */

public abstract class PaymentFactoryCreator {
	
	private PaymentFactoryCreator () {}
	
	public static PaymentProduct buildPayment(PaymentType type) {
		PaymentProduct payment;
		switch (type) {
			case GOOGLE_PAYMENT -> payment = new GooglePaymentConcreteProduct();
			case CARD -> payment = new CardPaymentConcreteProduct();
			default -> throw new UnsupportedOperationException("No se ha suministrado un método");
		}
		return payment;
	}

}
