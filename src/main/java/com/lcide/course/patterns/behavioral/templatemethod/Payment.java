package com.lcide.course.patterns.behavioral.templatemethod;

/**
 * Define la estructura del algoritmo, con un método del algoritmo y otros métodos a implementar por las subclases.
 * @author lcide
 *
 */
public abstract class Payment {
	
	abstract boolean initialize();
	abstract boolean startPayment();
	abstract boolean endPayment();
	
	public final boolean makePayment() {		
		return initialize() &&
				startPayment() &&
				endPayment();
	}

}
