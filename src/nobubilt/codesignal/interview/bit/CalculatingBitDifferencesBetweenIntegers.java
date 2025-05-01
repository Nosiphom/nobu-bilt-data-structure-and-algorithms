package nobubilt.codesignal.interview.bit;

public class CalculatingBitDifferencesBetweenIntegers {
/**
 * You are to write a function getBitDiff(a, b) that calculates the count of
 *  different bits between two integers a and b. This function should return 
 *  an integer representing the number of positions at which the corresponding bits
 *   are different.

For example, if a = 14 (1110) and b = 15 (1111), the function getBitDiff(a, b) 
should return 1, as it is only one bit different in the binary representation of 
a and b.

9 = 1001
2 = 0010
n = 2 ^ 9 => 1001 ^ 0010 =>1011
1011 & 1010 => 1010  c=1
1010 & 1001 => 1000  c=2
1000 & 0111 => 0000  c=3

You can only use bit manipulation in this task, type conversion is not allowed.
 * @param a
 * @param b
 * @return
 */

	 public static int getBitDiff(int a, int b) {
	        // TODO: implement the function body.
	        int n = a ^ b; // EXCLUSIVE OR gives where bits are diff
	        int count=0;
	        while(n != 0) // COUNTING SET BITS AKA WHERE ITS 1.
	        {
	            n = n & (n-1);
	            ++count;
	        }
	        return count;
	    }
}
