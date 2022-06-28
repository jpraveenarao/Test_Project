package testing;

import java.util.HashMap;

//How To Iterate Or Loop Over HashMap (Map) In Java
//Iterating or looping Map Using keySet() and for each loop
public class CollecctionsEx_16 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");

		for (String key : map.keySet()) {
			System.out.println("key:" + key + "  value:" + map.get(key));
		}

	}
}
