package core;

import data.Util;

import java.util.Collections;
import java.util.List;

public class Employee implements  Comparable<Employee> {
	private String name;
	private Integer age;
	private Integer salary;

	public Employee(){}

	public Employee(String name, Integer age, Integer salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		List<Employee> employees = Util.getEmployees();

		System.out.println("Before sorting comparable");
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}

		Collections.sort(employees);
		System.out.println("After sorting comparable");
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}

	}
}
