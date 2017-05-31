package org.jnit.designpatterns.dependencyInjectionExampleForSpring;

import java.util.List;

public class EmployeeResults {

	Departments department; 
	
	public EmployeeResults(Departments department){
		super();
		this.department = department;
	}
	

	public String getEmployerByName(String name) {

		List<String> employees = department.findEmployeeDetails();
		for (String employee : employees) {
			String[] empStr = employee.split("\\s+");
			String empName = empStr[0];
			if (name.equals(empName)) {
				return empStr[1];
			}

		}
		return "Name Not Found";

	}

}
