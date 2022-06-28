package testing;

public class ReverseString {
	public static void main(String[] args)
	{
		String string= "Dream big";
		String reversestring=" ";
		for(int i=string.length()-1;i>=0;i--)
		{
			reversestring= reversestring+string.charAt(i);
		}
		System.out.println("Reverse String:"+reversestring);
	}

}
