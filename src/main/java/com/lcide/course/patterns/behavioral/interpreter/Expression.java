package com.lcide.course.patterns.behavioral.interpreter;

/**
 * define la interfaz con la ejecución de una operación, que se le pasará un contextos.
 * @author lcide
 *
 */

public interface Expression {
	/** regla a definir */
	boolean interpret(String ctxt);

}
