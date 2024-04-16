package com.lcide.course.patterns.behavioral.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor{

	@Override
	public String gasoilOffer(GasoilOffer gasoilOffer) {
		return "Descuento del 3% en Gasolina con tarjeta clasica";		
	}

	@Override
	public String flyOffer(FlyOffer flyOffer) {
		return "Descuento del 5% en Vuelos con tarjeta clasica";		
	}

}
