package nobubilt.codesignal.recursion;

public class ReverseStringRecursively {
/**
 * Your task is to create a recursive function reverseString(s) that reverses a 
 * given string s using recursion without using Java's built-in string methods like 
 * StringBuilder.reverse() or similar.

For example, reverseString("hello") would return "olleh".
 */
	public String reverseString(String s) {
        // TODO: Implement the function to reverse the string using recursion.
        if(s.isEmpty()){return s;}
        int inx =  s.length()-1;
        String str = String.valueOf(s.charAt(inx));
        if(inx == 0)
        {
            return str;
        }
        return str + reverseString(s, inx -1);
    }
    
    public String reverseString(String s, int inx)
    {
        if(inx == 0)
        {
            return String.valueOf(s.charAt(inx));
        }
        String str = String.valueOf(s.charAt(inx));
        return str + reverseString(s, inx -1); 
    }
}
