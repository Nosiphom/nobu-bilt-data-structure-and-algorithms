package nobubilt.codesignal.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitioningCharactersIntoSubstring {
	
/**
 * if you were to partition the text "abacdcd" into the chapters "aba" and "cdcd", 
 * your resultant report of chapter lengths should list as [3, 4], preserving the 
 * original sequence.

The ancient scroll s stretches on to a length n, varying anywhere from 1 to 1000000 characters. 
Its diverse inhabitants range from the scribed characters from a to z.
public List<Integer> solution(String s). This magical method shall read the string of 
characters and spin out a list of integers representing the lengths of each chapter.
 More formally, the task involves partitioning a string into as many substrings as possible 
 while ensuring that each character appears in only one substring (no substrings have common 
 characters). The substrings should retain the original order of characters from the input 
 string.

Constraints:

The length of the input string n will be in the range of 1 ≤ n ≤ 1000000.
All characters in the string will be lower-case English alphabets ('a' to 'z').
The time complexity of the solution should be 

O(n).
 */
	 public List<Integer> solution(String s) {
	        // TODO: implement the function
	        // "f ee pplkp adaasd r"   1, 2, 5, 6, 1
	        //  1
	        List<Integer> list = new ArrayList<>();
	        int startInx = 0;
	        int len = s.length();
	        Map<Character, Integer> lastOccurrenceMap = new HashMap<>();
	        for(int inx = 0; inx < s.length(); inx++)
	        {
	            Character ch = s.charAt(inx);
	            lastOccurrenceMap.put(ch , inx);
	           
	        }
	        while(startInx < len)
	        {
	            char letter = s.charAt(startInx);
	            int lastOccurrence = lastOccurrenceMap.get(letter);
	            int currentInx = startInx;
	            while(currentInx < lastOccurrence)
	            {
	                ++currentInx;
	                
	                if(lastOccurrenceMap.get(s.charAt(currentInx)) > lastOccurrence)
	                {
	                  lastOccurrence = lastOccurrenceMap.get(s.charAt(currentInx));
	                }
	            }

	            if(lastOccurrence > startInx)
	            {
	                list.add(lastOccurrence + 1 - startInx);	//length            	  
	                if(lastOccurrence == len -1)
	                {
	                    break;
	                }
	            }
	            else
	            {
	                list.add(1);
	            }
	            startInx = lastOccurrence + 1;           
	        }
	        return list;
	    }
}
