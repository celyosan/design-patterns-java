package com.lcide.course.patterns.creational.abstractfactory;

public class FactoryProvider {
	
	private FactoryProvider () {}

	public static AbstractFactory<?> getFactory(FactoryType chooseFactory) {
		if (FactoryType.CARD == chooseFactory) {
			return new CardFactoryMethod();
		} else if (FactoryType.PAYMENT_METHOD == chooseFactory) {
			return new PaymentFactoryMethod();
		} else {
			throw new UnsupportedOperationException ("No hay  implementación");
		}
	}
}
