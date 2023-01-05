package logicalProgram;

public class ReverseStringProgram {
	public static void main(String[] args) {
		
		String str="Malayalamuu";
		
		//Approach 1
		char[] chArray=str.toCharArray();
		for(int i=chArray.length-1; i>=0; i--)
		{
			System.out.print(chArray[i]+" ");
		}
		System.out.println();
		
		
		//Approach 2
		for(int i=str.length()-1; i>=0;i--)
		{
			
			System.out.print(str.charAt(i)+" ");
		}
	}

}
