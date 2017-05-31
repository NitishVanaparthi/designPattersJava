package org.jnit.designpatterns.dependencyInjectionMisileneousCreation;

public class EmailServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIAppliation(new EmailServiceImpl());
	}

}
