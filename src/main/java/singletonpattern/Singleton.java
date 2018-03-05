package singletonpattern;

/**
 * Created by sunilp on 2/24/18.
 */
public class Singleton {
	private static Singleton ourInstance = new Singleton();

	public static Singleton getInstance() {
		return ourInstance;
	}

	private Singleton() {
	}
}
