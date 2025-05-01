package nobubilt.codesignal.interview.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDetectDuplicateIndice {
	/**
	 * You are given an array of integers and an integer k. Your task is 
	 * to determine whether there are two distinct indices, i and j, in 
	 * the array such that nums[i] = nums[j] and the absolute difference 
	 * between i and j is at most k. Return True if such a pair exists 
	 * and False if not.

	The expected time complexity is O(n), where n is the length of the array.
	        assertFalse(solution(new int[]{1, 2, 3, 4, 5}, 3));
	        assertTrue(.solution(new int[]{1, 2, 3, 4, 5, 1}, 5));
	 */

	public static boolean solution(int[] nums, int k) {
        // TODO: implement solution    
        /**
        0  1  2  3  4  5  6  7    
        4  5  6  9  6
        */
        Map<Integer, Integer> indexOccMap = new HashMap<>();
        for(int inx = 0; inx < nums.length; inx++)
        {
            if(indexOccMap.containsKey(nums[inx]))
            {
                if(inx - indexOccMap.get(nums[inx]) <= k )
                {
                    return true;
                }
            }
            else
            {
                 indexOccMap.put(nums[inx], inx);                
            }

        }
        return false;
    }
}
