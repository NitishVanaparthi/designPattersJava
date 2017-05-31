package org.jnit.designpatterns.dependencyInjectionMisileneousCreation;

public class MyDIAppliation implements Consumer{

	private MessageService messageService; 
	
	public MyDIAppliation(MessageService svc){
		this.messageService = svc; 
	}
	
	public void processMessage(String rec, String msg) {
		this.messageService.sendMessage(msg, rec);
		
	}

}
