package nobubilt.codesignal.interview.array;

import java.util.HashSet;
import java.util.Set;

public class ThreeArrayHopingTraversal {
	/**
	 * Gloria the bunny finds herself once again amidst an array game. This time, 
	 * however, the game has slightly intensified with a third array coming into play. 
	 * Your task is to develop a Java function to maneuver Gloria through her quest, 
	 * yielding the summation of the maximum values she encounters from arrayB and 
	 * arrayC together.

Gloria's movement pattern oscillates between the arrays in the following order: 
arrayA -> arrayB -> arrayA -> arrayC -> arrayA -> arrayB -> arrayA -> arrayC, and 
so on.

The rule to decide Gloria's move is: She uses the current element's value in the 
array
 as an index for her next array. For example, if Gloria is at arrayA[1]=2, she would 
 move to arrayB[2].

The pattern repeats itself until one of the following occurs:

Gloria's path repeats, indicating that she is stuck in a loop and cannot progress 
further, OR Gloria tries to access an index that exceeds the length of an array (for 
example, attempting to access arrayA[4] when arrayA only contains 4 items indexed 
from 0 to 3), in which case Gloria's journey should also stop.
Your task is to calculate the sum of the maximum values that Gloria encounters in 
arrayB and arrayC during her journey.

Each input array consists of n items, where n ranges from 1 to 100, inclusive. Every 
item in the arrays is a non-negative integer and falls within the range of 0 to 
99, inclusive.

EXAMPLE

Consider arrayA = [2, 1, 3, 0], arrayB = [1, 3, 2, 4], and arrayC = [4, 2, 5, 1]. 
Gloria's journey would look like:

She begins at arrayA[0] = 2 which leads her to arrayB[2] = 2.
She then goes back to arrayA[2] = 3, and then to arrayC[3] = 1.
She returns to arrayA[1] = 1, then makes a hop to arrayB[1] = 3.
She goes back to arrayA[3] = 0 and then proceeds to arrayC[0] = 4.
Now Gloria would go to arrayA[4], however, since arrayA[4] doesn't exist 
because arrayA` only contains 4 elements indexed from 0 to 3, Gloria's 
journey stops here.
During her journey, Gloria encounters the maximum value 3 in arrayB and 4 in arrayC. 
The function should return 7, the sum of these two maximum values.
	 * @param arrayA
	 * @param arrayB
	 * @param arrayC
	 * @return
	 */
	 
	 public int solution(int[] arrayA, int[] arrayB, int[] arrayC) {
	        // TODO: implement
	        
	        boolean inArrayA = true;
	        boolean inArrayB = false;
	        int inxA = 0;
	        int index = -1;
	        int B_MAX_VALUE = Integer.MIN_VALUE;
	        int C_MAX_VALUE = Integer.MIN_VALUE;
	        Set<Integer> aIndices = new HashSet<>();
	        Set<Integer> bIndices = new HashSet<>();
	        Set<Integer> cIndices = new HashSet<>();
	       
	        while(true)
	        {
	            if(inArrayA)
	            {
	               
	                if(inxA < arrayA.length && !aIndices.contains(inxA))
	                {
	        System.out.println("In A: inx: "+ inxA + " arrayA[inxA]: " + arrayA[inxA]);
	                    aIndices.add(inxA);
	                    index = arrayA[inxA];                    
	                }
	                else
	                {
	                    break;
	                }

	            }
	            else
	            {
	                if(inArrayB)
	                {
	                  
	                    if(index < arrayC.length && !cIndices.contains(index))
	                    {
	                       cIndices.add(index);
	        System.out.println("In C: inx: "+ index + " arrayC[index]: " + arrayC[index] +
	                      " C_MAX_VALUE: "+ C_MAX_VALUE);
	                        if(arrayC[index] > C_MAX_VALUE)
	                        {
	                            C_MAX_VALUE = arrayC[index];
	                             System.out.println("After max C: " + C_MAX_VALUE);
	                        }
	                        inxA = arrayC[index];
	                    }
	                    else
	                    {
	                        break;
	                    }
	                    
	                }
	                else
	                {
	                    
	                    if(index < arrayB.length && !bIndices.contains(index))
	                    {
	                      
	                         System.out.println("In B: inx: "+ index + " arrayB[index]: " + arrayB[index] +
	                      " B_MAX_VALUE: "+ B_MAX_VALUE);
	                        bIndices.add(index);
	                        if(arrayB[index] > B_MAX_VALUE)
	                        {
	                            
	                            B_MAX_VALUE = arrayB[index];
	                             System.out.println("AFTER max B: " + B_MAX_VALUE);
	                        }
	                        inxA = arrayB[index];
	                    }
	                    else
	                    {
	                        break;
	                    }
	                }
	                 inArrayB = !inArrayB;
	            }
	            
	            inArrayA = !inArrayA;
	           
	        }
	        if(B_MAX_VALUE == Integer.MIN_VALUE)
	        {
	            B_MAX_VALUE = 0;
	        }
	        if(C_MAX_VALUE == Integer.MIN_VALUE)
	        {
	            C_MAX_VALUE = 0;
	        }
	        return  B_MAX_VALUE + C_MAX_VALUE;
	    }
	
}
