package nobubilt.codesignal.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ProcessingOperationsInNumberTreeSet {
	
/**
 * TreeSet is a data structure in Java's Collection Framework that stores unique 
 * elements while maintaining sorted order.

Advantages of using TreeSet:

Extracting the minimum (using first()) or maximum (using last()) values will be a 
constant-time operation, i.e., 

O(1), as they are always at the start or end of the set.
Achieving sorted order after every insertion or deletion happens automatically with 
TreeSet, and the operations have a logarithmic time complexity O(logN).	

You are tasked with designing a Java method called solution() that processes a series 
of distinct requests or operations. These operations consist of a list of two 
 integers: one signifies the type of operation, and the other is the operand.

There are three kinds of actions you will need to handle:

Adding a number to the set (operation type 0). If the number is already in the set, you 
should ignore it.
Removing a number from the set (operation type 1). Whenever this operation is invoked, it 
is guaranteed that the number exists in the set.
Finding the maximum number in the set (operation type 2).
The list of operations is delivered to your method as a 2D array, where each subarray contains 
two values — the type of operation and the operand.

The function should output an array of results for every operation. For operation types 0 and 1, 
the function should return the count of elements in the set after the operation. For operation
 type 2, the function should return the maximum number in the set. If the set is empty, the
  function should return -1.
Constraints: The number of operations 1≤n≤10 to the power 5. For the operation parameter,
 0≤operation≤2. For the operand parameter, 

−10 to the power 5 ≤operand≤10 to the power 5.

Example: For operations = {{0, 20}, {0, 30}, {2}, {1, 20}, {0, 20}, {2}}, the output should 
be {1, 2, 30, 1, 2, 30}.
 */
	 public static List<Integer> solution(int[][] operations) {
        // TODO: implement the solution here.
        List<Integer> result = new ArrayList<>();
        TreeSet<Integer> sortedSet = new TreeSet<Integer>();
        for(int inx = 0; inx <operations.length; inx++)
        {
            int[] row = operations[inx];
            int operation = row[0];
            if(row.length > 1)
            {
                int operand= row[1];
                if(operation == 0)
                {
                    sortedSet.add(operand);
                }
                else if(operation == 1)
                {
                    sortedSet.remove(operand);

                }
                result.add(sortedSet.size());
                continue;
            }
           if(operation == 2)
           {
                int largest = sortedSet.isEmpty() ? -1 : sortedSet.last();
                result.add(largest);
           } 
        }
        System.out.println("size: " + sortedSet.size());
        return result;
    }
}
