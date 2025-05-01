package nobubilt.codesignal.interview.array;
/**
 * You have been given an array of n integers. Your task is to write a function that
 *  reverses the array in groups of k size, and if the last group has fewer than 
 *  k elements, reverse all of them. Return the newly organized array after the 
 *  groups have been reversed.

For example, given the array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the 
output should be: [3, 2, 1, 6, 5, 4, 9, 8, 7, 10]. The first three elements are 
reversed to get [3, 2, 1], the next three become [6, 5, 4], the following
 three are [9, 8, 7], and the final one remains [10] as there are fewer
  than k elements remaining.
 * 
 *
 */
public class ShuffleArrayBasedOnInterval {

	 public static int[] solution(int[] numbers, int k) {
	        // TODO: implement the solution here
	        /**
	        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	        */
	        
	        int inx = 0;
	        while(inx + k-1 < numbers.length)
	        {
	            reverseT(numbers, inx, inx + k-1);
	            inx = inx + k;                    
	        }
	        int remainder = numbers.length%k;
	        if(remainder > 0)
	        {
	             inx = numbers.length - remainder;
	            reverseT(numbers, inx, numbers.length-1);
	        }
	        return numbers;
	    }
	    
	    public static void reverseT(int[] numbers, int left, int right)
	    {
	        while(left < right)
	        {
	            int temp = numbers[left];
	            numbers[left] = numbers[right];
	            numbers[right]= temp;
	            ++left;
	            --right;
	        }
	    }

	}
