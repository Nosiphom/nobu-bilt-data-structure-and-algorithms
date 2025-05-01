package nobubilt.codesignal.interview.sort;

public class MergeSortAlgorithm {
	/**
	 * You are given an array of n integers. Your task is to implement a merge sort function
	 *  to sort this array in ascending order and return the sorted array.

	Please note that while Java has built-in sorting functionality, the purpose of this 
	task is to practice implementing basic sorting algorithms, so you are not allowed to 
	use Java's built-in sort method. Instead, implement the merge sort algorithm.

	Merge Sort is a divide and conquer algorithm. It works by:
	Dividing the array into two halves.
	Recursively sorting each half.
	Merging the sorted halves to produce the sorted array.
	Here's an example:

	For the array [10, 3, 2, 8, -1, 5, 1]:

	Divide into [10, 3, 2] and [8, -1, 5, 1].
	Recursively sort each half:
	Sort [10, 3, 2] to [2, 3, 10].
	Sort [8, -1, 5, 1] to [-1, 1, 5, 8].
	Merge [2, 3, 10] and [-1, 1, 5, 8] to get [-1, 1, 2, 3, 5, 8, 10].
	The expected time complexity is O(nlogn).
	 * 
	 *
	 */

	 public static int[] mergeSort(int[] array) {
	        // TODO: Implement the merge sort algorithm
	        if(array.length <= 1){return array;}
	        int[] result = partition(array);
	        return result;
	    }
	    
	    public static int[] sortAndMerge(int[] leftArray, int[] rightArray)
	    {
	        int leftInx = 0;
	        int rightInx = 0;
	        int masterInx =0;
	        int[] result = new int[leftArray.length + rightArray.length];
	        
	        while(leftInx < leftArray.length && rightInx < rightArray.length)
	        {
	            if(leftInx < leftArray.length  
	        && leftArray[leftInx] <= rightArray[rightInx])
	            {
	                result[masterInx] = leftArray[leftInx];
	                ++masterInx;
	                ++leftInx;
	            }
	           else 
	           {
	                if( rightInx < rightArray.length )
	                {
	                    result[masterInx] = rightArray[rightInx];
	                    ++masterInx;
	                    ++rightInx;
	                }
	           }
	        }
	        
	        while(leftInx < leftArray.length)
	        {
	            result[masterInx] = leftArray[leftInx];
	            ++masterInx;
	            ++leftInx;
	        }
	        while(rightInx < rightArray.length)
	        {
	            result[masterInx] = rightArray[rightInx];
	            ++masterInx;
	            ++rightInx;
	        }
	        return result;
	    }
	    
	    public static int[] partition(int[] array)
	    {
	        if(array.length == 1)
	        {
	            return array;
	        }
	        int leftHalfSize = (array.length)/2;
	        int rightHalfSize = array.length - leftHalfSize;
	        int[] leftArray = new int[leftHalfSize];
	        int[] rightArray = new int[rightHalfSize];
	        
	        for(int inx = 0; inx < leftHalfSize; inx++)
	        {
	            leftArray[inx] = array[inx];
	        }
	        int rightInx = 0;
	        for(int inx = leftHalfSize; inx < array.length; inx++)
	        {
	            rightArray[rightInx] = array[inx];
	            ++rightInx;
	        }
	        leftArray = partition(leftArray);
	        rightArray = partition(rightArray);
	        array = sortAndMerge(leftArray, rightArray);
	        return array;
	    }
	}

