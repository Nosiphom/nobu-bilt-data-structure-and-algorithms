package nobubilt.codesignal.interview.string;

public class RunLengthEncoding {
/**
 * In this task, you are required to write a Java function that takes a 
 * string as input and identifies all consecutive groups of identical pairs of 
 * characters within it. A group can be defined as a segment of the text where 
 * the same pair of characters is repeated consecutively.

Your function should return a string representing all the repeating character 
pairs and the number of their repetitions. For instance, if the input string 
is "aaabbabbababaca", your function should output: "aa1ab1ba1bb1ab2ac1a1". Note 
that if the length of the input string is odd, the last character is not 
paired with any other and is just added to the resulting string with 
repetition count 1.

Unlike in the lesson, the input strings for this task are guaranteed to 
consist only of lowercase alphabetic characters. The length of the string 
will not exceed 500 characters.

Can you develop such a program? Get set, go!
 * @param s
 * @return
 */
   
    public String solution(String s) {
        // TODO: Implement the function here
        StringBuilder sb = new StringBuilder();
        String str = "**";
        int ct = 0;
        int inx = 0;
        while(inx + 1 < s.length())
        {
            String phrase = s.substring(inx, Math.min(inx +2, s.length()));
            if(phrase.equals(str))
            {
                ++ct;
            }
            else
            {
                if(str != "**")
                {
                     sb.append(str+ ct);   
                }
                
                str = phrase;
                ct = 1;
            }
            inx +=2;
        }
       
       if(str != "**")
        {
           sb.append(str + ct);  
        }
        if(inx < s.length())
        {
           sb.append(s.substring(inx) + 1); 
        }
        return sb.toString();
    }
}
