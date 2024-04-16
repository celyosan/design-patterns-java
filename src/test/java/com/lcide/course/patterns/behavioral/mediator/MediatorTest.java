package com.lcide.course.patterns.behavioral.mediator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MediatorTest {
	
	@Test
	void testMediator () {

		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleage1 user1 = new ConcreteColleage1(mediator);
		ConcreteColleage2 user2 = new ConcreteColleage2(mediator);
		
		mediator.setUser1(user1);
		mediator.setUser2(user2);
		
		assertTrue(user1.send("Hola, soy user1"));
		assertTrue(user2.send("Hola user1, soy user2"));
		
		// Los objetos solo conocen a mediator, y mediator es quien establece la comunicacion entre ellos.
	}

}
