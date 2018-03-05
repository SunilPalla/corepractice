package collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sunilp on 1/31/18.
 */
public class TreeMapImpl {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap =
				new TreeMap<Integer, String>();
		tmap.put(100,"Amit");
		tmap.put(102,"Ravi");
		tmap.put(101,"Vijay");
		tmap.put(103,"Rahul");

		for(Map.Entry m:tmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		/*TreeMap<String, String> map = new TreeMap<>();
		map.put("c", "val");
		map.put("b", "val");
		map.put("a", "val");
		map.put("e", "val");
		map.put("d", "val");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}*/

	}
}
