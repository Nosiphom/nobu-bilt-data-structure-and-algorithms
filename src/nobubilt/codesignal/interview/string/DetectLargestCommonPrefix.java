package nobubilt.codesignal.interview.string;

import java.util.Arrays;


public class DetectLargestCommonPrefix {
	 /**
	  * You have been given an array of strings, words. Your task is to implement a function that will find 
	  * the largest common prefix among the strings in the array. If there is no common prefix, it should 
	  * return an empty string. Your task should aim for a solution of complexity O(words.length⋅length ^2), 
	  * where words.length is the number of strings in the array and length is the length of the smallest string.
	  * 

	 For example, largestCommonPrefix(new String[]{"tractor", "traffic", "transmit"}) should output "tra", 
	 as it is the largest common prefix for these three strings.
	  * 
	  *
	  */
	 
	 public static String largestCommonPrefix(String[] words) {
		  if(words.length == 0){return "";}
	        Arrays.sort(words);
	        String shortestStr = words[0];
	        for(int strInx = 1; strInx < words.length; strInx++)
		        {
	                String phrase = words[strInx];
		            for(int inx = 0; inx < phrase.length() && inx < shortestStr.length(); inx++)
		            {
		                if(phrase.charAt(inx) != shortestStr.charAt(inx))
		                {
		                    shortestStr = shortestStr.substring(0, inx);
		                }
		            }
		        }
	        return shortestStr;
	    
	    }
}
