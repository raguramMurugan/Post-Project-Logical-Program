package logicalProgram;

public class MaximumNumberOfWords {
	
	public static void main(String[] args) {
		String[] userInput={"We are learning Java Programs", "Training will be for three Months so prepare well",
				"Improve your technical Skills ASAP"};
		
		int maximumCount=0;
		for(String word:userInput)
		{
			int countedwords=word.split(" ").length;
			maximumCount=Math.max(maximumCount,countedwords);
		}
		System.out.println("Maximum number of words is:"+" "+maximumCount);
}
}
