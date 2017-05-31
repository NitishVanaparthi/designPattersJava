package org.jnit.designpatterns.dependencyInjectionExampleForSpring;

import java.util.ArrayList;
import java.util.List;

public class DevOpsDepartment implements Departments{

	public static List<String> employees = new ArrayList<String>();
	static {
		employees.add("nitish devOps JNIT");
		employees.add("chris devOps JNIT");
		employees.add("charan buildAndRelease SINIST");
		employees.add("shiva releaseDepartment JNIT");
	}

	/* (non-Javadoc)
	 * @see org.jnit.designpatterns.dependencyInjectionExampleForSpring.Departments#findEmployeeDetails()
	 */
	public List<String> findEmployeeDetails() {
		return employees;
	}

}
