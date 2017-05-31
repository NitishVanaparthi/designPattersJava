package org.jnit.designpatterns.singleton;

public class ThreadSafeSingletonInstanceCreation {
	private static ThreadSafeSingletonInstanceCreation instance;

	private ThreadSafeSingletonInstanceCreation() {
	}

	/*public static synchronized ThreadSafeSingletonInstanceCreation getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingletonInstanceCreation();
		}
		return instance;
	}*/
	
	public static ThreadSafeSingletonInstanceCreation getDoubleLockingInstance(){
		if(instance == null){
			synchronized (ThreadSafeSingletonInstanceCreation.class) {
				if(instance == null){
					instance = new ThreadSafeSingletonInstanceCreation();
				}
			}
		}
		return instance;
	}

}
