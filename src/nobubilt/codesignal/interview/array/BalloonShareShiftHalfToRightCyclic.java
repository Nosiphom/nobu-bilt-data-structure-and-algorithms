package nobubilt.codesignal.interview.array;

import java.util.Arrays;

public class BalloonShareShiftHalfToRightCyclic {
	
	public static void main(String[] args) {
        int[] balloons = {4, 1, 2};
        System.out.println(solution(balloons));  // Output should be 3
    }
/**
 * Picture a quaint, small town where every house is numbered sequentially 
 * from 1 to n. One day, a festive town event is held, and balloons are tied to 
 * each house. The festivities do not end there. At the conclusion of the event, 
 * a fun game is played: at each step of the game, each house sends half of its 
 * balloons to the neighboring house simultaneously (the neighbor to the right 
 * side, and for the last house, the neighbor is the first house). When counting 
 * the half of the balloons, we consider the existing balloons before receiving 
 * any balloons from a neighbor. The game goes on until, at some step, there are 
 * no changes in the number of balloons compared to the previous step.

The task is to create a Java function, int solution(int[] balloons), where balloons 
is an array representing the number of balloons at each house. The function should 
simulate this game and return the number of steps in the game.

For example, if balloons = {4, 1, 2}, the output should be solution(balloons) = 3.
 After the first step, the list becomes {3, 3, 1}. This is because the first house
  sends 2 balloons and gets 1, the second house sends nothing but gets 2, and the 
  third house sends 1 but receives nothing. Note that when the number of balloons 
  x is odd, then the house sends (x - 1) / 2 balloons. After the second step, the 
  list becomes {2, 3, 2} and never changes after that. So after the third step, 
  the process finishes.
 * 
 * 
 * Firstly, it's essential to note that we're dealing with a cyclical event. In 
 * other words, when iterating over our balloons array, we need to perceive the 
 * array as circular, meaning balloons[n - 1] should refer back to balloons[0]. 
 * This concept of cyclicity becomes crucial when we consider the last house 
 * passing balloons to the first.
 * @param balloons
 * @return
 */
	public static int solution(int[] balloons)
	{
		int steps = 0;
		int len = balloons.length;
		while(true)
		{
			++steps;
			int[] clonedBalloons = balloons.clone();// Store updated balloon counts
			for(int inx = 0; inx < len; inx++)
			{//Throughout each cycle, each house must share half of its balloons with the next house.
				int toShare = balloons[inx]/2;// Balloons to share
				clonedBalloons[inx] -= toShare; // Decrease balloons of current house
//We must also ensure that the last house shares balloons with the first house at the end of each cycle — for this, we'll use the modulo % operator.
				clonedBalloons[(inx + 1)%len] += toShare;// Increase balloons of next house
			}
			if(Arrays.equals(clonedBalloons, balloons)) 
			{
				break;
			}
			
			balloons = clonedBalloons;// Update balloons with new counts.
		}
		
		return steps;
	}
	
	
}
