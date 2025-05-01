package nobubilt.codesignal.array;

public class LongestSequenceAfterRemoval {
/**
 * Your task is to write a function solution(S, Q), where S is a string of lowercase 
 * English alphabets, and Q is a list of pairs. Each pair represents a query involving 
 * two alphabets, say c1 and c2. For each query, your function should return the length 
 * of the longest sequence of consecutive characters remaining after removing all
 *  occurrences of the alphabets c1 and c2 from the string S.
S consists of English lowercase letters only: "abcdefghijklmnopqrstuvwxyz"
Each pair in Q contains two distinct English lowercase alphabets.
Example: Consider the function call solution("abcccacba", { {'a', 'b'}, {'b', 'c'} }). 
The output should be [3, 1].

In the first query, removing all 'a's and 'b's from "abcccacba" results in strings 
"ccc" and "c", the maximum length is 3. In the second query, removing all 'b's and 'c's 
from "abcccacba" yields 3 "a"s, each of length 1. Thus, the result is [3, 1].

Similarly, for solution("intelliaiassistant", { {'a', 'i'}, {'n', 't'} }), the output 
should be [5, 11].
 * @param S
 * @param Q
 * @return
 */

	
	 public static int[] solution(String S, char[][] Q) {
	        // TODO: implement the solution here
	         int[] result = new int[Q.length];
	         int col = 0;
	        for(char[] row : Q)
	        {
	            char left = row[0];
	            char right = row[1];
	            int maxLength = 0;
	            int currentLen = 0;
	            int lastStop = 0;
	            for(int inx = 0; inx < S.length(); inx++)
	            {
	                if(S.charAt(inx) == left || S.charAt(inx) == right)
	                {
	                    currentLen = inx - lastStop;
	                    if(currentLen > maxLength)
	                    {
	                        maxLength = currentLen;
	                    }
	                    lastStop = inx + 1;
	                }
	            }
	            if(lastStop < S.length())
	            {
	               maxLength = Math.max(S.length() - lastStop, maxLength);
	            }
	            result[col] = maxLength;
	            col++;
	        } return result;
	    }
}
