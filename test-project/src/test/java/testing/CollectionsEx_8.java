package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a program to convert Array to List?
public class CollectionsEx_8 {
public static void main(String[] args)
{
	int arr[]= {2,4,6,8,10};
	List<Integer> list= new ArrayList<Integer>();
	
	for(int i : arr)
	{
		list.add(i);
		
	}
	//List<Integer> list = Arrays.asList(arr); 
		for(int s: list)
	{
		System.out.print(s+" ");
	}
	
}
}
