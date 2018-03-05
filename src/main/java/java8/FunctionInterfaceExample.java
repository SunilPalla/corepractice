package java8;

@FunctionalInterface
public interface FunctionInterfaceExample<F,T> {
	T compute(F a,F b);
}
