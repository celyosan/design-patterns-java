package com.lcide.course.patterns.structural.facade;

public class CreditMarketFacade {

	private ICredit gold;
	private ICredit silver;
	private ICredit black;
	public CreditMarketFacade() {
		gold = new GoldCredit();
		silver = new SilverCredit();
		black = new BlackCredit();
	}
	
	// Centralizamos uso de interfaces a través de Facade.
	
	public void showGoldCredit() {
		this.gold.showCredit();
	}
	
	public void showSilverCredit() {
		this.silver.showCredit();
	}
	
	public void showBlackCredit () {
		this.black.showCredit();
	}
	
	public Integer getGoldCredit () {
		return this.gold.getCredit();
	}
	
	public Integer getBlackCredit () {
		return this.black.getCredit();
	}
	
	public Integer getSilverCredit () {
		return this.silver.getCredit();
	}
	
}
