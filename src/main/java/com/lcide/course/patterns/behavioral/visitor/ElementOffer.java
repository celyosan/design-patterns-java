package com.lcide.course.patterns.behavioral.visitor;

/**
 * Elemento que acepta un visitor.
 * @author lcide
 *
 */
public interface ElementOffer {

	boolean accept(CreditCardVisitor visitor);
}
