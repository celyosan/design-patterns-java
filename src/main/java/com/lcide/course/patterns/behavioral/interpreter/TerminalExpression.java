package com.lcide.course.patterns.behavioral.interpreter;

/**
 * Con símbolo de gramática
 * @author lcide
 *
 */
public class TerminalExpression implements Expression {
	
	private String text;	

	public TerminalExpression(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public boolean interpret(String ctxt) {		
		return ctxt.contains(text);
	}

}
