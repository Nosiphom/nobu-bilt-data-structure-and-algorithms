package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.List;

public class CircularShiftWithoutBuiltInMethods {	
/**
 * In this problem, you are given an ArrayList of n integers. Additionally, you are given an 
 * integer shift, which represents the number of positions each element in the list should be moved.

Your task is to create a Java function that should shift every element in the list to the right 
(for a positive shift) or to the left (for a negative shift) by shift positions. The shift should 
be circular — the last element should be moved to the start of the list if shift is positive, 
and vice versa.

Please implement this without the usage of any built-in methods of Java to shift, sort, or move 
items in the list. Your solution’s efficiency should be O(n).

Examples:

For ls = [1, 2, 3, 4, 5] and shift = 2, the output should be [4, 5, 1, 2, 3].

For ls = [1, 2, 3, 4, 5] and shift = -1, the output should be [2, 3, 4, 5, 1].
 */
	
	 public List<Integer> shiftListElements(List<Integer> ls, int shift) 
	 {
		 int len = ls.size();
		 int actualShift = shift%len;
		 System.out.println();
		 List<Integer> result = new ArrayList<>(ls);
		 for(int inx = 0; inx < len; inx++)
		 {
			 int nextPosition = inx + actualShift;
			 System.out.println("nextPosition: " +  nextPosition + " inx: " + inx + " actualShift: "+actualShift);
			 if(nextPosition >= len)
			 {
				 nextPosition = nextPosition - len;
				 System.out.println("re-nextPos: " +  nextPosition); 
			 } 
			 else if(nextPosition < 0)
			 {
				 nextPosition =  nextPosition + len;
				 System.out.println("lo-nextPosition: " +  nextPosition); 
			 } 
			 result.set(nextPosition, ls.get(inx));
		 }
		 
		 return result;
	 }
}
