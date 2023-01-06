package logicalProgram;

public class BuildArrayFromPermutation {
	
	public static int[] nums= {0,2,1,5,3,4};

	public static void main(String[] args) {
		
		int n=nums.length;
		
		for(int i=0;i<n;i++)
		{
			nums[i]=nums[i] + (nums[nums[i]]%n)*n;
			
		}
		
		for(int i=0;i<n;i++)
		{
			nums[i]=nums[i]/n;
			System.out.print(nums[i]);
		}
	}
	

}
