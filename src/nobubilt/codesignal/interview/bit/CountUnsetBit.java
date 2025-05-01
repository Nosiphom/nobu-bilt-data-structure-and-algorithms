package nobubilt.codesignal.interview.bit;

public class CountUnsetBit {
	
	public static int countUnsetBits(int n)
	{
		
		int count = 0;
		while(n != 0)
		{
			n = n & (n-1);
			++count;
		}
		return 32 - count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/**
 * Your task is to write a Java function named countUnsetBits. This function will take a 
 * 32-bit integer n as input and return the number of unset (0) bits in the binary 
 * representation of the given number.

The solution is allowed to use only bit techniques, it is not allowed to use type 
conversions.
 * @param n
 * @return
 */
	
	
	
	
	
	
	
	
	
	
	
	
    public static int countUnsetBitsT(int n) {
        // TODO: Implement the solution here
        int setBitcount =0;
        while(n != 0)
        {
            n = n & (n-1);
            ++setBitcount;
        }
        return 32 - setBitcount;
    }
}
