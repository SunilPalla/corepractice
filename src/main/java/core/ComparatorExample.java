package core;

import data.Util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sunilp on 1/31/18.
 */
public class ComparatorExample implements Comparator<Employee> {

	public static void main(String[] args) {
		List<Employee> employees = Util.getEmployees();

		System.out.println("Before sorting comparator");
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}

		Collections.sort(employees, new ComparatorExample());
		System.out.println("After sorting comparator");
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
