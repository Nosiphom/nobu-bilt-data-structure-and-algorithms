package nobubilt.codesignal.array;

public class MaxSumForRangeKTwoPointers {
	/**
	 * // TODO: Implement the function to find maximum subarray sum of size k in numbers
	 *   maximumSum(new int[]{1, 2, 3, 4, 5, -6}, 1));
	 * 
	 * outcome = new int[]{5, 4} return maxSum and inx where it starts
	 * 	 					0   1  2   3    4  5  6   7
	 * maximumSum(new int[]{-2, -5, 6, -2, -3, 1, 5, -6}, 2)
	 * outcome =  new int[]{6, 5} inx = 5 where {1, 5} = 6
	 * @param numbers
	 * @param k
	 * @return
	 */	
	 public int[] maximumSum(int[] numbers, int k) {
	        // TODO: Implement the function to find maximum subarray of size k in numbers
	        int left = 0;
	        long maximumSum = Integer.MIN_VALUE;
	        int inx = 0;
	        int right = 0;
	        long sumSoFar = 0;
	    
	        while(right < numbers.length)
	        {
	            while(right < numbers.length && right - left + 1 <= k)
	            {
	                sumSoFar += numbers[right];
	                ++right;
	            }
	    //        delta = right - left + 1;
	   //         System.out.println("delta: " + delta + " sumSoFar "+ sumSoFar); 
	            if(right - left == k)
	            {
	                if(sumSoFar > maximumSum)
	                {
	                  maximumSum = sumSoFar;
	                  inx = left;
	                }
	             sumSoFar = sumSoFar - numbers[left];
	             ++left;
	            }
	        }
	        return new int[]{(int)maximumSum, inx}; // Placeholder implementation
	    }
}
