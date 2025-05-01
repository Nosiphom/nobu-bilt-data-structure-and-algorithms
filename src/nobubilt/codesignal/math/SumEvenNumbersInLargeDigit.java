package nobubilt.codesignal.math;

public class SumEvenNumbersInLargeDigit {

	public static int solution(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			int digit = num%10;
			if(digit%2 == 0)
			{
				sum += digit;
			}
			num = num/10;
		}
		
		return sum;
	}
/**
 * We need to create a function that operates on an input integer to calculate 
 * the sum of its even-numbered digits. However, we won't convert this integer 
 * to a string at any point during this process. For example, given an integer n 
 * of value 4625, our output should be 12, which is the sum of the even digits 4, 6, 
 * and 2.
 */
	public static void main(String[] args) {
        int n = 4625;
        System.out.println(solution(n));  // Output should be 12
    }
}
