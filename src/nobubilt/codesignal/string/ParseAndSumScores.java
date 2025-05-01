package nobubilt.codesignal.string;

import java.util.ArrayList;
import java.util.List;

public class ParseAndSumScores {
	/**
	 * You are given a string s of length n, with n ranging from 1 to 500 inclusive. 
	 * This string represents the complex and jumbled record of a sports game. It 
	 * combines player names and scores but lacks a uniform structure. The player 
	 * names consist of words made up of lowercase English alphabets (a-z), while 
	 * the scores are integers ranging from 1 to 100 inclusive.

Your mission involves writing a Java function public int parseAndSumScores(String s).
 This function should parse the given string, isolate the integers representing player
  scores, and return the sum of these scores.

For instance, for the input string, "joe scored 5 points, while adam scored 10 points
 and bob scored 2, with an extra 1 point scored by joe", your function should return 
 the sum 5 + 10 + 2 + 1, which totals 18.
	 * @param s
	 * @return
	 */
	 public int parseAndSumScores(String s) {
	        // TODO: implement
	        String[] words = s.split(" ");
	        List<Integer> nums = new ArrayList<>();
	        for(int inx = 0; inx < words.length; inx++)
	        {
	            String str = words[inx];
	            StringBuilder sb = new StringBuilder();
	            for(int i = 0; i < str.length(); i++)
	            {
	                if(Character.isDigit(str.charAt(i)))
	                {
	                  sb.append(str.charAt(i));
	                }
	                else if(sb.length() != 0 && !Character.isDigit(str.charAt(i)))
	                {
	                     nums.add(Integer.parseInt(sb.toString()));
	                     sb = new StringBuilder();
	                }
	            }
	            if(sb.length() != 0)
                {
                     nums.add(Integer.parseInt(sb.toString()));
                     sb = new StringBuilder();
                }
	        
	        }
	        
	        int sum = 0;
	        for(int num : nums)
	        {
	            sum += num;
	        }
	        return sum;
	    }
	}

