package nobubilt.codesignal.interview.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombineStringAndArrayWithVowelConsentAdjustment {
/**
 * You are given a string of n alphabetical characters and an array of n integers, with n ranging from 1 to 100, inclusive. The task requires you to process both the string and the array simultaneously from their first elements, and continue as long as certain condition on the array is satisfied. Return the modified string and certain portion of the original array.

For the string, your goal is to replace every occurrence of a vowel with the next vowel in the sequence, wrapping around from 'u' to 'a'. If the character is a consonant, it should be replaced with the next consonant in alphabetical order, wrapping around from 'z' to 'b'.

Meanwhile, for the array of integers, you are instructed to multiply each integer by 3 and add the result to a total until that total reaches or exceeds 100. Each integer in the array can range from -50 to 50, inclusive.

Finally, return the modified string and any unprocessed integers from the array in their original order.

Stop processing when the total sum, restricted to 100, is met or when all elements have been processed. In other words, process both the string and the array while the condition holds true.

If you process all elements in the array and the string, and the total sum still has not reached 100, simply return the processed string and an empty list.

The final return format should be a concatenated string containing the modified string and the vector of unprocessed integers joined by spaces.

Example:

Input:

String: "examplestring"
Array: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Start processing both the string and the array:

Character 'e' and Number 1:

'e' is a vowel, so it is replaced with the next vowel 'i'.
The array calculation: 1 · 3 = 3, total = 3.
Character 'x' and Number 2:

'x' is a consonant, so it is replaced with the next consonant 'y'.
The array calculation: 2 · 3 = 6, total = 9.
Character 'a' and Number 3:

'a' is a vowel, so it is replaced with the next vowel 'e'.
The array calculation: 3 · 3 = 9, total = 18.
Character 'm' and Number 4:

'm' is a consonant, so it is replaced with the next consonant 'n'.
The array calculation: 4 · 3 = 12, total = 30.
Character 'p' and Number 5:

'p' is a consonant, so it is replaced with the next consonant 'q'.
The array calculation: 5 · 3 = 15, total = 45.
Character 'l' and Number 6:

'l' is a consonant, so it is replaced with the next consonant 'm'.
The array calculation: 6 · 3 = 18, total = 63.
Character 'e' and Number 7:

'e' is a vowel, so it is replaced with the next vowel 'i'.
The array calculation: 7 · 3 = 21, total = 84.
Character 's' and Number 8:

's' is a consonant, so it is replaced with the next consonant 't'.
The array calculation: 8 · 3 = 24, total = 108 (stop, as total reached over 100).
The rest of the string and array processing stops since the total has exceeded 100.

Output:

Resulting string: "iyenqmit"
Remaining array: {9, 10}
In conclusion:

Processed String: The string "examplestring" becomes "iyenqmit".
Processed Array: With multiplications and additions up to the total exceeding 100, the processed numbers are {1, 2, 3, 4, 5, 6, 7, 8} and the remaining array is {9, 10}.
 */
	
	 Map<Character, Character> nextVowelMap = new HashMap<>();    
	    public void createVowelMap()
	    {
	       nextVowelMap.put('a', 'e');
	       nextVowelMap.put('e', 'i');
	       nextVowelMap.put('i', 'o');
	       nextVowelMap.put('o', 'u');
	       nextVowelMap.put('u', 'a');
	    }
	   
	    public String solution(String inputString, List<Integer> numbers) {
	        // TODO: implement the solution based on the provided task description
	        createVowelMap();
	        int inx = 0; 
	        StringBuilder sb = new StringBuilder();
	        int sumSoFar = 0;
	        while(inx < inputString.length() && inx < numbers.size() && sumSoFar <= 100)
	        {
	            char letter = inputString.charAt(inx);
	            if(nextVowelMap.containsKey(letter))
	            {
	                sb.append(nextVowelMap.get(letter));
	            }
	            else
	            {
	                sb.append(nextLetter(letter));
	            }
	            sumSoFar += (numbers.get(inx) * 3);
	            ++inx;
	        }
	        
	        List<Integer> subList = numbers.subList(inx, numbers.size());
	        String subStr = subList.toString();
	   subStr = subStr.replaceAll(", ", " ");
	        
	        return sb.toString() + " " + subStr.substring(1, subStr.length()-1);
	    }
	    
	    public char nextLetter(char letter)
	    {
	        if(letter == 'z')
	        {
	            return 'b';
	        }
	        return (char)(letter + 1);
	    }
	    
	    public char nextVowel(char vowel)
	    {
	       return nextVowelMap.get(vowel);
	    }
	}

