package com.lcide.course.patterns.creational.abstractfactory;

public class VisaProduct implements CardAbstractProduct {

	@Override
	public CardType getCardType() {
		// TODO Auto-generated method stub
		return CardType.VISA;
	}

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return "111 11 11 11111111111";
	}

}
