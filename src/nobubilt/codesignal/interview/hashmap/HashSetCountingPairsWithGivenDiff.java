package nobubilt.codesignal.interview.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashSetCountingPairsWithGivenDiff {
/**
 * You are given an array of n integers and a number k. Your task is 
 * to calculate the number of distinct pairs in the array that have 
 * a difference of k. A pair consists of two integers that are 
 * different, and the absolute difference between the integers is exactly k.
assertEquals(3, countPairsWithDiffK(new int[]{1, 5, 3, 4, 2}, 2));
assertEquals(42, countPairsWithDiffK(new int[]{1, 1, 1, 1, 1, 1, 1}, 0));
The solution is expected to have linear time complexity, i.e., O(n).
 */
 
    public static int countPairsWithDiffK(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        int count = 0;

        // Count occurrences of each number
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        // Iterate through the map to find pairs
        for (int num : numCount.keySet()) {
            if (k == 0 ) {
                int n = numCount.get(num);
                System.out.println("n: " + n);
               //{1, 1, 1, 1, 1, 1, 1}  k = 0 
              //permutations: if 7 1s then 1 can b paired 6 times with other 1s
                count += n * (n - 1);  // 7 * (7-1)=> 7 * 6 = 42 (final answer)
            }
            else
            {  // {-1, 0, 1, 2, 3, 4, 5}, 4)   
                if (numCount.containsKey(num + k)) {
                	// num = -1, num+k => -1 + 4=3
                	//numCount.get(-1)=> 1 * numCount.get(-1 + 4) = 1 * 1= 1 
                    count += numCount.get(num) * numCount.get(num + k);
                }
                // num = 4, num-k=> 4-4=0
            	//numCount.get(4)=> 1 * numCount.get(4-4) = 1 * 1= 1 
                if (k != 0 && numCount.containsKey(num - k)) {
                    count += numCount.get(num) * numCount.get(num - k);
                }
            }
        }
        if(k == 0){return count;}

        return count/2; // Each pair is counted twice
    }
}
