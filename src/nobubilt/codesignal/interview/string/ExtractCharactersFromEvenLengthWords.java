package nobubilt.codesignal.interview.string;

public class ExtractCharactersFromEvenLengthWords {
/**
 * You are given a sentence represented by a string, where words are separated by 
 * spaces. Your task is to write a Java function that performs the following:

For each word with an even number of characters, extract the second half of the word.
From this second half, select the characters whose ASCII values are less than 
the ASCII value of a given character c.
Concatenate all these selected characters and form a single output string, 
preserving their order of appearance.
For example, consider the sentence: "Python is a high-level programming 
language." and the character 'n'. The word 'Python' has 6 characters 
(an even number), with the second half being 'hon'. Within 'hon', only the 
character 'h' has an ASCII value less than 'n'.

Hence, the output of your function for this example should be: "h".
 */
  public String solution(String sentence, char c) {
        // TODO: implement
        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");
        for(String str : arr)
        {
            if(str.length()%2== 0)
            {
                for(int inx = str.length()/2; inx < str.length(); inx++)
                {
                    if(str.charAt(inx) < c)
                    {
                        sb.append(str.charAt(inx));
                    }
                }
            }
        }
        return sb.toString();
    }
}

