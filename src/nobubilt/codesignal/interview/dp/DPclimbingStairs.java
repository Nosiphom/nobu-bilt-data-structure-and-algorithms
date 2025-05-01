package nobubilt.codesignal.interview.dp;

import java.util.HashMap;
import java.util.Map;

public class DPclimbingStairs {

/**
 * The task is related to climbing stairs. Imagine you have to climb n stairs, 
 * starting with stair number 0. At each step, you can either climb 1 stair or 2 stairs. 
 * The task is to compute the total number of distinct ways you can climb the n stairs 
 * using dynamic programming. Avoid using a brute-force approach.

For example, for n = 4, the output should be totalWays(n) = 5, as 4 = 1 + 1 + 1 + 1,
 4 = 1 + 1 + 2, 4 = 1 + 2 + 1, 4 = 2 + 1 + 1, and 4 = 2 + 2, totaling to 5 different ways.
 */
	 public static int totalWays(int n) {
	        // TODO: implement
	        
	        return totalWays(n, new HashMap<Integer, Integer>());
	    }
	    
	    public static int totalWays(int n, Map<Integer, Integer> memo)
	    {
	        if(memo.containsKey(n)){return memo.get(n);}
	        if(n <= 1)
	        {
	            memo.put(n, 1);
	            return 1;
	        }
	        if(n == 2)
	        {
	            memo.put(n, 2);
	            return 2;
	        }
	        int result = totalWays(n-1, memo) + totalWays(n-2, memo);
	        memo.put(n, result);
	        return result;
	    }
}
