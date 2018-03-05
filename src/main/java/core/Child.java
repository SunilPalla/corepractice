package core;

public class Child extends Base {
	static void printValue() {
		System.out.println("  Called static Child method.");
	}
	void nonStatPrintValue() {
		System.out.println("  Called non-static Child method.");
	}
	void localIndirectStatMethod() {
		System.out.println("  Non-static calls own static:");
		System.out.print("  ");
		printValue();
	}
	public static void main(String[] args) {
		System.out.println("Object: static type Base; runtime type Child:");
		Base base = new Child();
		base.printValue();
		base.nonStatPrintValue();
		System.out.println("Object: static type Child; runtime type Child:");
		Child child = new Child();
		child.printValue();
		child.nonStatPrintValue();
		System.out.println("Class: Child static call:");
		Child.printValue();
		System.out.println("Class: Base static call:");
		Base.printValue();
		System.out.println("Object: static/runtime type Child -- call static from non-static method of Child:");
		child.localIndirectStatMethod();
		System.out.println("Object: static/runtime type Child -- call static from non-static method of Base:");
		child.nonLocalIndirectStatMethod();
	}
}