package com.lcide.course.patterns.behavioral.mediator;

/** Interfaz mediator: establece la comunicación entre objetos
 * 
 * @author lcide
 *
 */
public interface Mediator {
	boolean send(String message, Colleage colleage);
}
