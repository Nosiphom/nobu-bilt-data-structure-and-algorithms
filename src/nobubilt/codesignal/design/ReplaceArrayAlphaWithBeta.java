package nobubilt.codesignal.design;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class ReplaceArrayAlphaWithBeta {
/**
 * The first item in B is 4 at index=0. Double this number is 8. The closest number to 8 in array B is 8, which is at index=7. The number at the same index in array A is 80, so we add 80 to our new array.

The second item in B is 12 at index=1. Double this number is 24. The closest number to 24 in B is 25, which is at index=9. The corresponding index in A has the number 100. So, we add 100 to our new array.

The third item in B is 3 at index=2. Double this number is 6. The closest number to 6 in B is 6, which is at index=4. The corresponding index in A has the number 50. So, we add 50 to our new array.

We continue this process for the rest of the elements in B.

 * Complexity Analysis
It's vital to have an understanding of the computational complexity of our Two-Pointer approach and why it's effective for this problem.

Time Complexity: The main steps of our solution involve sorting the array B and traversing it with two pointers. Sorting an array of n elements has a time complexity of 
O
(
n
log
⁡
n
)
O(nlogn). The two-pointer traversal of the sorted array adds an 
O
(
n
)
O(n) time complexity. Thus, the overall time complexity of our solution is 
O
(
n
log
⁡
n
)
O(nlogn) for the sorting operation, which dominates the linear time traversal.

Space Complexity: Apart from the input data, our solution needs space for B_sorted and res, both of which are arrays having the same length as the input. Therefore, our solution has a linear space complexity of 
O
(
n
)
O(n), where n is the length of the input arrays.
 * @param A
 * @param B
 * @return
 */
	    public static int[] findAndReplace(int[] A, int[] B) {
	        List<SimpleEntry<Integer, Integer>> B_sorted = new ArrayList<>();
	        for (int i = 0; i < B.length; i++) {
	            B_sorted.add(new SimpleEntry<>(B[i], i));
	        }
	        B_sorted.sort(Comparator.comparingInt(SimpleEntry::getKey));

	        int j = 0;  // Initialize right pointer
	        int[] res = new int[A.length];  // Initialize the result array
	        for (int i = 0; i < B.length; i++) {
	            int target = 2 * B_sorted.get(i).getKey();  // The target is twice the current number in the sorted B
	            while (j < B.length - 1 && B_sorted.get(j + 1).getKey() < target) {
	                j++;  // Move the right pointer to find a number smaller than or equal to the target
	            }
	            if (j < B.length - 1 && 
	                Math.abs(B_sorted.get(j + 1).getKey() - target) < Math.abs(target - B_sorted.get(j).getKey())) {
	                j++;  // Move the right pointer one more step if the next number is closer to the target
	            }
	            res[B_sorted.get(i).getValue()] = A[B_sorted.get(j).getValue()];  
	            // Collect the corresponding element from A at the same index as the closest number in B_sorted
	        }

	        return res;
	    }

	    public static void main(String[] args) {
	        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
	        int[] B = {4, 12, 3, 9, 6, 1, 5, 8, 37, 25, 100};
	        int[] result = findAndReplace(A, B);
	        System.out.println(Arrays.toString(result));
	        //int[] result = {80, 100, 50, 20, 20, 60, 40, 20, 110, 90, 110};
	    }
	
}
