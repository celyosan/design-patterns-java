package com.lcide.course.patterns.structural.decorator;

public class GoldCreditComponent implements CreditComponent {

	@Override
	public void config() {
		System.out.println("El crédito es de un 500k");

	}

	@Override
	public Integer getCredit() {
		return 500000;
	}

}
