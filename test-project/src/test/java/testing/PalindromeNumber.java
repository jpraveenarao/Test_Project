package testing;

public class PalindromeNumber {
	public static void main(String[] args)
	{
		int temp,n,r,sum=0;
		n=546;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
	}

}
