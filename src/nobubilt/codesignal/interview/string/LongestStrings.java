package nobubilt.codesignal.interview.string;

import java.util.PriorityQueue;

public class LongestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
		//the output should be solution(inputArray) = ["aba", "vcd", "aba"].		
		String[] results = solution(inputArray);
		for(String rec : results)
		{
			System.out.println(rec);
		}
	}

	static String[] solution(String[] inputArray) {
	    PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b) -> b.len-a.len);
	    PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b) -> a.inx-b.inx);

	    for(int inx = 0; inx < inputArray.length; inx++)
	    {
	        maxHeap.add(new Pair(inx, inputArray[inx].length()));
	    }
	    
	    int maxLen = maxHeap.peek().len;
	    while(maxHeap.peek().len == maxLen)
	    {
	        Pair curr = maxHeap.poll();
	        minHeap.add(curr);
	    }
	    String[] result = new String[minHeap.size()];
	   
	    for(int index=0; index < result.length; index++)
	    {
	        result[index] = inputArray[minHeap.poll().inx];
	        
	    }
	    return result;
	}	
}

class Pair
{
    int inx;
    int len;
    Pair(int index, int length)
    {
        this.inx = index;
        this.len = length;
    }
}