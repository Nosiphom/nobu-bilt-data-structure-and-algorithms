package nobubilt.codesignal.math;

public class ComparingLargeNumbers {
/**
 * For this task, you are given two non-negative integers, num1 and num2. However, 
 * these are not just ordinary numbers; they are so large that they should be 
 * represented as strings instead of normal integers. Each can be up to 100 
 * digits long.

	Your mission is to write a Java function that compares these two "string-numbers" 
	without converting the entire strings into integers. Your function should determine
	 whether num1 is greater than, less than, or equal to num2.
	
	The task requires that you manually compare the two strings from the most 
	significant digit to the least significant. You should implement your own logic 
	to compare two string numbers.
	
	The function should return the following results:
	
	If num1 is greater than num2, your function should return 1.
	If num2 is greater than num1, your function should return -1.
	If num1 and num2 are equal, your function should return 0.
	Let's look at the following examples:
	
	For num1 = "12345" and num2 = "1234", your function should return 1.
	For num1 = "1234" and num2 = "12345", your function should return -1.
	For num1 = "12345" and num2 = "12345", your function should return 0.
	This exercise is a great test of your understanding of how numbers and strings 
	work and interact in a programming language. We hope you find it challenging 
	and enjoyable!
 */
    public int compareStringNumbers(String num1, String num2) {
        // TODO: implement the function
        if(num1.length() > num2.length() && !num1.startsWith("0")){return 1;}
        if(num2.length() > num1.length() && !num2.startsWith("0")){return -1;}
        
        int n1Inx = 0;
        int n2Inx = 0;
        while(num1.charAt(n1Inx) == '0' && n1Inx < num1.length())
        {
            ++n1Inx;
        }
         while(num2.charAt(n2Inx) == '0' && n1Inx < num1.length())
        {
            ++n2Inx;
        }
       //leng limit check end
        if(n1Inx == num1.length() && n2Inx == num2.length()){return 0;}
        if(num1.length() - n1Inx > num2.length() - n2Inx){return 1;}
        if(num1.length() - n1Inx < num2.length() - n2Inx){return -1;}
        //equal len
        while(n1Inx < num1.length() && n2Inx < num2.length() 
        		&& num1.charAt(n1Inx) - '0' == num2.charAt(n2Inx)-'0')
        {
            ++n1Inx;
            ++n2Inx;
        }
        if(n1Inx < num1.length() && n2Inx < num2.length() )
        {
            if( num1.charAt(n1Inx) - '0' > num2.charAt(n2Inx)-'0')
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        
        return 0;
    }
}
