package nobubilt.codesignal.interview.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeapFindKshortestStringsInList {
/**
 * Your task is to write a function that takes a list of strings and an integer k as input. 
 * The function should return the k shortest strings in the list in ascending order of their 
 * lengths. In the case of ties, prioritize the strings that come earlier in the original list.

For instance, if the input list is ['cat', 'window', 'defenestrate', 'python', 'algorithm'] 
and k = 2, the output should be ['cat', 'window'] because they are the two strings with 
the shortest lengths.

The solution should work in O(n log k) time complexity, where n is the number of strings in the list.

Hint: Consider using a priority queue to efficiently manage and retrieve the strings based on 
their lengths and original order in the list.
 * @param strings
 * @param k
 * @return
 */
	  
	  public static List<String> findKShortest(List<String> strings, int k) {
	        // TODO: implement solution
	        PriorityQueue<PhraseRecord> maxHeap = new PriorityQueue<>(new PhraseRecordComparator());
	        
	        for(int inx = 0; inx < strings.size(); inx++)
	        {
	            String phrase = strings.get(inx);
	            maxHeap.add(new PhraseRecord(phrase, phrase.length(), inx));
	            if(maxHeap.size() > k)
	            {
	                maxHeap.poll();
	            }
	        }
	        List<String> result = new ArrayList<>();
	        while(!maxHeap.isEmpty())
	        {
	            result.add(maxHeap.poll().phrase);
	        }
	        Collections.reverse(result);
	        return result;
	    }
	}

	class PhraseRecordComparator implements Comparator<PhraseRecord>
	{
	    public int compare(PhraseRecord pr1, PhraseRecord pr2)
	    {
	        if(pr1.len == pr2.len)
	        {// doing opposite of what Collections.reverse will do.
	            return pr2.index - pr1.index ;
	        }
	        return  pr2.len - pr1.len;
	    } 
	}

	class PhraseRecord
	{
	    String phrase;
	    int len;
	    int index;
	    PhraseRecord(String str, int length, int inx)
	    {
	        this.phrase = str;
	        this.len = length;
	        this.index = inx;
	    }
	}
