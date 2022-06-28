package testing;
//Java Program to swap two numbers  without  using temporary variable 


public class SwappinWithoutTemp {
	public static void main(String[] args)
	{
	int x= 10;
	int y= 5;
	x= x+y;
	y=x-y;
	x=x-y;
	System.out.println("After SWapping "+ "x is:"+x+","+"y is:"+y);
	
	}
}
