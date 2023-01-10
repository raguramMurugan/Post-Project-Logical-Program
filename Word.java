package logicalProgram;

public class Word
{
	public static void main(String[] args)
	{
		String [] str={"Ragu", "Raguram", "Raguram Sumi"};
		String result=wordCompare(str);
		System.out.println(result);
	}
	
	public static String wordCompare(String[] str)
	{
		if(str==null || str.length==0)
		{
			return null;
		}
		String first_word=str[0];
		
		int j=0;
		
		String second_word=str[1];
		
		for(int i=0; i< str.length; i++)
		{
			
			while(j<first_word.length()&& j<second_word.length() && 
					first_word.charAt(j)== second_word.charAt(j))
			{
				j++;
			}
			
			if(j==0)
			{
				return "No Common word";
			}	
			first_word=second_word.substring(0,j);
		}
		return first_word;
	}
}
