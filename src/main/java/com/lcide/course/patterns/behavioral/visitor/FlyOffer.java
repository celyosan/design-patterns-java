package com.lcide.course.patterns.behavioral.visitor;

/**
 * Elemento con una operación accept para un tipo de Visitor.
 * @author lcide
 *
 */
public class FlyOffer implements ElementOffer{

	@Override
	public boolean accept(CreditCardVisitor visitor) {
		String theFlyOffer = visitor.flyOffer(this);
		System.out.println(theFlyOffer);
		return theFlyOffer != null;
	}

}
