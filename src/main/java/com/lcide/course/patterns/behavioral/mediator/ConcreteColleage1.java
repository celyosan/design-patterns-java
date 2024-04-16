package com.lcide.course.patterns.behavioral.mediator;

public class ConcreteColleage1  extends Colleage {
	
	public ConcreteColleage1 (Mediator mediator) {
		super (mediator);
	}

	@Override
	public boolean send(String message) {
		mediator.send(message, this);
		return true;
	}

	@Override
	public boolean mesageReceived(String message) {
		System.out.println("Colega 1 ha recibido el siguiente mensaje del chat: " + message);
		return true;
	}

}
