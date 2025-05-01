package nobubilt.codesignal.interview.string;

public class DetectLongestRepeatingSubstring {
	 /**
	  * You are given a string s. Your task is to create a function that checks whether the 
	  * string s consists of one repeated substring. If it does, the function should 
	  * return the substring. If there are multiple possible answers, return the longest one.
	  *  If it does not consist of a repeated substring, return an empty string.

	 To clarify, a "repeated substring" refers to a pattern of characters that re-occurs 
	 throughout the full string, with no characters left over. For example, 
	 the string "abababab" consists of repeated substrings "ab" and "abab". 
	 On the other hand, the string "abcabcab" does not consist of a repeated substring, 
	 as the final characters "ab" do not complete the repeating pattern of "abc".
	  * 
	  *
	  */
	 public static String repeatSubstring(String s) {
	        // TODO: implement the function according to the task requirements.
	        String longestStr = "";
	        for(int inx =0; inx < s.length(); inx++)
	        {
	            String subString = s.substring(0, inx+1);
	            if(isRepeating(subString, s) && subString.length() != s.length() )
	            {
	               longestStr = subString.length()
	               > longestStr.length()? subString : longestStr;
	            }
	        }
	        return longestStr;
	    }
	    /**
	        "aaaaa", Solution.repeatSubstring
	       ("aaaaaaaaaa"));
	    */
	    public static boolean isRepeating(String phrase, String s)
	    {
	        int sLen = s.length();
	        int phraseLen = phrase.length();
	        //div len
	        if(sLen%phraseLen != 0)
	        {
	            return false;
	        }
	        int factor = sLen/phraseLen;
	        String repeated = phrase.repeat(factor);
	        return repeated.equals(s);
	    }
}
