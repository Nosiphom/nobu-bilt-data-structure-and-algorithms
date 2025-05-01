package nobubilt.codesignal.interview.array;

public class ArrayHoppingGameWithGloria {

	public static void main(String[] args) {
        int[] arrayA = {2, 4, 3, 1, 6};
        int[] arrayB = {4, 0, 3, 2, 0};

        System.out.println("Maximum value encountered in arrayB: " 
        + solution(arrayA, arrayB));
        // Prints:
        // Maximum value encountered in arrayB: 3
    }
/**
 * Gloria's quest unfolds with two arrays, both brimming with non-negative integers.
 *  Starting at the first element of arrayA, she leaps to arrayB based on the index 
 *  she discovers in arrayA. She then bounces back to arrayA according to the index 
 *  she stumbles upon in arrayB. Gloria repeats these hops until she returns to 
 *  where she started in arrayA. What an adventure!

Your challenge is to craft a Java function that aids Gloria on her trip. The 
function will take two arrays of integers as inputs, representing arrayA and arrayB. 
The objective is to find the highest value from arrayB that Gloria jumps to during 
her voyage.

It is guaranteed that, at some point, Gloria returns to the starting position.

Example

If arrayA = {2, 4, 3, 1, 6} and arrayB = {4, 0, 3, 2, 0}, the output should be 3.

In this scenario, Gloria starts from the first element of arrayA, which is 2. Then, 
she jumps to arrayB at index 2, where she discovers 3. She then bounces back to 
arrayA at index 3, where she arrives at 1. From there, she leaps back to arrayB 
at index 1, stumbling upon a 0. Finally, she bounces back to arrayA at index 0, 
the location where she started her adventure. Hence, she stops here. During this 
journey, she encountered the highest value 3 from arrayB.
 * @param arrA
 * @param arrB
 * @return
 */
	public static int solution(int[] arrA, int[] arrB)
	{
		int inxA =0;
		int inxB = -1;
		int max_val = Integer.MIN_VALUE;
		boolean inArrayA = true;
		while(true)
		{
			if(inArrayA)
			{
				inxB = arrA[inxA];
				if(arrB[inxB] > max_val)
				{
					max_val = arrB[inxB];
				}
			}
			else
			{
				inxA = arrB[inxB];
				if(inxA == 0)
				{
					return max_val;
				}
			}
			inArrayA = !inArrayA;
		}
		
	}
	
	
}
