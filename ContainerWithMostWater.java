package logicalProgram;

//Write a Java Program to find the Container with Most Water Logged

public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] heightOfWaterLogged= {1,8,6,2,5,4,8,3,7};
		int result=maximumWaterLogged(heightOfWaterLogged);
		System.out.println(result);
	}

	private static int maximumWaterLogged(int[] heightOfWaterLogged) {
		
		int leftPointer=0;
		int rightPointer=heightOfWaterLogged.length-1;
		int maxArea=0;

		while(leftPointer<rightPointer)
		{
			int length=rightPointer-leftPointer;
			int height=Math.min(heightOfWaterLogged[leftPointer],heightOfWaterLogged[rightPointer]);
			int area=length * height;
			maxArea=Math.max(maxArea, area);
			
			if(heightOfWaterLogged[leftPointer] < heightOfWaterLogged[rightPointer])
			{
				leftPointer++;
			}
			else {
				rightPointer--;
			}
		}
		return maxArea;
	}

}
