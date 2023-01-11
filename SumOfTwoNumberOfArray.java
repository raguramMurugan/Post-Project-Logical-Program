package logicalProgram;

import java.util.Arrays;

/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.*/

public class SumOfTwoNumberOfArray {
	
	public static void main(String[] args) {
		int[] nums= {2,7,11,22};
		int target=50;
		System.out.println(Arrays.toString( sumOfTwoArray(nums,target)));
	}

	private static int[] sumOfTwoArray(int[] nums, int target) {
		
		for(int selectionIndex=0; selectionIndex<nums.length;selectionIndex++)
		{
			for(int scanningIndex=selectionIndex+1; scanningIndex<nums.length-1;scanningIndex++)
			{
				if(nums[selectionIndex] + nums[scanningIndex]==target)
				{
					return new int[] {selectionIndex,scanningIndex};
				}
				
			}
		}
		return new int[] {-1,-1};
		
	}

}
