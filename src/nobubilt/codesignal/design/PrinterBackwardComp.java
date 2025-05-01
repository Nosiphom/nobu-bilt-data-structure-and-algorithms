package nobubilt.codesignal.design;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PrinterBackwardComp {

	/**
	 * You are tasked with upgrading a print management system currently capable of 
	 * handling text content by printing it directly to the console. The system includes 
	 * a Printer class with a printContent(content) method responsible for outputting text 
	 * content. However, due to the evolving needs of your user base, there is now a requirement 
	 * to support printing not only plain text but also HTML and JSON content.

To maintain backward compatibility, ensure that the original printContent method continues to 
function precisely as before when supplied with plain text without necessitating any modifications
 from the current system's users. Implement the necessary additions or modifications using the
  principles we discussed earlier.

In this task, you're going to enhance the capabilities of an existing Printer class. Currently, 
the Printer class has a method printContent(content) that allows printing plain text content 
directly to the console. Your mission is to maintain the class’s functionality for plain text 
while extending its capabilities to support printing HTML and JSON content in specific formats.

The requirements for the updated Printer class are as follows:

Plain Text: When handling plain text (the default behavior), the class should print the content 
as it is. No modification to the existing printContent method behavior for plain text is expected.
HTML Content: For HTML content, the class should strip all HTML tags and print the remaining content.
 You will need to determine the best way to implement HTML tag removal while ensuring the text content 
 is left untouched and correctly formatted.
JSON Content: The printer should be capable of pretty-printing JSON content. This involves parsing the 
JSON string and printing it in a human-readable format with proper indentation of 4 spaces.
To achieve backward compatibility and flexibility, modify the printContent method to accept an 
additional optional parameter named contentType. This parameter should default to 'plain', 
indicating the content type being printed and supporting at least two other types: 'html' and 'json'.

Note: Use the Jackson library to implement JSON pretty-printing.

Keep in mind the following points as you work on this task:

Use the principles of clean code to ensure that your additions are well-structured and maintainable.
Make sure that the Printer class raises an IllegalArgumentException when an unsupported contentType 
is passed to the printContent method.
Design your solution in a way that it can be easily extended to support more content types in the future.
This enhancement is critical for meeting the evolving requirements of our user base while ensuring we do 
not disrupt current functionalities.
	 */
	
	  public static class Printer {
	        public void printContent(String content) {
	            printContent(content, "plain");
	        }

	        public void printContent(String content, String contentType) {
	            if(contentType.equals("html"))
	            {
	                String outcome = content.replaceAll("<.*?>", ""); //implement HTML tag removal
	                System.out.println(outcome);
	            }
	            else if(contentType.equals("json"))
	            {
	                ObjectMapper objectMapper = new ObjectMapper();
	                objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	                try{
	                    Object objectJson = objectMapper.readValue(content, Object.class);
	                    String jsonString = objectMapper.writeValueAsString(objectJson);
	                    System.out.println(jsonString);
	                }
	                catch(IOException eo)
	                {
	                    
	                }
	            }
	            else if(contentType.equals("plain"))
	            {
	                System.out.println(content);
	            }
	            else
	            {
	                throw new IllegalArgumentException();
	            }
	            // TODO: Implement functionality for 'html' content type by stripping HTML tags.
	            // TODO: Implement functionality for 'json' content type to pretty-print JSON using Jackson library.
	        }
	    }
}
