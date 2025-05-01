package nobubilt.codesignal.string;

import java.util.ArrayList;

public class ParseAndMultiply {
	/**
	 * Our task for the day involves creating a Java method called 
	 * parseAndMultiplyNumbers(). This method is designed to accept a string as 
	 * an input. However, it's not just any string — the input we'll consider is 
	 * a playful mix of numbers and words.

The purpose of this method is to analyze the input string, extract all the numbers, 
convert these numbers (currently string types) into integer data types, and then 
multiply all these numbers together. The final output? It's the product of all 
those numbers!

Here's an illustration for clarification. Given the input string "I have 2 
apples and 5 oranges," our method should return the product of 2 and 5, which is 10.
	 * @param inputString
	 * @return
	 */
	public static int parseAndMultiplyNumbers(String inputString) {
        String num = "";
        ArrayList<Integer> numbers = new ArrayList<>();

        for (char ch : inputString.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            } else if (!num.isEmpty()) {
                numbers.add(Integer.parseInt(num));
                num = "";
            }
        }
        if (!num.isEmpty()) {
            numbers.add(Integer.parseInt(num));
        }

        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // Call the method
        System.out.println(parseAndMultiplyNumbers("I have 2 apples and 5 oranges"));
    }
}
