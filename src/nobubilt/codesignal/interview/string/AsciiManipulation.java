package nobubilt.codesignal.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AsciiManipulation {
	 public static void main(String[] args) {
	      
		 /**
		  * You can convert a character into its ASCII value using a simple cast:
		  */
		 
	        char c = 'A';
	        int asciiVal = (int) c;
	        System.out.println("The ASCII value of " + c + " is: " + asciiVal); // 65
	    
	 /**
	  * Similarly, you can convert an ASCII value back to its corresponding character:
	  */
	        int k_asciiVal = 65;
	        char k = (char) k_asciiVal;
	        System.out.println("The character of ASCII value " + k_asciiVal + " is: " + k); //A

	 /**
	  * Manipulating the ASCII value of characters can be quite useful in certain 
	  * situations. For example, to convert a lowercase letter to uppercase (or vice
	  *  versa), you could subtract (or add) 32 to the character's ASCII value.
	  * 
	  */
	   
	        
	        
	        String s = "mark";
	        StringBuilder sb = new StringBuilder(s);
	        for (int i = 0; i < sb.length(); i++) {
	            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
	        }
	        System.out.println(sb.toString());  // Prints: 'MARK'

	        s = "Mark";
	        sb = new StringBuilder(s);
	        for (int i = 0; i < sb.length(); i++) {
	            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
	        }
	        System.out.println(sb.toString());  // Prints: 'mark'
	    
	 
	        String originalText = "Hello, Java!";
	        /** The encrypted_text function call and println statement should 
	         * remain the same as the solution
	        
	        */
	        String encryptedText = encryptText(originalText);
	     // Correct output after TODO should be 'Khoor, Mdyd!'
	        System.out.println(encryptedText);  
	        
	        
	        String astronautsData = "Buzz Aldrin,1930;Yuri Gagarin,1934;Valentina Tereshkova,1937";
	        List<String> astronautsList = split(astronautsData, ";");
	        List<String> cleanedAstronauts = new ArrayList<>();

	        for (String astronaut : astronautsList) {
	            cleanedAstronauts.add(join(split(astronaut, ","), " "));
	        }

	        for (String cleanedAstronaut : cleanedAstronauts) {
	            System.out.println(cleanedAstronaut); // Should output: Buzz Aldrin 1930, Yuri Gagarin 1934, Valentina Tereshkova 1937
	        }
	 	}


     /** Simple text encryption using Caesar Cipher technique
     // The Caesar Cipher for `shift = 3` cyclically shifts every
      *  letter of the word by 3 positions:
     a -> d, b -> e, c -> f, ..., x -> a, y -> b, z -> c
     */ 

     // Implement the encryption logic by shifting each alphabet character
     public static String encryptText(String text) {
         StringBuilder encrypted = new StringBuilder();
         for (char c : text.toCharArray()) {
             if (Character.isLetter(c)) {  // check if the character is a letter
                 int shift = 3;
      // TODO: Use correct calculations to shift the character within the alphabet
                 if(Character.isLowerCase(c))
                 {
                     char nextLetter = (char)(((c - 'a' + shift)%26) + 'a');
                     encrypted.append(nextLetter);
                 }
                 else
                 {
                     char nextLetter = (char)(((c - 'A' + shift)%26) + 'A');
                     encrypted.append(nextLetter);
                 }
         // Hint: 'A' = 65, 'a' = 97
         // Hint 2: You can use the modulo (%) operator to wrap around the alphabet
         } else {
            	 
           // keep non-letter characters unchanged  B,66, C,67, D,68, E69 F70 G71
         
                 encrypted.append(c);       }
         }
         return encrypted.toString();
}
     /**
      * Modify the given Java code to combine the astronaut's name and year of birth using Java's Stream API instead of using string concatenation with a loop. You should implement a solution that separates the data by commas and then reconstructs the astronaut's information using string joining techniques. Ensure your code works for a variable number of astronaut fields, should future data include more information such as a year of death.
      */
     public static List<String> split(String s, String delimiter) {
         return Arrays.asList(s.split(delimiter));
     }
     
     // Modify this function to use Java's Stream API for joining strings.
     public static String join(List<String> list, String delimiter) {
         // #TODO: Replace the following loop operations with Stream API string join ensuring it works also for variable number of fields
         StringBuilder joined = new StringBuilder();
         joined.append(list.stream().collect(Collectors.joining(delimiter)));
         
         
         // for (int i = 0; i < list.size(); i++) {
         //     if (i != 0) {
         //         joined.append(delimiter);
         //     }
         //     joined.append(list.get(i));
         // }
         return joined.toString();
     }
     
}