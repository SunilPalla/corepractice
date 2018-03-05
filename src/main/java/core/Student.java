package core;

import java.io.Serializable;

/**
 * Created by sunilp on 2/7/18.
 */
public class Student implements Serializable {
	private static final long serializableVersionUid = 1l;

	int id;
	String name;
	transient int age;//Now it will not be serialized
	String salary;

	public Student(int id, String name,int age,String salary) {
		this.id = id;
		this.name = name;
		this.age=age;
		this.salary = salary;
	}
}
