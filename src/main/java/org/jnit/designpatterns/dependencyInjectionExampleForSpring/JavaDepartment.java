package org.jnit.designpatterns.dependencyInjectionExampleForSpring;

import java.util.ArrayList;
import java.util.List;

public class JavaDepartment implements Departments {
	public static List<String> employees = new ArrayList<String>();
	static {
		employees.add("nitish javaDeveloper JNIT");
		employees.add("chris javaDevelooper JNIT");
		employees.add("charan meanStack SINIST");
		employees.add("shiva coreJava JNIT");
	}

	/* (non-Javadoc)
	 * @see org.jnit.designpatterns.dependencyInjectionExampleForSpring.Departments#findEmployeeDetails()
	 */
	public List<String> findEmployeeDetails() {
		return employees;
	}

}
