package com.lcide.course.patterns.behavioral.interpreter;

public class OrExpression implements Expression {
	
	private Expression expression1;
	private Expression expression2;
	
	public OrExpression(Expression expression1, Expression expression2) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret(String ctxt) {		
		return expression1.interpret(ctxt) || expression2.interpret(ctxt);
	}

}
