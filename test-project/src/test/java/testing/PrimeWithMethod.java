package testing;

public class PrimeWithMethod {
	static  void isPrime(int n)
	{
		if (n<=1)
		{
			System.out.println("Not Prime");
			
		}
		for(int i=2;i<n/2;i++)
		{
		if(n%2==0)
		{
			System.out.println("Not prime");
			break;
			
		}else
			System.out.println("Prime");
	}
	}
	public static void main(String[] args)
	{
		isPrime(7);
		isPrime(10);
		
	}

}
