package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//How To Iterate Or Loop Over HashMap(Map)
//Iterating or Looping Map in Java using entrySet() and for each Loop
public class CollectionsEx_16_3 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		/*Set<Map.Entry<String,String>> entrySet= map.entrySet();
		for(Map.Entry entry: entrySet) {
			System.out.println("key: "+entry.getKey()+"value: "+entry.getValue());
		}*/
		for(Map.Entry<String,String> entry:map.entrySet())
		{
			System.out.println("key: "+entry.getKey()+"value: "+entry.getValue());
		}
		
	}

}
