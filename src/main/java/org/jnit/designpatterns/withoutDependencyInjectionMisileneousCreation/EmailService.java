package org.jnit.designpatterns.withoutDependencyInjectionMisileneousCreation;

public class EmailService {
	public void sendEmail(String msg, String rec){
		System.out.println("Message is "+msg+"Receiver is "+rec);
	}

}
