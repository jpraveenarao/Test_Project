package testing;

public class DuplicateCharacter {
	public static void main(String[]args)
	{
		String string1 = "Great responsibility";
		char string[]=string1.toCharArray();
		for (int i=0;i<string.length;i++)
		{
			int count =1;
			
			for(int j= i+1;j<string.length;j++)
			{
				if(string[i]== string[j]&&string[i] != ' ')
				{
					count++;
					 string[j] = '0';  
				}
				if(count>1&&string[j]!='0')
					System.out.println(string[i]+": "+count);
				
			}
			
			
		}
		
		
		 
	}

}
