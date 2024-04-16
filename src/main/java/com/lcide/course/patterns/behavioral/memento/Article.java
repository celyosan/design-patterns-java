package com.lcide.course.patterns.behavioral.memento;

/**
 * Originator: crea un objeto Memento y contiene una instantanea de su estado interno, que podemos recuperar.
 * @author lcide
 *
 */
public class Article {
	
	private String author;
	private String text;
	public Article(String author, String text) {
		super();
		this.author = author;
		this.text = text;
	}
	
	public ArticleMemento createMemento() {
		return new ArticleMemento(author, text);
	}
	
	public void restoreMemento(ArticleMemento memento) {
		this.author = memento.getAuthor();
		this.text = memento.getText();
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

}
