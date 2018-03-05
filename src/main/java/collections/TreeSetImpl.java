package collections;

import apple.laf.JRSUIUtils;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by sunilp on 2/12/18.
 */
public class TreeSetImpl {
	public static void main(String[] args) {
		Map<String,TreeSet> dictionary = new TreeMap<>();
		TreeSet treeSet = new TreeSet();
		treeSet.add("Sunil");
		treeSet.add("Himesh");
		treeSet.add("Salman");
		treeSet.add("Abdul");
		dictionary.put("name",treeSet);

		treeSet.stream().forEach(set -> System.out.println(set));
	}
}
