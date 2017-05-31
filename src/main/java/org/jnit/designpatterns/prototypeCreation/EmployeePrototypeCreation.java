package org.jnit.designpatterns.prototypeCreation;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototypeCreation implements Cloneable {
	private List<String> empList;

	public EmployeePrototypeCreation() {
		empList = new ArrayList<String>();
	}

	public EmployeePrototypeCreation(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("one");
		empList.add("two");
		empList.add("three");
		empList.add("four");
		empList.add("five");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new EmployeePrototypeCreation(temp);
	}

}
