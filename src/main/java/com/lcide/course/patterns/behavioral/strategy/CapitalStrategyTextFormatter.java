package com.lcide.course.patterns.behavioral.strategy;

public class CapitalStrategyTextFormatter implements StrategyTextFormatter {

	@Override
	public String format(String txt) {
		String result = "Texto en mayusculas: " + txt.toUpperCase();
		System.out.println("Texto en mayusculas: " + txt.toUpperCase());
		return result;
	}

}
