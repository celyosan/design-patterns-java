package com.lcide.course.patterns.behavioral.observer;

/**
 * Clase que observa las moficaciones del Observable semaforo
 * @author lcide
 *
 */
public class PeatonObserver implements Observer{

	@Override
	public boolean update(SemaforoObservable semaforo) {
		if(StatusObservable.ROJO_COCHE.equals(semaforo.getStatus())) {
			System.out.println("El peaton SI puede pasar.");
		} else {
			System.out.println("El peaton NO puede pasar.");
		}
		return true;
	}

}
