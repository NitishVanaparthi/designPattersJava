package org.jnit.designpatterns.factoryCreation;

public class NameFactory {
	public static Namer getNamer(String entry) {
		int i = entry.indexOf(",");
		if (i > 0) {
			return new LastFirst(entry);
		} else {
			return new FirstFirst(entry);
		}

	}
}
