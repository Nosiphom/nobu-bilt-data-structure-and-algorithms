package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplicationLargeNumbers {
	/**
	 * You are tasked with writing a Java function to multiply two extremely 
	 * large positive integers. These are not your regular-sized large numbers; 
	 * they are represented as strings potentially up to 500 digits long.

Your function should take two string parameters, representing the two large 
integers to be multiplied, and return the product as a string. The challenging 
part is that you should perform the multiplication without converting the entire 
strings into integers.

Keep in mind that the elements of the string are digits in the range from 0 to 9, 
inclusive.

Furthermore, bear in mind that when multiplying numbers manually, we align the 
numbers vertically and multiply each digit of the first number with each digit 
of the second number, starting from the rightmost digits, and add the results 
after shifting appropriately.

For example:

multiplyLargeNumbers("123", "456") should return "56088".
multiplyLargeNumbers("999999999", "1") should return "999999999".
multiplyLargeNumbers("0", "500") should return "0".
Please solve this problem using similar, decision-based string manipulations 
instead of merely converting strings into integers, multiplying them, and 
converting the result back to a string. This approach is imperative as direct 
multiplication would not be feasible for very large numbers.

Challenge yourself, and Happy Coding!
	 * @param num1
	 * @param num2
	 * @return
	 */
	  public String multiplyLargeNumbers(String num1, String num2) {
	        // TODO: Implement function
	        List<Character> result = new ArrayList<>();
	        int carry = 0;
	        int zeroAdj = num2.length()-1;
	        for(int n2Inx = num2.length()-1; n2Inx >= 0; n2Inx--)
	        {
	            int n2 = num2.charAt(n2Inx) - '0';
	             List<Character> subset = new ArrayList<>();
	             
	             for(int counter = 0; counter < zeroAdj- n2Inx; counter++)
	             {
	                subset.add((char)('0' + 0));
	             }
	          
	            // System.out.println("num2: " + num2);
	            // subset.stream().forEach(rec -> System.out.print(rec));
	            // System.out.println();
	             carry = 0;
	             for(int n1Inx = num1.length()-1; n1Inx >= 0; n1Inx--)
	             {
	                int n1 = num1.charAt(n1Inx) - '0';
	                int current = (n1 * n2) + carry;
	                carry = current/10;
	                current = current%10;
	                subset.add((char)('0' + current));
	             }
	             if(carry > 0)
	             {
	            	 subset.add((char)('0' + carry));
	             }
	            result = addToResult(result, subset);
	            
	        }
	        StringBuilder sb = new StringBuilder(result.size());
	        for(Character ch : result)
	        {
	            sb.append(ch);
	        }
	        if(sb.charAt(0) == '0')
	        {
	           int inx = 0;
	           while(inx < sb.toString().length() && sb.charAt(inx) == '0') 
	           {
	             ++inx;
	           }
	           if(inx == sb.toString().length()){return "0";}
	           return sb.toString().substring(inx);
	        }
	        return sb.toString();  // placeholder
	    }
	    
	    public List<Character> addToResult(List<Character> result,  List<Character> subset )
	    {
	        Collections.reverse(subset);
	        if(result.isEmpty()){return subset;}

	        List<Character> outcome = new ArrayList<>();
	        int inxSub = subset.size() - 1;
	        int inxR = result.size()-1;
	        int carry = 0;
	        while(inxSub >= 0 || inxR >= 0 || carry !=0)
	        {
	            int subNum = inxSub >= 0 ? subset.get(inxSub) - '0' : 0;
	            int rNum = inxR >= 0 ? result.get(inxR) - '0' : 0;
	            int current = subNum + rNum + carry;
	            carry = current/10;
	            current = current%10;
	            outcome.add((char)('0' + current));
	            --inxR;
	            --inxSub;
	           
	        } 
	        Collections.reverse(outcome);
	       
	        return outcome;
	    }
	}
