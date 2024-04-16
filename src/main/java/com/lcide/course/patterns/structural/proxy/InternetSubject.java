package com.lcide.course.patterns.structural.proxy;

/**
 * Interfaz común a proxy y al objeto real.
 * @author lcide
 *
 */
public interface InternetSubject {
	boolean connectTo(String url);
}
