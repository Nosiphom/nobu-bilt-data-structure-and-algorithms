package nobubilt.codesignal.interview.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabeticTransformationAndSubtractionOccurrence {
/**
 * Bob, Alice's friend, is interested in string manipulations. Inspired by 
 * Alice's technique, he has devised his own string encoding scheme. He 
 * takes a sentence, which is a string of n alphanumeric characters (ranging 
 * from a-z, A-Z, 0-9), including spaces and punctuation marks, with n ranging 
 * from 1 to 500, inclusive. His encoding technique consists of the following steps:

He replaces each alphanumeric character with the previous character in their 
respective sequence:

For letters, he moves in the alphabetical order, and for numbers, he moves 
in the numeric sequence.
For example, given a string, for each character:
If it's b, it becomes a.
If it's B, it becomes A.
If it's 1, it becomes 0.
Special cases:
a becomes z.
A becomes Z.
0 becomes 9.
Spaces and punctuation marks remain unchanged.
After shifting the characters, he counts the frequency of each alphanumeric 
character in the new string.

Then, he creates an association between each alphanumeric character and its 
frequency and ASCII value. For each character, he computes the absolute 
difference between the ASCII value of the character and its frequency.

Finally, he generates a list of these absolute differences and sorts them in 
ascending order.

For example, consider the input string "Hello, 123!". Following Bob's encoding 
scheme:

Encode the characters:

H becomes G
e becomes d
l becomes k
o becomes n
1 becomes 0
2 becomes 1
3 becomes 2
Resulting string: "Gdkkn, 012!"

Frequency analysis:

G appears 1 time
d appears 1 time
k appears 2 times
n appears 1 time
0 appears 1 time
1 appears 1 time
2 appears 1 time
Calculate absolute differences (ASCII value - frequency):

G (71 - 1) = 70
d (100 - 1) = 99
k (107 - 2) = 105
n (110 - 1) = 109
0 (48 - 1) = 47
1 (49 - 1) = 48
2 (50 - 1) = 49
Sorting the differences: [47, 48, 49, 70, 99, 105, 109]

The task is to help Bob generate a list of these absolute differences, 
sorted in ascending order.
 */
	
	  public List<Integer> solution(String sentence) {
	        // TODO: Implement the solution following the task description
	        StringBuilder sb = new StringBuilder();
	        for(int inx = 0; inx < sentence.length(); inx++)
	        {
	            Character ch = sentence.charAt(inx);
	            if(Character.isLetter(ch))
	            {
	                if(ch == 'A')
	                {
	                    sb.append('Z');
	                    continue;
	                }
	                else if(ch == 'a')
	                {
	                    sb.append('z');
	                    continue;
	                }
	                sb.append((char)(ch - 1));
	            }
	            else if(Character.isDigit(ch))
	            {
	                 if(ch == '0')
	                {
	                    sb.append('9');
	                    continue;
	                }
	                sb.append(ch - '1');
	            }
	            else
	            {
	                sb.append(ch);
	            }
	        }
	        Map<Character, Integer> occurrenceMap = new HashMap<>();
	        for(int inx = 0; inx < sentence.length(); inx++)
	        {
	            Character ch = sb.toString().charAt(inx);
	            if(Character.isLetterOrDigit(ch))
	            {
	                occurrenceMap.put(ch, occurrenceMap.getOrDefault(ch, 0)+1);
	            }

	        }
	        
	        List<Integer> result = new ArrayList<>();
	        for(Character key : occurrenceMap.keySet())
	        {
	           result.add((int)(key) - occurrenceMap.get(key));
	        }
	        Collections.sort(result);
	        return result;
	    }
	
}
