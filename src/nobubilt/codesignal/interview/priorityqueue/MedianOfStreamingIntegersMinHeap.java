package nobubilt.codesignal.interview.priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MedianOfStreamingIntegersMinHeap {

	/**
	 * You are given an array of integers and are required to return an array
	 *  of medians computed as you add each integer from the given array. The 
	 *  median is the middle value of a sorted array. If the array contains an 
	 *  even number of elements, the median is the average of the two middle values.

Starting with an empty list, insert one number at a time from the given array 
into the list, and after each insertion, calculate the median value of the 
list and append it to the output array. Repeat this process until you have 
inserted all numbers from the given array. Note that it is not allowed to 
use built-in methods like sort() or Arrays.sort(), you should efficiently 
use heap to calculate the median of the given stream of numbers.

 assertEquals(Arrays.asList(2.0, 1.5, 2.0, 3.5, 2.0), 
 findStreamMedian(Arrays.asList(2, 1, 5, 6, 2)));

The expected time complexity is O(nlogn).
	 * @param numbers
	 * @return
	 */ 
	 public static List<Double> findStreamMedian(List<Integer> numbers) {
        // TODO: implement the function 06
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        List<Double> result = new ArrayList<>();
        for(int inx = 0; inx < numbers.size(); inx++)
        {
            int num = numbers.get(inx);
            addNumbers(num, minHeap, maxHeap);
            balanceQueues(minHeap, maxHeap);
            result.add(getMedian(minHeap, maxHeap));
        }
        return result;
    }
	    
	    public static double getMedian(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap)
	    {
	        double outcome = 0.0;
	         
	        if(minHeap.size() == maxHeap.size())
	        {
	            outcome = (minHeap.peek() + maxHeap.peek())/2.0;
	        }
	        else if( minHeap.size() > maxHeap.size())
	        {
	            outcome = (double)minHeap.peek();
	        }
	        else
	        {
	            outcome = (double)maxHeap.peek();
	        }
	        return outcome;
	    }
	    
	    public static void balanceQueues(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap)
	    {
	        PriorityQueue<Integer> smallerHeap = minHeap.size() <= maxHeap.size() ? minHeap : maxHeap;
	        PriorityQueue<Integer> largerHeap = minHeap.size() > maxHeap.size() ? minHeap : maxHeap;
	        
	        if(largerHeap.size() - smallerHeap.size() >= 2)
	        {
	            smallerHeap.add(largerHeap.poll());
	        }
	    }
	    public static void addNumbers(int num, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap)
	    {
	        if(maxHeap.isEmpty() || num < maxHeap.peek())
	        {
	            maxHeap.add(num);
	        }
	        else
	        {
	            minHeap.add(num);
	        }
	    }
	
}
