package com.lcide.course.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker: Encargado de mantener a salvo el objeto Memento
 * @author lcide
 *
 */
public class Carateker {

	private List<ArticleMemento> estados = new ArrayList<>();
	
	public boolean addMemento(ArticleMemento memento) {
		return estados.add(memento);
	}
	
	public ArticleMemento getMemento(int index) {
		return estados.get(index);
	}
}
