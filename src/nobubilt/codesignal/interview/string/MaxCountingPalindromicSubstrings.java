package nobubilt.codesignal.interview.string;

public class MaxCountingPalindromicSubstrings {
	/**
	 * You are given a text string and a number length. Your task is to count the number 
	 * of substrings of exactly length characters in the string that are palindromes.

	A string is a palindrome if it reads the same backward as forward.
	Method signature: public static int countPalindromes(String text, int length)
	For instance, String text = "madamargentinamanitnegra";
	int length = 5;
	System.out.println(Solution.countPalindromes(text, length)); // Output: 2
	should return 2 because there are three substrings of length 5 that are palindromes: madam, and naman.

	The expected time complexity for this task is linear, which is O(text.length).
	 * @param text
	 * @param length
	 * @return
	 */
	 public static int countPalindromes(String text, int length) {
	        // TODO: Implement the method to count palindromic substrings
	        int index = 0;
	        int counter = 0;
	        
	        while(index <= text.length()-length)
	        {
	            String substring = text.substring(index, index + length);
	            if(isPalindrome(substring))
	            {
	                ++counter;
	            }
	            index++;
	        }
	        
	        return counter;
	    }
	    
	    public static boolean isPalindrome(String phrase)
	    {
	        if(phrase.length() == 0){return false;}
	        if(phrase.length() == 1){return true;}
	        int left = 0;
	        int right = phrase.length()-1;
	        while(left < right)
	        {
	            if(phrase.charAt(left) != phrase.charAt(right))
	            {
	               return false;
	            }
	            ++left;
	            --right;
	        }
	        
	        return true;
	    }
	}
