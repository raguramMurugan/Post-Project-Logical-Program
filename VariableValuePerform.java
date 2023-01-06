package logicalProgram;

public class VariableValuePerform {
	public static String[] input= {"--X","++X","++X","--X","++X","++X"};
	
	public static void main(String[] args) {
		
		int count=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i].charAt(1)=='+')
			{
				count++;
			}
			else {
				count--;
			}
			System.out.println(count);
		}
		
	}

}
