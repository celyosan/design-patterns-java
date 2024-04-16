package com.lcide.course.patterns.behavioral.visitor;

public class BlackCreditCardVisitor implements CreditCardVisitor {

	@Override
	public String gasoilOffer(GasoilOffer gasoilOffer) {
		return "Descuento del 10% en Gasolina con tarjeta black";
	}

	@Override
	public String flyOffer(FlyOffer flyOffer) {
		return "Descuento del 25% en Vuelos con tarjeta black";		
	}

}
