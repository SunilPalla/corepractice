package core;

/**
 * Created by sunilp on 2/21/18.
 */
public class StaticChild extends StaticExample {
	static {
		System.out.println("in child static block");
	}
	StaticChild() {
		System.out.println("in child constructor");
	}
}
