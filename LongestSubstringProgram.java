package logicalProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringProgram {
	
	public static void main(String[] args) {
		
		longestSubstringValue("abbac");
	}

	private static void longestSubstringValue(String userInput) {
	
		String longestSubString=null;
		int lengthOfTheString=0;
		char[] arr=userInput.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0; i< arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else {
				i=map.get(ch);
				map.clear();
			}
			
		}
		if(map.size() > lengthOfTheString)
		{
			longestSubString=map.keySet().toString();
			lengthOfTheString=map.size();
			
		}
		System.out.println("Length of the String is:"+ " "+lengthOfTheString );
		System.out.println("Longest Substring is:"+" "+longestSubString);
		
		
		
	}

}
