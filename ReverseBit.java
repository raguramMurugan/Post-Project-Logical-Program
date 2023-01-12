package logicalProgram;

public class ReverseBit {
	public static void main(String[] args) {
		int n=0101;
		System.out.println(reverseBit(n)); 
	}

	private static int reverseBit(int n) {
		int reverse=0;
		for(int i=1; i<=32;i++)
		{
			reverse=reverse + (n&1);
			n=n>>1;
		
		if(i<=31)
		{
			reverse=reverse<<1;
		}
	}
			return reverse;
}

}
