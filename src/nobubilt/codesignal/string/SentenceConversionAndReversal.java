package nobubilt.codesignal.string;

public class SentenceConversionAndReversal {
/**
 * Given a string consisting of words separated by whitespace, your task is to 
 * write a function that accepts this string. It then replaces each character in 
 * the words with the corresponding character opposite in the English alphabet and 
 * stitches them all together to form a new string.

Here's what you need to consider:

The input string will include between 1 and 100 words.
Each word consists of characters separated by white space.
A word is composed of characters ranging from a to z or A to Z. So, if a word contains
 a lowercase 'a', for instance, it should be replaced with 'z', 'b' with 'y', 'c' with
 'x', and so on, maintaining the same case. For words with an uppercase 'A', it should 
 be replaced with 'Z', 'B' with 'Y', 'C' with 'X', and so forth, while preserving the 
 uppercase. The given string will not start or end with a space, and there will be no
  occurrence of double spaces. After transforming the characters of the words, form a 
  new string by taking the last word first and appending the remaining words in their 
  original order, each separated by spaces. Note: The opposite letter mappings are as 
  follows: a ↔ z, b ↔ y, c ↔ x, ..., m ↔ n, n ↔ m, ..., x ↔ c, y ↔ b, z ↔ a. The 
  mapping is case-sensitive.

Example

For the input string "CapitaL letters", the output should be "ovggvih XzkrgzO".
 * @param inputStr
 * @return
 */
	 public String solution(String inputStr) {
	        // TODO: implement the string transformation function
	        System.out.println('z' - 'a'); // letter minus 'a' or letter minus 'A' 25
	        System.out.println('z' -  6); // 116
	        System.out.println((char)116); //  t
	        
	        String[] words = inputStr.split(" ");
	        String[] arr = new String[words.length];
	        for(int inx = 0; inx < words.length; inx++)
	        {
	            String word = words[inx];
	            StringBuilder sb = new StringBuilder();
	            for(int i = 0; i < word.length(); i++)
	            {
	                if(Character.isUpperCase(word.charAt(i)))
	                {
	                   int leftDelta = word.charAt(i) - 'A';
	                   char letter = (char)('Z' - leftDelta);
	                   sb.append(letter);
	                }
	                else
	                {
	                    int leftDelta = word.charAt(i) - 'a';
	                   char letter = (char)('z' - leftDelta);
	                   sb.append(letter);
	                }
	            }
	            arr[inx] = sb.toString();
	        }
	        
	        StringBuilder rest = new StringBuilder(arr[arr.length-1]);
	        for(int inx = 0; inx < arr.length-1; inx++)
	        {
	            rest.append(" ").append(arr[inx]);
	        }
	        
	        return rest.toString();
	    }
	}

