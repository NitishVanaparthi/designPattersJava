package org.jnit.designpatterns.factoryCreatetionTest;

import org.jnit.designpatterns.factoryCreation.Computer;
import org.jnit.designpatterns.factoryCreation.ComputerFactory;

public class ComputerFactoryTest {
	public static void main(String args[]) {

		Computer pc = ComputerFactory.getComputer("pc", "8GB", "500GB", "2.0Gz");
		Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", "3.5Gz");

		System.out.println("PC Configuration"+pc);
		System.out.println("Server Configuration"+server);
	}
}
