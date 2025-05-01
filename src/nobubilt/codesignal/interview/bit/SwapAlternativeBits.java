package nobubilt.codesignal.interview.bit;

public class SwapAlternativeBits {
/**
 * You are provided with an integer number n, and your task is to swap every pair of 
 * odd and even bits of this number. Bit positions are numbered from 1 to n from right to 
 * left (or least significant to most significant). This means bit 1 (the least 
 * significant bit) should be swapped with bit 2, bit 3 should be swapped with bit 4, 
 * and so forth.

For example, if n = 23, its binary representation is 010111. After swapping the odd 
and even bits, we get 101011, which is the binary representation of 43. So, the 
function swapBits(23) will return 43.

You can only use bit manipulation in this task, type conversion is not allowed. 
The expected time complexity for this task is O(logn).

Mask out even bits (bits at even positions) and shift them right by 1.
Mask out odd bits (bits at odd positions) and shift them left by 1.
Combine both results using bitwise OR (|).
Bitwise Explanation
Even bits: 0xAAAAAAAA (10101010101010101010101010101010 in 32-bit)
Odd bits: 0x55555555 (01010101010101010101010101010101 in 32-bit)
For example, if n = 23:

Binary of 23:    00000000 00000000 00000000 0010111
Even bits:       00000000 00000000 00000000 0010100  (Extracted with `n & 0xAAAAAAAA`)
Odd bits:        00000000 00000000 00000000 0000011  (Extracted with `n & 0x55555555`)
Shift and swap:
Left shift evens: 00000000 00000000 00000000 0101000
Right shift odds: 00000000 00000000 00000000 0000011
OR operation:     00000000 00000000 00000000  101011  (Binary of 43)
 */
	   public static int swapBits(int n) {
	        // TODO: implement this function
	        int evenBits = (0xAAAAAAAA & n) >>> 1; //// Extract even bits and shift right
	        int oddBits = (0x55555555 & n) << 1;// Extract odd bits and shift left
	        
	        return evenBits | oddBits; // Combine them
	    }
}
