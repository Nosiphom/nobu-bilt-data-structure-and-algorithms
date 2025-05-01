package nobubilt.codesignal.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindReverseAndReplace {
/**
 * You are given two lists, sentences and words, each comprising n strings, where 
 * n ranges from 1 to 100 inclusive. Each string in the sentences list has a length 
 * ranging from 1 to 500 inclusive. Each word in the words list is a single lowercase 
 * English alphabet word of length 1 to 10 inclusive.

Your task is to find all instances of each word in the corresponding sentence from 
the sentences list and replace them with the reverse of the word. The words and 
sentences at the same index in their respective lists are deemed to correspond to 
each other. Note that the words are case-insensitive, meaning that if some of its 
characters are capitalized in the sentence, it also counts as a occurrence of the word.

Return a new list comprising n strings, where each string is the sentence from the 
sentences list at the corresponding index, with all instances of the word from the 
words list at the same index replaced with its reverse.

If the word is not found in the respective sentence, keep the sentence as it is.
Remember, while replacing the instances of word in the sentence, you should preserve 
the case of the initial letter of the word. If a word starts with a capital letter in 
the sentence, its reversed form should also start with a capital letter.

Example

For sentences = {"this is a simple example.", "the name is bond. james bond.", 
"remove every single e"} and words = {"simple", "bond", "e"}, the output should be 
{"this is a elpmis example.", "the name is dnob. james dnob.", "remove every single e"}.

public class Example {
    public static void main(String[] args) {
        String sentence = "This is a Simple example of a simple task.";
        String word = "simple";

        // Compile a case-insensitive pattern
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        // Find and print all matches
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println("Found: " + match + " at index " + matcher.start());
        }
    }
}
 */
	

	public List<String> solution(List<String> sentences, List<String> words) {
	    // TODO: implement the solution
		List<String> result = new ArrayList<>();
		for(int inx = 0; inx < sentences.size(); inx++)
		{
		    String sentence = sentences.get(inx);
		    String word = words.get(inx);
		   
		    StringBuilder sb = new StringBuilder();
		    
		    Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(sentence);
		    
		    while(matcher.find())
		    {
		       // String match = matcher.group();
		        sb.append(sentence.substring(0, matcher.start()));
		        String phrase = sentence.substring(matcher.start(), 
		        		matcher.start()+word.length());
		        if(Character.isUpperCase(phrase.charAt(0)))
		        {
		            String reverseWord = new StringBuilder(phrase).reverse().toString();
		            StringBuilder caseSensitiveSb = new StringBuilder();
		            caseSensitiveSb.append(Character.toUpperCase(reverseWord.charAt(0)));
		            caseSensitiveSb.append(reverseWord.substring(1, reverseWord.length()-1));
		            caseSensitiveSb.append(Character.toLowerCase(
		            		reverseWord.charAt(reverseWord.length()-1)));
		            sb.append(caseSensitiveSb.toString());
		        }
		        else
		        {
		            String reverseWord = new StringBuilder(phrase).reverse().toString();
		            sb.append(reverseWord);
		        }
		        sb.append(sentence.substring(matcher.start() + word.length()));  
		        sentence = sb.toString();
		        sb = new StringBuilder();              
		    }
		    result.add(sentence);
		}
	
		return result; // Placeholder for the result
	}
}
