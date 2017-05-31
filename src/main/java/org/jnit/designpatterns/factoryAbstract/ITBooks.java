package org.jnit.designpatterns.factoryAbstract;

public class ITBooks extends Books {
	private String bookName;
	private String author;
	private String title;

	public ITBooks(String bookName, String author, String title) {
		
		this.bookName = bookName;
		this.author = author;
		this.title = title;
	}

	@Override
	public String getBookName() {
		return bookName;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
