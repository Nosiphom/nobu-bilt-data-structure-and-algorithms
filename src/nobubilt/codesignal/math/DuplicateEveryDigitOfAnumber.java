package nobubilt.codesignal.math;

public class DuplicateEveryDigitOfAnumber {
/**
 * 
 * Your task is to implement a function that duplicates every digit in a given 
 * non-negative integer number, n. For example, if n equals 1234, the function 
 * should return 11223344.

To prevent possible integer overflow, it is guaranteed that n will be a 
non-negative integer that does not exceed 10 ^ 4. Solve this task without 
converting n into a string or performing any other type of casting. Your job 
is to work strictly with integer operations.

Keynote:
Focus on the essence of the problem, which is processing each digit of the number 
independently while maintaining the digit order. There is no need to look for 
mathematical patterns or clever simplifications; plain and straightforward 
processing will suffice. Utilize the toolbox of basic programming skills: loops, 
conditions, and mathematical operations. Good luck!
 */
	 public int solution(int n) {
	        // TODO: Implement the solution
	        if(n == 0){return 0;}
	        int power = 0;
	        int num = 1;
	        
	        while(n > 0)
	        {
	            int digit = n%10;
	            int dup = (digit * 10) + digit;
	            if(power == 0)
	            {
	                num = dup;
	                
	            } 
	            else
	            {
	               int outcome = (int) Math.pow(10, power);
	                num += (dup * outcome);
	            }
	       //     System.out.println("num: " +  num + "   n:" + n);
	            n = n/10;
	            power+=2;
	        }
	        
	        return num;
	    }
	}
