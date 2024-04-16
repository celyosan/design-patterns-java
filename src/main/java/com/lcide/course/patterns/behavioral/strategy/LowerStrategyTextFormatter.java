package com.lcide.course.patterns.behavioral.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter{

	@Override
	public String format(String txt) {
		String result = "Texto en minusculas: " + txt.toLowerCase();
		System.out.println(result);
		return result;
	}

}
