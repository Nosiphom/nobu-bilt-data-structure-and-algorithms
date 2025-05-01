package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.List;

public class BoardGameProgressQuantification {

/**
 * You are the developer of a unique board game and are now 
 * dealing with the challenge of quantifying player progress,
 *  assuming different starting positions.

The game is played on a linear board that can be described as
 an array of integers, from 1 to n, with n ranging from 
1 to 500 inclusive. Each position in the array is a move value
 that a player can take, signifying the exact number of steps 
 a player can move rightward. An obstacle is a specific integer
  value on which the player cannot land.

Your task is to implement the solution(int[] numbers, 
int obstacle) function in Java, which calculates and returns 
an array steps. For every i in steps, the algorithm should 
calculate the number of steps required for a player to reach 
the end of the array from the i-th position without landing 
on an obstacle. If the player encounters an obstacle, 
steps[i] should be -1.

Each number in the numbers array can range from 
1 to 10, and the obstacle value can range between 
1 and 10, inclusive.

The player must move exactly the number of steps specified
 at each position.

The return value should be steps, the array with calculated
 values.

For example, if numbers is {5, 3, 2, 6, 2, 1, 7} and obstacle
 is 3, the function would return an array {3, -1, 3, 1, 2, 2, 1}.
The first value 3 indicates that starting from position 0, 
  the player will reach the end in 3 steps. The second value,
   -1, indicates that starting from 1, the player is on an 
   obstacle. Therefore, progression from 1 is not possible. 
   And so on.
 * @param numbers
 * @param obstacle
 * @return
 */

	 public int[] solution(int[] numbers, int obstacle) {
	        // TODO: implement the function
	        List<Integer> result = new ArrayList<>();
	        for(int inx = 0; inx < numbers.length; inx++)
	        {
	            int num = numbers[inx];
	            if(num == obstacle)
	            {
	                result.add(-1);
	                continue;
	            }
	            int currPos = inx;
	            int moves = 0;
	            while(currPos < numbers.length)
	            {
	                if(numbers[currPos] == obstacle)
	                {
	                    result.add(-1);
	                    break;
	                }
	                if(currPos + numbers[currPos] >= numbers.length)
	                {
	                    ++moves; 
	                    result.add(moves);
	                    break;
	                }
	                else
	                {
	                    currPos += numbers[currPos];
	                    ++moves;
	                }
	            }
	        }
	        
	        int[] arr  = new int[result.size()];
	        for(int inx = 0; inx < result.size(); inx++)
	        {
	            arr[inx] = result.get(inx);
	        }
	        return arr;
	    }
	
}
