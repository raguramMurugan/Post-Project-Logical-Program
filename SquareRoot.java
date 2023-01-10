package logicalProgram;

class SquareRoot
{
	public static void main(String[] args)
	{
		//System.out.println("Kindly Enter a Number to check the Square-root value:");
		int user=121;
		
		int start=0;
		int end=user;
		
		if(user<2)
		{
			System.out.println(user);
		}
		
		while(start <= end)
		{
			int mid=(start + end)/2;
			
			if(mid*mid==user)
			{
				System.out.println("Square Root Value is :"+mid);
				break;
			}
			else if(mid*mid > user)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;	
				}
		}
		
	}
	
}
