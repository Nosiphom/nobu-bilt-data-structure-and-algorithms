package nobubilt.codesignal.math;

public class NthPrimeNumber {
	/**
	 * assertEquals(5, solution.nthPrime(3)); //2 3 5
	 *   assertEquals(2, solution.nthPrime(1)); //2
	 * @param n
	 * @return
	 */
	  public int nthPrime(int n) {
	        // TODO: implement the function
	        int counter = 0;
	        int num = 1;
	        while(counter < n)
	        {
	            ++num;
	            if(isPrimeNumber(num))
	            {
	                ++counter;   
	            }
	        }
	        
	        return num;
	    }
	    
	    boolean isPrimeNumber(int num)
	    {
	        for(int inx = 2; inx <= (int)Math.sqrt(num); inx++)
	        {
	            if(num%inx == 0)
	            {
	                return false;
	            } 
	        }
	        return true;
	    }
}
