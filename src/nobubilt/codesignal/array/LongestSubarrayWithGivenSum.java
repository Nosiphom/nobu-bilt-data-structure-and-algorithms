package nobubilt.codesignal.array;

import java.util.ArrayList;
import java.util.List;

public class LongestSubarrayWithGivenSum {
/**
 * You are given an array of n positive integers, where n ranges from 
1 to 500000, inclusive, and each number in the array is between 1 and 1000. Your task is to 
find the longest subarray such that the sum of its elements equals a predetermined number, k.
You have to write a Java method getLongestSubarray that will receive the list of integers, 
array, and the predetermined number, k, as inputs, and will return a List representing the 
longest subarray whose sum of elements equals k. The length of the LongestSubarray should be 
maximized. If no such subarray is found, the function should return an empty List. If there are 
multiple longest subarrays with a sum equal to k, return the one that occurs earlier.
For example, if the given array is {1, 2, 3, 4, 5} and k is 5, the method should return {2, 3} 
because this subarray is the longest that sums up to the k value.

When solving this task, you can use a two-pointer technique where both pointers move towards 
the right. This approach will help to solve the task using linear time complexity, achieving 
the expected time complexity of O(n). Try to construct your solution keeping these key points 
in mind; your solution should be both efficient and effective.
 */
	
	
	
	 public List<Integer> getLongestSubarray(List<Integer> array, int k) {
	        // TODO: implement function
	        List<Integer> longestSubArray = new ArrayList<>();
	        int left = 0;
	        int right = 0;
	        int sumSoFar = 0;
	        int longestDelta = 0;
	        int[] coord = new int[2];
	        while(right < array.size())
	        {
	            sumSoFar += array.get(right);
	            
	            while(sumSoFar > k && left < array.size()) 
	            {
	                sumSoFar = sumSoFar - array.get(left);
	                ++left;
	            }
	           
	            if(sumSoFar == k)
	            {
	           //     System.out.println("right: " + right + " left " + left );
	                if(right - left + 1> longestDelta)
	                {
	                   coord[0] = left;
	                   coord[1]= right;
	                   longestDelta = right - left+1;
	                   sumSoFar = sumSoFar - array.get(left);
	                  ++left;
	                }
	            }
	            ++right;
	            
	        }
	        int inx = coord[0];
	        while( inx<= coord[1])
	        {
	            longestSubArray.add(array.get(inx));
	            ++inx;
	        }
	        return longestSubArray;
	    }
}
