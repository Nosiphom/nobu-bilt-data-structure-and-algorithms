package nobubilt.codesignal.string;

public class TypographicalSwapInStrings {
/**
 * Humans often make mistakes when they are typing quickly. In some cases, they may 
 * press two keys simultaneously, resulting in swapped consecutive characters in the 
 * text. Your task is to craft a Java function that helps identify such typos. 
 * Specifically, you are asked to construct a function called spotSwaps that behaves 
 * as follows:

Given two strings, source and target, of the same length n (1≤n≤500), inclusive, 
both comprise only lowercase English letters. The function should return the zero-based
index of the swap in the source string if exactly one swap of consecutive elements can
fix the target string to match the source string; otherwise, the function should 
return -1. The index of the swap is the index of the left element in the swapped pair.
  

Note:

Characters can be swapped at most once.
Don't check for swaps at the last position of the string, since there is no character
 with which to swap. If multiple swaps are needed, or if no swaps are needed, or it's 
impossible to fix via swaps, return -1.
Example

For source = "hello" and target = "hlelo", the output should be 1.

Good luck!
 */
 public int spotSwaps(String source, String target) {
        // TODO: implement
    int left = -1;
  
    for(int inx = 0; inx < source.length(); inx++)
    {
        if(source.charAt(inx) != target.charAt(inx))
        {
            if(left == -1)
            {
                left = inx;
                continue;
            }
            else if(left != -1 && left == inx - 1 && 
            		target.charAt(inx) == source.charAt(left) 
            		&& target.charAt(left) == source.charAt(inx))
            {
                return left;
            }
         
        }
    }
    return -1;
    }
}
