package nobubilt.codesignal.interview.dp;

import java.util.Arrays;

public class MinimumNumberOfPerfectSquaresDP {
/**
 * dp[0] = 0;
 * dp [1 = 1
 * 
 * You are given a positive integer n. Your task is to find the minimal number of 
 * perfect squares that sum up to n. A perfect square is an integer that is the square 
 * of some other integer. For example, 1, 4, 9, and 16 are perfect squares, 
 * but 2 and 3 are not. It is allowed to use the same perfect square multiple times.

For instance, given n equals 13, return 2 because 13 can be expressed as 
4 (2×2) + 9 (3×3); therefore, the function should return 2 (the number of 
perfect squares that sum to 13).
// 12   (2x2), (2x2), (2x2)

The expected time complexity for this algorithm is O(n⋅Math.sqrt(n)).
 * @param n
 * @return
 */
	 public static int minNumOfSquares(int n) {
	        // TODO: implement the function
	        int[] dp = new int[n+1];
	        Arrays.fill(dp, Integer.MAX_VALUE);
	        dp[0]  = 0;
	        for(int num = 1; num <= n; num++)
	        {
	            for(int squareInx = 1; squareInx <= Math.sqrt(num); squareInx++)
	            {
	                int square = squareInx * squareInx;
	                if(square == num)
	                {
	                    dp[num] = 1;
	                }// 12   (2x2), (2x2), (2x2)
	                else
	                {
	               /** 
	               * n = 1 dp[0], dp[1], dp[2]=2, dp[3]=dp[3-1]+1=> 3
	               * n = 4 dp[4-1]+1 => 4 (1x1)+(1x1)+(1x1)+(1x1),
	               *       dp[4] from (2x2) => 1
	               */	
	              //  	System.out.println( squareInx+ " num: "+ num + " dp[num]: " + dp[num]
	              //  			+ "  dp[num-square]: " +dp[num-square] + " dp[num-square] + 1: "+sum);
	                    dp[num] = Math.min(dp[num], dp[num-square] + 1);
	                }
	                
	            }
	        }
	        return dp[n];
	    }
}
