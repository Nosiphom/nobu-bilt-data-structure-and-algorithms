package nobubilt.codesignal.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptimizeArrayReplace {
/**
 * You are given two arrays, array A and array B, each containing n integers where n can 
 * range from 2 to 100000 inclusive. All elements of both arrays are integers that can range from 
-1010  to 1010 , inclusive.Your task is to create a function optimizedReplace that returns a new 
array, C. For each index i, C[i] should contain a specific value from array A - A[j], determined 
by the condition that B[i] is the closest number to B[j] from array B.
This means that array C will have the same length as A and B. C[i] will contain the value 
corresponding to the j-th index from array A, where the value at the j-th index in array B is
 closest to the value at the i-th index of array B.

Assume that there is no ambiguity. The array B is given in a way that no two elements in array 
B have the same minimal absolute difference with B[i].

Remember, the number of elements, n, and the range of the elements, imply that brute force 
solutions will not be efficient. You should aim to leverage optimized algorithms and techniques 
to solve this task efficiently.

Example
Suppose we have A = {10, 20, 30, 40, 50} and B = {7, 5, 1, 2, 4}.

The function optimizedReplace(A, B) should work as follows:

For B[0] = 7, the closest number in B is 5 at index 1. Hence, C[0] = A[1] = 20.

For B[1] = 5, the closest number in B is 4 at index 4. Thus, C[1] = A[4] = 50.

For B[2] = 1, the closest number in B is 2 at index 3. Hence, C[2] = A[3] = 40.

For B[3] = 2, the closest number in B is 1 at index 2. So, C[3] = A[2] = 30.

Lastly, for B[4] = 4, the closest number in B is 5 at index 1. We have C[4] = A[1] = 20.

Thus, the function optimizedReplace({10, 20, 30, 40, 50}, {7, 5, 1, 2, 4}) should 
return {20, 50, 40, 30, 20}.
 */

	 public long[] optimizedReplace(long[] A, long[] B) {
	        // TODO: implement the function
	        long[] result = new long[B.length];
	        List<Long[]> sortedBlist = new ArrayList<>();
	        for(int inx = 0; inx < B.length; inx++)
	        {
	            sortedBlist.add(new Long[]{B[inx], (long)inx});
	        }
	        Collections.sort(sortedBlist, Comparator.comparing(rec -> rec[0]));
	        
	        for(int inx = 0; inx < B.length; inx++)
	        {
	            int nextIndex = findNextIndex(B[inx], B, sortedBlist);
	            
	            result[inx] = A[nextIndex];
	        }
	        
	        return result;
	    }


	public int findNextIndex(long currNum, long[] B, List<Long[]> sortedBlist)
	{
	    int index = 0;
	    int left = 0;
	    int right = sortedBlist.size(); // binary Search
	    while(left < right)
	    {
	        int mid = (left + right)/2;
	        if(sortedBlist.get(mid)[0] == currNum)
	        {
	            long leftDelta = Long.MAX_VALUE;
	            long rightDelta = Long.MAX_VALUE;
	            if(mid - 1 >= 0)
	            {
	                leftDelta = Math.min(sortedBlist.get(mid)[0] - sortedBlist.get(mid-1)[0], leftDelta);
	            }
	            if(mid + 1 < sortedBlist.size())
	            {
	                rightDelta = Math.min(rightDelta, (sortedBlist.get(mid+1)[0] - sortedBlist.get(mid)[0]));
	            }
	            if(leftDelta < rightDelta)
	            {
	                index = sortedBlist.get(mid-1)[1].intValue();
	                break;
	            }
	            else
	            {
	                index = sortedBlist.get(mid+1)[1].intValue();
	                break;
	            }
	        }
	        else if(sortedBlist.get(mid)[0] < currNum)
	        {
	             left = mid+1;
	        }
	        else
	        {
	            right = mid;
	        }
	    }
	     return index;
	}

	int findBValueIndex(long num, long[] B)
	    {
	        for(int inx = 0; inx < B.length; inx++)
	        {
	            if(num == B[inx])
	            {
	                return inx;
	            }
	        }
	        return -1;
	    }

	}