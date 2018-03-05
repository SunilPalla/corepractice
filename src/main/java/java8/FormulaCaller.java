package java8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilp on 1/29/18.
 */
public class FormulaCaller {
	public static void main(String[] args) {
		Formula formula = new Formula() {
			@Override
			public double calculateSqrt(int a) {
				return 100 * sqrt(a);
			}

			@Override
			public double calculateCeil(double a) {
				return ceil(a);
			}

			@Override
			public String method1() {
				return "hi";
			}
		};
		System.out.println(formula.calculateSqrt(10));
		System.out.println(formula.calculateCeil(10.8));
		System.out.println(formula.sqrt(4));
		System.out.println(formula.method1());

		Map<String,String> map = new HashMap<>();
		map.put("test","test");
	}
}
