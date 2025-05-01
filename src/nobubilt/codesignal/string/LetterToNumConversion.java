package nobubilt.codesignal.string;

public class LetterToNumConversion {
/**
 * Let's imagine you are given a string that contains a series of words separated 
 * by a hyphen ("-"). Each word in the string can be a lowercase letter from 
 * 'a' to 'z' or a set of digits representing a number from 1 to 26. Your task is 
 * to parse this string and swap the type of each word: convert numbers into their 
 * corresponding English alphabet letters, and letters into their numerical equivalents.
 *  This means '1' should convert to 'a', and 'a' should convert to '1'.

You need to return a new string with the converted words, rejoined with hyphens.
Ensure you maintain the original order of the words from the input string in your
 output string.

The input string's length should range from 1 to 1000 for this exercise. The 
string will never be empty, always containing at least one valid lowercase letter 
or numerical word.

Remember, the transformation of words should be limited to converting numbers 
from 1 to 26 into their corresponding letters from 'a' to 'z', and vice versa.

Example

For the input string "1-a-3-c-5", the output should be "a-1-c-3-e".

 */
	

    public String solution(String s) {
        // TODO: Implement the function that could solve the task
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("-");
        for(int i = 0; i < words.length; i++)
        {
            String phrase = words[i];
            if(Character.isLetter(phrase.charAt(0)))
            {
                char ch = phrase.charAt(0);
                int delta = ch - 'a';
                sb.append(delta+1);
            }
            else if(Character.isDigit(phrase.charAt(0)))
            {
                int num = Integer.parseInt(phrase);
                char letter = (char)('a' + (num-1));
                sb.append(letter);
            }
            if(i < words.length-1)
            {
            sb.append('-');                
            }

        }
        
        return sb.toString();
    }
}

