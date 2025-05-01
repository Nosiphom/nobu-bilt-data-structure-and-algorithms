package nobubilt.codesignal.interview.dp;

import java.util.Arrays;

public class CoinChangeWaysDP {
/**
 * In this task, your goal is to find the number of distinct ways you can make change 
 * for a target amount, given an array of available coin denominations. Specifically, you 
 * need to write a Java method coinChange(int[] coins, int amount), where:
coins is an array of integers representing the available denominations. Each 
denomination can be used an unlimited number of times. This array contains unique numbers.
amount is a non-negative integer representing the target amount.
The method should return an integer — the number of distinct ways you can combine the 
coins to sum up to the target amount. If there is no possible combination that would 
result in the target amount, return 0.

The expected time complexity of your solution is O(amount * coins.length).
// Example 1:
int result1 = coinChange({1, 2, 5}, 11); 
// result1 should be 11

// Example 2:
int result2 = coinChange({2}, 3);
// result2 should be 0
 * 
 *         assertEquals(4, .coinChange(new int[]{1, 2, 3}, 4));
 *         1 1 1 1
 *         2 2
 *         1 3
 *         1 1 2
 * @param coins
 * @param amount
 * @return
 */
	
	 public static int coinChange(int[] coins, int amount) {
	        // TODO: implement the dynamic programming solution
	        int[] cashWays = new int[amount+1];
	        Arrays.fill(cashWays,0);
	        cashWays[0] = 1;
	        for(int coinInx = 0; coinInx < coins.length; coinInx++)
	        {
	            int coin = coins[coinInx];
	            for(int cashInx =  1; cashInx <= amount; cashInx++)
	            {
	                if(coin <= cashInx)
	                {
	                    cashWays[cashInx] = cashWays[cashInx - coin] + cashWays[cashInx];
	           ///         System.out.println("cashInx: " + cashInx + " cashWays[cashInx - coin]: "+ cashWays[cashInx - coin] + " cashWays[cashInx]: " + cashWays[cashInx] + "  coin: " + coin  + " amount: "+ amount);
      
	                }
	            }
	        }
	        
	        return cashWays[amount];
	    }
	
	
	//  System.out.println("cashInx: " + cashInx + " cashWays[cashInx - coin]: "+ cashWays[cashInx - coin] + " cashWays[cashInx]: " + cashWays[cashInx] + "  coin: " + coin  + " amount: "+ amount);

	
}
