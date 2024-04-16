package com.lcide.course.patterns.behavioral.visitor;

/**
 * Elemento con una operación accept para un tipo de Visitor.
 * @author lcide
 *
 */
public class GasoilOffer implements ElementOffer{

	@Override
	public boolean accept(CreditCardVisitor visitor) {
		String theGasOffer = visitor.gasoilOffer(this);
		System.out.println(theGasOffer);
		return theGasOffer != null;
	}

}
