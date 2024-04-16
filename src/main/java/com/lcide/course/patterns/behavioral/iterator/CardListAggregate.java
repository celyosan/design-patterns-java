package com.lcide.course.patterns.behavioral.iterator;

public class CardListAggregate implements ListAggregate<Card> {

	private Card[] cards;
	 	
	public CardListAggregate(Card[] cards) {
		super();
		this.cards = cards;
	}

	@Override
	public Iterator<Card> iterator() {
		return new CardIterator(cards);
	}

}
