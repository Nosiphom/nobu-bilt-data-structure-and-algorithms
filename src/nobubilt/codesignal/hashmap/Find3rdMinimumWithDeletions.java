package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
/**
 * You are given a list of integers and a series of queries. There are two types of queries:

Delete the k-th minimum element (k <= 5) from the list.
Find the 3rd minimum of the list after performing all deletion operations.
You are tasked with creating a Java function List<Integer> solution(List<Integer> data,
 List<Map.Entry<String, Integer>> queries) that accepts a list of integers and a list of 
 queries as arguments. Each query is either in the form of Map.entry("delete", k) or 
 Map.entry("find", 0). For each 'find' query, your function should return the current 3rd minimum 
 in the list, if it exists. If the list does not contain a 3rd minimum, return -1.

Constraints:

1 <= data.size() <= 1000000
1 <= queries.size() <= 1000000
data[i] <= 100 for all 0 <= i < data.size()
queries[i].getKey() is either 'delete' or 'find' for all 0 <= i < queries.size()
If queries[i].getKey() == "delete", then 1 <= queries[i].getValue() <= 5
The list data does not contain duplicates.
Example:

For List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) and 
List<Map.Entry<String, Integer>> queries = Arrays.asList(Map.entry("delete", 1), Map.entry("find", 0),
 Map.entry("delete", 2), Map.entry("find", 0)), the output should be [4, 5].
Reasoning: After the first deletion operation, the element 1 is removed from the list. 
The result of the first 'find' query is then 4 (the 3rd minimum). After the second deletion 
operation, the element 3 is deleted from the list. The result of the second 'find' query is 
then 5 (the 3rd minimum).
 * 
 *
 */
public class Find3rdMinimumWithDeletions {
	
	  private PriorityQueue<Integer>  maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	     private PriorityQueue<Integer>  minHeap = new PriorityQueue<>();
	    public List<Integer> solution(List<Integer> data, List<Map.Entry<String, Integer>> queries) {
	        
	        for(Integer rec : data)
	        {
	            minHeap.add(rec);
	        }
	        
	        List<Integer> result = new ArrayList<>();
	            for(Map.Entry<String, Integer> entry : queries)
	            {
	                String operation = entry.getKey();
	                Integer value = entry.getValue();
	                if(operation.equals("delete"))
	                {
	                    minHeap = removeElement(minHeap, value);
	                }
	                else if(operation.equals("find"))
	                {
	                    maxHeap.clear();
	                    int k = 3;
	                   
	                    while(k > 0 && !minHeap.isEmpty())
	                    {
	                        maxHeap.add(minHeap.poll());
	                        k--;
	                    }
	                    if(maxHeap.size() == 3)
	                    {
	                        result.add(maxHeap.peek());
	                    }
	                    else
	                    {
	                        result.add(-1);
	                    }
	                    
	                    int currSize = maxHeap.size();
	                    while(currSize > 0)
	                    {
	                        minHeap.add(maxHeap.poll());
	                        --currSize;
	                    }
	                }
	            }
	        // TODO: Implement this function
	        return result;
	    }
	    
	    PriorityQueue<Integer> removeElement(PriorityQueue<Integer> minHeap, Integer target)
	    {
	        PriorityQueue<Integer> tempHeap = new PriorityQueue<>();
	        int counter = 1;
	        while(!minHeap.isEmpty() && counter != target)
	        {
	            tempHeap.add(minHeap.poll());
	            ++counter;
	        }
	        if(!minHeap.isEmpty())
	        {
	            minHeap.poll();
	        }

	        while(!tempHeap.isEmpty())
	        {
	            minHeap.add(tempHeap.poll());
	        }
	       return minHeap;
	    }
}
