package java8;

public class FunctionInterfaceImpl {
	public static void main(String[] args) {
		FunctionInterfaceExample<Integer,Integer> f = (a,b) -> a+b;
		System.out.println(f.compute(7,7));
	}
}
