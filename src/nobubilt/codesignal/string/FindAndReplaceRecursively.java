package nobubilt.codesignal.string;

public class FindAndReplaceRecursively {
/**
 * Imagine you are working on a new feature for a text processing application. The 
 * feature requires you to provide users with the option to replace all occurrences
 *  of a certain substring in the entered text with a new substring.

You are tasked with writing a function, public String 
replaceSubstring(String text, String old, String newSubstr), that does the following:
Accepts as input text (a string of length n, where 1 ≤ n ≤ 500, which includes only 
lowercase alphabets and spaces), old (a string of length k, where 1 ≤ k ≤ n, which 
includes only lowercase alphabets), and newSubstr (a string of length m, where 
1 ≤ m ≤ 500, which includes only lowercase alphabets).

Replaces every occurrence of the string old in text with the string newSubstr.
Returns the updated text string with all replaced substrings.
For instance, your function might be called as follows:

Java
Copy to clipboard
replaceSubstring("hello world", "world", "friend")
In this case, the output would be:

Copy to clipboard
"hello friend"
This is because there is one occurrence of the substring 'world' in the string. 
This occurrence is replaced by 'friend', resulting in the return value "hello friend".
 */
	  public String replaceSubstring(String text, String old, String newSubstr) {
	        // TODO: Implement the function
	        StringBuilder sb = new StringBuilder();
	        int occInx = text.indexOf(old);
	        while(occInx != -1)
	        {
	            sb.append(text.substring(0, occInx));
	            sb.append(newSubstr);
	            sb.append(text.substring(occInx + old.length()));
	            text = sb.toString();
	            
	            occInx = sb.indexOf(old);
	            sb = new StringBuilder();
	        }
	        return text;
	    }
	}
