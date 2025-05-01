package nobubilt.codesignal.math;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrefixMedianWithPriorityQueues {
/**
 * Given an array of unique integers with elements ranging from 
1 to 10 to the power 6 and length between 1 to 1000, we need to create a Java 
method prefixMedian(). This method will take the array as input and return a
 corresponding array, which consists of the medians of all the prefixes of the 
 input array.

Remember that a prefix of an array is a contiguous subsequence that starts from 
the first element. The median of a sequence of numbers is the middle number when 
the sequence is sorted. If the length of the sequence is even, the median is the 
element in the position length / 2 - 1.
// sorted 1 2 3 8 9
For example, consider an input array {1, 9, 2, 8, 3}. The output of your method 
should be {1, 1, 2, 2, 3}.
 * @param arr
 * @return
 */
	  
	  public static void main(String[] args) {
	        int[] arr = {1, 9, 2, 8, 3};
	        int[] medians = prefixMedian(arr);
	        
	        System.out.println("Final Medians Array: " + Arrays.toString(medians)); // [1, 1, 2, 2, 3]
	    }	  
	  
	    public static int[] prefixMedian(int[] arr) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	        int[] medians = new int[arr.length];
	        
	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];
	            if (!maxHeap.isEmpty() && num < maxHeap.peek()) {
	                maxHeap.add(num);
	            } else {
	                minHeap.add(num); 								// 1  9  2  8   3
	        }
	        
	        if (maxHeap.size() > minHeap.size()) {
	            minHeap.add(maxHeap.poll());
	        } else if (minHeap.size() > maxHeap.size() + 1) {  // 1  9
	            maxHeap.add(minHeap.poll());   				// maxHeap 1 2       minHeap  9 8 3
	        }
	        
	        if (minHeap.size() == maxHeap.size()) {
	            medians[i] = maxHeap.peek();          // 1 2
	        } else {
	            medians[i] = minHeap.peek();     // 1  2  3
	        }
	    }
	    
	    return medians;
	}
	  
	
}
