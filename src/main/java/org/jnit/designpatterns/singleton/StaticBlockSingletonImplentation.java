package org.jnit.designpatterns.singleton;

public class StaticBlockSingletonImplentation {
	private StaticBlockSingletonImplentation(){}
	
	private static StaticBlockSingletonImplentation instance;
	
	static{
		try{
			instance = new StaticBlockSingletonImplentation();
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingletonImplentation getInstance(){
		return instance;
	}

}
