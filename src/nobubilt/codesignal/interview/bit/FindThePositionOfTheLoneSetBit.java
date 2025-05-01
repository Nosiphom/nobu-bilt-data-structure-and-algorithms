package nobubilt.codesignal.interview.bit;

public class FindThePositionOfTheLoneSetBit {

/**
 * Write a function findLoneSetBit(int n) which returns the position of the only 
 * set bit (bit having value 1) in the binary representation of a given non-zero 
 * integer n.
 *  If there are multiple or no set bits in the given number, return -1.
The solution is allowed to use only bit techniques, it is not allowed to use type 
conversions.

Here are some examples:

Java
Copy to clipboard
System.out.println(Solution.findLoneSetBit(16));  // Output: 5 (16 = 10000)
System.out.println(Solution.findLoneSetBit(13));  // Output: -1 (13 = 1101)
System.out.println(Solution.findLoneSetBit(0));   // Output: -1 (0 = 0)
 * @param n
 * @return
 */
	public static int findLoneSetBit(int n) {
	        // TODO: Implement the function that returns the position of the lone set bit
	        if(n == 0){return -1;}
	        if(n == 1){return 1;}
	        if((n & 1) != 0) // e.g. 1 & 1 => 1 or 01111 & 1 => 01111
	        {
	            n = n >> 1;
	            if(n > 1)
	            {
	                return -1;
	            }   
	        }
	        
	        int pos = 0;
	        while(n != 0)  
	        {
	            n = n >> 1;  
	            ++pos;
	        }
	        return pos; 
	    }
	
}
