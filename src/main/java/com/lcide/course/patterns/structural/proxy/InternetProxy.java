package com.lcide.course.patterns.structural.proxy;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase Proxy, capa por encima de objeto real {@link InternetSubject}
 * @author lcide
 *
 */
public class InternetProxy implements InternetSubject {
	
	private InternetSubject internet = new AccessToInternetRealSubject();
	private static List<String> bannedUrls;
	
	static {
		bannedUrls = new ArrayList<>();
		bannedUrls.add("google.com");
		bannedUrls.add("facebook.com");
		bannedUrls.add("twitter.com");
	}
	

	@Override
	public boolean connectTo(String url) {
		if (bannedUrls.contains(url)) {
			throw new RuntimeException("Direccion no permitida. Contacta con tu administrador");
		}
		return internet.connectTo(url);
	}

}
