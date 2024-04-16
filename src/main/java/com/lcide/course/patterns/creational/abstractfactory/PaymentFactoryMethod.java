package com.lcide.course.patterns.creational.abstractfactory;

/**
 * Factoria
 * @author lcide
 *
 */
public class PaymentFactoryMethod implements AbstractFactory<PaymentMethodAbstractProduct> {

	@Override
	public PaymentMethodAbstractProduct create(String type) {
		if (PaymentMethodType.DEBIT.name().equals(type)) {
			return new DebitProduct();
		} else if (PaymentMethodType.CREDIT.name().equals(type)) {
			return new CreditProduct();
		} else {
			throw new UnsupportedOperationException ("No hay  implementación");
		}
	}
	
}
