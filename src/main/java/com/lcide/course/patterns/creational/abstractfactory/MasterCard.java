package com.lcide.course.patterns.creational.abstractfactory;

public class MasterCard implements CardAbstractProduct {

	@Override
	public CardType getCardType() {
		// TODO Auto-generated method stub
		return CardType.MASTER_CARD;
	}

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return "0000 00 00 00000000000";
	}

}
