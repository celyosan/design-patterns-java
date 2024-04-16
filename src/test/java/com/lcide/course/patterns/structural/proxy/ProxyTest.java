package com.lcide.course.patterns.structural.proxy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProxyTest {
	
	@Test
	void test_Proxy () {
		InternetSubject internet = new InternetProxy();
		assertTrue(internet.connectTo("udemy.com"));		
	}
	
	@Test
	void test_Proxy_Error () {
		InternetSubject internet = new InternetProxy();
		assertThrows(RuntimeException.class, () ->	internet.connectTo("facebook.com"));
	}

}
