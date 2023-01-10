package logicalProgram;


import java.util.*;
public class PlusOne
{
	public static void main(String[] args)
	{
		int [] array={9,9,9};
		int [] b=plusOne(array);
		
		System.out.println(Arrays.toString(b));
		
	}
	
	public static int[] plusOne(int[] array)
	{
		int i=array.length-1; // 3
		
		while(i>=0) // 3>=0-->True, 
		{
			if(array[i] !=9) // array[2]=6 6!=9-->True, 
			{
				array[i]=array[i] +1; //b[2]=6+1--> b[2]=7;
				return array;
			}
			array[i]=0;
			i--;
		}
		int [] b=new int[array.length+1];
		b[0]=1;
		return b;
	}
}
