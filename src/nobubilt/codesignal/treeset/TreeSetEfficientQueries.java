package nobubilt.codesignal.treeset;
import java.util.*;
public class TreeSetEfficientQueries {
/**
 * TreeSet is a data structure in Java's Collection Framework that stores unique elements
 *  while maintaining sorted order.

Advantages of using TreeSet:

Extracting the minimum (using first()) or maximum (using last()) values will be a constant-time 
operation, i.e., 

O(1), as they are always at the start or end of the set.
Achieving sorted order after every insertion or deletion happens automatically with TreeSet, and 
the operations have a logarithmic time complexity 
O(logN).	

We are tasked with designing a Java function named processQueries that can process a series of 
distinct requests or queries efficiently. The queries comprise a list of two integers — the type 
of operation and the operand.

There are three types of operations we'll handle:

Adding an integer to the set (operation type 0)
Removing an integer from the set (operation type 1). Whenever this operation is invoked, we can
 guarantee that the integer exists in the set.
Finding the smallest integer that is greater than or equal to a given value (operation type 2).
The function should return the current size of the set when the operation type is 0 or 1, and the 
smallest possible integer when the operation type is 2. If such an integer does not exist, the 
function should return -1.

Lastly, when the operation type is 2, we need to find the minimum bound, i.e., the smallest 
value greater than or equal to our provided value in the set. We perform this using the 
TreeSet.ceiling operation. If such a value does not exist, we append -1 to results.
 * @param queries
 * @return
 */
	 public static List<Integer> processQueries(List<int[]> queries)
	 {
		 List<Integer> list = new ArrayList<>();
		 TreeSet<Integer> sortedSet = new TreeSet<>();
		 for(int[] row : queries)
		 {
			 int operation = row[0];
			 int operand = row[1];
			 if(operation == 0)
			 {
				 sortedSet.add(operand);
				 list.add(sortedSet.size());
			 }
			 else if(operation == 1)
			 {
				 sortedSet.remove(operand);
				 list.add(sortedSet.size());
			 }
			 else if(operation == 2)
			 {
				 Integer closest = sortedSet.ceiling(operand);
				 if(closest == null)
				 {
					 list.add(-1);
				 }
				 else
				 {
					 list.add(closest);
				 }
					 
			 }
		 }
		 
		 return list;
	 }

	    public static void main(String[] args) {
	        List<int[]> queries = Arrays.asList(
	            new int[]{0, 10},
	            new int[]{2, 10},
	            new int[]{0, 20},
	            new int[]{1, 10},
	            new int[]{2, 10}
	        );

	        List<Integer> result = processQueries(queries);
	        for (int res : result) {
	            System.out.print(res + " ");
	        }  // Output: 1 10 2 1 20
	    }
	
}
