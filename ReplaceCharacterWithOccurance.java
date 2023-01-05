package logicalProgram;

public class ReplaceCharacterWithOccurance {
	
	public static String str="Oppenheimer";
	public static char replaced='p';
	
	public static void main(String[] args) {
		
		int count=1;
		
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==replaced)
			{
				str=str.replaceFirst(String.valueOf(replaced), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
	}

}
