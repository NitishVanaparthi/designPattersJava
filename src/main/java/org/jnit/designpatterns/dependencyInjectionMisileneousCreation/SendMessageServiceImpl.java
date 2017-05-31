package org.jnit.designpatterns.dependencyInjectionMisileneousCreation;

public class SendMessageServiceImpl implements MessageService{

	public void sendMessage(String msg, String rec) {
		System.out.println("sms sent to rec"+rec+"sms message"+msg);
		
	}

}
