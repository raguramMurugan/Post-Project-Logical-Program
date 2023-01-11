package logicalProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//find the Top K repeated element in an Array

public class ToKFrequentElement{
	public static void main(String[] args) {
		int[] valueArray= {1,1,1,2,2,2,3,4,4,4,5,5,5,5,5};
		
		System.out.println(topRepeatedElement(valueArray,1));
		
	}

	private static String topRepeatedElement(int[] valueArray, int k) {
		
		Map<Integer, Integer> map=new HashMap<>();
		
		
		for(int i:valueArray)
		{
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		PriorityQueue< Integer> maxHeap=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
		
		for(int key:map.keySet())
		{
			maxHeap.add(key);
		}
		
		int[] result=new int[k];
		
		for(int i=0;i<k;i++)
		{
			result[i]=maxHeap.poll();
		}
		return Arrays.toString(result);
		
	

}
}