package nobubilt.codesignal.interview.array;

import java.util.Arrays;

public class MinimizeManhattanDistanceWithArrayRotations {
/**
 * Prepare to challenge your array manipulation skills! Consider two arrays,
 *  array1 and array2, each consisting of n non-negative integers. The values 
 *  of n range from 1 to 500, inclusive. Each integer in the arrays is at most 
10^3.

Your task is to discover a rotation of array1 that minimizes the Manhattan 
distance with array2. The Manhattan distance between two arrays, a and b, of 
size n, is defined by:
D(a,b)= 
i=1
∑
n
​
 ∣a 
i
​
 −b 
i
​
 ∣
where 
a
i
a 
i
​
  and 
b
i
b 
i
​
  denote the 
i
i-th elements of arrays a and b, respectively, and 
n
n represents the size of the arrays.
A rotation of an array refers to taking one or more elements from the end and 
moving these elements to the beginning, maintaining their original order in the 
process.

You need to return the rotated array that yields the smallest possible 
Manhattan distance. Let's say that you find multiple rotations of array1 that 
yield the same smallest Manhattan distance with array2. In this case, you should 
return the rotated array that, when converted into an integer number by 
concatenating all of its digits (from left to right), would be the smallest.

Keep in mind that the size of the two arrays is always the same, and the arrays
 are not necessarily sorted at the beginning. If array1 is exactly the same 
 as array2 from the beginning, output the original array1.

Example:
Given array1 = [1, 2, 3, 4, 5] and array2 = [5, 4, 3, 2, 1], one optimal 
rotation of array1 to minimize the Manhattan distance with array2 is [3, 4, 5, 1, 2].
Here is how we arrive at this:
Calculate the Manhattan distance for each rotation of array1.
For the unrotated array1 = [1, 2, 3, 4, 5], the Manhattan distance with 
array2 = [5, 4, 3, 2, 1] is: ∣1−5∣+∣2−4∣+∣3−3∣+∣4−2∣+∣5−1∣=4+2+0+2+4=12
For the first rotation [5, 1, 2, 3, 4], the Manhattan distance is: 
∣5−5∣+∣1−4∣+∣2−3∣+∣3−2∣+∣4−1∣=0+3+1+1+3=8
For the second rotation [4, 5, 1, 2, 3], the Manhattan distance is: 
∣4−5∣+∣5−4∣+∣1−3∣+∣2−2∣+∣3−1∣=1+1+2+0+2=6
For the third rotation [3, 4, 5, 1, 2], the Manhattan distance is: 
∣3−5∣+∣4−4∣+∣5−3∣+∣1−2∣+∣2−1∣=2+0+2+1+1=6
For the rotation [2, 3, 4, 5, 1] the distance is greater than 6.
Even though two rotations, [4, 5, 1, 2, 3] and [3, 4, 5, 1, 2], yield 
the same Manhattan distance (6), [3, 4, 5, 1, 2] is chosen because it 
is smaller lexicographically when viewed as a single number.

Thus, [3, 4, 5, 1, 2] minimizes the Manhattan distance with array2 = 
[5, 4, 3, 2, 1], yielding a Manhattan distance of 6.
 * @param array1
 * @param array2
 * @return
 */
	  public static int[] solution(int[] array1, int[] array2) {
	        // TODO: Your implementation goes here
	        
	        if(identicalArray(array1, array2))
	        {
	            return array1;
	        }
	        
	        int limitRotation = array1.length-1;
	        int rotationCounter = 1;
	        int[] arr1Copy = Arrays.copyOf(array1, array1.length);
	        int[] resultArr = null;
	        int shortestDist = Integer.MAX_VALUE;
	         while(rotationCounter <= limitRotation)
	         {
	            if(arr1Copy.length > 1)
	            {
	                arr1Copy = rotateArray(arr1Copy, 1);
	                Arrays.stream(arr1Copy).forEach(rec -> System.out.print(rec + " "));  
	                System.out.println("after");              
	            }
	            
	            int currDist = calculateDistance(arr1Copy, array2);
	            if(currDist <= shortestDist)
	            {
	                if(resultArr == null)
	                {
	                    resultArr = Arrays.copyOf(arr1Copy, arr1Copy.length);
	                    shortestDist = currDist;
	                    ++rotationCounter; 
	                    continue;
	                }
	                if(shortestDist == currDist)
	                {
	                    int arr1First = arr1Copy[0];
	                    String arr1Str = String.valueOf(arr1First);
	                     
	                    String resultStr = String.valueOf(resultArr[0]);
	                    System.out.println("resultStr first: " + resultStr.charAt(0) + " arr1Str: " + arr1Str.charAt(0));
	                    if(Integer.valueOf(resultStr.charAt(0)) < Integer.valueOf(arr1Str.charAt(0)))
	                    {
	                        break;
	                    }
	                }
	                int inx = 0; 
	                if(arr1Copy[inx] == resultArr[inx])
	                {
	                     boolean resultIsLarger = true;
	                    while(inx < arr1Copy.length && arr1Copy[inx] == resultArr[inx])
	                    {
	                        if(arr1Copy[inx] > resultArr[inx])
	                        {
	                            resultIsLarger = false;
	                            break;
	                        }
	                        inx++;
	                    }
	                    
	                    if(!resultIsLarger)
	                    {
	                        resultArr = Arrays.copyOf(arr1Copy, arr1Copy.length);
	                    }
	                }
	               else
	               {
	                    if(arr1Copy[0] < resultArr[0])
	                    {
	                        resultArr = Arrays.copyOf(arr1Copy, arr1Copy.length);                        
	                    }
	               }
	               shortestDist = currDist;
	            }
	            
	             ++rotationCounter;
	         }
	        return resultArr;
	    }
	    /**
	    10,123,456,789
	    91,012,345,678
	    */
	    
	    public static boolean identicalArray(int[] array1, int[] array2)
	    {
//	        int inx = 0;
//	        while(inx < array1.length && array1[inx] == array2[inx])
//	        {
//	            ++inx;
//	        }
//	        if(inx == array1.length){return true;}
	        return Arrays.equals(array1, array2);
	    }
	    
	    public static int calculateDistance(int[] arr1, int[] arr2)
	    {
	        int sum = 0;
	        for(int inx = 0; inx < arr1.length; inx++)
	        {
	            sum += Math.abs(arr1[inx] - arr2[inx]);
	        }
	        return sum;
	    }
	    
	    /**
	     1  2  3  4  5
	     5  4  3  2  1
	     5  
	    */
	    public static int[] rotateArray(int[] arr1Copy, int k)
	    {
	        reverse(arr1Copy, 0, arr1Copy.length-1);
	        reverse(arr1Copy, 0, k-1);        
	        reverse(arr1Copy, k, arr1Copy.length-1);
	        return arr1Copy;
	    }
	    
	    public static void reverse(int[] arr, int left, int right)
	    {
	        while(left < right)
	        {
	            int tempLeft = arr[left];
	            arr[left] = arr[right];
	            arr[right] = tempLeft;
	            ++left;
	            --right;
	        }
	    }
	}