package nobubilt.codesignal.interview.bit;

public class SecondFromRightZero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(equalPairOfBits(10, 11)); // 10 = 1010, 11 = 1011 => 2
		System.out.println(equalPairOfBits(17, 18)); //=> 4
		
        System.out.println(swapAdjacentBits(13));  // Output should be 14
        System.out.println(swapAdjacentBits(74));  // Output should be 133
		
        
        System.out.println(differentRightmostBit(11, 13));  // Output should be 2
        System.out.println(differentRightmostBit(7, 23));   // Output should be 16

		
        int digit = 37; // 100101
		System.out.println(secondFromRightZero(digit));
		System.out.println(1 << (Integer.toBinaryString(digit).length()- 
				Integer.toBinaryString(digit).lastIndexOf('0', 
						Integer.toBinaryString(digit).lastIndexOf('0')-1)-1));
	}
	
	/**
	 * To find the position of the rightmost pair of equal bits in the binary representations 
	 * of two integers n and m, you can use bitwise operations. Specifically, you want to 
	 * identify the position of the rightmost bit where both n and m have either 0 or 1.

Here's the step-by-step approach and the concise solution in Java:

Bitwise AND:

(n & m): This will produce a number where each bit is set to 1 if the corresponding bits 
of n and m are both 1.
Bitwise NOR:

~(n | m): This will produce a number where each bit is set to 1 if the corresponding bits 
of n and m are both 0.
Combine with OR:

(n & m) | (~(n | m)): This combines the results to find all positions 
where n and m have equal bits.
Isolate the Rightmost 1 Bit:

The rightmost bit where they are equal can be found using the same trick 
with -x to isolate the 
rightmost 1 bit.
	 * @param n
	 * @param m
	 * @return
	 */
	static int equalPairOfBits(int n, int m)
	{
		return (n & m | ~(n | m)) & -((n & m | ~(n | m)));
	}
	
	/**
	 * Explanation: Different right most bit
XOR Operation:
For n = 11 and m = 13, the output should be
solution(n, m) = 2.

11 = 1011, 13 = 1101, the rightmost bit in which they differ is the bit at 
	   -          -
(n ^ m) & -(n ^ m): 1011 ^ 1101 => 0110 & -0110 => 0110 & (1001+1)=>
0110 & 1010 => 0010.
position 1 (0-based) from the right in the binary representations.
So the answer is 2^1 = 2.

For n = 7 and m = 23, the output should be solution(n, m) = 16.

7 = 00111, 23 = 10111, i.e.
    -           -
So the answer is 2^4 = 16

n ^ m: This will produce a number where each bit is set to 1 if the corresponding 
bits of n and m are different, and 0 if they are the same.
Isolate the Rightmost 1 Bit:

(n ^ m) & -(n ^ m): This expression isolates the rightmost 1 bit in the result 
of n ^ m. This works because -x is the two's complement of x, which flips all the
 bits of x and adds 1.

For example, if x = 6 (which is 0110 in binary):

-x = -6 (which is 1010 in binary, after flipping and adding 1).
x & -x will isolate the rightmost bit, yielding 0010.
This single line efficiently computes the desired value by leveraging bitwise 
operations and properties of two's complement arithmetic.
	 * @param n
	 * @param m
	 * @return
	 */
	static int differentRightmostBit(int n, int m) {
		  return (n ^ m) & -(n ^ m);
	}
	
	  int digit = 37; // 100101
	static int secondFromRightZero(int n)
	{
		return (1 << (Integer.toBinaryString(n).length()- 
				Integer.toBinaryString(n).lastIndexOf('0', Integer.toBinaryString(n).lastIndexOf('0')-1)-1));
	}
	
	 public static int swapAdjacentBits
(int n) {
	        return ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
	    }
	 /**
	  * 
Creating a one-liner solution for swapping bits in each pair for a 32-bit integer in Java can be quite 
challenging, but we can use bitwise manipulation tricks to achieve this in a condensed form. 
Here's a concise one-liner approach:

Explanation:
Mask Creation:

0xAAAAAAAA is a hexadecimal number where all the even bits are set to 1 (binary: 10101010101010101010101010101010).
0x55555555 is a hexadecimal number where all the odd bits are set to 1 (binary: 01010101010101010101010101010101).
Bitwise AND Operation:

(n & 0xAAAAAAAA): Extracts all the bits at even positions.
(n & 0x55555555): Extracts all the bits at odd positions.
Bit Shifting:

>>> 1: Right shift the even bits by 1 to move them to odd positions.
<< 1: Left shift the odd bits by 1 to move them to even positions.
Bitwise OR Operation:

Combine the shifted bits using the bitwise OR (|) to get the final result where each pair of bits is swapped.
This one-liner leverages the power of bitwise operations to efficiently swap the bits in each pair and return 
 the resulting integer.

	  */

}
