package java8.data;

import org.joda.time.DateTime;

public class Employee {

	private String firstName;
	private String lastName;
	private Address address;
	private Integer salary;
	private DateTime dateOfBirth;
	private Integer age;

	public Employee(){}

	public Employee(String firstName , String lastName, Integer salary, Address address, DateTime dateOfBirth, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public static class Address {
		private String location;
		private String city;

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
