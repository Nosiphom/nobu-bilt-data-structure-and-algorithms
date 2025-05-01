package nobubilt.codesignal.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCumulativeSumQuery {
	// int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
/**
 * You are given an array of n integers and several queries. Each query is a pair (l, r), 
 * where l and r represent inclusive indices within the array. Your task is to define a 
 * function named solution that returns an array reflecting the maximum cumulative 
 * sum of integers between the indices l and r. More formally, for each (l, r), 
 * you should find the maximum sum of elements in the array with indices in the interval 
 * from l to m inclusive, where m in its turn is a number from l to r inclusive.

The array's element count, n, ranges from 1 to 1000, inclusive, with each element 
being an integer from -1000 to 1000, inclusive. The length of the list queries is at 
most 1000000. The index l is a non-negative number and is less than or equal to r, 
while r is non-negative and less than the total number of elements in the array.

Example:

For arr = [3, 1, -4, 2, -5, 1, 3, 6] and queries = [(0, 4), (2, 6), (2, 7)] the 
output should be [4, -2, 3].
2 d matrix max running sum
	[3, 1, -4, 2, -5,  1,  3, 6] 
    0  1   2   3   4   5   6   7    inx
    3  4   4   4   4   4   4   7    started from inx = 0 aka val 3
       1   1   1   1   1   2   4
           -4  -2 -2  -2  -2   3
               2   2   2   2   7
                  -5  -4  -1   5
                      1    4   10
                           3   9


 * @param args
 */


	
	
	 public List<Integer> solution(int[] arr, List<int[]> queries) {
	        // TODO: implement the function
	        int len = arr.length;
	        int[][] sumArr = new int[len][len];
	        for(int row[] : sumArr)
	        {
	            Arrays.fill(row, Integer.MIN_VALUE);
	        }
	        for(int left = 0; left < len; left++)
	        {
	            int runningSum = arr[left];
	            for(int right = left; right < len; right++)
	            {
	                if(right == left)
	                {
	                    sumArr[left][right] = runningSum;
	                    continue;
	                }
	                if(left !=right)
	                {
	                    runningSum += arr[right];
	                }
	                sumArr[left][right] = Math.max(runningSum, sumArr[left][right-1]);
	                
	             
	          //      System.out.print(sumArr[left][right] + " ");
	            }
	        }
	        List<Integer> result = new ArrayList<>();
	        for(int[] query : queries)
	        {
	            int left = query[0];
	            int right = query[1];
	            result.add(sumArr[left][right]);
	        }       
	        return result;
	    }
}
