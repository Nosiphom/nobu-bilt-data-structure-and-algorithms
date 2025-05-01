package nobubilt.codesignal.math;

public class CheckingForContigousSubArray {
/**
 * You are provided with two arrays of integers, listA and listB. Your task is to determine if 
 * listB is a contiguous subarray of listA. You need to return true if listB is a contiguous 
 * subarray of listA, and false otherwise.

A subarray is defined as a subset of consecutive elements within an array. For instance, [2, 3] 
is a subarray of [1, 2, 3, 4] but not a subarray of [1, 3, 2, 4].

Note that you are not allowed to use any Java built-in array functions for this task except 
for getting the length of an array. All other operations should be executed with basic Java 
programming constructs.
 */
	public static boolean solution(int[] listA, int[] listB) {
        // TODO: implement solution
        int innerInx = 0;
        for(int outerInx = 0; outerInx < listA.length; outerInx++)
        {
            if(listA[outerInx] == listB[innerInx])
            {
                while(innerInx < listB.length && outerInx < listA.length && listA[outerInx] == listB[innerInx])
                {
                    ++outerInx;
                    ++innerInx;
                }
                if(innerInx == listB.length)
                {
                    return true;
                }
                else
                {
                    innerInx = 0;
                }
            }
        }
        return false;
    }
}
