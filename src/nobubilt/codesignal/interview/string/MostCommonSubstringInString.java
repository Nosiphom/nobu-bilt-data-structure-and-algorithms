package nobubilt.codesignal.interview.string;
import java.util.*;

public class MostCommonSubstringInString {
/**
 * You are given a string of characters. Your task is to write a function that will find and return 
 * the most common substring of a given length in the input string. If two or more substrings have 
 * the same maximum frequency, you should return the lexicographically smallest one.

For example, given the input string "bananabananaba" and a substring length of 5, your function 
should return "anaba", since it appears twice and is lexicographically smaller than other 
substrings that also appear twice (e.g., "banan").

The expected time complexity for this task is O(str.length⋅length).
 * @param s
 * @param length
 * @return
 */
	   public static String findMostCommonSubstring(String s, int length) {
	        // TODO: implement the function
	        // substring of len & its occ count
	        // List of highest (same len) but if 1 then return the 1
	        // List of highest (same len) => get alphabet occ first
	        //
	        PriorityQueue<PhraseOcc> maxHeap = new PriorityQueue<>((a,b)-> b.occurrence - a.occurrence);
	        Set<String> uniqueSet = new HashSet<>();
	        for(int inx = 0; inx < s.length(); inx++)
	        {
	            if(inx + length <= s.length()) 
	            {
	                String phrase = s.substring(inx, inx + length);
	                if(!uniqueSet.contains(phrase))
	                {
	                    int occurrence = findOccurrenceCount(phrase, s);   
	                
	                    maxHeap.add(new PhraseOcc(phrase, occurrence));   
	                    uniqueSet.add(phrase);     
	                }
	            }  
	        }
	        List<String> highestOccurrence = new ArrayList<>();
	        if(!maxHeap.isEmpty())
	        {
	            PhraseOcc highest = maxHeap.poll();
	            while(!maxHeap.isEmpty() && maxHeap.peek().occurrence == highest.occurrence)
	            {
	                highestOccurrence.add(maxHeap.poll().phrase);
	            }
	            highestOccurrence.add(highest.phrase);
	            Collections.sort(highestOccurrence);
	            return highestOccurrence.get(0);
	        }
	        
	        return "";
	    }
	    
	    public static int findOccurrenceCount(String phrase, String s)
	    {
	        int counter = 0;
	        int inx = 0;
	        while(inx < s.length())
	        {
	           int nextInx = s.indexOf(phrase, inx);
	           if(nextInx == -1)
	           {
	             return counter;
	           } 
	      //     System.out.print(nextInx + " ");
	           inx = nextInx;
	           ++inx;
	           ++counter;
	        }
	        System.out.println();
	        
	        return counter;
	    }
	}

	class PhraseOcc
	{
	    String phrase;
	    int occurrence;
	    PhraseOcc(String str, int occ)
	    {
	        this.phrase = str;
	        this.occurrence = occ;
	    }
	}