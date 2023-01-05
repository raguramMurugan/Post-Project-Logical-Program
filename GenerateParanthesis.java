package logicalProgram;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesis {
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Kindly Enter the Number");
		int userInput=s.nextInt();
		generateParanthesis(userInput);
	}
	
	public static List<String> generateParanthesis(int n)
	{
		List<String> value=new ArrayList<>();
		generateValueParanthesis(value,0,0,n,"");
		System.out.println(value);
		return value;
		
	}

	private static void generateValueParanthesis(List<String> value, int open, int close, int n, String str) {
		if(str.length()==2*n)
		{
			value.add(str);
			return;
		}
		
		if(open<n)
		{
			generateValueParanthesis(value, open+1, close, n, str+"(");
		}
		
		if(close<open)
		{
			generateValueParanthesis(value, open, close+1, n, str+")");
		}
		}
	}
