package com.lcide.course.patterns.behavioral.mediator;

/**
 * Concrete mediator: implementa mediator, y establece como los objetos se comunican entre ellos. 
 * Además los conoce y los mantiene
 * @author lcide
 *
 */
public class ConcreteMediator implements Mediator {
	
	private ConcreteColleage1 user1;
	private ConcreteColleage2 user2;
	
	public void setUser1(ConcreteColleage1 user1) {
		this.user1 = user1;
	}

	public void setUser2(ConcreteColleage2 user2) {
		this.user2 = user2;
	}

	@Override
	public boolean send(String message, Colleage colleage) {
		if (colleage == user1) {
			return user2.mesageReceived(message);
		} else if (colleage == user2) {
			return user1.mesageReceived(message);
		}
		return false;
	}

}
