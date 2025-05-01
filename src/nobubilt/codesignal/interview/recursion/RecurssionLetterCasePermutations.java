package nobubilt.codesignal.interview.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecurssionLetterCasePermutations {
/**
 * You are given a string s, your task is to implement a function that returns all 
 * possible letter case combinations in the string.

For example, if the input string is s = "a1b2", the output should be 
["a1b2", "a1B2", "A1b2", "A1B2"]. Another example: if the input string is s = "3z4", 
the output should be ["3z4", "3Z4"].

Your function should handle both lowercase and uppercase input, and it should treat 
digits and special characters as invariable elements.
 */		 
	 public static List<String> solution(String s) {
        // TODO: implement the solution
        if(s.length() == 0){return new ArrayList<>();}
        Set<String> result = new HashSet<>();
        char[] elements = s.toCharArray();
        generateCombos(elements, 0, result);
        List<String> outcome = new ArrayList<>(result);
      //In ASCII Z has lower decimal than z, so reverse to get z before Z
        Collections.sort(outcome, Comparator.reverseOrder());
        return outcome;
    }
	    
    public static void generateCombos(char[] elements, int index, Set<String> result)
    {
        if(index == elements.length)
        {
            String phrase = new String(elements);
            result.add(phrase);
            return;
        }
        
         char original = elements[index];
        if(!Character.isLetter(elements[index]))
        {
            generateCombos(elements, index + 1, result); // moving on 
        }
        else
        {
           elements[index]= Character.toLowerCase(elements[index]);
            generateCombos(elements, index + 1, result);
            
            elements[index]=  Character.toUpperCase(elements[index]);
            generateCombos(elements, index + 1, result);
        }
        elements[index]= original;
    }
}
