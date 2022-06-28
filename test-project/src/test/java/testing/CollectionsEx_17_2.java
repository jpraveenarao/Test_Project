package testing;

//sort HashMap by values
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsEx_17_2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");
		System.out.println("Berfore sorting HashMap");
		Set set = hashmap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Map<Integer, String> newmap = sortByValue(hashmap);
		for (Map.Entry<Integer, String> en : newmap.entrySet()) { 
			System.out.println("Key = " + en.getKey() + 
						", Value = " + en.getValue()); 
		}
	}

	public static HashMap<Integer,String> sortByValue(HashMap<Integer, String> hm) 
	{ 
		// Create a list from elements of HashMap 
		List<Map.Entry<Integer, String> > list = 
			new LinkedList<Map.Entry<Integer, String> >(hm.entrySet()); 

		// Sort the list 
		Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() { 
			public int compare(Map.Entry<Integer, String> o1, 
							Map.Entry<Integer, String> o2) 
			{ 
				return (o1.getValue()).compareTo(o2.getValue()); 
			} 
		}); 
		
		// put data from sorted list to hashmap 
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>(); 
		for (Map.Entry<Integer, String> aa : list) { 
			temp.put(aa.getKey(), aa.getValue()); 
		} 
		return temp; 
	} 

}
