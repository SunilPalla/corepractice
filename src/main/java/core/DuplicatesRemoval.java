package core;

import java.util.LinkedHashSet;

/**
 * Created by sunilp on 3/20/18.
 */
public class DuplicatesRemoval {
	private static String dupString = "sunnniilll";
	public static void main(String[] args) {
		removeDuplicates(dupString);
		removeDuplicatesUsingHashset(dupString);
	}

	private static void removeDuplicates(String str) {
		String finalString="";
		for(int i=0;i<str.length();i++) {
			if(!finalString.contains(String.valueOf(str.charAt(i)))) {
				finalString=finalString.concat(String.valueOf(str.charAt(i)));
			}

		}
		System.out.println(finalString);
	}

	private static void removeDuplicatesUsingHashset(String str) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			hashSet.add(String.valueOf(str.charAt(i)));
		}
		System.out.println(hashSet.toString());
	}
}
