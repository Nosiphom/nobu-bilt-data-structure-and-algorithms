package nobubilt.codesignal.math;

import java.util.HashSet;
import java.util.Set;

public class CoPrimeNumberChecker {
	/**
	 * You are provided with two integers, a and b. Your task is to write a Java function that 
	 * checks whether both a and b are coprime or not. Two numbers are said to be coprime or 
	 * mutually prime if the only positive integer that divides both of them is 1. 
	 * The expected complexity is O(max(a,b)).

		For example:
	
		Java
		Solution solution = new Solution();
		System.out.println(solution.areCoprime(15, 28));   // Output: true
		System.out.println(solution.areCoprime(12, 18));   // Output: false
		In the first example, the only positive integer that divides both 15 and 28 is 1; 
		hence, they are coprime. However, in the second example, 12 and 18 are divisible by 2 and 3; 
		thus, they are not coprime.
	 * 
	 *
	 */	

	 public boolean areCoprime(int a, int b) {
	        // TODO: implement
	        int gcd = greatestCommonDivisor(a,b);
	        if(gcd == 1)
	        {
	            return true;
	        }
	        return false;
	    }
	  	    
	    int greatestCommonDivisor(int a, int b) // 12   18
	    {
	        while(b != 0)  // 18   12  :: 0
	        {
	            int temp = b; // 18   				12   :: 6
	            b = a%b;  // 12%18 => 12  ::  18%12=> 6  :: 12%6 => 0
	            a = temp; // 18  				 :: 12  :: 6
	        }
	        return a; // 6
	    }
	    
	    public static void main(String[] args)
	    {
	    	int num = 12%18;
	    	System.out.println("*****"+ num);
	    	
	    	Set<Integer> result = getDivisors(6);
	    	result.stream().forEach(rec -> System.out.print(rec + " "));
	    }
	    
	    private static Set<Integer> getDivisors(int n) {
	        // TODO: implement
	        Set<Integer> result = new HashSet<>();
	        int num = n;
	        for(int inx = 1; inx <= n; inx++)
	        {
	            if(num%inx == 0)
	            {
	                result.add(inx);
	            }
	            
	        }
	        return result;
	    }
	}