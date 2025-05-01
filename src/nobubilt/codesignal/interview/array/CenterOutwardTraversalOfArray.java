package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.Arrays;

public class CenterOutwardTraversalOfArray {
	
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        ArrayList<Integer> result = iterateMiddleToEnd(numbers);
        System.out.println(result);  // Output should be [3, 2, 4, 1, 5]
    }
/**
 * Our task is to produce a new array, given an array of integers, that starts 
 * from the center of the original array and alternates direction towards both ends. 
 * That is, the first element of our new array will be the middle element of the 
 * original one.

After defining the starting point, we will alternate between elements to the left 
and to the right of this center until all elements have been included. If the 
length of the initial array is even, we first take the element to the left of 
the center, then the one to the right of the center, then do the alternation as 
described above.

For example, for numbers = [1, 2, 3, 4, 5], the output would be [3, 2, 4, 1, 5].

We will break down this seemingly complex task into manageable pieces to 
progressively build our Java solution. Keep in mind an additional condition: the 
length of the array — represented as n — can range from 1 to 100,000, inclusive.

 * @param numbers
 * @return
 */
	
	public static ArrayList<Integer> iterateMiddleToEnd(ArrayList<Integer> numbers)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int left, right;
		int mid = numbers.size()/2;
		if(numbers.size()%2 == 1) // odd
		{
			left = mid - 1;
			right = mid + 1;
	/**
	 * If we find that the array's length is odd, we include the middle element in 
	 * the newOrder array, given it has no counterpart. If the array's length is 
	 * even, newOrder initially remains empty.
	 */
			result.add(numbers.get(mid)); //
		}
		else
		{
			left = mid - 1;
			right = mid;
		}
		
		while(left >= 0 && right < numbers.size())
		{
			result.add(numbers.get(left--));
			result.add(numbers.get(right++));
		}
		return result;
	}
	   
}
