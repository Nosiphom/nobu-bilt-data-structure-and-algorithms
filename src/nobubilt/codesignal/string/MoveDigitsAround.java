package nobubilt.codesignal.string;

public class MoveDigitsAround {
/**
 * You are provided with a string of alphanumeric characters in which each number,
 *  regardless of the number of digits, is always followed by at least one alphabetic 
 *  character before the next number appears. The task requires you to return a 
 *  transformed version of the string wherein the first alphabetic character 
 *  following each number is moved to a new position within the string and characters 
 *  in between are removed.

Specifically, for each number in the original string, identify the next letter that 
follows it, and then reposition that character to directly precede the number. All 
spaces and punctuation marks between the number and the letter are removed.

The length of the string s ranges from 3 to 10 to the power 6(inclusive), and the 
string contains at least one number. The numbers in the string are all integers and 
are non-negative.

Here is an example for better understanding:
Given the string:
"I have 2 apples and 5! oranges and 3 grapefruits."
The function should return:
"I have a2pples and o5ranges and g3rapefruits."
In this instance, the character 'a' following the number 2 is moved to come before 
the 2, the 'o' succeeding the 5 is placed before the 5, and the 'g' subsequent to 
the 3 is repositioned to precede the 3. Punctuation marks and spaces are disregarded 
as they are not alphabetic characters.

Please note that the operation should maintain the sequential order of the numbers 
and the rest of the text. Considering this, the task is not solely about dividing a 
string into substrings but also about modifying them. This will test your expertise 
in Java string operations and type conversions.
 */
	  public String solution(String input) {
	        StringBuilder sb = new StringBuilder();
	        StringBuilder numSb = new StringBuilder();
	        for(int inx = 0; inx < input.length(); inx++)
	        {
	            char ch = input.charAt(inx);
	            if(Character.isDigit(ch))
	            {
	                numSb.append(ch);
	            }
	            else if(Character.isLetter(ch))
	            {
	                sb.append(ch);
	                if(numSb.length() > 0)
	                {
	                    sb.append(numSb.toString());
	                    numSb = new StringBuilder();
	                }
	            }
	            else if(Character.isWhitespace(ch) || Character.isSpaceChar(ch))
	            {
	                if(inx > 0 && numSb.length() > 0)
	                {
	                    continue;
	                }
	                sb.append(' ');
	            }
	            else if(numSb.length() == 0)
	            {
	                sb.append(ch);
	            }
	            
	        }
	        
	        return sb.toString();
	    }
	
}
