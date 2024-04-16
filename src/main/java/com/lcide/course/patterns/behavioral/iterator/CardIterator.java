package com.lcide.course.patterns.behavioral.iterator;

public class CardIterator implements Iterator<Card> {

	private Card[] cards;
	private int position;
	
	public CardIterator(Card[] cards) {
		this.cards = cards;
		position = 0;
	}
	
	@Override
	public Card next() {		
		return cards[position++];
	}

	@Override
	public boolean hashNext() {		
		return position < cards.length;
	}

	@Override
	public Card currentItem() {
		return cards[position];
	}

	@Override
	public int currentPosition() {
		return position;
	}

}
