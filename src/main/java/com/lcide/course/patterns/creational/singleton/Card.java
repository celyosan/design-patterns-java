package com.lcide.course.patterns.creational.singleton;

public class Card {
	/** objeto a compartir */
	private static Card instance;
	
	private String cardNumber;	
	
	private Card(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}			

	public static synchronized Card getInstance(String cardNumber) {
		if (instance == null) {
			instance = new Card(cardNumber);
		}
		return instance;
	}

}
