package org.jnit.designpatterns.singletonCreationTest;

import org.jnit.designpatterns.singleton.EagerInitializedSingleton;
import org.jnit.designpatterns.singleton.LazySingletonInitialization;
import org.jnit.designpatterns.singleton.StaticBlockSingletonImplentation;
import org.jnit.designpatterns.singleton.ThreadSafeSingletonInstanceCreation;

public class SingletonCreationTest implements Runnable{

	public void run() {
		System.out.println("StaticBlockSingletonImplentation   "+StaticBlockSingletonImplentation.getInstance().hashCode());
		System.out.println("LazySingletonInitialization   "+LazySingletonInitialization.getInstance().hashCode());
		System.out.println("ThreadSafeSingletonInstanceCreation  "+ThreadSafeSingletonInstanceCreation.getDoubleLockingInstance().hashCode());
		try {
			System.out.println("EagerInitializedSingleton  "+EagerInitializedSingleton.getInstance().hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		SingletonCreationTest st = new SingletonCreationTest();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		t2.start();
	}

}
