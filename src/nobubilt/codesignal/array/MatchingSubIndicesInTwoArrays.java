package nobubilt.codesignal.array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingSubIndicesInTwoArrays {
	
/**
 * Your task is to write a function that returns a pair of distinct indices [i, j] 
 * such that the sum of the elements at i and j in array arrA equals the sum of the 
 * elements at the same indices in array arrB. If there are multiple valid pairs, 
 * return the pair in which i is minimal. If there is still ambiguity, choose the one with 
 * minimal j among the latter.

Consider arrA = [2, 5, 1, 4] and arrB = [3, 6, 3, 2]. In this case, the output should 
be [2, 3] because arrA[2] + arrA[3] = arrB[2] + arrB[3], i.e., 1 + 4 = 3 + 2.
 * 
 * Use a Map to Track Differences: Store the difference between arrA[i] and arrB[i] as 
 * keys in a map, with the list of indices as values.
Find Complementary Pairs: For each difference, check if its complement exists in the map. 
This means you're looking for pairs of indices where the differences cancel each other out.
Iterate Over Pairs: For each pair of indices from the two lists, check if they form a valid 
pair (i.e., they are distinct and their differences cancel out).

Update Smallest Indices: Keep track of the smallest indices found so far. Update them 
whenever you find a new valid pair with smaller indices.

Key Points:
Distinct Indices: Ensure that i and j are distinct by checking if (i != j).
Smallest Indices: Update the result only if the current pair is smaller than the previously 
found pair.
Complementary Differences: Use the map to find pairs of indices where the differences cancel 
each other out.
 * arrA = [2, 5, 1, 4] and arrB = [3, 6, 3, 2]
 * inx 0    1   2  3
 * key -1  -1  -2  2  => -1 : {0,1}  -2:{2}   2:{3}
 */
	
	
	 public int[] findIndices(int[] arrA, int[] arrB) {
	        // TODO: Implement the solution here
	        Map<Integer, List<Integer>> diffMap = new HashMap<>();
	        for(int inx = 0; inx < arrA.length; inx++)
	        {
	            int diff = arrA[inx] - arrB[inx];
	            if(!diffMap.containsKey(diff))
	            {
	                diffMap.put(diff, new ArrayList<>());
	            }
	            diffMap.get(diff).add(inx);
	        }
	        
	        int[] result = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
	        for(Integer diffKey : diffMap.keySet())
	        {
	            int complement = -1 * diffKey; // key -2   complement 2
	            if(diffMap.containsKey(complement))
	            {
	                List<Integer> diffIndices = diffMap.get(diffKey); //-2:{2} 
	                List<Integer> complementIndices = diffMap.get(complement); //2:{3}
	                
	                for(int diffInx : diffIndices)
	                {
	                    for(int complementInx : complementIndices)
	                    {
	                        if(diffInx != complementInx)  // 2 != 3
	                        {
	                            if(diffInx < result[0] || (diffInx == result[0] && complementInx <result[1]))
	                            {
	                                result[0] = diffInx;
	                                result[1] = complementInx;
	                            }
	                        }
	                    }
	                }           
	            }
	        }
	        return result; // Placeholder return value. Replace with correct implementation.
	    }
}