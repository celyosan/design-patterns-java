package com.lcide.course.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa Subject. Contiene las operaciones de registro de Observers y que hacer para notificar. 
 * @author lcide
 *
 */
public class MessagePublisher implements Subject {
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public boolean addAttach(Observer obs) {		
		return observers.add(obs);
	}

	@Override
	public boolean detach(Observer obs) {
		return observers.remove(obs);
	}

	@Override
	public boolean notifyUpdate(SemaforoObservable obs) {		
		observers.forEach(observer -> observer.update(obs));
		
		// simulamos operacion larga
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
