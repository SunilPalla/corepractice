package java8;

public class AnotherClass extends BaseClass {
	AnotherClass() {
	}

	public static void main(String[] args) {
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.method1();
	}
	@Override
	void method1() {
		method1();
	}
}
