package com.lcide.course.patterns.creational.abstractfactory;

/**
 * Factoria
 * @author lcide
 *
 */

public class CardFactoryMethod implements AbstractFactory<CardAbstractProduct> {

	@Override
	public CardAbstractProduct create(String type) {
		if (CardType.VISA.name().equals(type)) {
			return new VisaProduct();
		} else if (CardType.MASTER_CARD.name().equals(type)) {
			return new MasterCard();
		} else {
			throw new UnsupportedOperationException ("No hay  implementación");
		}
	}
	
}
