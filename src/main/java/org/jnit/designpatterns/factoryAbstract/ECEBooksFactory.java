package org.jnit.designpatterns.factoryAbstract;

public class ECEBooksFactory implements BooksAbstractFactory {

	private String bookName;
	private String author;
	private String title;

	public ECEBooksFactory(String bookName, String author, String title) {

		this.bookName = bookName;
		this.author = author;
		this.title = title;
	}

	public Books createBooks() {
		// TODO Auto-generated method stub
		return new ECEBooks(bookName, author, title);
	}

}
