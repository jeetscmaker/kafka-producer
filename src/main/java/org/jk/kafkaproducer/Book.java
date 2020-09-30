package org.jk.kafkaproducer;

public class Book {
	private String name;
	private String isbn;

	public Book() {
	}

	public Book(String name, String isbn) {
		super();
		this.name = name;
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
