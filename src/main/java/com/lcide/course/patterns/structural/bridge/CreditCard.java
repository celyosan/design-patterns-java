package com.lcide.course.patterns.structural.bridge;

/** Abstraction del Bridge 
 * 
 */
public abstract class CreditCard {
	/** Implementor */
	protected ICreditCard tarjeta;

	protected CreditCard(ICreditCard tarjeta) {
		super();
		this.tarjeta = tarjeta;
	}
	
	public abstract void makePayment();

}
