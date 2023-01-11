package logicalProgram;

//Add Two Integer without using Addition Operation

public class AddTwoInteger {
	public static void main(String[] args) {
		System.out.println( addTwoInteger(2,4));
	}

	private static int addTwoInteger(int a, int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		
		int xorOperation=a^b;
		int andShiftByOne=a&b<<1;
		
		return addTwoInteger(xorOperation, andShiftByOne);
		
		
	}

}
