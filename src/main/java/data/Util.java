package data;

import core.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilp on 1/31/18.
 */
public class Util {

	public static List<Employee> getEmployees() {

		List<Employee> col = new ArrayList<Employee>();

		col.add(new Employee("Frank", 28, 5000));
		col.add(new Employee( "Jorge", 25, 6000));
		col.add(new Employee( "Bill", 34, 7000));
		col.add(new Employee( "Michel", 25,9000));
		col.add(new Employee( "Simpson", 28,6500));
		col.add(new Employee("Clerk",26,7800 ));
		col.add(new Employee( "Lee", 40, 3400));
		col.add(new Employee( "Mark", 30, 9000));

		return col;
	}
}
