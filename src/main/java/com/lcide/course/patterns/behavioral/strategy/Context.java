package com.lcide.course.patterns.behavioral.strategy;

public class Context {
	private StrategyTextFormatter strategyTextFormatter;

	public Context(StrategyTextFormatter strategyTextFormatter) {
		super();
		this.strategyTextFormatter = strategyTextFormatter;
	}
	
	public String publishText(String text) {
		return this.strategyTextFormatter.format(text);
	}
}
