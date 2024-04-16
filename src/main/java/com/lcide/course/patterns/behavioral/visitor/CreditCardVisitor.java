package com.lcide.course.patterns.behavioral.visitor;

/**
 * Clase visitor. Cambia una clase de ejecución Elemento
 * @author lcide
 *
 */
public interface CreditCardVisitor {

	/** Ejecucion para el elmento GasoilOffer */
	String gasoilOffer (GasoilOffer gasoilOffer);
	/** Ejecucion para el elmento FlyOffer */
	String flyOffer(FlyOffer flyOffer);
}
