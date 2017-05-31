package org.jnit.designpatterns.factoryCreatetionTest;

import org.jnit.designpatterns.factoryCreation.NameFactory;
import org.jnit.designpatterns.factoryCreation.Namer;

public class NamerFactoryTest {
	public static void main(String args[]){
		Namer lastFirst = NameFactory.getNamer("Ram,Nam");
		System.out.println(lastFirst.getFirst());
		System.out.println(lastFirst.getLast());
	}

}
