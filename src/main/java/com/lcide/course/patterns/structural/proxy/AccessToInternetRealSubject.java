package com.lcide.course.patterns.structural.proxy;

/**
 * Objeto real
 * @author lcide
 *
 */
public class AccessToInternetRealSubject implements InternetSubject {

	@Override
	public boolean connectTo(String uri) {
		System.out.println("Conectando a la url " + uri);
		return true;
	}
	
}
