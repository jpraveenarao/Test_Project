package testing;

import java.util.ArrayList;
import java.util.List;
//Q2 Write a program to convert List to Array
//Using ArrayList get() method

public class CollectionsEx_2
{
public static void main(String[] args)
{
	List<String> al = new ArrayList<String>();
	 al.add("apple");
	 al.add("ball");
	 al.add("cat");
	 String arr[]= new String[al.size()];
	 for(int i=0;i<al.size();i++)
	 {
		 arr[i]=al.get(i);
	 }
	 
	 for(String s:arr)
	 {
		 System.out.print(s+ " ");
	 }
	

}
}
