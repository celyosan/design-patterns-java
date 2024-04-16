package com.lcide.course.patterns.structural.decorator;

public class CreditDecorator implements CreditComponent {

	protected CreditComponent decoratedCredit;
		
	public CreditDecorator(CreditComponent decoratedCredit) {
		super();
		this.decoratedCredit = decoratedCredit;
	}
	
	@Override
	public void config() {
		decoratedCredit.config();
	}

	@Override
	public Integer getCredit() {
		return decoratedCredit.getCredit();
	}

}
