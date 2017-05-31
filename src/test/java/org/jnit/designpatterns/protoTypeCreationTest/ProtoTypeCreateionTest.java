package org.jnit.designpatterns.protoTypeCreationTest;

import java.util.List;

import org.jnit.designpatterns.prototypeCreation.EmployeePrototypeCreation;

public class ProtoTypeCreateionTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		EmployeePrototypeCreation emp = new EmployeePrototypeCreation();
		emp.loadData();
		EmployeePrototypeCreation empNew = (EmployeePrototypeCreation) emp.clone();
		EmployeePrototypeCreation empNew1 = (EmployeePrototypeCreation) emp.clone();
		List<String> list = empNew.getEmpList();
		list.add("six");
		List<String> list1 = empNew1.getEmpList();
		list1.remove("three");
		System.out.println("empList "+emp.getEmpList());
		System.out.println("empList list "+list);
		System.out.println("empList list1 "+list1);
	}

}
