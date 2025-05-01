package nobubilt.codesignal.interview.string;

public class AccessStringInAlternatingPattern {
/**
 * You receive a string, from which you need to extract characters. However, 
 * the sequence in which you select them diverges from the norm. You start with 
 * the first character, then select the last character, move to the second character, 
 * then choose the second-to-last character, and continue this pattern until 
 * there are no characters left. Quite a mind-bender, isn't it?

Here's what we mean:

You are required to craft a Java function, public static String solution(String 
inputString) { ... } in the Solution class. This function takes inputString as a 
parameter, a string of lowercase English alphabet letters ('a' to 'z'), with a 
length ranging between 1 to 100 characters. The function then returns a new string, 
fashioned from the input string but with characters selected in the pattern we 
described above.

For example, if the inputString is "abcdefg", the function should return "agbfced".


 * @param str
 * @return
 */
	public static String solution(String str)
	{
		StringBuilder sb = new StringBuilder();
		int limit = str.length()/2 + str.length()%2;
		for(int inx = 0; inx < limit; inx++)
		{
			sb.append(str.charAt(inx));
			if(inx != str.length() - 1 - inx) // dont repeat middle ch in odd len.
			{
				sb.append(str.charAt(str.length() - 1 - inx));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
        // Example usage
        String inputString = "abcdefg";
        String outputString = solution(inputString);
        System.out.println(outputString);  // Outputs: agbfced
    }
}
