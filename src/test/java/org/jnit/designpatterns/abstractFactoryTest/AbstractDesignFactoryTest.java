package org.jnit.designpatterns.abstractFactoryTest;

import org.jnit.designpatterns.factoryAbstract.Books;
import org.jnit.designpatterns.factoryAbstract.BooksFactory;
import org.jnit.designpatterns.factoryAbstract.CSCBooksFactory;
import org.jnit.designpatterns.factoryAbstract.ECEBooksFactory;
import org.jnit.designpatterns.factoryAbstract.ITBooksFactory;

public class AbstractDesignFactoryTest {
	public static void main(String[] args){
		testAbstractDesginFactory();
	}

	private static void testAbstractDesginFactory() {
		Books CSE = BooksFactory.getBook(new CSCBooksFactory("c programming", "s chandh", "let's c"));
		Books IT = BooksFactory.getBook(new ITBooksFactory("Information Technology", "s chandh", "growing technology"));
		Books ECE = BooksFactory.getBook(new ECEBooksFactory("EDC", "SNR", "Electronic design system"));
		
		
		System.out.println(CSE.getAuthor());
		System.out.println(IT.getBookName());
		System.out.println(ECE.getTitle());
	}

}
