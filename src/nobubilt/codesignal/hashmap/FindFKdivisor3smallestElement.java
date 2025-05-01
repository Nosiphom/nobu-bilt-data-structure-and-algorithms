package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindFKdivisor3smallestElement {
/**
 * You are provided with a list of integers, and your task is to define a function named 
 * solution that takes this list as input and returns another list. The returned list should 
 * contain the floor(k/3)-th smallest element for each prefix of the original list, prefix_numbers[0..k].

The function solution will take the following parameter:

An array of n integers, numbers, (1≤n≤100000, ∣numbers[i]∣≤100000, where all numbers[i] are unique, 
and i is [0, n-1]) - the original list of integers. The floor(k/3)-th smallest element is the element 
that would occupy the index floor(k/3) if the sublist prefix_numbers[0..k] were sorted in ascending order. 
If floor(k/3) equals the length of the sublist, return the maximum possible value from the sublist.

Constraints:

The list will contain between 1 and 100000 elements, inclusive. Each element of the list will be 
an integer in the range −100000 to 100000, inclusive. Example: For numbers = [33, 11, 44, 22, 55, 77], 
the function solution(numbers) should return [33, 11, 33, 22, 22, 33].

Let's break down each step and the corresponding prefix list:

For the prefix [33], k=1, floor(k/3) = floor(1/3) = 0; the sorted prefix is [33], where 
the element at index 0 is 33. Result so far: [33].
For the prefix [33, 11], k=2, floor(k/3) = floor(2/3) = 0; the sorted prefix is [11, 33], 
the element at index 0 is 11. Result so far: [33, 11].
For the prefix [33, 11, 44], k=3, floor(k/3) = floor(3/3) = 1; the sorted prefix is [11, 33, 44], 
the element at index 1 is 33. Result so far: [33, 11, 33].
For the prefix [33, 11, 44, 22], k=4, floor(k/3) = floor(4/3) = 1; the sorted 
prefix is [11, 22, 33, 44], the element at index 1 is 22. Result so far: [33, 11, 33, 22].
For the prefix [33, 11, 44, 22, 55], k=5, floor(k/3) = floor(5/3) = 1; the sorted
 prefix is [11, 22, 33, 44, 55], the element at index 1 is 22. Result so far: [33, 11, 33, 22, 22].
For the prefix [33, 11, 44, 22, 55, 77], k=6, floor(k/3) = floor(6/3) = 2; the sorted 
prefix is [11, 22, 33, 44, 55, 77], the element at index 2 is 33. Final result: [33, 11, 33, 22, 22, 33].
This example shows the calculations for each prefix of the list and demonstrates how 
the floor(k/3)-th smallest element is determined for each step.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	List<Integer> list = new ArrayList<>(Arrays.asList(0));
	//		List<Integer> list = new ArrayList<>(Arrays.asList(33, 11, 44, 22, 55)); //33  11  33  22  22 
	List<Integer> list = new ArrayList<>(Arrays.asList(33, 11, 44, 22, 55, 77)); //33  11  33  22  22  33  
		List<Integer> result = solution(list);
		result.stream().forEach(num-> System.out.print(num + "  "));
 
	}
	
	   public static List<Integer> solution(List<Integer> numbers) {
	        List<Integer> result = new ArrayList<>();
	        // TODO: implement the function according to the task description
	        PriorityQueue<Integer> reverseprefixMaxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	           PriorityQueue<Integer> prefixMinHeap = new PriorityQueue<>();
	        for (int i = 0; i < numbers.size(); i++) {
	    int num = numbers.get(i);
	    int limit = (int) Math.floor((i+1) / 3) + 1;  // Correct calculation of limit

		  if (!reverseprefixMaxHeap.isEmpty() && num <= reverseprefixMaxHeap.peek()) {
		                reverseprefixMaxHeap.add(num);
		            } else {
		                prefixMinHeap.add(num);
		            }
//		  System.out.println("top: "+ reverseprefixMaxHeap.peek() + " limit: " + limit);
		    // Balance the heaps
		    while (reverseprefixMaxHeap.size() > limit) {
		   //     System.out.println("jam: "+ reverseprefixMaxHeap.peek());
		        prefixMinHeap.add(reverseprefixMaxHeap.poll());
		    }
		    while(reverseprefixMaxHeap.size() < limit && !prefixMinHeap.isEmpty()) {
		  //      System.out.println("geee: "+ reverseprefixMaxHeap.peek());
		        reverseprefixMaxHeap.add(prefixMinHeap.poll());
		    }
		//reverseprefixMaxHeap  33 22 11 
		//prefixMinHeap     44 55 77
	    // result 33 11 33 22 22 33
		    // Add the current `floor(k/3)`-th smallest element to the result
		//    System.out.println("HERE: "+ reverseprefixMaxHeap.peek());
		    if (limit > 0) {
		        result.add(reverseprefixMaxHeap.peek());
		    }
		    else 
		    {
		    	result.add(Collections.max(reverseprefixMaxHeap.isEmpty() ? prefixMinHeap: reverseprefixMaxHeap));
		    }
		}
	        return result;
	    }
	
}
