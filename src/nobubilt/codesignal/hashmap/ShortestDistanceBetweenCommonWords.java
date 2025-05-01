package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestDistanceBetweenCommonWords {
/**
 * Your job requires you to construct a Java method named solution(). This method 
 * should receive a list of n words, with n ranging from 1 to 10^5, inclusive. 
 * The task mandates that your method return a map, where each key is a unique 
 * word from the list, and the corresponding value is the shortest distance between 
 * two occurrences of that word in the list.

Each word in the list is composed solely of lowercase and uppercase English alphabets, 
and the length of each word can range from 1 to 50, inclusive. Calculating the distance 
between two occurrences of a word involves subtracting the position of the first occurrence 
from that of the subsequent occurrence. For example, in the list {"dog", "cat", "bird", 
"cat", "dog", "elephant", "dog"}, the distance between the first and second occurrences 
of "dog" is 4, and the distance between the second and third occurrences of "dog" is 
2. Therefore, the shortest distance for "dog" should be considered 2. The word "cat" 
appears twice in the list in positions that are 2 elements apart, so for "cat", the 
answer should be 2.

For words that appear only once where there is no second occurrence, the shortest distance
 should be considered undefined, and such words should be excluded from the output map. Hence, 
 for the example above, the output should be

JSON
Copy to clipboard
{
  "dog": 2,
  "cat": 2
}
Be sure to utilize a HashMap structure efficiently to track the positions of word occurrences 
and to assist in performing the necessary calculations to solve the task optimally.
 */

    public Map<String, Integer> solution(List<String> wordList) {
        // TODO: implement the function here
        Map<String, List<Integer>> occIndexMap = new HashMap<>();
        for(int inx = 0; inx < wordList.size(); inx++)
        {
            String phrase = wordList.get(inx);
            if(!occIndexMap.containsKey(phrase))
            {
                occIndexMap.put(phrase, new ArrayList<>());
            }
            occIndexMap.get(phrase).add(inx);
        }
        
        Map<String, Integer> distanceMap = new HashMap<>();
        for(Map.Entry<String, List<Integer>> entry : occIndexMap.entrySet())
        {
            if(entry.getValue().size() == 1)
            {
                continue;
            }
            
            int distance = Integer.MAX_VALUE;
            for(int inx  = 1; inx < entry.getValue().size(); inx++)
            {
                distance = Math.min(distance, (entry.getValue().get(inx) - entry.getValue().get(inx-1)));
            }
            distanceMap.put(entry.getKey(), distance);
        }
        return distanceMap;
    }
}
