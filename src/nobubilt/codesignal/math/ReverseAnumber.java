package nobubilt.codesignal.math;

public class ReverseAnumber {
/**
 * Your task is to construct a function that accepts an integer n and returns 
 * the integer with the same digits as n, but in reverse order. You should 
 * implement your solution using a while loop.

For instance, if the input is 12345, the output should be 54321.

Keep in mind that n will always be a positive integer between 
1 and 10^ 8.
Do not use built-in functions that convert the integer to another data type, 
such as a string, to reverse it. Solve the problem purely using mathematical 
operations and loop constructs. Note that when the result has leading zeros, 
you should consider only the integer value (e.g., 1230 becomes 321 after 
the operation).
 * @param n
 * @return
 */	
	 public int solution(int n) {
	        // TODO: implement the solution here
	        int num = 0;
	        int counter = 10;
	        while(n > 0)
	        {
	            int digit = n%10;
	            if(num == 0)
	            {
	                num = digit;
	            }
	            else
	            {
	                num = (num * counter) + digit;
	            }
	           n = n/10;
	        }
	        
	        return num; // Placeholder return
	    }
}
