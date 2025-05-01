package nobubilt.codesignal.interview.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeMulitSortedLists {
/**
 * You work with large data sets in Java, and typically, the data arrive sorted within 
 * individual batches but not across all batches. You are given n lists, where each 
 * list is sorted in ascending order. The function should return a single list consisting 
 * of all elements from all lists, sorted in ascending order.

The time complexity of your solution should be O(n * m), where n is the total number 
of lists and m is the maximum length of any list. Your solution is not allowed to use 
built-in functions like Arrays.sort, Collections.sort, or additional libraries like PriorityQueue.
 */
	 public static List<Integer> mergeNSortedLists(List<List<Integer>> lists) {
	        // TODO: implement the function to merge sorted lists
	        
	        if(lists.size() == 0){return new ArrayList<>();}
	        List<Integer> firstList = lists.get(0);
	        for(int inx = 1; inx < lists.size(); inx++)
	        {
	            List<Integer> nextList = lists.get(inx);
	            firstList = combineList(nextList, firstList);
	        }
	        return firstList;
	    }
	    
	    public static List<Integer> combineList(List<Integer> list1, List<Integer> list2)
	    {
	        List<Integer> mergedList = new ArrayList<>();
	        int inx1 = 0;
	        int inx2 = 0;
	        int len1 = list1.size();
	        int len2 = list2.size();
	        while(inx1 < len1 && inx2 < len2)
	        {
	            if(list1.get(inx1) <= list2.get(inx2))
	            {
	                mergedList.add(list1.get(inx1));
	                 ++inx1;
	            }  
	            else
	            {
	                mergedList.add(list2.get(inx2));
	                ++inx2;
	            }
	        }
	        if(inx1 < len1)
	        {
	            mergedList.addAll(list1.subList(inx1, len1));
	        }
	        if(inx2 < len2)
	        {
	            mergedList.addAll(list2.subList(inx2, len2));
	        }
	        return mergedList;
	    }
}
