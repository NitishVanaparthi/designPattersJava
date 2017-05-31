package org.jnit.designpatterns.factoryAbstract;

public class CSCBooksFactory implements BooksAbstractFactory{
	
	private String bookName;
	private String author;
	private String title;
	
	

	public CSCBooksFactory(String bookName, String author, String title) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.title = title;
	}



	public Books createBooks() {
		
		return new CSCBooks(bookName, author, title);
	}

}
