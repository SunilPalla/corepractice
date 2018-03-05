package java8;

import java8.data.Employee;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionExample {

	public static void main(String[] args) {
		OptionExample optionExample = new OptionExample();
		optionExample.processEmployees(getEmployeeData());
	}

	private void processEmployees(List<Employee> employeeData) {
		List<Employee> employees = Optional.ofNullable(employeeData).orElseGet(Collections::emptyList);
		//Stream max = employees.stream().map(employee -> employee.getFirstName()).sorted(String::compareTo);
		//max.forEach(name -> System.out.println(name));
		//String first = max.findFirst().get().toString();
		//System.out.println(first);

		//parallelism
		int age = employees.parallelStream().filter(employee ->  employee.getSalary() > 45000).mapToInt(Employee::getAge).sum();
		System.out.println(age);
		//sequential
		employees.stream().filter(employee ->  employee.getSalary() > 45000).forEach(employee1 -> System.out.println(employee1.getAge()));
	}

	private static List<Employee> getEmployeeData() {
		List<Employee> employees = new ArrayList<>();
		Employee.Address address =  new Employee.Address();
		address.setCity("San Jose");
		address.setLocation("CA");

		Employee employee = new Employee("John", "Doe", 45000, address, new DateTime("1985-11-21"), 50);
		employees.add(employee);

		Employee.Address address1 =  new Employee.Address();
		address1.setCity("Illinois");
		address1.setLocation("Chicago");

		Employee employee1 = new Employee("Sam", "Pitroda", 50000, address1, new DateTime("1984-10-09"), 45);
		employees.add(employee1);

		Employee employee2 = new Employee("Sam", "Pitroda", 50000, address1, new DateTime("1984-10-09"), 45);
		Employee.Address address2 =  new Employee.Address();
		address2.setCity("Illinois");
		address2.setLocation("Chicago");
		employees.add(employee2);

		return employees;
	}

}
