package nobubilt.codesignal.recursion;

public class SumofDigitsRaisedtoTheirPositionsUsingRecursion {
	/**
	 * You are provided with a positive integer n. Your task is to write a recursive function 
	 * that returns the sum of all the digits in n raised to the power of their respective 
	 * positions (1-indexed from the right). Make sure to use recursion in your solution.

	In simpler terms, take each digit in n, raise it to the power of its position, and 
	find the sum of these values. Note that positions start from 1 and count from the 
	rightmost digit.

	For example, if n = 253, your function should calculate 3^1 = 3 (as 3 is at the 1st position),
	 5^2 = 25 (as 5 is at the 2nd position), and 2^3 = 8 (as 2 is at the 3rd position), 
	 with each ^ representing "raised to the power of". So, the final result will be 3 + 25 + 8 = 36.
	 * 
	 *
	 */
	public int sumOfDigitsRaisedToPositions(int n)
	{
		String strVal = String.valueOf(n);
		if(strVal.length() == 1) {return n;}
		
		return sum(strVal, 1, strVal.length()-1);
	}
	
	public int sum(String strVal, int counter, int inx)
	{
		if(inx == 0)
		{
			int val = strVal.charAt(inx) - '0';
			return (int)Math.pow(val, counter);
		}
		
		int val = strVal.charAt(inx)-'0';
		return (int)Math.pow(val, counter) + sum(strVal, counter + 1, inx-1);
	}

}
