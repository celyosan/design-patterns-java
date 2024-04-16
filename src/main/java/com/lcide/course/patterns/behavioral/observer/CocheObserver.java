package com.lcide.course.patterns.behavioral.observer;

/**
 * Clase que observa las moficaciones del Observable semaforo
 * @author lcide
 *
 */
public class CocheObserver implements Observer {

	@Override
	public boolean update(SemaforoObservable semaforo) {
		if(StatusObservable.ROJO_COCHE.equals(semaforo.getStatus())) {
			System.out.println("El coche NO puede pasar.");
		} else {
			System.out.println("El coche SI puede pasar.");
		}
		return true;
	}

}
