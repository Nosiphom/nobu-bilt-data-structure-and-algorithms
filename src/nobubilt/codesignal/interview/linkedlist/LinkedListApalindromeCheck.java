package nobubilt.codesignal.interview.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListApalindromeCheck {

/**
 * You are given a singly linked list, and your task is to determine whether the linked list 
 * is a palindrome or not. A linked list is a palindrome if it reads the same forward and backward.

Implement a function isPalindrome(ListNode head) that takes a head node of a singly linked list 
(which is the first node in the list) and returns true if the linked list is a palindrome and 
false otherwise. The expected time complexity for your solution is O(n).

For example, a linked list with the following nodes: 1 -> 2 -> 3 -> 2 -> 1 would return true 
as it is a palindrome; however, for 1 -> 2 -> 3 -> 4, the function would return false because 
it doesn't read the same in both directions.
 */
	 
	  public static boolean isPalindrome(ListNode head) {
	        // TODO: implement solution
	        if(head == null){return false;}
	        List<Integer> list = new ArrayList<>();
	        ListNode current = head;
	        while(current != null)
	        {
	            list.add(current.val);
	            current = current.next;
	        }
	        int left = 0;
	        int right = list.size()-1;
	        while(left < right)
	        {
	            if(list.get(left) != list.get(right))
	            {
	                return false;
	            }
	            ++left;
	            --right;
	        }
	        
	        return true;
	    }
	}
