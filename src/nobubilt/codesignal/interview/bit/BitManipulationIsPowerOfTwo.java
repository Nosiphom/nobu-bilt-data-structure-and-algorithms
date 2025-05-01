package nobubilt.codesignal.interview.bit;

public class BitManipulationIsPowerOfTwo {
	
	public static boolean solution(int n)
	{
		  // TODO: implement the function to check if the number is 
		  //a power of two using bit manipulation technique
		// n =3 is false
		// n =4 is true
		return (n != 0 ) && ((n & n-1) == 0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  public static boolean solutionT(int n) {
	        // TODO: implement the function to check if the number is 
		  //a power of two using bit manipulation technique
	       
		  /**
		   * n = 3 => 11 => 11 & 10 (aka 2) = 10 false
		   * n = 4 =>100 => 100 & 11 (aka 3) = 0 true
		   */
		  return (n != 0) && ((n & (n-1)) == 0);
	    }
}
