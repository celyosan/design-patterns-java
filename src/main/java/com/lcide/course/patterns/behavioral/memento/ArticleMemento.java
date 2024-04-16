package com.lcide.course.patterns.behavioral.memento;

/**
 * Memento: encargado de guardar el estado de un objeto Originator
 * @author lcide
 *
 */
public class ArticleMemento {
	
	/*
	 * Aqui incluimos las variables que queramos guardar para
	 * restaurar el estado anterior
	 */
	
	private String author;
	private String text;
	public ArticleMemento(String author, String text) {
		super();
		this.author = author;
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public String getText() {
		return text;
	}
	
	

}
