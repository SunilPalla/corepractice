package core;

public class Base {
	static void printValue() {
		System.out.println("  Called static Base method.");
	}
	void nonStatPrintValue() {
		System.out.println("  Called non-static Base method.");
	}
	void nonLocalIndirectStatMethod() {
		System.out.println("  Non-static calls overridden(?) static:");
		System.out.print("  ");
		this.printValue();
	}
}
