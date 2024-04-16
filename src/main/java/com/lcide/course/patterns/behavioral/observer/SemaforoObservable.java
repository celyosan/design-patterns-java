package com.lcide.course.patterns.behavioral.observer;

/**
 * Observable: Objeto a ser observado y notificar sus modificaciones
 * @author lcide
 *
 */
public class SemaforoObservable {

	private StatusObservable status;

	public SemaforoObservable(StatusObservable status) {
		this.status = status;
	}

	public StatusObservable getStatus() {
		return status;
	}	
}
