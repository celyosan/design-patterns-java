package com.lcide.course.patterns.creational.builder;

public class CardProduct {
	
	private final String cardType;
	private final String number;
	private final String name;
	private final int expires;
	private final boolean credit;
	
	private CardProduct (CardBuilder builder) {
		this.cardType = builder.cardType;
		this.number = builder.number;
		this.name = builder.name;
		this.expires = builder.expires;
		this.credit = builder.credit;
	}	
	
	// Aplicamos inmutabilidad, ya que solo será modificable por el builder
	
	public String getCardType() {
		return cardType;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getExpires() {
		return expires;
	}

	public boolean isCredit() {
		return credit;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardProduct [cardType=").append(cardType).append(", number=").append(number).append(", name=")
				.append(name).append(", expires=").append(expires).append(", credit=").append(credit).append("]");
		return builder.toString();
	}

	/** 
	 * Constructor
	 * @author lcide
	 *
	 */
	public static class CardBuilder {
		private String cardType;
		private String number;
		private String name;
		private int expires;
		private boolean credit;
		
		public CardBuilder(String cardType, String number) {
			this.cardType = cardType;
			this.number = number;
		}
		
		public CardBuilder name (String name) {
			this.name = name;
			return this;
		}
		
		public CardBuilder expires (int expires) {
			this.expires = expires;
			return this;
		}
		
		public CardBuilder credit (boolean credit) {
			this.credit = credit;
			return this;
		}
		
		/**
		 * método de hace la construccion del objeto
		 * @return
		 */
		public CardProduct build() {
			return new CardProduct(this);
		}
	}
}
