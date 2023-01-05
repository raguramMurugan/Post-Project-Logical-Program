package logicalProgram;

public class RemoveSpecialCharacterProgram {
	
	public static String str="@^%R$a&gu@Ram*^@";
	
	public static void main(String[] args) {
		String resultString=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("After Replacing the Special Character:"+" "+resultString );
	}

}
