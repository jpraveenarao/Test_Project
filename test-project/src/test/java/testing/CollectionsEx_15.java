package testing;

import java.util.HashMap;

// How to check if HashMap is empty? (Solution)
public class CollectionsEx_15 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		System.out.println("Is HahsMap empty:"+ map.isEmpty());
		
		map.put(1,"Rose");
		map.put(2,"Hibiscus");
		map.put(3,"Jasmine");
		
		
		System.out.println("Is HahsMap empty:"+ map.isEmpty());
		
	}

}
