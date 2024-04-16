package com.lcide.course.patterns.structural.bridge;

/**
 * ConcreteImplementor. Implementación de implementor.
 * @author lcide
 *
 */
public class UnsecureCreditCard implements ICreditCard {

	@Override
	public void makePayment() {
		System.out.println("Pago realizado SIN seguridad");
	}

}
