package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sunilp on 1/30/18.
 */
public class LambdaExpression {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		System.out.println("before ::"+names);
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		System.out.println("after ::"+names);
		Collections.sort(names,(a,b) -> {return a.compareTo(b);});
		System.out.println("lambda ::"+names);

	}
}
