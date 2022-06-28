package testing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//How To Iterate Or Loop Over HashMap(Map)
//Iterate or Loop HashMap in Java Using entrySet() and java iterator
public class CollectionsEx_16_4 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		Set<Map.Entry<String,String>>entrySet =map.entrySet();
		
		Iterator <Map.Entry<String,String>>itr=entrySet.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
			
		}
		
	}

	

}
