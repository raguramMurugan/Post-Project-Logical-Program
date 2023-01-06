package logicalProgram;

import java.util.Arrays;

public class ConcatenateTheArray {
	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5};
		int[] array2= {6,7,8,9};
		
		int[] result=new int[array1.length +array2.length];
		
		int count=0;
		for(int value:array1)
		{
			result[count]=value;
			count++;
		}
		
		for(int value:array2)
		{
			result[count]=value;
			count++;
		}
		
		System.out.println(Arrays.toString(result));
	}

}
