package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.List;

public class UniquePrimeFactors {
/**
 * Your task is to create a Java function called getPrimeFactors(int n) that will 
 * return all unique prime factors of an integer n in a list. A prime factor of n 
 * is a prime number that divides n without leaving a remainder. The expected 
 * complexity is 
O(Math.sqrt(n)).

Note that returned prime factors should be unique and sorted in ascending order 
in the resulting list.

 */
	 
	 public List<Integer> getPrimeFactors(int n) {
	        // TODO: Implement the function that returns all prime factors of n
	       List<Integer> result = new ArrayList<>();
	        if(n <=1){return new ArrayList<>();}
	        System.out.println("************");
	        for(int num = 2; num <= (int)Math.sqrt(n); num++)
	        {
	        	System.out.println("n: "+ n + "  ::num: "+ num);
	            if( n%num== 0)
	            {
	                while(n%num == 0)
	                {
	                    n = n/num;
	                }
	                result.add(num);
	            }
	        }
	        if(n > 1)
	        {
	        	 System.out.println("out:  n: "+ n);
	            result.add(n);
	        }
	        return result;
	    }
	   
}
