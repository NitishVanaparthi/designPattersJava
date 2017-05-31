package org.jnit.designpatterns.dependencyInjectionExampleForSpring;

public class MyApplication {
	public static void main(String args[]) {
		EmployeeResults results = new EmployeeResults(new DevOpsDepartment());
		System.out.println(results.getEmployerByName("nitish"));
	}

}
