package nobubilt.codesignal.interview.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoDescendingSortedLists {
/**
 * You are given two sorted lists in ascending order, each containing n integers. 
 * Your task is to merge these two lists into a new list such that:
The resulting list is sorted in descending order. If there are duplicate 
elements in the two lists, they should be merged so that each duplicate 
appears only once in the final list. For instance, if you are given two 
lists, [1, 2, 3, 4, 5] and [3, 4, 5, 6, 7], your function 
should return [7, 6, 5, 4, 3, 2, 1] as the merged list.
 * @param list1
 * @param list2
 * @return
 */
	 public static List<Integer> mergeSortedListsDescendingUnique(List<Integer> list1, List<Integer> list2) {
        // TODO: Implement the function
        List<Integer> mergedList = new ArrayList<>();
        int l1Inx = 0;
        int l2Inx = 0;
        int len1 = list1.size();
        int len2 = list2.size();
        while(l1Inx < len1 && l2Inx < len2)
        {
             if(list1.get(l1Inx) < list2.get(l2Inx))
            {
                mergedList.add(list1.get(l1Inx));
                ++l1Inx;
            }
            else if( list2.get(l2Inx) < list1.get(l1Inx))
            {
                mergedList.add(list2.get(l2Inx));
                ++l2Inx;
            }
            else if(list1.get(l1Inx) == list2.get(l2Inx))
            {
                int commonVal = list1.get(l1Inx);
                mergedList.add(commonVal);
                while(l1Inx < len1 && list1.get(l1Inx) == commonVal)
                {
                    ++l1Inx;
                }
                while(l2Inx < len2 && list2.get(l2Inx) == commonVal)
                {
                    ++l2Inx;
                }
            }      
        }
        System.out.println("l1Inx: " + l1Inx +  "  l2Inx: " + l2Inx);
        if(l1Inx < len1)
        {
            mergedList.addAll(list1.subList(l1Inx , len1));
        }
         if(l2Inx < len2)
        {
            mergedList.addAll(list2.subList(l2Inx , len2));
        }
        Collections.reverse(mergedList);
        return mergedList;
    }
}
