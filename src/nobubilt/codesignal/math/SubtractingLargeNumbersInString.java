package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubtractingLargeNumbersInString {
/**
 * You are given two exceedingly large positive decimal numbers, num1 and num2, 
 * both represented as strings. The length of these strings can range anywhere 
 * from 1 to 500 characters. The challenge here is to subtract num2 from num1 
 * without directly converting the strings into integers.

Create a Java method that performs this operation and returns the resultant string, 
referred to as num3.

Please note that the subtraction will not result in a negative number, as num1 will 
always be greater than or equal to num2.

Examples:

subtractStrings("398746", "199234") should return "199512".
subtractStrings("100", "1") should return "99".
subtractStrings("111111111111111", "111111111111111") should return "0".
 */	 
    public String subtractStrings(String num1, String num2) {
        // TODO: Implement the solution
        /**
             12283
          -    167
        */
        
        int n1Inx = num1.length()-1;
        int n2Inx = num2.length()-1;
        int carry = 0;
        List<Character> result = new ArrayList<>();
 //                   System.out.println("n1: " + n1Inx + " n2: " + n2Inx);
        while(n1Inx >= 0 || n2Inx >= 0 || carry != 0)
        {
            int n1 = n1Inx >= 0 ? num1.charAt(n1Inx) - '0' : 0;
            int n2 = n2Inx >= 0 ? num2.charAt(n2Inx) - '0' : 0;
            n2 = n2 + carry;
            carry = 0;
            if(n1 < n2)
            {
                n1 = (n1 + 10);
                carry = 1;
            }
  //          System.out.println("n1: " + n1 + " n2: " + n2);
            int current = n1 - n2;
     //       System.out.println(current);
            result.add((char)('0'+current));
            --n1Inx;
            --n2Inx;
        }
        Collections.reverse(result);
        StringBuilder sb = new StringBuilder(result.size());
        for(Character ch: result)
        {
            sb.append(ch);
        }
        if(sb.toString().charAt(0) == '0')
        {
            int inx =0;
            while(inx < sb.toString().length() && sb.toString().charAt(inx) == '0')
            {
                ++inx;
            }
            if(inx >= sb.toString().length()){return "0";}
            return sb.toString().substring(inx);
        }
        return sb.toString();
    }
}
