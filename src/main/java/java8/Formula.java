package java8;

/**
 * Created by sunilp on 1/29/18.
 */
public interface Formula {
	double calculateSqrt(int a);
	double calculateCeil(double a);
	String method1();

	default double sqrt(int a) {
		return Math.sqrt(a);
	}

	default double ceil(double a) {
		return Math.ceil(a);
	}
}
