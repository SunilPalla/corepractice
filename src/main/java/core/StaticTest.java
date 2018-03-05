package core;

/**
 * Created by sunilp on 2/21/18.
 */
public class StaticTest {
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		System.out.println("Static Example::" + StaticExample.i);
		StaticExample.i = 40;
		System.out.println("Static Example After call::" + StaticExample.i);
	}
}
