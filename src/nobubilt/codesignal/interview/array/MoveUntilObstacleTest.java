package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveUntilObstacleTest {
	
	public static void main(String[] args) {
        System.out.println(solution(new ArrayList<>(Arrays.asList(2, 3, 3, 4, 2, 4)), 4));
        	// return 5;
        
        System.out.println(solution(new ArrayList<>(Arrays.asList(4, 1, 2, 2, 4, 2, 2)), 2));
        //so the total number of steps the player takes is 2
	}
	/**
	 * In the "Move Until Obstacle" game, the player begins at the start of a linear 
	 * ArrayList of integers. The number at each position indicates how many steps a 
	 * player can move to the right. An obstacle number is one upon which the player 
	 * cannot land. The goal is to move as far to the right as possible until either 
	 * an obstacle stops the player or the player reaches the end of the ArrayList.

Your function, public static int solution(ArrayList<Integer> numbers, int obstacle), 
should tally and return the number of moves needed to reach the end of the ArrayList 
without encountering an obstacle. If the player encounters an obstacle, the function
 should return the index at which this obstacle lies.

For example, if the function receives the input: 
numbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 2, 4)) and obstacle = 4, it 
should return 5 (5th index). This is because the player starts at the 0th index, 
takes 2 steps 
as indicated by the number at the 0th index (landing on the 2nd index), and then 
takes 3 more steps as indicated by the number at the 2nd index to land on the 5th 
index, which is the obstacle 4.

If the function receives the following input: 
numbers = new ArrayList<>(Arrays.asList(4, 1, 2, 2, 4, 2, 2)) and obstacle = 2, 
the output should be 2. The player starts at the 0th index, takes 4 steps, lands 
on the 4th index, then takes 4 more steps, which brings the player outside the 
ArrayList, so the total number of steps the player takes is 2.
	 * @param numbers
	 * @param obstacle
	 * @return
	 */
	 
	 public static int solution(ArrayList<Integer> numbers, int obstacle) {
	        int position = 0;
	        int moves = 0;
	        
	        while (position < numbers.size()) {
	            // Check for obstacle at the current position
	            if (numbers.get(position) == obstacle) {
	                return position;  // Return the index of the obstacle
	            }
	            // Increment moves and update position
	            moves++;
	            position += numbers.get(position);  // Move to the next position
	        }
	        
	        // If loop ends without obstacles, return total moves taken
	        return moves;
	    }

	    
}
