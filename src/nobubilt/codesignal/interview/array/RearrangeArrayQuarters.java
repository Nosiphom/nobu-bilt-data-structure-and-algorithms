package nobubilt.codesignal.interview.array;

public class RearrangeArrayQuarters {
	
/**
 * You are given an array of n integers. Write a function that rearranges the array so 
 * that the middle half of the elements (considering the left and right quarters have been 
 * eliminated) move to the beginning of the array. The remaining elements, the left and 
 * right quarters, should move to the end of the array. If n is not divisible by 4, 
 * include the extra elements in the middle half.

Specifically:

Divide the array into four quarters.
Move the second and third quarters to the front in that order.
Move the first and fourth quarters to the back in that order.
The function should modify the array in place.

For example, if the input array is [1, 2, 3, 4, 5, 6, 7, 8], your function should 
rearrange the array to [3, 4, 5, 6, 1, 2, 7, 8].

The solution should have a time complexity of O(n).
 * @param nums
 */
	 public void rearrangeArray(int[] nums) {
	        // TODO: implement the function.
	        /**
	        [1, 2, 3, 4, 5, 6, 7, 8]
	        3, 4, 5, 6, // even [ qLen = len/4 = 2]
	         1, 2, 7, 8
	         
	        {9, 7, 5, 1, 2, 3, 4}  // odd Math.ceil(len/4)= 7/4 = 2
	        
	     exp {7, 5, 1, 2, 3, 9, 4} 
	        */
	        int len = nums.length;
	        if(len <= 3){return;}
	        int qLen = len/4;
	        // Handle the Remainder: If len % 4 is not zero, distribute the extra elements.
	        //Typically, these extra elements should be part of the middle half.
	        int remainder = len%4;
	
	        int middleArrayLen = len%4 == 0 ? qLen * 2 : (qLen * 2)+ remainder;
	        int[] middleQuarters = new int[middleArrayLen];
	        int[] outerQuarters = new int[qLen * 2];
	        
	       // The middle half will include the extra elements if there's a remainder

	        int midInxStart = qLen;
	        int midInxEnd = len - qLen - 1;
	        //move Outer left
	 //       System.out.println("midInxStart: " + midInxStart + "  midInxEnd: " + midInxEnd );
	        int outerCounter = 0;
	        for(int inx = 0; inx < midInxStart; inx++)
	        {
	             
	           outerQuarters[inx] = nums[inx]; 
	   //        System.out.println("outerQuarters[inx]: " + outerQuarters[inx]);
	           ++outerCounter;
	        }
	        
	        //move Outer right
	        int index = midInxStart;
	        for(int inx = midInxEnd+1; inx < len && index < outerQuarters.length; inx++)
	        {
	            
	           outerQuarters[index] = nums[inx]; 
	 //           System.out.println("::outerQuarters[index]: " + outerQuarters[index]);
	           ++index;
	           ++outerCounter;
	        }
	        
	        //move middle quarters 
	        int innerInx = 0;
	        int innerCounter = 0;
	        for(int inx = midInxStart; inx <= midInxEnd && innerInx < middleQuarters.length; inx++)
	        {
	           middleQuarters[innerInx] = nums[inx]; 
	 //         System.out.println(":: middleQuarters[innerInx]: " + middleQuarters[innerInx]);
	           ++innerInx;
	           ++innerCounter;
	        }
	        int numsInx = 0;
	        for(int middleInx = 0; middleInx < innerCounter; middleInx++)
	        {
	            nums[numsInx] = middleQuarters[middleInx];
	  //          System.out.println("nums[numsInx]: " + nums[numsInx]);
	            ++numsInx;
	        }
	        
	        for(int outterInx = 0; outterInx < outerCounter; outterInx++)
	        { 
	            nums[numsInx] = outerQuarters[outterInx];
	   //         System.out.println("::nums[numsInx]: " + nums[numsInx]);
	            ++numsInx;
	         
	        }
	    }
	}
