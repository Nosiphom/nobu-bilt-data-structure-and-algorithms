package nobubilt.codesignal.interview.linkedlist;

public class SwappingNodesInLinkedList {
	/**
	 * You are given a singly linked list and two indices, start and end (both indices 
	 * are 0-based). Write a Java function 
	 * swapLinkedListNodes(ListNode head, int start, int end) that swaps the nodes of 
	 * the linked list at these two provided indices. The function should return the 
	 * head node of the modified linked list. When swapping, you should only change the 
	 * next property of a node, not the actual node values. It is guaranteed that 
	 * start <= end.

For example, consider the linked list 1 -> 2 -> 3 -> 4 -> 5 and you are given start = 1
 and end = 3. The resulting linked list after swapping nodes at indices 1 and 3 would 
 be: 1 -> 4 -> 3 -> 2 -> 5
The expected time complexity of your solution should be O(n), where n is the length of 
the linked list.
You have a linked list and need to swap two nodes at specific indices, start and end.  
	 */	

	public static ListNode swapLinkedListNodes(ListNode head, int start, int end) {
        // TODO: implement
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prevNodeOfStart = dummyNode;
        ListNode prevNodeOfEnd = dummyNode;
        for(int inx = 0; inx < start; inx++)
        {
            prevNodeOfStart = prevNodeOfStart.next; // 1
        }
        for(int inx = 0; inx < end; inx++ )
        {
            prevNodeOfEnd = prevNodeOfEnd.next; // 3
        }
        
        ListNode nodeAtStart = prevNodeOfStart.next; // 2
        ListNode nodeAtEnd = prevNodeOfEnd.next;    //4
        
        ListNode nextNodeAfterEnd  = nodeAtEnd.next; // 5
        prevNodeOfStart.next = nodeAtEnd; // 1->4
        nodeAtEnd.next = nodeAtStart.next;// 4-> 3
        prevNodeOfEnd.next = nodeAtStart; // 3 ->2
        nodeAtStart.next = nextNodeAfterEnd; // 2 -> 5
        return dummyNode.next;
    }
}
