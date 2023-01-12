package logicalProgram;

import java.util.Arrays;

public class ReverseStringMatrixArray {
	public static void main(String[] args) {
		int[] num= {5,4,3,2,1};
		
		System.out.println(reverseArrayMatrix(num));
		
	}

	private static String reverseArrayMatrix(int[] num) {
		
		int left=0;
		int right=num.length-1;
		int temp=0;
		
		while(left < right)
		{
			temp=num[left];
			num[left]=num[right];
			num[right]=temp;
			left++;
			right--;
		}
		
		return Arrays.toString(num);
	}
	

}
