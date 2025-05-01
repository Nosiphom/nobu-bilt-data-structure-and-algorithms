package nobubilt.codesignal.interview.string;

import java.util.ArrayList;
import java.util.List;

public class GeometricMeanPairsStringFloatingPointFormat {
/**
 * You are given an input array consisting of n integers ranging from 0 to 100, 
 * inclusive, where n represents the length of the array. Your task is to write a 
 * function that returns a new array of strings. Each string should consist of two 
 * elements joined by a space: an element from the input array paired with its 
 * geometric mean with the 'opposite' element. The 'opposite' element of any 
 * element in the array is defined as the element at the corresponding position 
 * from the end of the array.

Assume that the geometric mean of two numbers, a and b, is calculated as: 
a⋅b.

A few notes:
If the length of the array, n, is odd, the middle element is considered to be its 
own 'opposite'. The elements of the input array will be in the range from 
0 to 100, inclusive.
Calculate the geometric mean to two decimal places. For example, the geometric mean of 
2 and 8 is 4.00 (since Math.sqrt(2*8)​ =4).
For example, for numbers = [1, 2, 3, 4, 5], the output should be solution(numbers) 
= ["1 2.24", "2 2.83", "3 3.00", "4 2.83", "5 2.24"].
 */
	 public List<String> solution(List<Integer> numbers) {
	        // TODO: implement this function
	        List<String> list = new ArrayList<>();
	        int len = numbers.size();
	        for(int inx = 0; inx < len; inx++)
	        {
	            int left = numbers.get(inx);
	            int right = numbers.get(len - 1 - inx);
	            double mean  =  Math.sqrt(left * right);
	            String meanStr = String.format("%.2f", mean);
	            list.add(new String(""+left + " " + meanStr));
	        }
	        
	        return list;
	    }
	}
