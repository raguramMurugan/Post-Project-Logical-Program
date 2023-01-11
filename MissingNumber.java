package logicalProgram;

//Find the Missing number in the Given Array

public class MissingNumber {
	public static void main(String[] args) {
		int[] values= {0,1,2,3,4,5,7,8,9};
		System.out.println(missingNumberArray(values)); 
	}

	private static int missingNumberArray(int[] values) {
		int result=values.length;//8
		for(int i=0; i<values.length;i++)
		{
			result=result ^ i ^ values[i]; 
		}
		return result;
		
		
	}

}
