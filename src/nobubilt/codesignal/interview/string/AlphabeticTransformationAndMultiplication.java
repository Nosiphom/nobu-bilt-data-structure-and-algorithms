package nobubilt.codesignal.interview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AlphabeticTransformationAndMultiplication {
/**
 * You are provided with a string of n lowercase English characters, where n 
 * ranges from 1 to 500 inclusive. Your task is to return a dictionary where 
 * each key-value pair represents a letter k and its corresponding numerical 
 * representation v.

The numerical representation v of each character k is computed as follows: 
replace k with the character that comes three characters before it in the 
alphabetical order (wrap around to z when this is less than a), then 
multiply the ASCII value of the new character by the frequency of k in 
the provided string.

Your function should return a dictionary of the letters in the string and 
their corresponding numerical representations, sorted in ascending order by
 the characters.

For example, given the string 'abc', your function should return:

Java
Copy to clipboard
{'a': 120, 'b': 121, 'c': 122}
In this case, we replace 'a' with 'x' and multiply its ASCII value (120) by 
its frequency (1) to get 120. For 'b', we replace it with 'y' and multiply 
its ASCII value (121) by its frequency (1) to get 121. And for 'c', we replace 
it with 'z' and multiply its ASCII value (122) by its frequency (1) to get 122. 
Then, we sort them based on the characters.
 */
	
    public Map<Character, Integer> solution(String s) {
        // TODO: Replace the following with your implementation
        StringBuilder sb = new StringBuilder();
        for(int inx =0; inx < s.length(); inx++)
        {
            Character letter = s.charAt(inx);
            int delta = (int)(letter - 'a');
            if(delta >= 3)
            {
                sb.append((char)(letter - 3));
            }
            else
            {
                switch(letter)
                {
                    case 'a':
                    sb.append('x');
                    break;
                    case 'b':
                    sb.append('y');
                    break;
                    case 'c':
                    sb.append('z');
                    break;
                    default:
                }
            }            
        }

        Map<Character, Integer> sbOccMap = new HashMap<>();
        for(int inx = 0; inx < sb.toString().length(); inx++)
        {
            Character letter = sb.toString().charAt(inx);
            sbOccMap.put(letter, sbOccMap.getOrDefault(letter, 0)+1);
        }
        
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for(int inx = 0; inx < sb.toString().length(); inx++)
        {
            Character letter = sb.toString().charAt(inx);
            Character oldLetter = s.charAt(inx);
            if(!treeMap.containsKey(oldLetter))
            {
                int product = sbOccMap.get(letter) * (int)letter;
                treeMap.put(oldLetter, product);
            }

        }
        
        return treeMap;
    }
}
