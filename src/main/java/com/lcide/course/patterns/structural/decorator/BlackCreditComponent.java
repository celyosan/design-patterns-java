package com.lcide.course.patterns.structural.decorator;

public class BlackCreditComponent implements CreditComponent {

	@Override
	public void config() {
		System.out.println("El crédito es de un millón");
	}

	@Override
	public Integer getCredit() {
		return 1000000;
	}
}
