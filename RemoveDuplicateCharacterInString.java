package logicalProgram;

public class RemoveDuplicateCharacterInString {
	
	public static String str="apple";
	
	public static void main(String[] args) {
		char[] arrChar=str.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i< arrChar.length; i++)
		{
			boolean duplicate=false;
			for(int j=i+1;j<arrChar.length;j++)
			{
				if(arrChar[i]==arrChar[j])
				{
					duplicate=true;
					break;
				}
			}
			if(!duplicate)
			{
				sb.append(arrChar[i]);
			}
		}
		System.out.println(sb);
	}

}
