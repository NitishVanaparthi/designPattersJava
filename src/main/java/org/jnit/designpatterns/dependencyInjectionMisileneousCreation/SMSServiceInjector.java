package org.jnit.designpatterns.dependencyInjectionMisileneousCreation;

public class SMSServiceInjector implements MessageServiceInjector{

	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIAppliation(new SendMessageServiceImpl());
	}

	

}
