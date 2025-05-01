package nobubilt.codesignal.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SmallestAbsoluteDistanceInListWithTreeSet {
	
/**
 * TreeSet is a data structure in Java's Collection Framework that stores unique elements
 *  while maintaining sorted order.

Advantages of using TreeSet:

Extracting the minimum (using first()) or maximum (using last()) values will be a constant-time 
operation, i.e., 

O(1), as they are always at the start or end of the set.
Achieving sorted order after every insertion or deletion happens automatically with TreeSet, and 
the operations have a logarithmic time complexity O(logN).	

 * You are provided with a list of queries. Each query represents an operation in which integers 
 * are added to a list. Your task is to implement a Java function, solution(), that processes 
 * these queries. After each addition operation, the function returns the smallest absolute
 *  distance between any pair of added numbers. If fewer than two numbers have been added, it 
 *  should return -1.

The function is defined as public List<Integer> solution(List<Integer> queries), where queries 
is a list of integers to be added. The function should return a list of integers, with each 
integer representing the smallest absolute distance after each operation.
Constraints:
1≤queries.size()≤100000
−1000000≤queries[i]≤1000000
Example: For List<Integer> queries = Arrays.asList(3, 9, 5, 1, 8), the output should be 
Arrays.asList(-1, 6, 2, 2, 1).

Explanation:

After adding 3, since the set contains only one number, the smallest distance is -1.
After adding 9, the smallest distance between any pair (3, 9) becomes 6.
After adding 5, the smallest distance between any pair (3, 5) is 2.
After adding 1, the smallest distance remains unchanged, i.e., the distance between the pair 
(3, 5) remains at 2.
Finally, after adding 8, the smallest distance between any pair (8, 9) becomes 1.
 */

	 public List<Integer> solution(List<Integer> queries) {
		   // TODO: Implement your solution
	        List<Integer> result = new ArrayList<>();
	        TreeSet<Integer> sortedSet = new TreeSet<>();
	        int distMin = Integer.MAX_VALUE;
	        result.add(-1);
	        sortedSet.add(queries.get(0));
	        
	        for(int inx = 1; inx < queries.size(); inx++)
	        {
	            int num = queries.get(inx);   
	            Integer lower = sortedSet.floor(num);
	            Integer higher = sortedSet.ceiling(num);
	            sortedSet.add(num);
	            if(lower == null && higher == null)
	            {
	                result.add(0);
	                distMin = 0;
	                continue;
	            }
	            
	            if(lower == null)
	            {
	                distMin = Math.min(distMin, Math.abs(higher - num));
	                result.add(distMin);
	                continue;
	            }
	            
	            if(higher == null)
	            {
	                distMin = Math.min(distMin, Math.abs(num - lower));
	                result.add(distMin);
	                continue;
	            }
	            int outcome = Math.min(Math.abs(higher - num), Math.abs(num - lower));
	            distMin = Math.min(outcome, distMin);
	            result.add(distMin);
	        }
	        return result;
	    }
}
