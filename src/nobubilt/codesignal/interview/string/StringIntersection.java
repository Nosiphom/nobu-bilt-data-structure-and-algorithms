package nobubilt.codesignal.interview.string;

import java.util.HashMap;
import java.util.Map;

public class StringIntersection {
	/**
     * 
    You are given two strings, string1 and string2. Your goal is to determine a new string, 
    string3, that is formed by characters that occur in both string1 and string2 in the same order 
    as they occur in string1. Characters in string3 should maintain their original sequence order 
    from string1. If a character is repeated in string1 and string2, include that character in 
    string3 as many times as it occurs in both strings, but not more than that.

    For example, given string1 = "apple" and string2 = "peach", the resulting string3 would be "ape".

    Your algorithm should not exceed a time complexity of 

    O(string1.length+string2.length).
     */
     public static String solution(String string1, String string2) {
        // TODO: Implement the function here
        Map<Character, Integer> str1occ = new HashMap<>();

        Map<Character, Integer> str2occ = new HashMap<>();
        
        for(int inx = 0; inx < string1.length(); inx++)
        {
            Character letter = string1.charAt(inx);
         str1occ.put(letter, str1occ.getOrDefault(letter, 0) + 1);
         }
        
         for(int inx = 0; inx < string2.length(); inx++)
        {
            Character letter = string2.charAt(inx);
            str2occ.put(letter, str2occ.getOrDefault(letter, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> str3occurrenceMap = new HashMap<>();
        for(int inx = 0; inx < string1.length(); inx++)
        {
            Character letter = string1.charAt(inx);
            if(str2occ.containsKey(letter))
            {
                System.out.print(letter + " ");
      
                int occ = Math.min(str1occ.get(letter), str2occ.get(letter));  
                if(!str3occurrenceMap.containsKey(letter) || str3occurrenceMap.get(letter) < occ)
                {
                    str3occurrenceMap.put(letter, str3occurrenceMap.getOrDefault(letter, 0) + 1);
                    sb.append(letter);
                }
                
            }
        }
        
        return sb.toString();
    }
}
