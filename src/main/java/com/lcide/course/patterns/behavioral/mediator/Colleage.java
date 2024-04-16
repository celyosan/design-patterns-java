package com.lcide.course.patterns.behavioral.mediator;

/** 
 * Interfaz de comunicación con Mediator: Establece como se han de comunicar los objetos con Mediator, de una manera estándar.
 */
public abstract class Colleage {
	protected Mediator mediator;
	
	protected Colleage(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract boolean send (String message);
	public abstract boolean mesageReceived (String message);
	
}
