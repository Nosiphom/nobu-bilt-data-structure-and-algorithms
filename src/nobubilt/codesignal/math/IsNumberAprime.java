package nobubilt.codesignal.math;


public class IsNumberAprime {	
	 /**
	  * identifying if a number is prime or not. A prime number is a number 
	  * greater than 1 that has no positive divisors other than 1 and itself.
	  *  Here's a quick and efficient way to check if a number n is prime: we 
	  *  iterate through 2 to the square root of n. If n is divisible by any 
	  *  of these numbers, it's not a prime number. If n is not divisible by 
	  *  any of the numbers in the range, then it's a prime number.
	  * 
	  *
	  */
	    public static boolean isPrime(int number) {
	        // Function to check if number is a prime number
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= (int)Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        System.out.println(isPrime(10)); // Outputs: false
	        System.out.println(isPrime(11)); // Outputs: true
	    }
	
}
