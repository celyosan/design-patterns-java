package com.lcide.course.patterns.creational.abstractfactory;

/**
 * Superfábrica
 * @author lcide
 *
 * @param <T>
 */
public interface AbstractFactory<T> {
	T create (String type);
}
