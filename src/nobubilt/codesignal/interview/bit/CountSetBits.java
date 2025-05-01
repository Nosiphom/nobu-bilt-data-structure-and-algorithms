package nobubilt.codesignal.interview.bit;

public class CountSetBits {

	public static void main(String[] args)
	{
		System.out.println("Number of bits in 3: " + countSetBits(3)); // 2 => 11  
		System.out.println("Number of bits in 6: " + countSetBits(6)); // 2 => 110
		System.out.println("Number of bits in 10: " + countSetBits(10)); // 2 =>1010
		System.out.println("Number of bits in 8: " + countSetBits(8)); // 1=> 1000
		
	}

/**
 * This method, countSetBits, counts the number of set bits (1s) in the binary 
 * representation of a number. The & operator is used for the bitwise AND operation.
 *  The n - 1 operation flips the least significant bit (the rightmost 1 bit in the 
 *  binary representation) of n to 0, and n &= (n - 1) applies this change to n. 
 *  The while loop continues until n becomes 0, and for each iteration, the count 
 *  is increased, tracking the number of set bits.

For example, consider n = 6, which is 110 in binary:

n - 1 is 5 (101 in binary);
The bitwise AND operation 110 & 101 results in 100.
 * @param n
 * @return
 */
	public static int countSetBits(int n)  // 6 => 110
	{
		int counter = 0;
		while(n != 0)
		{// 110 & 101 where 6-1 = 5 aka 101 =>  110 & 101 = 100 (aka 4) ::: 100 & (4-1)
			n= n & (n-1); 
			++counter;	  // 100 & (4-1) => 100 & 011 = 000
		}
		
		return counter; //2 
	}
	
	
}
