package com.lcide.course.patterns.structural.bridge;

/**
 * ConcreteImplementor. Implementación de Implementor
 * @author lcide
 *
 */
public class SecureCreditCard implements ICreditCard {

	@Override
	public void makePayment() {
		System.out.println("Pago realizado CON seguridad");
	}

}
