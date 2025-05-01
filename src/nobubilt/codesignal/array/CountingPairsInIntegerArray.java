package nobubilt.codesignal.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingPairsInIntegerArray {
/**
 * Write a Java function named solution that calculates the number of pairs of elements 
 * in an array that have the same value. The function takes one parameter — an array of 
 * integers arr and should return an integer representing the number of pairs with equal 
 * values. An array can contain up to 100 elements, each being an integer ranging 
 * from -100 to 100, inclusive.

Time Constraints:

The solution should execute within 200 milliseconds for all inputs within the problem constraints.
Example: For arr = {1, 1, 2, 2, 1, 3}, the function should return 4. The reason being 
that there are three pairs of equal values (1, 1) and one pair (2, 2).
 */
	
	public int solution(int[] arr) {
        // TODO: implement
           Arrays.sort(arr); // 1 1 1 2 2 3 = 4
        // 1 1 1 2 2 3   
        int left = 0;
        
        int len = arr.length;
        int count = 0;
        while(left < len)
        {
            int right = left + 1;
            while(left < len && left <= right && right < len)
            {
                while(right < len  && arr[left] == arr[right])
                {
                    ++count;
                    ++right;
                }
                if(right == len || arr[left] != arr[right])
                {
                    break;
                }
                right = left + 1;
                
            }
            ++left;
        }
        return count;
    }
}
