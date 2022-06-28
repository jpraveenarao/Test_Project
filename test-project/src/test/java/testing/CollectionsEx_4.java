package testing;

import java.util.ArrayList;

//Given an element write a program to check if element(value) exists in ArrayList?
public class CollectionsEx_4 {
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(17);
		al.add(5);
		al.add(6);
		al.add(10);
		
		if(al.contains(11))
		{
			System.out.println("Given element found");
		}else
		{
			System.out.println("Not found");
		}
		
		
	}

}
