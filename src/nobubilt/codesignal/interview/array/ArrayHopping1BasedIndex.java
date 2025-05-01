package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayHopping1BasedIndex {

/**
 * You're assisting in the creation of an algorithm for a novel game where a 
 * character hops between two arrays following certain rules. The game starts at 
 * the first index (1-based) of an array, arrayA.

The value at the character's current position in arrayA determines the index it 
jumps to on the second array, arrayB. Upon landing on arrayB, it does the same 
thing: the value at the current position specifies the index it jumps to in arrayA. 
This iteration continues until the character lands on an index in arrayA that it 
has already visited, at which point the game concludes.

Your task is to develop a Java function simulating this gameplay. The function 
receives two equal-length arrays of integers, arrayA and arrayB, each containing 
n elements (1 ≤ n ≤ 100). It should return an array consisting of the 1-based 
indices on arrayB that the character visited before a position on arrayA was 
repeated.

Each element in the input arrays ranges from 1 to n, indicating the next 1-based 
index that the character will jump to in the other array. The function guarantees 
that each jump always results in a valid position within the same-length arrays, 
and a position in arrayA will inevitably be revisited.

Can you devise a function that proficiently simulates this gameplay?

Example

For arrayA = {1, 3, 2, 5, 4} and arrayB = {5, 4, 3, 2, 1} the output should be 
{1, 4, 3, 2, 5} since it first lands at the first position in arrayB (the resulting
 array is {1}), then goes to the fifth position in arrayA, then returns to the 
 fourth position in arrayB (the resulting array becomes {1, 4}), etc.
 */
	
	  public List<Integer> solution(int[] arrayA, int[] arrayB) {
	        // TODO: Implement the function
	        Set<Integer> visitedAspotIndexes = new HashSet<>();
	        List<Integer> bIndices = new ArrayList<>();
	        int inxA = 0;
	        int inxB = -1;
	        boolean inArrayA = true;
	        
	        while(true)
	        {
	            if(inArrayA)
	            {
	                if(!visitedAspotIndexes.contains(inxA) && inxA < arrayA.length)
	                {
	                    System.out.println("A: " + inxA);
	                    inxB = arrayA[inxA] - 1; // 0-based indexing by subtracting 1
	                   
	                    bIndices.add(inxB+1); // store 1-based index
	                    visitedAspotIndexes.add(inxA);  
	                    if(bIndices.size() == arrayB.length){break;}
	                }
	                else
	                {
	                    break;
	                }
	            }
	            else
	            {
	                if(inxB < arrayB.length && 
	                		!visitedAspotIndexes.contains(arrayB[inxB]-1) )
	                {
	                    System.out.println("B: " + inxB);
	                     inxA = arrayB[inxB]-1;//0-based indexing by subtracting 1.
	                }
	                 else
	                 {
	                    break;
	                 }
	            }
	            inArrayA = !inArrayA;
	        }
	        
	        return bIndices;
	    }
	}

