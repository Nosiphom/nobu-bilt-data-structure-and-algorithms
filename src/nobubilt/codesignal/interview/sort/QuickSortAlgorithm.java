package nobubilt.codesignal.interview.sort;

import java.util.List;

public class QuickSortAlgorithm {
/**
 * You are given a list of n integers. Write a Java function that sorts this list using 
 * the QuickSort algorithm. Your function should take the list as input and return a sorted 
 * list in ascending order without using any built-in sorting functions.

QuickSort is an efficient, comparison-based, divide-and-conquer sorting algorithm. 
The basic steps are as follows:

Pick a pivot: Choose an element from the array/list to be the pivot (commonly the middle element).
Partitioning: Rearrange the array so that elements less than the pivot come before it, 
and elements greater than the pivot come after it. Elements equal to the pivot can go either way.
Recursively apply: Apply the same process to the sub-arrays on either side of the pivot.
Here's a quick example with the array [3, 6, 8, 10, 1, 2, 1]:

Choose a pivot: Let's pick the middle element 10.
Partition: Rearrange elements around 10:
Left part: [3, 6, 8, 1, 2, 1]
Pivot: [10]
Right part: []
Apply recursively:
Left part [3, 6, 8, 1, 2, 1] gets partitioned around 8, giving [3, 6, 1, 2, 1], [8], [].
Apply further recursive steps until all sub-arrays have a single element.
For instance, if the provided list is [3, 6, 8, 10, 1, 2, 1], the function should
 return [1, 1, 2, 3, 6, 8, 10].

The task requires an efficient solution, and the maximum expected time complexity is 
O(nlogn).
 * @param arr
 * @return
 */ 
	  public static List<Integer> quickSortCustom(List<Integer> arr) {
	        // TODO: implement the QuickSort algorithm here
	        if(arr.size() <= 1){return arr;}
	        List<Integer> outcome = quickSort(arr, 0, arr.size() - 1);
	       
	        return outcome;
	    }
	    public static List<Integer> quickSort(List<Integer> arr, int low, int high)
	    {
	        if(low >= high)
	        {
	            return arr;
	        }
	        int pivotInx = (low + high)/2;
	        int pivot = arr.get(pivotInx);
	        int highValue = arr.get(high);
	        arr.set(pivotInx, highValue);
	        arr.set(high, pivot);
	        int partitionInx = partition(arr, low, high);
	        
	        arr = quickSort(arr, low, partitionInx-1);
	        arr = quickSort(arr, partitionInx+1, high);
	        return arr;
	    }
	 
	    public static int partition(List<Integer> arr, int low, int high)
	    {
	        int right = high-1;
	        
	        while(low < right)
	        {
	            while( low < right && arr.get(low) <= arr.get(high))
	            {
	                ++low;
	            }
	            while(right > low && arr.get(right) > arr.get(high))
	            {
	                --right;
	            }
	            int tempLow = arr.get(low);
	            int tempRight = arr.get(right);
	            arr.set(low, tempRight);
	            arr.set(right, tempLow);
	        }
	        
	        if(arr.get(low) > arr.get(high))
	        {
	            int tempLow = arr.get(low);
	            int tempHigh = arr.get(high);
	            arr.set(low, tempHigh);
	            arr.set(high, tempLow);
	            return low;
	        }
	        
	        return high;
	    }
	    
	    
	}
