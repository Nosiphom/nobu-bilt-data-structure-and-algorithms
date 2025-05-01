package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargeNumberAdder {

	public static void main(String[] args) {
	       System.out.println(addLargeNumbers("1454178195297", "8458263917502"));
	       // Outputs 9912442112799
	       //         9912442112799
	   }

	public static String addLargeNumbers(String num1, String num2)
	{
		int num1Inx = num1.length()-1;
		int num2Inx = num2.length()-1;
		List<Character> result = new ArrayList<>();
		int carry = 0;
		while(num1Inx >= 0 || num2Inx >= 0 || carry != 0)
		{
			int digit1 = num1Inx >= 0 ? num1.charAt(num1Inx)-'0' : 0;
			int digit2 = num2Inx >= 0 ? num2.charAt(num2Inx)-'0' : 0;
			int current = digit1 + digit2 + carry;
			carry = current/10;
			current = current%10;
			result.add((char)('0' + current));
			--num1Inx;
			--num2Inx;
		}
		
		Collections.reverse(result);
		StringBuilder sb = new StringBuilder(result.size());
		for(Character ch : result)
		{
			sb.append(ch);
		}
		return sb.toString();
	}
	
}
