package com.lcide.course.patterns.behavioral.iterator;
/**
 * Define como recorrer Colección de objetos
 * @author lcide
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * Método esencial.
	 * Define el objeto siguiente y avanzamos el cursor
	 * @return
	 */
	T next ();
	/**
	 * Método esencial.
	 * Define si hay objeto siguiente en la colección.
	 * Si no hay, devuelve false.
	 * @return
	 */
	boolean hashNext();
	/**
	 * Método inventado.
	 * @return
	 */
	T currentItem();
	/**
	 * Método inventado.
	 */
	int currentPosition();
}
