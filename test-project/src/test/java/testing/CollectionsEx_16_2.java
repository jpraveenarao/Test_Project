package testing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



//How To Iterate Or Loop Over HashMap (Map) In Java
//Iterating or looping Map Using keySet() and  iterator
public class CollectionsEx_16_2 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
	
	Set<String> keySet=map.keySet();
	Iterator<String> itr= keySet.iterator();
	while(itr.hasNext())
	{
		String key= itr.next();
		System.out.println("key: "+key+"value: "+map.get(key));
	}
	

}
}
