package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.List;

public class SequentialCharacterRemovalInArray {
/**
 * You are given a string s containing only uppercase letters, with its length n 
 * ranging from 1 to 100, inclusive. Your task involves a series of sequential 
 * comparisons resulting in the removal of certain characters, following this process:

Form neighbouring pairs in the string sequentially (pair the first and second 
characters, the third and fourth, and so forth). If the string length is odd, keep 
the last character unpaired. For each pair, compare the characters and remove the 
character that comes earlier in the lexicographical order. If they are the same, 
remove the first character in the pair. These two steps define a round of operation. 
Perform these rounds until the string becomes empty.
If the string length after a round is 1, in the next round the last remaining character
 is removed and the process terminates.
Your task is to implement a Java method, solution(String s), where s is the initial 
input string. The method should follow the described process and return an 
ArrayList<Character> of the removed letters in the order of their removal.

Each character of the string is an uppercase letter from A to Z, inclusive.

As an example, if s = "BCAAB", the output should be ['B', 'A', 'A', 'B', 'C'].

The rounds would occur as follows:

After the first round, the pairs are (B,C), (A,A), (B) and the resulting string is
 CAB with 'B' and 'A' being removed. The removed characters list becomes ['B', 'A'].
After the second round, the pairs are (C,A) and (B), and the resulting string is CB 
with 'A' being removed. The removed characters list becomes ['B', 'A', 'A'].
After the third round, B is removed and the string becomes C. The removed characters
 list becomes ['B', 'A', 'A', 'B'].
After the fourth round, there are no pairs, and thus 'C' is removed, and the resulting 
string is empty. The removed characters list becomes ['B', 'A', 'A', 'B', 'C'].
 * @param s
 * @return
 */
	 public List<Character> solution(String s) {
	        // TODO: implement the solution here 
	        List<Character> letters = new ArrayList<>();
	        for(int inx = 0; inx < s.length(); inx++)
	        {
	            letters.add(s.charAt(inx));
	        }
	        List<Character> output= new ArrayList<>();
	    
	        while(true)
	        {
	            List<Character> clonedList = new ArrayList<>(letters);
	            int limit = clonedList.size()/2;
	            for(int inx = 0; inx < limit; inx++)
	            {
	                Character firstCh = clonedList.get(inx);
	                if(inx+1 < clonedList.size())
	                {
	                    Character secondCh = clonedList.get(inx+1);
	                    Character toRemove = firstCh < secondCh ? firstCh : secondCh;
	                    clonedList.remove(toRemove);
	                    output.add(toRemove);
	                }
	                else
	                {
	                    break;
	                }             
	            }
	            if(clonedList.size() == 1)
	            {
	                output.addAll(clonedList);
	                break;
	            }
	            if(clonedList.isEmpty())
	            {
	                break;
	            }
	            letters = clonedList;
	        }
	        return output;
	    }
}
