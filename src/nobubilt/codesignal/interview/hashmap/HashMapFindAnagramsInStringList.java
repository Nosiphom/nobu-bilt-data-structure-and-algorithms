package nobubilt.codesignal.interview.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapFindAnagramsInStringList {
/**
 * You are given a list of n strings of varied lengths. Write a function 
 * findAnagrams(String[] strs) that takes this list and returns a list of lists. 
 * Each sublist should contain strings that are anagrams of each other, 
 * sorted in lexicographical order. The final list of lists should also be 
 * sorted lexicographically by the first string in each sublist.

In this problem, an anagram is defined as a word or phrase that is formed 
by rearranging the letters of a different word or phrase. For example, the 
words cinema and iceman are anagrams because they contain the same letters.

Your solution should have a time complexity of O(n⋅m⋅logm), where n is the
 number of strings in the list, and m is the maximum length of a string in the list.
 List<List<String>> expected = Arrays.asList(
	            Arrays.asList("act", "cat", "tac"),
	            Arrays.asList("dog", "god")
	        )
assertEquals(expected, findAnagrams(new String[]{"cat", "dog", "tac", 
"god", "act"}));

List<List<String>> expected = Arrays.asList(
    Arrays.asList("apple", "papel"),
    Arrays.asList("dog", "god"),
    Arrays.asList("food"),
    Arrays.asList("good"),
    Arrays.asList("tac")
);
assertEquals(expected, .findAnagrams(new String[]{"apple", "papel", "dog", 
"tac", "god", "good", "food"}));

 * 
 * @param strs
 * @return
 */
   
    public static List<List<String>> findAnagrams(String[] strs) {
        // TODO: Implement the function
        
        Map<String, List<String>> occurrenceMap = new HashMap<>();
        for(String phrase : strs)
        {
            char[] letters = phrase.toCharArray();
            Arrays.sort(letters);
            String sortedStr = new String(letters);
            if(!occurrenceMap.containsKey(sortedStr))
            {
                occurrenceMap.put(sortedStr, new ArrayList<>());
            }
            occurrenceMap.get(sortedStr).add(phrase);
        }
        List<List<String>> result = new ArrayList<>();
        
        for(String key : occurrenceMap.keySet())
        {
            List<String> list = occurrenceMap.get(key);
            Collections.sort(list);
            result.add(list);
        }
        Collections.sort(result, Comparator.comparing(list -> list.get(0)));
        return result;
    }
}
