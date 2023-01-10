package logicalProgram;

import java.util.Stack;
class Valid
{
public static void main(String[] args)
{
String str="{}[]()";
boolean result=validBrackets(str);
System.out.println(result);
}

public static boolean validBrackets(String str)
{
	
	Stack <Character> st=new Stack<>();
	
	for(int i=0; i< str.length(); i++)
	{
		
		
		
		if(str.charAt(i)=='[' ||
		   str.charAt(i)=='{' ||
		   str.charAt(i)=='(' )
		   {
			   st.push(str.charAt(i));
		   }
		   else{
			   if(!st.isEmpty() && (
			   (str.charAt(i)==']' && st.peek()=='[') ||
		       (str.charAt(i)=='}' && st.peek()=='{' )||
			   (str.charAt(i)==')' && st.peek()=='(')))
			   {
				   st.pop();
			   }
			   else{
				   st.push(str.charAt(i));
			   }
		   }
		
	}
	  return st.isEmpty()? true : false;
}


}