package testing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//How To Iterate Through A HashSet/Set
// Iterate the HashSet using iterator
public class CollenctionsEx_3 {
	public static void main(String[] args)
	{
		HashSet<Integer>  hs= new HashSet<Integer>();
		
		hs.add(3);
		hs.add(6);
		hs.add(9);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		
	}

}
