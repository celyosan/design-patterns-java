package com.lcide.course.patterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test_Singleton() {
		Card visa = Card.getInstance("0000");
		assertEquals("0000", visa.getCardNumber());
		
		// no podemos modificar el objeto, ya que al ser creado el singleton, nos devuelve el almacenado.
		Card visa2 = Card.getInstance("1111");
		assertEquals("0000", visa.getCardNumber());
		// ambos objeto contienen la misma posición de memoria (toString devuelve la posición de memoria si no se sobreescibe)
		assertEquals(visa.toString(), visa2.toString());
	}
}
