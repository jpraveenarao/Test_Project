package testing;
//Whenever  an object is created constructor is called.

public class Calculator {

	public  void add()
	{
		System.out.println("Adding numbers");
	}
	public void sub()
	{
		System.out.println("Substracting numbers");
		
	}
	public void div()
	{
		System.out.println("Dividing numbers");
	}
	public void multi()	{
		System.out.println("Multiplying numbers");
		
	}
	public Calculator()
	{
		System.out.println("Constructor is called");
	}
	
	public static void main(String[] args)
	{
		Calculator calc= new Calculator();
		/*calc.add();
		calc.div();
		calc.multi();
		calc.sub();*/
		}
}
