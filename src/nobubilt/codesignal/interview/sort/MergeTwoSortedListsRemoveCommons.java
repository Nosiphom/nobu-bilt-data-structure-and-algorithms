package nobubilt.codesignal.interview.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedListsRemoveCommons {
/**
 * Imagine you are given two sorted lists of integers, list1 and list2. Your task is to write 
 * a Java function that will return a new sorted list that comprises elements from 
 * list1 and list2, but without any common elements in both lists. This new list must 
 * also be sorted in ascending order.
For instance, if you are given list1 = [2, 5, 7, 10] and list2 = [1, 5, 9], your function 
removeCommonElements(Arrays.asList(2, 5, 7, 10), Arrays.asList(1, 5, 9)) should 
return [1, 2, 7, 9, 10] because 5 is a common element in both lists and should be removed.

Hint: Use the two-pointer approach to solve this task efficiently.
 * @param list1
 * @param list2
 * @return
 */
	 public static List<Integer> removeCommonElements(List<Integer> list1, List<Integer> list2) {
	        // TODO: Implement the function here
	        List<Integer> mergedList = new ArrayList<>();
	        int inx1 = 0;
	        int inx2 = 0;
	        int len1 = list1.size();
	        int len2 = list2.size();
	        while(inx1 < len1 && inx2 < len2)
	        {
	            if(list1.get(inx1) < list2.get(inx2))
	            {
	                mergedList.add(list1.get(inx1));
	                ++inx1;
	            }
	            else if(list2.get(inx2) < list1.get(inx1))
	            {
	                mergedList.add(list2.get(inx2));
	                ++inx2;
	            }
	            else if(list1.get(inx1) == list2.get(inx2))
	            {
	                int commonValue = list1.get(inx1);
	                while(inx1 < len1 && list1.get(inx1) == commonValue)
	                {
	                    ++inx1;
	                }
	                while(inx2 < len2 && list2.get(inx2) == commonValue)
	                {
	                    ++inx2;
	                }
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
