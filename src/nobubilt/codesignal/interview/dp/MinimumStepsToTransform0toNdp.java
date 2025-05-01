package nobubilt.codesignal.interview.dp;

import java.util.Arrays;

public class MinimumStepsToTransform0toNdp {
	
/**
 * Given a number, you can perform only two types of operations with it:

Add 1
Multiply by 2
Write a function minSteps(int n) that takes an integer n and computes the minimum 
number of steps required to transform the number 0 into the number n.

You should solve this task with O(n) time complexity using dynamic programming.

For example, minSteps(8) = 4, because:

Start from 0
Add 1 to get 1 (1 step)
Multiply by 2 to get 2 (1 step)
Multiply by 2 again to get 4 (1 step)
Multiply by 2 one more time to get 8 (1 step)

 * Initialization: Start with an array steps where steps[0] = 0 because no 
 * steps are needed to reach 0.

Iterate and Calculate: For each number i from 1 to n:

Calculate the steps to reach i by adding 1 to i-1.
If i is even, also consider reaching i by multiplying i/2 by 2.
Choose Minimum: For each i, choose the minimum steps from the two options above.

Here's a hint: Use steps[i] = Math.min(steps[i - 1] + 1, steps[i / 2] + 1) when i is even. 
How can you incorporate this into your loop? 
For example, minSteps(8) = 4, because:

Start from 0
Add 1 to get 1 (1 step)
Multiply by 2 to get 2 (1 step)
Multiply by 2 again to get 4 (1 step)
Multiply by 2 one more time to get 8 (1 step)
		0    1    2    3     4     5   6   7   8   
steps   0    1  2,2    3  3+1,2+1
 * @param n
 * @return
 */
    public static int minSteps(int n) {
        // TODO: Implement the function here
       int[] steps = new int[n+1];
       steps[0] = 0;
       for(int inx = 1; inx <= n; inx++)
       {
           if(inx%2== 0)
           {
              steps[inx] = Math.min(steps[inx-1]+ 1, steps[inx/2]+1);
           }
           else
           {
              steps[inx] = steps[inx-1]+ 1;
           }       
       }
       return steps[n];
    }
}
