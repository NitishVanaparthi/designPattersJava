package org.jnit.designpatterns.factoryAbstract;

public class ITBooksFactory implements BooksAbstractFactory {

	private String bookName;
	private String author;
	private String title;

	public ITBooksFactory(String bookName, String author, String title) {

		this.bookName = bookName;
		this.author = author;
		this.title = title;
	}

	public Books createBooks() {
		return new ITBooks(bookName, author, title);
	}

}
