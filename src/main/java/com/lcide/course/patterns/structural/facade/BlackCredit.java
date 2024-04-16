package com.lcide.course.patterns.structural.facade;

public class BlackCredit implements ICredit {
	
	private static final Integer CREDIT_LIMIT = 1000000;

	@Override
	public void showCredit() {
		System.out.println("Tiene un crédito de " + CREDIT_LIMIT);
	}

	@Override
	public Integer getCredit() {
		return CREDIT_LIMIT;
	}

}
