package logicalProgram;

public class FindOneBit {
	public static void main(String[] args) {
		System.out.println(findOneBit(0001111));
	}
	private static int findOneBit(int n) {
		
		int count=0;
		while(n!=0)
		{
			if((n & 1)==1)
			{
				count++;
			}
				n=n>>>1;
		}
		return count;
	}

}
