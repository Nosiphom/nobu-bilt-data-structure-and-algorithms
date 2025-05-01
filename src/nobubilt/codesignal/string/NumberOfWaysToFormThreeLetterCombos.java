package nobubilt.codesignal.string;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWaysToFormThreeLetterCombos {

/**
 * You are given a string s composed of n lowercase alphabetic characters. Your task is to discover 
 * the number of ways to delete all characters except for three to obtain a 3-letter string, two 
 * characters of which are identical, and the other is different.

Write a Java method named solution that takes the string s as an argument and returns an integer 
indicating the total number of different 3-letter combinations that can be formed with two 
identical characters and one distinct character from the string.

Constraints:

The string s must contain at least three characters and at most 
10 to the power 5 characters, i.e., 
3 <= n <=10 to the power 5. All characters in s must be lowercase alphabetic characters.
The solution should have a time complexity of O(n).
Example:

For s = "abcabc", the output should be solution(s) = 12. The possible combinations include:
 "aba", "abb", "aca", "acc", "aab", "aac", "bcb", "bcc", "bab", "bbc", "cac", "cbc". Each
  combination consists of three characters, two of which are identical, and the third
   one is distinct.
 */
	 public long solution(String s) {
	        // TODO: implement the function
	        
	                /**
	        abcabc => aabbcc
	        "aba"-, "abb-", "aca-", "acc-", "aab-", "aac-", "bcb-", "bcc-", "bab-", 
	        "bbc-", "cac-", "cbc-".
	        aba aab
	        aca aac
	        abb bab
	        bcb bbc
	        acc cac
	        cbc bcc
	        
	        3 distinct
	       // maintain order: 
	       
	       hderh
	       hhder
	       hdh, heh, hrh
	        */
	        Map<Character, Long> occurrenceMap = new HashMap<>();
	        for(int inx = 0; inx < s.length(); inx++)
	        {
	            Character letter = s.charAt(inx);
	            occurrenceMap.put(letter, occurrenceMap.getOrDefault(letter, 0L) + 1);
	        }
	        if(occurrenceMap.size() == 1){return 0;}
	        long count = 0;
	        for(Character letter : occurrenceMap.keySet())
	        {
	            long occurrence = occurrenceMap.get(letter);
	            if(occurrence >= 2)
	            {
	                long pairs = (occurrence * (occurrence -1))/2;
	                for(Character nextLetter : occurrenceMap.keySet())
	                {
	                    if(nextLetter != letter)
	                    {
	                        count += (pairs * occurrenceMap.get(nextLetter)); 
	                    }
	                }                
	            }

	        }
	        return count;
	    }
}
