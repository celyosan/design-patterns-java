package com.lcide.course.patterns.behavioral.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MementoTest {
	
	@Test
	void testMemento() {
		Carateker carateker = new Carateker();
		
		String textoInicial = "Memento es una película";
		
		Article article = new Article("Luis", textoInicial);
		assertEquals(textoInicial, article.getText());
		
		String textoInicialModificado = article.getText() + " de ciencia ficción";
		
		article.setText(textoInicialModificado);
		
		assertEquals(textoInicialModificado, article.getText());
		System.out.println(article.getText());
		
		boolean saveMemento = carateker.addMemento(article.createMemento());
		assertTrue(saveMemento);
		
		String textoModificadoOtraVez = article.getText() + " protagonizada por Guy Pearce";
		
		article.setText(textoModificadoOtraVez);
		assertEquals(textoModificadoOtraVez, article.getText());

		System.out.println(article.getText());

		saveMemento = carateker.addMemento(article.createMemento());
		assertTrue(saveMemento);
		
		String textoModificadoErroneamente = article.getText() + " y protagonizada también por Leonardo Di Caprio";
		article.setText(textoModificadoErroneamente);
		
		assertEquals(textoModificadoErroneamente, article.getText());
		System.out.println(article.getText());

		ArticleMemento articleMemento1 = carateker.getMemento(0);
		ArticleMemento articleMemento2 = carateker.getMemento(1);
		
		article.restoreMemento(articleMemento1);
		
		assertEquals(textoInicialModificado, article.getText());
		System.out.println(article.getText());

		article.restoreMemento(articleMemento2);
		
		assertEquals(textoModificadoOtraVez, article.getText());
		System.out.println(article.getText());
				
		String textoCorregidoModificado = article.getText() + " del año 2000";
		article.setText(textoCorregidoModificado);
		
		assertEquals(textoCorregidoModificado, article.getText());
		System.out.println(article.getText());
	}

}
