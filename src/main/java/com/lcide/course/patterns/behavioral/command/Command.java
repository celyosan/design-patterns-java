package com.lcide.course.patterns.behavioral.command;

/**
 * Tiene la acción a ejecutar de un comando
 * @author lcide
 *
 */
public interface Command {
	
	/**
	 * Contendrá las acciones a realizar según la lógica del comando.
	 */
	ActionType execute();
}
