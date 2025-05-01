package nobubilt.codesignal.interview.string;

import java.util.Arrays;
import java.util.List;

public class CombineStringAndArrayAbsoluteDeductionOfThree {
/**
 * You are required to create a function that, given two parameters — an array of 
 * integers and a string — will return a modified text message based on these elements.

You will be provided with an array of n integers, where n is between 
1 and 100, inclusive, and a string with m characters, where m ranges from 
1 to 500, inclusive. Each element in the array will range from 
−100 to 100, inclusive.

Your initial task is to process the array by subtracting 3 from each number and then 
accumulating the absolute values of each number until their total exceeds 30. If the 
total exceeds 30, the last integer should not be marked as processed and should be 
included in the output. You must then stop processing the array immediately.

Concurrently, you must process the given string. In this part, replace each lowercase 
character in your string with the succeeding alphabetical character in a cyclic manner; 
for instance, 'a' should be replaced by 'b', 'b' should be replaced by 'c', and so on, 
until 'z', which should be replaced by 'a'. If a character is not a lowercase letter,
it should be left as is.

Similar to the array, if the total absolute value from the array operations crosses 
the threshold of 30, you should cease the string modification immediately.

At the conclusion, return both an updated string with all processed characters and the 
remaining, unprocessed portion of the initial array, respectively, as a single string.
 The format of the output should be: <updated string> <remaining array elements>. Each 
 element in the remaining array should be separated by a space.

Example

Input:

Java
Copy to clipboard
int[] array = {5, 10, 15, 20, 25};
String string = "hello world";
Output:

Java
Copy to clipboard
"ifm 20 25"
Explanation:

After processing the array, the accumulated values surpass 30 after processing the 
first three elements (|5-3| + |10-3| + |15-3| = 21, |5-3| + |10-3| + |15-3|+|20-3|=38).
Therefore, processing stops after these elements.
The first three characters of the string "hello world" are processed to become "ifm".
The remaining elements of the array are 20 and 25.


 */




    public String solution(int[] arr, String text) {
        // TODO: Implement the function
        int sumSoFar = 0;
        int inx = 0;
        StringBuilder sb = new StringBuilder();
        while(inx < arr.length && inx < text.length() && sumSoFar <= 30)
        {
            if(sumSoFar +Math.abs(arr[inx] - 3) > 30)
            {
                break;
            }
            sumSoFar += Math.abs((arr[inx] - 3));
            char ch = text.charAt(inx);
            if(Character.isLetter(ch) && Character.isLowerCase(ch))
            {
                sb.append( ch == 'z' ? 'a' : (char)(ch + 1));
            }
            else
            {
                   sb.append(ch);                
            }
            
            ++inx;
        }
        List<Integer> subList = Arrays.stream(arr).boxed().toList().
        		subList(inx, arr.length);
            
        String subStr = subList.toString().replaceAll(",", "");
        
        return sb.toString() + " " + subStr.substring(1, subStr.length()-1);
 
    }
}
