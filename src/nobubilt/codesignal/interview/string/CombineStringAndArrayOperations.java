package nobubilt.codesignal.interview.string;

import java.util.ArrayList;
import java.util.List;

public class CombineStringAndArrayOperations {
/**
 * Our mission today is to generate a unique encoded message for a book club. Here's the fun part: to create a cryptic message, we will process a string and an array of numbers simultaneously and stop once a given condition is satisfied.

For the string, our task is to replace each letter with the next alphabetical letter and then reverse the entire updated string. For the array of numbers, our task is to divide each number by 2, round the result, and accumulate the rounded numbers until their total exceeds 20.

When the accumulated total exceeds 20, we immediately stop the process and return the updated string and the as-yet-unprocessed numbers in their original order.

Example

Consider the input string "books" and array {10, 20, 30, 50, 100}.

We start our process with an empty string and a sum of 0.

For the first character 'b' in 'books', we replace it with the next alphabet 'c'. For the corresponding number 10 in the array, we divide it by 2 and round it. The result is 5. The sum after the first operation is 5, which is less than 20, so we continue to the next character.
For the next character 'o', we replace it with 'p'. For the corresponding number 20 in the array, half and rounded is 10. The sum after the second operation is 15 (5 + 10). The sum still doesn't exceed 20, so we move to the third character.
For the next character 'o', we replace it with 'p'. For the corresponding number 30 in the array, half and rounded is 15. When we add this 15 to the previously calculated sum of 15, it totals 30, which is more than 20. So, we stop the process here.
We have processed 'b', 'o', and 'o' from the word 'books' and replaced them with 'c', 'p', and 'p' respectively to get "cpp". After reversing, we get "ppc".
For the array, we exclude any numbers that we have processed. Hence, we exclude the first three numbers, and the array becomes {50, 100}.
So the output should be "ppc 50, 100".
 * @param str
 * @param numbers
 * @return
 */
	public static String solution(String str, List<Integer> numbers)
	{
		int sumSoFar = 0;
		int strInx = 0;
		
		StringBuilder sb = new StringBuilder();
		while(strInx < str.length() && sumSoFar <= 20)
		{
			sb.append(str.charAt(strInx) == 'z' ? 'a' : (char)(str.charAt(strInx) + 1));
			int half = (int)Math.round(numbers.get(strInx)/2.0);
			sumSoFar += half;
			++strInx;
		}
		sb.reverse();
		List<Integer> unused = numbers.subList(strInx, numbers.size());
		String unusedStr = unused.toString();
		return sb.toString() + " " + unusedStr.substring(1, unusedStr.length()-1);
		
	}
	
	 public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(50);
	        numbers.add(100);

	        String result = solution("books", numbers);
	        System.out.println(result);

	        // Output:
	        // ppc 50, 100
	    }
}
