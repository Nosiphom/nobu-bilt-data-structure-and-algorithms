package nobubilt.codesignal.interview.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabeticShiftAndOccurrence {
/**
 * Alice has devised a unique way of encoding words. She takes a word 
 * and replaces each character with the next character in the alphabetical order. 
 * In other words, given a string word, for each character, if it is not z, she 
 * replaces it with the character that comes next alphabetically. For the character 
 * z, she replaces it with a.

Another element of Alice's algorithm involves frequency analysis. After shifting 
the characters, she counts the frequency of each character in the new string. Then, 
she creates an association of each character with its frequency and ASCII value. 
Each character maps to a number, which is a product of the ASCII value of the character 
and its frequency. Our task is to construct a list containing these products, sorted in
 descending order.

Example
For the input string "banana", the output should be [294, 222, 99].
The string "banana" will be shifted to "cbobob".
Calculating the product of frequency and ASCII value for each character:
The ASCII value for c is 99; it appears once in the string, so its product is 99.
99⋅1=99.
The ASCII value for b is 98; it appears three times in the string, so its product is 98⋅
98⋅3=294.
The ASCII value for o is 111; it appears twice in the string, so its product is 111⋅
111⋅2=222.
Collecting these products into a list gives [99, 294, 222]. Sorting this list in 
descending order results in [294, 222, 99].
	 */
	
	public static List<Integer> characterFrequencyEncoding(String word)
	{
		StringBuilder sb = new StringBuilder();
		for(int inx = 0; inx < word.length(); inx++)
		{
			Character letter = word.charAt(inx);
			Character nextLetter = letter == 'z' ? 'a' : (char)(letter + 1);
			sb.append(nextLetter);
		}
		
		Map<Character, Integer> occurrenceMap = new HashMap<>();
		for(int inx = 0; inx < sb.toString().length(); inx++)
		{
			Character letter = sb.toString().charAt(inx);
			occurrenceMap.put(letter, occurrenceMap.getOrDefault(letter, 0)+1);
		}
		
		List<Integer> result = new ArrayList<>();
		for(Character key : occurrenceMap.keySet())
		{
			int numVal = (int)key;
			result.add(numVal  * occurrenceMap.get(key));
		}
		
		Collections.sort(result, Comparator.reverseOrder());
		return result;
		
	}

	 public static void main(String[] args) {
	        String word = "banana";
	        List<Integer> result = characterFrequencyEncoding(word);
	        for (int value : result) {
	            System.out.print(value + " ");
	        }
	        // Prints:
	        // 294 222 99
	    }
}
