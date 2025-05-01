package nobubilt.codesignal.interview.string;

import java.util.ArrayList;
import java.util.List;

public class IdentifyConsecutiveGroupsOfCharacters {
/**
 * In this lesson, your objective is to write a Java method that accepts a 
 * string as input and identifies all consecutive groups of identical 
 * characters within it. A group is defined as a segment of the text 
 * wherein the same character is repeated consecutively.

Your method should return a List of strings. Each string will consist of 
the repeating character and the length of its repetition, joined by a colon (:). 
For example, if the input string is "aaabbcccaae", your method should 
output: "a:3", "b:2", "c:3", "a:2", "e:1".

Bear in mind that, while processing the input string, we are interested 
only in alphanumeric characters (i.e., alphabets and digits), without 
differentiating the case. Other characters present will not factor into 
the formation of these groups.


 * @param str
 * @return
 */
	public static List<String> findGroups(String str)
	{
		List<String> result = new ArrayList<>();
		char grpCh = '*';
		int grpCt = 0;
		
		int inx = 0;
		while(inx < str.length())
		{
			char ch = str.charAt(inx);
			if(grpCh == ch)
			{
				++grpCt;
			}
			else
			{
				if(grpCh != '*')
				{
					result.add("" + grpCh + ":" + grpCt);
				}
				
				grpCh = ch;
				grpCt = 1;
			}
				
			++inx;
		}
		if(grpCh != '*')
		{
			result.add("" + grpCh + ":" + grpCt);
		}		
		
		return result;
	}
	
	 public static void main(String[] args) {
	        // Example usage
	        String input = "aaabbcccaae";
	        List<String> result = findGroups(input);
	        for (String group : result) {
	            System.out.println(group);
	        }
	        // Output:
	        // "a:3"
	        // "b:2"
	        // "c:3"
	        // "a:2"
	        // "e:1"
	    }
}
