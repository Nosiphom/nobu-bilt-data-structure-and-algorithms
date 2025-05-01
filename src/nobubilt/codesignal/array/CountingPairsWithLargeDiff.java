package nobubilt.codesignal.array;

import java.util.Arrays;

public class CountingPairsWithLargeDiff {
	
	/**
	* You are provided with an array of n integers, which are guaranteed to be distinct.
	*  The task requires you to craft a function solution that returns the count of pairs 
	*  of numbers whose absolute difference is more than 10. The solution should find 
	*  the answer within 3 seconds, so pay attention to write a time-efficient one.

	Constraints:
	1≤n≤100000    −100000≤arr[i]≤100000
	The array consists of distinct integers.
	Example: For arr = [-20, -10, 0, 10, 20], the output should be 6. Pairs with a 
	difference of more than 10 include (-20, 0), (-20, 10), (-20, 20), (-10, 10), 
	(-10, 20), and (0, 20).

	Cosmo • Yesterday
		       */

	 public long solution(int[] arr) {
    
		 Arrays.sort(arr);
	        /**
	           0    1   2  3  4
	        [-20, -10, 0, 10, 20]
	        l -20, 20
	        -20 10
	        -20 0
	        -10 20
	        -10 10
	        0
	        -10 (len-inx + 1) 2
	        0 1
	        */
	    
	       
	       
	        int len = arr.length;
		        int counter = 0;
		        int left = 0;
		        int right = 0;
		        while(left < len)
		        {
		            while(right < len && Math.abs(arr[right] - arr[left]) <= 10)
		            {
		                ++right;
		            }
		            if(right < len)
	                {
	                     counter += len - right;
	                }     
		            left++;
		        }
	        
	        return counter;
	    }
}
