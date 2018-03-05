package design.csvreader;

/**
 * Created by sunilp on 2/8/18.
 */
public class Person {

	private String gender;
	private int age;
	private String startingChar;

	public Person(){}

	public Person(String gender, int age, String startingChar) {
		this.gender = gender;
		this.age = age;
		this.startingChar = startingChar;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStartingChar() {
		return startingChar;
	}

	public void setStartingChar(String startingChar) {
		this.startingChar = startingChar;
	}
}
