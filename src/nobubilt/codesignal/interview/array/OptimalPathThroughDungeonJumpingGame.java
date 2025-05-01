package nobubilt.codesignal.interview.array;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class BlueNub
{
	int jump;
	int health;
	BlueNub(int j, int h)
	{
		this.jump = j;
		this.health = h;
	}
}
class BlueNubComparator implements Comparator<BlueNub>
{
	public int compare(BlueNub b1, BlueNub b2)
	{
		if(b1.health == b2.health)
		{
			return b1.jump - b2.jump;
		}
		return b2.health - b1.health;
	}
}
public class OptimalPathThroughDungeonJumpingGame {
	  public int solution(List<Integer> dungeon, int health) {
		  int jump = 1;
		  PriorityQueue<BlueNub> maxHeap = new PriorityQueue<>(new BlueNubComparator());
		  
		  
		  
			  while(jump <= dungeon.size())
			  {
				  int currHealth = health;
				  int currPos = 0;
				  while(currPos < dungeon.size())
				  {
					  currHealth = currHealth - dungeon.get(currPos);
					  currPos += jump;
					  if(currHealth < 0) {break;}
				  }
				  if(currHealth > 0)
				  {
					  maxHeap.add(new BlueNub(jump, currHealth));					  
				  }

				  ++jump;
			  }
		  
			  if(!maxHeap.isEmpty()) {
				  return maxHeap.peek().jump;
			  }
		  return -1;
	  }
/**
 * You are given an array of n integer values, with n ranging from 1 to 500,
 *  inclusive. The array represents a path through a virtual dungeon, with 
 *  certain positions marked as traps.

Each element in the array ranges from −200 to 200, inclusive, and represents 
the trap power. A value of 0 signifies a safe position, whereas positive integers 
indicate trap power — the higher the value, the harder it is to avoid and, hence, 
the more dangerous it is. Negative integers, however, are beneficial; encountering 
them could potentially restore some of your health points, making them advantageous
 rather than detrimental.

Your task is to move from the start position to the end position. For each step, you 
can move by x elements in the right direction only, where x ranges from 1 to n. Each 
time you step on a trap, you lose health points equal to the trap's power. You 
originally have h health points, where h is a positive integer ranging from 
1 to 100. Find the x that you must choose such that you lose the least amount of 
health points upon reaching the end of the array. Also, determine if there is no 
possible x that allows you to reach the end of the array with any remaining health 
points. In the latter case, return −1 to indicate that it's impossible to traverse
 the dungeon without succumbing to a fatal trap. If at any point your health points 
 reach 0 or less, you are considered out of the game.
If multiple x values result in the same health, the smallest x that results in the 
best health can be returned.

Example
Input:

dungeon = [0, -1, 1, 0, -1]
health = 3
Output:

1
Explanation:

Begin at the start of the array with 3 health points.
For x = 1, the path would be: [0, -1, 1, 0, -1], resulting in the following health 
points after each step: 3, 4, 3, 3, 4 (you preserve the most health by stepping 
through one element at a time).
For x = 2, the path would be: [0, 1, -1], resulting in the following health points 
after each step: 3, 2, 3.
For x = 3, the path would be: [0, 0], resulting in the following health points after
 each step: 3, 3.
For x = 4, the path would be: [0, -1], resulting in the following health points after 
each step: 3, 4.
Moving with x = 1 ensures the least health loss and allows you to finish with the 
most health points.
 * @param dungeon
 * @param health
 * @return
 */
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  public int solutionT(List<Integer> dungeon, int health) {
	        // TODO: Implement the solution
	        int jump = 1;
	        int start = 0;
	        int currHealth = health;
	        PriorityQueue<JumpPojo> maxHeap = new PriorityQueue<>(new JumpPojoComparator());
	        while(jump + start > 0 && jump + start <= dungeon.size() && currHealth > 0)
	        {
	            int position = start;
	            while(position >= 0 && position < dungeon.size())
	            {
	                currHealth -= dungeon.get(position);
	                if(currHealth < 0)
	                {
	                    break;
	                }
	                position += jump;
	            }
	            if(currHealth > 0)
	            {
	                 maxHeap.add(new JumpPojo(jump, currHealth));                
	            }
	            currHealth = health;
	            ++jump;
	        }
	        
	        if(!maxHeap.isEmpty())
	        {
	            return maxHeap.peek().jump;
	        }
	        /**
	        0 signifies a safe position
	        positive integers indicate trap power
	        x is jump
	        on trap [ health - arr[inx]]
	        if health == 0 || < 0 game over
	        */
	        return -1;
	    }
	}

	class JumpPojoComparator implements Comparator<JumpPojo>
	{
	    public int compare(JumpPojo j1, JumpPojo j2)
	    {
	        if(j1.health == j2.health)
	        {
	            return j1.jump - j2.jump;
	        }
	        return j2.health - j1.health;
	    }
	}

	class JumpPojo
	{
	    int jump;
	    int health;
	    JumpPojo(int j, int h)
	    {
	        this.jump = j;
	        this.health = h;
	    }
	}

