package nobubilt.codesignal.interview.string;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSubstringOccAlgoSearch {
	  /**
	   * Your task is to design an algorithm that, given a string text and an integer length, 
	   * returns the maximum number of times any substring of length length occurs in text.
	   *   
	  */
	  
	  public static int maxSubstringOccurrences(String text, int length) {
          PriorityQueue<StringOccurrenceRecord> maxHeap = 
        		  new PriorityQueue<>(Comparator.comparingInt(rec -> rec.counter * -1));
  
	  int index = 0;
	  while(index <= text.length() - length)
	  {
	      String subString = text.substring(index, index + length);
	      int counter = 0;
	      int strInx = 0;
	      while(strInx < text.length())
	      {
	  
	          int occInx = text.indexOf(subString, strInx);
	          if(occInx == -1)
	          {
	              break;
	          }
	          ++counter;
	          strInx = occInx + 1;
	      }
	      index = index + length;
	      maxHeap.add(new StringOccurrenceRecord(subString, counter));
	  }
	  
	  if(!maxHeap.isEmpty())
	  {
	      return maxHeap.peek().counter;
	  }
	  return 0;
	}
}

class StringOccurrenceRecord
{
	String phrase;
	int counter;
	StringOccurrenceRecord(String str, int ct)
	{
	  this.phrase = str;
	  this.counter = ct;
	}
}