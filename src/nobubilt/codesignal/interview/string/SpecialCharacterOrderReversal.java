package nobubilt.codesignal.interview.string;

public class SpecialCharacterOrderReversal {

	
/**
 * You need to develop a Java method, public String specialOrder(String inputString),
 *  which takes inputString as an argument. The resulting string begins with the 
 *  last character of the inputString, then selects the second-to-last character, 
 *  continuing in reverse order until you reach the middle character of the string. 
 *  Then, start with the first character of the inputString, proceed to the 
 *  second character, and continue in this manner until you reach the middle character.

For example, if the inputString is "abcdefg", the method should return "gfedabc".
Keep in mind the following constraints while creating your function:
The input string contains only lowercase English letters ('a' to 'z').
The length of the input string is between 1 and 100, inclusive.
 */
	 public String specialOrder(String inputString) {
	        // TODO: Implement function
	        StringBuilder sb = new StringBuilder();
	        int limit = inputString.length()/2  + inputString.length()%2;
	        System.out.println("limit: " + limit);
	        if(inputString.length()%2 != 0)
	        {
	            --limit;
	        }
	        for(int inx = inputString.length()-1; inx >= limit; inx--)
	        {
	            sb.append(inputString.charAt(inx));
	        }
	        
	        for(int inx = 0; inx < limit; inx++)
	        {
	            sb.append(inputString.charAt(inx));
	        }
	        return sb.toString();
	    }
	}
