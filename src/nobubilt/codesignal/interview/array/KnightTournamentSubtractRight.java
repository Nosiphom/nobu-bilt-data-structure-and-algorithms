package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.List;

public class KnightTournamentSubtractRight {
	
/**
 * Imagine a medieval tournament where knights participate in jousting matches. 
 * The knights are arranged in a circular formation (represented as an array in 
 * your program), and each knight is initially assigned strength, represented as 
 * integers from 1 to 100, determined randomly.

The game consists of rounds. On each round, each knight fights the knight on 
his right side by subtracting the strength of his opponent from his own. 
Since this is a circular game, the knight on the right side of the last knight 
in the array is the first knight. Note that all matches are played in parallel,
 so the strengths are updated only after all matches are played. If after a match,
 a knight's strength becomes equal to or less than zero, symbolizing the knight's 
  defeat, the knight is removed from the game in the next round.

The game continues until a situation develops in which no more moves can be made. 
This happens either when there is just one knight standing or all remaining 
knights have equal strength meaning no knight can win a match.

Given the list of knights' strengths in the initial order, your program should 
calculate the number of rounds in the tournament.

Example:

Suppose we have knights with strengths [100, 50, 30, 20]. The game would proceed 
as follows:

Round 1:

Knight 1 fights Knight 2: (100 - 50 = 50)
Knight 2 fights Knight 3: (50 - 30 = 20)
Knight 3 fights Knight 4: (30 - 20 = 10)
Knight 4 fights Knight 1: (20 - 100 = -80) (Knight 4 is out)
Updated strengths: [50, 20, 10] (Knight 4 removed)
Round 2:

Knight 1 fights Knight 2: (50 - 20 = 30)
Knight 2 fights Knight 3: (20 - 10 = 10)
Knight 3 fights Knight 1: (10 - 50 = -40) (Knight 3 is out)
Updated strengths: [30, 10] (Knight 3 removed)
Round 3:

Knight 1 fights Knight 2: (30 - 10 = 20)
Knight 2 fights Knight 1: (10 - 30 = -20) (Knight 2 is out)
Updated strengths: [20] (Knight 2 removed)
The tournament ends with only one knight standing, so the number of rounds is 3. 
Thus, tournament([100, 50, 30, 20]) returns 3.
 */
	  /**
     * Simulate the tournament and return the number of rounds.
     * 
     * @param knights a list of integers representing the initial strengths 
     * of the knights
     * @return number of rounds in the tournament
     */
	
    public int tournament(List<Integer> knights) {
        // TODO: Implement the function to simulate the tournament
        int rounds = 0;
        if(knights.size() == 1){return rounds;}
        while(true)
        {
            ++rounds;
            List<Integer> reducedList = new ArrayList<>();
            int len = knights.size();
            for(int inx = 0; inx < knights.size(); inx++)
            {
                int numLeft = knights.get(inx);
                int numRight = knights.get((inx+1)%len);
                if(numLeft - numRight > 0)
                {
                    reducedList.add(numLeft - numRight);                  
                }
            }
            if(reducedList.isEmpty() || reducedList.size() == 1)
            {
                break;
            }
            knights = reducedList;
        }
        return rounds;
    }
}

