package com.lcide.course.patterns.structural.adapter;

/**
 * Adaptador: Adapta interfaz Secure con el uso de la interfaz Payment
 * @author lcide
 *
 */
public class Adapter implements Payment{
	
	private Secure secureCreditCard;	

	public Adapter(LevelType type) {
		super();
		if (LevelType.BLACK.equals(type)) {
			this.secureCreditCard = new BlackCreditCard();
		} else if (LevelType.GOLD.equals(type)) {
			this.secureCreditCard = new GoldCreditCard();
		}
	}

	@Override
	public boolean pay(LevelType type) {
		if (LevelType.BLACK.equals(type)) {
			secureCreditCard.payWithSecureLevelA();
			return true;
		} else if (LevelType.GOLD.equals(type)) {
			secureCreditCard.payWithSecureLevelZ();
			return true;
		}
		return false;
	}

}
