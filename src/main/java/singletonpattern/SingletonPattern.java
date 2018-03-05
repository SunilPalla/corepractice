package singletonpattern;

/**
 * Created by sunilp on 2/24/18.
 */
public class SingletonPattern {
	private static  SingletonPattern singletonPattern = new SingletonPattern();

	private SingletonPattern() {
	}

	public static SingletonPattern getSingletonPattern() {
		return singletonPattern;
	}
}
