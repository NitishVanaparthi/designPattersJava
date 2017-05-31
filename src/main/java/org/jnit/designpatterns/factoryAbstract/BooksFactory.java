package org.jnit.designpatterns.factoryAbstract;

public class BooksFactory {
	
	public static Books getBook(BooksAbstractFactory factory){
		return factory.createBooks();
	}

}
