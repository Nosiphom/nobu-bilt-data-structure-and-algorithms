package nobubilt.codesignal.interview.search;

import java.util.ArrayList;
import java.util.List;

public class StringPatternMatchKMP {

	/**
	 * You're provided with a list of n strings and a single pattern string. 
	 * Your task is to implement a function, findPatternInTexts, applying the KMP 
	 * String Searching Algorithm. This function will receive the texts and the 
	 * pattern as input, then return a list where each element indicates the 
	 * starting position of the first occurrence of the pattern in the 
	 * corresponding text from the texts list. If the pattern is not present in a 
	 *   given text, use -1 as a placeholder.
	 * 
	 *
	 */

    public static List<Integer> findPatternInTexts(List<String> texts, String pattern)
    {
        // TODO: implement solution
        List<Integer> result = new ArrayList<>();
       int[] lps = calculateLongestPrefixSuffix(pattern);
        
        for(int index = 0; index < texts.size(); index++)
        {
            String phrase = texts.get(index);
            int firstOccurrance = kmpSearch(phrase, lps, pattern);
            result.add(firstOccurrance);
        }
        return result;
    }
    
    public static int kmpSearch(String phrase, int[] lps, String pattern)
    {
        int phraseInx = 0;
        int pattInx = 0;
        
        while(phraseInx < phrase.length())
        {
            if(phrase.charAt(phraseInx) == pattern.charAt(pattInx))
            {
                ++pattInx;
                ++phraseInx;
            }
            if(pattInx == pattern.length())
            {
                return phraseInx - pattInx;
            }
            else if(phraseInx < phrase.length() && phrase.charAt(phraseInx) != pattern.charAt(pattInx))
            {
                if(pattInx != 0)
                {
                    pattInx = lps[pattInx - 1];
                }    
                else
                {
                    phraseInx++;
                }     
            }
        }
        
        return -1;
    }
    /**
     * consider the KMP string searching algorithm, where the essence of its design 
     * is to eliminate the need to backtrack by retaining the information elicited 
     * from previous comparisons. If, at some point in the pattern, there's a mismatch,
     *  the algorithm does not begin matching the pattern with the text from the start
     *   but from a pre-computed point that takes into account all previous comparisons.
     *    It's an efficient way to avoid redoing work!
     * LPS stands for "Longest Prefix which is also Suffix." In the KMP algorithm, 
     * the LPS array helps determine the next positions to match in the pattern, 
     * avoiding unnecessary comparisons. It's a key part of the algorithm's efficiency.
     * @param pattern
     * @return
     */
    public static int[] calculateLongestPrefixSuffix(String pattern)
    {
        int length = 0;
        int index = 1;
        int[] lps = new int[pattern.length()];
        lps[0] = 0;
        while(index < pattern.length())
        {
            if(pattern.charAt(index) == pattern.charAt(length))
            {
                ++length;
                lps[index] = length;
                ++index;
            }
            else
            {
                if(length != 0)
                {
                    length = lps[length-1];
                }
                else
                {
                    lps[index] = 0;
                    ++index;
                }
            }
        }
        return lps;
    }
}
