package org.jnit.designpatterns.dependencyInjectionTest;

import org.jnit.designpatterns.dependencyInjectionMisileneousCreation.Consumer;
import org.jnit.designpatterns.dependencyInjectionMisileneousCreation.EmailServiceInjector;
import org.jnit.designpatterns.dependencyInjectionMisileneousCreation.MessageServiceInjector;
import org.jnit.designpatterns.dependencyInjectionMisileneousCreation.SMSServiceInjector;

public class MyMessageDiTest {
	public static void main(String args[]) {

		String msg = "Hello World";
		String rec = "nitish.vy910@gmail.com";
		String recPhone = "6784642373";

		MessageServiceInjector injector = null;
		Consumer app = null;

		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessage(rec, msg);
		
		
		injector  = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessage(recPhone, msg);

	}

}
