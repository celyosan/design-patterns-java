package com.lcide.course.patterns.structural.adapter;
/**
 * Interfaz a tratar por el cliente.
 * @author lcide
 *
 */
public interface Payment {
	boolean pay(LevelType type);
}
