package nobubilt.codesignal.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IncreaseNumberOfWordsByRemovingPopularLetter {

/**
 * The task asks you to return a pair containing two elements. The first element should be 
 * a character from the string, and the second element is an integer calculated as follows: 
 * Identify all unique words in the string, where a word is defined as a sequence of non-space 
 * characters separated by one or more spaces. The character you should return is the one whose 
 * removal (removal of all occurrences of that letter) would lead to the maximum number of 
 * unique words broken in the string, where a broken word is a word from which at least one 
 * letter is removed. The integer in the pair is the resulting maximum number of words.

A word can contain any number of characters, ranging from 
1 to the length of the original string, and it might include punctuation marks and numbers. 
For example, the words in "Life is like a box of chocolates" are: {"Life", "is", "like", "a", 
"box", "of", "chocolates"}, while the words in the string “1... 2... 3... Go!” are: {"1...", 
"2...", "3...", "Go!"}.

For example, given the string "Hello, world!", the function should return: ('l', 2), since 
selecting and removing the character 'l' would result in the maximum number of unique broken 
words. 2 words would break, so the integer in the pair should be 2.

Note: In the case that there are multiple characters that could be selected, return the one 
that appears first in the string. For the above example, o is also a character that breaks 
maximum number of words when removed, but l appears earlier.

The solution should have a time complexity of O(n).
 */
	
	 public Map.Entry<Character, Integer> solution(String s) {
	        // TODO: implement
	        String[] words = s.split(" ");
	        Set<String> uniqueWords = new HashSet<>(new ArrayList<>(Arrays.asList(words)));
	        Map<Character, List<String>> occurrenceMap = new HashMap<>();
	        for(String phrase : uniqueWords)
	        {
	            for(int inx = 0; inx < phrase.length(); inx++)
	            {
	                Character letter = phrase.charAt(inx);
	                if(!occurrenceMap.containsKey(letter))
	                {
	                    occurrenceMap.computeIfAbsent(letter, k -> new ArrayList<>());
	                    occurrenceMap.get(letter).add(phrase);
	                    continue;
	                }
	                if(occurrenceMap.containsKey(letter) &&
	                		occurrenceMap.get(letter).get(occurrenceMap.get(letter).size()-1).equals(phrase))
	                {
	                    continue;
	                }
	                occurrenceMap.get(letter).add(phrase);
	            }
	        }
	        
	        int maxOccurrence = 0;
	        Character key = 'a';
	        int occurrenceInx = -1;
	        
	        for(Map.Entry<Character, List<String>> entry : occurrenceMap.entrySet())
	        {
	            if(entry.getValue().size() > maxOccurrence)
	            {
	                maxOccurrence = entry.getValue().size();
	                key = entry.getKey();
	                occurrenceInx = s.indexOf(key);
	                continue;
	            }
	              if(entry.getValue().size() == maxOccurrence && s.indexOf(entry.getKey()) < occurrenceInx)
	            {
	                maxOccurrence = entry.getValue().size();
	                key = entry.getKey();
	                occurrenceInx = s.indexOf(key);
	                continue;
	            }
	        }
	        return Map.entry(key, maxOccurrence);
	    }
}
