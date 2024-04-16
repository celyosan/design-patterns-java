package com.lcide.course.patterns.behavioral.observer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ObserverTest {

	@Test
	void testObserver() {
		CocheObserver coche = new CocheObserver();
		PeatonObserver peaton = new PeatonObserver();
		MessagePublisher publisher = new MessagePublisher();
		
		// añadimos observadores
		boolean addCocheObserver = publisher.addAttach(coche);
		assertTrue(addCocheObserver);
		boolean addPeatonObserver = publisher.addAttach(peaton);
		assertTrue(addPeatonObserver);
		// notificamos a observadores cambio de observable
		boolean finishedNotifyAllObserversNewStatusObservable = publisher.notifyUpdate(new SemaforoObservable(StatusObservable.ROJO_COCHE));
		assertTrue(finishedNotifyAllObserversNewStatusObservable);
	
		finishedNotifyAllObserversNewStatusObservable = publisher.notifyUpdate(new SemaforoObservable(StatusObservable.VERDE_COCHE));
		assertTrue(finishedNotifyAllObserversNewStatusObservable);
	}
}
