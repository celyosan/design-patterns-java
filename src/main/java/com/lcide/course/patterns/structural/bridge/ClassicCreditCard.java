package com.lcide.course.patterns.structural.bridge;

/** 
 * Refined Abstraction de Abstraction.
 * @author lcide
 *
 */
public class ClassicCreditCard extends CreditCard{
	
	public ClassicCreditCard(ICreditCard tarjeta) {
		super(tarjeta);		
	}

	// Función redefinida
	@Override
	public void makePayment() {
		tarjeta.makePayment();
	}

}
