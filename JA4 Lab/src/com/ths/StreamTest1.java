package com.ths;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedHashMap;

class Employee{
	int empid;
	String name;
	int age;
	public Employee() {
		
	}
	public Employee(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class StreamTest1 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e = new Employee(121, "Cheryl", 50);
		
		empList.add(e);
		
		empList.add(new Employee(122, "Betty", 60));
		empList.add(new Employee(123, "sarah", 40));
		empList.add(new Employee(124, "veronica", 70));
		
		// printing names and ages of employees who's age > 50
		
		//1.  using normal java code
		
		for(Employee emp: empList) {
			if(emp.getAge() > 50) {
				System.out.println(emp.getName()+" "+emp.getAge());
			}
		}
		
		// 2. java 8 feature stream api
		empList.stream().filter(emp -> emp.getAge() > 50).forEach(emp -> System.out.println(emp.getAge() + " " + emp.getName()));
		
		
		// List to map
		
	//LinkedHashMap<Integer, String> empLmp = empList.stream().collect(Collectors.toMap(Employee :: getAge, Employee :: getName, (k,v) -> k + " " +v, LinkedHashMap :: ));
	}
}
