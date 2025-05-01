package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquaresPairCalculation {
/**
 * You will be given two arrays of integers. The first array has n elements, 
 * and the second array has k elements. Sizes n and k both range from 1 to 100,
 *  inclusive. The elements of both arrays can fall within a range of -100 to 100, 
 *  inclusive.

Your task is to write a Java function that will locate and return a list of all 
pairs of integers with the property that the first element of each pair comes 
from the first array and the second element of each pair comes from the second 
array, such that the sum of the two elements of the pair is a perfect square. 
A perfect square, as you know, is an integer that is the square of another integer.

The order of pairs in your output should correspond to the order of the elements 
in the input arrays. For example, if the two arrays are {2, 3, 16} and {1, 9, 10}, 
the function should return {{3, 1}, {16, 9}} because 3+1=4 (which is the square of 2) 
and 16+9=25 (which is the square of 5).

If no such pairs exist, or if either input array is empty, your function should 
return an empty list.
 */

	public List<int[]> findPerfectSquarePairs(int[] arr1, int[] arr2) {
	        // TODO: Implement this function
        List<int[]> result = new ArrayList<>();
        for(int numA : arr1)
        {
            for(int numB : arr2)
            {
               double sqrt =  Math.sqrt(numA+numB);
               if(sqrt - (int)Math.sqrt(numA+numB) > 0.0)
               {
                  continue;
               }
               if((int)Math.sqrt(numA+numB) * (int)Math.sqrt(numA+numB) ==sqrt *sqrt)
               {
               result.add(new int[]{numA, numB});                
               }
            }
        }   
	    return result;
	}
	
}
