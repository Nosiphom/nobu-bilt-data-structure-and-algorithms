package nobubilt.codesignal.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithDistinctCharacters {

	 public int solution(String s, int K) {
	        // TODO: implement the function here
	        Map<Character, Integer> freqMap = new HashMap<>();
	        int longestWindow = 0;
	        int startWindow = 0;
	        for(int endWindow = 0; endWindow < s.length(); endWindow++)
	        {
	            Character letter = s.charAt(endWindow);
	            freqMap.put(letter, freqMap.getOrDefault(letter, 0) + 1);
	            
	            while(freqMap.size() > K)
	            {
	                Character startLetter = s.charAt(startWindow);
	                freqMap.put(startLetter, freqMap.getOrDefault(startLetter, 0)  - 1);
	                if(freqMap.get(startLetter)  == 0)
	                {
	                    freqMap.remove(startLetter);
	                }
	                ++startWindow;
	            }
	            longestWindow = Math.max(longestWindow, endWindow - startWindow + 1);
	        }
	        return longestWindow;
	    }
}
