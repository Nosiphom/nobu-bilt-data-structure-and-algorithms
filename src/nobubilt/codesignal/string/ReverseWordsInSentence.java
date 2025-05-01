package nobubilt.codesignal.string;

public class ReverseWordsInSentence {

	public static String reverseWords(String str)
	{
		String[] words = str.split(" ");
		String[] reversedWords = new String[words.length];
		for(int inx = 0; inx < words.length; inx++)
		{
			StringBuilder sb = new StringBuilder(words[inx]);
			reversedWords[inx] =  sb.reverse().toString();
		}
		
		StringBuilder sbPhrase = new StringBuilder(reversedWords[0]);
		for(int inx = 1; inx < reversedWords.length; inx++)
		{
			sbPhrase.append(" ").append(reversedWords[inx]);
		}
		return sbPhrase.toString();
	}
    public static void main(String[] args) {
        // Call the function
        System.out.println(reverseWords("Hello neat java_lovers_123")); // prints: 'olleH taen 321_srevol_avaj'
    }
}
