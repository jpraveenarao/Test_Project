package testing;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
		int sum=0,temp,n,a;
		n=154;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
			
		}
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}else
			System.out.println("Not Armstrong number");
		
	}

}
