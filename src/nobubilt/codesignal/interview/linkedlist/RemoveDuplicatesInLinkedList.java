package nobubilt.codesignal.interview.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInLinkedList {

/**
 * Your task is to write a function, removeDuplicates(ListNode head). This function takes the 
 * head of a linked list as a parameter. The function should remove all duplicate nodes from 
 * an unsorted linked list and return the head of the updated linked list. The order of the 
 * remaining nodes in the list should be the same as in the original.

In other words, if a linked list has duplicate values, all occurrences of such values, 
except for their first occurrence, must be deleted from the list. For instance, for the 
given linked list 1 -> 3 -> 2 -> 3 -> 2 -> 3 -> 4 -> 5 -> 5 -> 5 you should 
return 1 -> 3 -> 2 -> 4 -> 5.
 * @param head
 * @return
 */
	 
	 public static ListNode removeDuplicates(ListNode head) {
	        // TODO: implement the solution in O(n) complexity
	                     // 1 -> 3 -> 2 -> 3 -> 2 -> 3 -> 4 -> 5 -> 5 -> 5
	        Set<Integer> uniqueSet = new HashSet<>();
	        ListNode current = head;
	        ListNode prevNode = head;
	     
	        uniqueSet.add(current.val);
	        while(current != null)
	        {
	        	if(current != null && uniqueSet.contains(current.val))
	        	{
	        		prevNode.next = current.next;
	        	}
	        	else
	        	{
	        		uniqueSet.add(current.val);
	        		prevNode = current;
	        	}
	        	current = current.next;
	        }
	        return head;
	    }
}
