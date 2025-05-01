package nobubilt.codesignal.interview.string;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharInOddWordLength {
/**
 * You are given a string of n words, with n ranging from 1 to 100, inclusive. 
 * The words are separated by a single space in the string. Your task is to 
 * return the most frequently occurring character in each word that has an 
 * odd number of characters. The resulting characters should be concatenated 
 * into a string with their occurrences in the sentence.

Please note:

Each word's character count ranges from 1 to 500, inclusive. The string contains 
lowercase and uppercase alphanumeric characters, spaces, and punctuation.
For instance, if the input string is "Hello world this is a demo string", your 
function should return "lwa". In this string, 'Hello', 'world', and 'a' have an 
odd number of characters. The most frequently occurring character in these words 
are 'l', 'w', and 'a' respectively. When concatenated, they form "lwa".
In case of a tie in character frequency, return the character that appears first 
in the word. In the example above, we took 'w' from the word 'world'.
The function should be case insensitive. The lowercase and uppercase characters 
should be counted as the same character. The output should only contain lowercase 
characters. For example: "Hhi" should return "h" because "h" appears twice in the 
string even though one is uppercase and one is lowercase.
If there are no words with an odd number of characters in the input string, your 
function should return an empty string.
The input string will always be at least one character long, and it cannot be just 
a single whitespace.
Having a good understanding of string operations and the use of nested loops is 
very useful in solving this task.
 */
	
    public String solution(String sentence) {
        // TODO: implement the solution here
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : arr)
        {
            if(word.length()%2!= 0)
            {
                Map<Character, Integer> occurrenceMap = new HashMap<>();
                Map<Character, Integer> initialOccurrence= new HashMap<>();
                for(int inx = 0; inx < word.length(); inx++)
                {
                    Character ch = word.charAt(inx);
                    if(!occurrenceMap.containsKey(ch))
                    {
                        initialOccurrence.put(ch, inx);
                    }
                    occurrenceMap.put(ch, occurrenceMap.getOrDefault(ch, 0)+1);
                }
                int highOcc = -1;
                Character highestKey = null;
                int earliestInx = Integer.MAX_VALUE;
                for(Character key : occurrenceMap.keySet())
                {
                    if(occurrenceMap.get(key) >= highOcc)
                    {
                        if(initialOccurrence.get(key) < earliestInx)
                        {
                            earliestInx = initialOccurrence.get(key);
                            highOcc = occurrenceMap.get(key);
                            highestKey = key;
                        }
                        else if(occurrenceMap.get(key) > highOcc)
                        {
                            earliestInx = initialOccurrence.get(key);
                            highOcc = occurrenceMap.get(key);
                            highestKey = key;
                        }
                    }
                }
                sb.append(Character.toLowerCase(highestKey));
            }
        }
        return sb.toString();
    }
}
