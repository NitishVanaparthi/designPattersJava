package org.jnit.designpatterns.dependencyInjectionMisileneousCreation;

public class EmailServiceImpl implements MessageService{

	public void sendMessage(String msg, String rec) {
		System.out.println("Email sent to rec"+rec+"Email message"+msg);
		
	}

}
