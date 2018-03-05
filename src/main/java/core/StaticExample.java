package core;

/**
 * Created by sunilp on 1/13/18.
 */
public class StaticExample {

	public static int i = 10;
	public int j=0;
	public static String s=null;

	static {
		s = "static";
	}

	public StaticExample(){
		System.out.println("in parent constructor");
	}


	public static void main(String[] args) {

		System.out.println("in main"+i);
		staticAccess();
		System.out.println("in main after staticAccess"+i);
		StaticExample.Inner inner = new StaticExample.Inner();
		inner.method();
		StaticChild staticChild = new StaticChild();

	}

	private static void staticAccess() {
		i = 20;
		System.out.println("in staticAccess"+i);
	}

	private void nonStatic() {
		staticAccess();
	}

	static class Inner {
		void method() {
			System.out.println("inner"+s);
		}
	}
}
