package singletonpattern;

/**
 * Created by sunilp on 2/24/18.
 */
public class Singleton {
	//violating singleton
	//Reflection
	//Serialization/deserialization
	//Clone
	//Multithreaded access
	//multiple classloaders
	//garbage collection

	//double check locking in case of multithreading is solution, but sometimes
	///gives half initialized object, so solution is volatile keyword.

	//create singleton using ENUM
	private static Singleton ourInstance = new Singleton();

	public static Singleton getInstance() {
		return ourInstance;
	}

	private Singleton() {
	}
}
