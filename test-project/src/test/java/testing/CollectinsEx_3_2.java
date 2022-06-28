package testing;

import java.util.HashSet;

//How To Iterate Through A HashSet/Set
//Iterate the HashSet using iterator
public class CollectinsEx_3_2 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Tiger");
		hs.add("Zebra");
		hs.add("Goat");
		
		for(String s: hs)
		{
			System.out.print(s+ " ");
		}
		

	}

}
