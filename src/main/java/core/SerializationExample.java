package core;

import java.io.*;

/**
 * Created by sunilp on 2/7/18.
 */
public class SerializationExample {

	public static void main(String args[])throws Exception {
		Student s1 =new Student(211,"ravi",22,"1234");//creating object
		//writing object into file
		FileOutputStream f=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();
		out.close();
		f.close();
		System.out.println("success");

		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+" "+s.name+" "+s.age+" "+s.salary);
		in.close();
	}

}
