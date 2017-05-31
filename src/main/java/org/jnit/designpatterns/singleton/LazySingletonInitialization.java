package org.jnit.designpatterns.singleton;

public class LazySingletonInitialization {

	private static LazySingletonInitialization instance;

	private LazySingletonInitialization() {}

	public static LazySingletonInitialization getInstance() {
		if (instance == null) {
			instance = new LazySingletonInitialization();
		}
		return instance;

	}
}
