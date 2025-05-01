package nobubilt.codesignal.interview.priorityqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KmostFreqMinHeap {

	/**
	 * You are given an array of n integers where some integers are repeated.
	 *  Write a function in Java that takes this array and an integer k as 
	 *  inputs. The function needs to return the k most frequent elements 
	 *  from the array in descending order of their frequency. If two numbers
	 *   have the same frequency, return them in ascending order. You should 
	 *   optimize your solution by leveraging Java's PriorityQueue class.

The expected time complexity of the solution should be O(nlogk).

       assertEquals(Arrays.asList(4, 1), 
       solution(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4}, 2));

   
	 * @param nums
	 * @param k
	 * @return
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	  public static List<Integer> solution(int[] nums, int k) {
		  // TODO: Implement function to return the k most frequent integers
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        
        for(int num : nums)
        {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0)+1);
        }
        PriorityQueue<ElementRecord> minHeap = new PriorityQueue<>
        (new ElementRecordComparator());
        
        for(int key : occurrenceMap.keySet())
        {
            minHeap.add(new ElementRecord(occurrenceMap.get(key), key));
            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }
        
        List<Integer> result = new ArrayList<>();
        while(!minHeap.isEmpty())
        {
            result.add(minHeap.poll().val);
        }
        Collections.reverse(result);
        return result;
    }
    
		    
		}
/**
 * Your ElementRecordComparator is set up to prioritize lower frequencies and, 
 * in case of ties, lower values. This is correct for a min-heap, but when you 
 * extract elements, they need to be in descending order of frequency and 
 * ascending order of value.
 * 
 *
 */
		class ElementRecordComparator implements Comparator<ElementRecord>
		{
		    public int compare(ElementRecord p1, ElementRecord p2)
		    {
		        if(p1.freq == p2.freq)
		        {// doing opposite of what Collections.reverse will do.
		            return  p2.val-p1.val; 
		        }
		        return p1.freq - p2.freq;
		    }
		}

		class ElementRecord
		{
		    int freq;
		    int val;
		    ElementRecord(int f, int v)
		    {
		        this.freq = f;
		        this.val = v;
		    }
		}

