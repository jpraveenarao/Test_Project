package testing;
//Sort HashMap by keys
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class CollectionsEx_17 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(22, "A");
		map.put(55, "B");
		map.put(33, "Z");
		map.put(44, "M");
		map.put(99, "I");
		map.put(88, "X");
		System.out.println("Before sorting HashMap");
		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("After sorting HashMap");
		Map<Integer, String> tmap = new TreeMap<Integer, String>(map);
		Set set = tmap.entrySet();
		Iterator itr1 = set.iterator();
		while (itr1.hasNext())
		{
			Map.Entry tentry = (Entry) itr1.next();
			System.out.println(tentry.getKey() + ":" + tentry.getValue());
		}
	}
}
