package nobubilt.codesignal.interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenenerateDistinctPermuationBacktrackingRecursion {
/**
 * You are provided with an array of n integers, which may contain duplicate elements. 
 * Write a recursive function that generates all distinct permutations of the numbers 
 * in the array. The permutations need to be of the same length as the input array, and 
 * they should be in lexicographically sorted order.

        assertEquals(Arrays.asList(
            Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), 
            Arrays.asList(2, 1, 1)), 
            class.solution(new int[] {1, 2, 1}));
    }
Use a method similar to backtracking to solve this task. The function should return 
a list of all these permutations. The expected time complexity for the solution is O(N!).
Note: You cannot use a built-in Java function or library method to directly 
generate permutations. The intention here is to specifically practice recursion and 
backtracking techniques.
 * @param nums
 * @return
 */
  public static List<List<Integer>> solution(int[] nums) {
        // TODO: Implement the function to generate all unique combinations
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] usedElements = new boolean[nums.length];
        List<Integer> elementList = new ArrayList<>();
        permutate(nums, elementList, usedElements, result);
       
        return result;
    }
    
    public static void permutate(int[] nums, List<Integer> elementList, 
    		boolean[] usedElements, List<List<Integer>> result)
    {
        if(elementList.size() == nums.length)
        {
            List<Integer> current = new ArrayList<>(elementList);
            result.add(current);
            return;
        }
       
        for(int inx = 0; inx < nums.length; inx++)
        {//Avoid Duplicates: Before using an element, check if it's a duplicate and 
        //if the previous duplicate was used. 
        //Duplicate Check: Ensure the duplicate check is correctly placed to skip 
        //over duplicates only when the previous duplicate was not used.
   
	        	if((inx > 0 && nums[inx] == nums[inx-1] && !usedElements[inx-1]) 
	        			|| usedElements[inx])
	            {
	                continue;
	            }
	            
	            elementList.add(nums[inx]);
	            usedElements[inx] = true;      
	            permutate(nums, elementList, usedElements, result);
	            elementList.remove(elementList.size()-1);
	            usedElements[inx] = false;
	        }
	    }
	}
/**
Sort the Array: This helps in generating permutations in lexicographical order and 
managing duplicates.
Set Usage: Using a Set to store permutations isn't necessary here. Instead, focus 
on using a List<List<Integer>> to store results directly.
Backtracking Logic: Ensure that you correctly handle duplicates by checking if the 
current element is the same as the previous one and if the previous one was not 
used. This check should be inside the loop before you mark an element as used.
Swap Logic: The swapping logic is not needed when using a boolean[] to track 
used elements. Instead, build the permutation by adding elements to a temporary list.


A temporary list to build each permutation.
A boolean array to track used elements.
Avoid Duplicates: Before using an element, check if it's a duplicate and if the 
previous duplicate was used. This is done by checking if nums[i] == nums[i - 1] 
and !used[i - 1]. Duplicate Check: Ensure the duplicate check is correctly placed 
to skip over duplicates only when the previous duplicate was not used.
Recursive Exploration: Add an element to the permutation, mark it as used, and 
recursively explore further. After exploring, backtrack by removing the element 
and marking it as unused.

Base Case: When the permutation reaches the length of the input array, 
add it to the result list.
*/