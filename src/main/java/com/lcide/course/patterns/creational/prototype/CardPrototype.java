package com.lcide.course.patterns.creational.prototype;

/**
 * Extiende de cloneable. Asi indicamos al método clon, que haga una copia miembro a miembro de dicha clase.
 * @author lcide
 *
 */
public interface CardPrototype {
	
	void getCard();
	
	CardPrototype copy();

}
