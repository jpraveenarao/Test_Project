package testing;

import java.util.ArrayList;
import java.util.List;

//Q2 Write a program to convert List to Array. 
//Method 2 : Using toArray() method

public class CollectionsEx_2_2 {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(4);
		list.add(7);
		list.add(8);
		Integer[] arr =  list.toArray(new Integer[list.size()]);
		for(int n:arr)
		{
			System.out.print(n +" ");
		}
		
	}

}
