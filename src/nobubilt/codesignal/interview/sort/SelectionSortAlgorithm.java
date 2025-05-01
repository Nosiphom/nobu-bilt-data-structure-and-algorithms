package nobubilt.codesignal.interview.sort;

public class SelectionSortAlgorithm {
/**
 * You are given an array of integers, and your task is to sort the array using the 
 * Selection Sort method. For example, given an array [3, 1, 2, 4, 5], your function 
 * should return [1, 2, 3, 4, 5].

Here's an explanation of how Selection Sort works for the example above:
First pass (i = 0): Find the minimum in [3, 1, 2, 4, 5] (which is 1) and swap it with the first element.
Result: [1, 3, 2, 4, 5]
Second pass (i = 1): Find the minimum in [3, 2, 4, 5] (which is 2) and swap it with the second element.
Result: [1, 2, 3, 4, 5]
Third pass (i = 2): Find the minimum in [3, 4, 5] (which is 3); it's already in position.
Result: [1, 2, 3, 4, 5]
Fourth pass (i = 3): Find the minimum in [4, 5] (which is 4); it's already in position.
Result: [1, 2, 3, 4, 5]
Fifth pass (i = 4): Only one element left, no change needed.
Result: [1, 2, 3, 4, 5]
The array is now sorted after these passes.

The expected time complexity is O(n ^ 2).
 * @param arr
 * @return
 */
  
	  public static int[] selectionSort(int[] arr) {
	        // TODO: Implement selection sort algorithm
	        for(int outterInx = 0; outterInx < arr.length-1; outterInx++)
	        {
	            int smallestValInx = outterInx;
	            int smallestVal = arr[outterInx];
	            for(int innerInx = outterInx; innerInx < arr.length; innerInx++)
	            {
	                if(arr[innerInx] < smallestVal)
	                {
	                    smallestVal = arr[innerInx];
	                    smallestValInx = innerInx;
	                }
	            }
	            swap(arr, outterInx, smallestValInx);
	        }        
	        return arr;
	    }
	    
	    public static void swap(int[] arr, int left, int right)
	    {
	        int temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	    }
}
