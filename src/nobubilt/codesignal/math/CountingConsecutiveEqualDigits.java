package nobubilt.codesignal.math;

public class CountingConsecutiveEqualDigits {
/**
 * You are tasked with writing a function that takes a positive integer n, as 
 * an input and returns the number of consecutive equal digits in the number. 
 * Specifically, your function should identify pairs of digits in n that are 
 * equal and consecutive and return the count of these pairs.

For instance, if n = 113224, it contains two groups of consecutive equal digits: 
11 and 22. Therefore, the output should be 2. For n = 444, the output should also 
be 2, as there are two groups of 44 in this number.

Keep in mind that n will be a positive integer ranging from 1 to 10^8, inclusive.
Note: You are not permitted to convert the number into a string or any other 
iterable structure for this task. You should work directly with the number.
Instead of building a new number with num, try using num to store the last 
digit you processed. Here's a hint:

Use num to keep track of the last digit.
Compare the current digit with num.
If they are equal, increment the counter.
Update num to the current digit after each iteration.
 */
	
	  public int solution(int n) {
// TODO: implement n = 113224 has 2 equal digits:11 and 22. n = 444 has 2 groups of 44
	        int counter = 0;
	        int num = Integer.MIN_VALUE;
	        while(n > 0)
	        {
	            int digit = n%10;
	            if(num == Integer.MIN_VALUE)
	            {
	                num = digit;
	            }
	            else 
	            {
	                if(num == digit)
	                {
	                      ++counter;
	                }
	                num =  digit;
	            }     
	            n = n/10;
	        }
	        return counter;
	    }
}
