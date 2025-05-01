package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PerformNumberOperationsOnANumberSetPriorityQueue {
/**
 * You are given a list of operations that need to be performed on a set of numbers. The 
 * operations are as follows:

'Add': This operation takes a single integer parameter, x, and adds it to the set.
'Max': This operation does not take any parameters. It returns the largest number currently 
in the set.
'RemoveMax': This operation also does not take any parameters. It removes the maximum number 
from the set.
Initially, the set is empty. 'Max' and 'RemoveMax' operations are assured to be called only when 
the set is not empty.

You need to create a Java function solution() that takes in a list of operations and performs
 them in sequence. Each operation is represented as an array of strings, where the first element
  is the string indicating the type of operation, and the second element is the parameter for 
  the 'Add' operation (for 'Max' and 'RemoveMax', the second element is an empty string).

Your function should return a list of outcomes of the 'Max' operations in the sequence they were 
executed.

Constraints:

The list of operations has a length of n, 1 ≤ n ≤ 100
'Add' operations are assured to be valid
There won't be more than 50 'Add' operations
'Max' and 'RemoveMax' operations are initiated only when the set is not empty
The numbers to be added are integers ranging from -100 to 100, inclusive.
Your solution should execute within a time limit of 1 second for all inputs.
Example:

For operations = {{"Add", "3"}, {"Add", "10"}, {"Max", ""}, {"Add", "5"}, {"Max", ""}, 
{"RemoveMax", ""}, {"Max", ""}}, the output should be {10, 10, 5}.

In this scenario, the operations are performed as follows:

Add 3 to the set: {3}
Add 10 to the set: {3, 10}
Obtain the maximum in the set: 10
Add 5 to the set: {3, 5, 10}
Obtain the maximum in the set: 10
Remove the maximum from the set: {3, 5}
Obtain the maximum in the set: 5
Thus, the outcomes of the max operations are 10, 10, 5.
 */
	
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    public List<Integer> solution(List<String[]> operations) {
        // TODO: implement the function according to the task description
        List<Integer> outcome = new ArrayList<>();
        for(String[] row : operations)
        {
            String operation = row[0];
            String digitStr = row[1];
            switch(operation)
            {
                case "Add": 
                maxHeap.add(Integer.parseInt(digitStr));
                break;
                case "Max":
                outcome.add(maxHeap.peek());
                break;
                case "RemoveMax":
                maxHeap.poll();
                break;
                default:
            }
        }
        return outcome;
    }
}
