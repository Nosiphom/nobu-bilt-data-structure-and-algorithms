package nobubilt.codesignal.interview.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {	  
/**
 * You are provided with two input lists that contain n and m integers, respectively. 
 * Both lists are sorted in non-decreasing order — i.e., every element is either equal 
 * to or larger than the preceding one.

Your task is to return a new list that results from merging the two input lists so that the final 
output list is also in non-decreasing order. It should contain all the elements of the two lists, 
maintaining their order within the lists.

Your solution should not use any Java built-in sort function but should instead use a technique
 similar to the one used in the lesson. The expected time complexity is O(n+m).

For instance, if the two input lists are [1, 3, 5, 7, 9] and [2, 2, 3, 4, 6, 6], your function 
should return [1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 9].
 */
	  public static List<Integer> solution(List<Integer> l1, List<Integer> l2) {

	        // TODO: implement the function to merge two lists and return merged list
	        List<Integer> mergedList = new ArrayList<>();
	        int l1Inx = 0;
	        int l2Inx = 0;
	        
	        while(l1Inx < l1.size() && l2Inx < l2.size())
	        {
	            if(l1.get(l1Inx) <= l2.get(l2Inx))
	            {
	                mergedList.add(l1.get(l1Inx));
	                ++l1Inx;
	            }
	            else if(l2.get(l2Inx) <= l1.get(l1Inx))
	            {
	                mergedList.add(l2.get(l2Inx));
	                ++l2Inx;
	            }
	        }
	        
	        while(l1Inx < l1.size())
	        {
	            mergedList.add(l1.get(l1Inx));
	            ++l1Inx;
	        }
	        while(l2Inx < l2.size())
	        {
	            mergedList.add(l2.get(l2Inx));
	            ++l2Inx;
	        }
	        return mergedList;
	    }
}
