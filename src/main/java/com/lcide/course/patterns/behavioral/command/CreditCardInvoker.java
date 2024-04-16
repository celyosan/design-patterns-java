package com.lcide.course.patterns.behavioral.command;

/**
 * Quien ejecuta los comandos.
 * @author lcide
 *
 */
public class CreditCardInvoker {
	
	private Command command;
		
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public ActionType executeCommand () {
		return command.execute();
	}
}
