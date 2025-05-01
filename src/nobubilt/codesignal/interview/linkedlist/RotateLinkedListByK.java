package nobubilt.codesignal.interview.linkedlist;

public class RotateLinkedListByK {
/**
 * You are given a singly linked list and an integer k. Your task is to write a 
 * Java function, rotateRight(ListNode head, int k), which rotates the linked list 
 * to the right by k places. Note that k might be 0 or greater than the length 
 * of the linked list.

Your function should take the last k nodes from the end of the list and move them 
to the start of the list, maintaining their original order. After the rotation, 
return the head of the resulting linked list.

For instance, if the linked list is 1 -> 2 -> 3 -> 4 -> 5 and k = 2, after the 
rotation, it should become 4 -> 5 -> 1 -> 2 -> 3.
The expected time complexity for your solution is O(n).
 */
   
    public ListNode rotateRight(ListNode head, int k) {
        // TODO: Implement the solution here.  
        int size = 0;
        ListNode current = head;
        while(current != null)
        {
            ++size;
            current = current.next;
        }
        k = k%size;
        if(k == 0){return head;}
        int delta = size -k;
        ListNode rightSide = head;
        ListNode leftDummy = new ListNode(0);
        leftDummy.next = head;
        ListNode leftSide = leftDummy;
        for(int inx = 0; inx < delta; inx++)
        {
            rightSide = rightSide.next;  // rightSide = 4 5
            leftSide = leftSide.next;  // leftSide 3 4 5
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = rightSide;   // 0 4 5
        // leftDummy 0, 1, 2, 3 u cut off 4  5 by moving the left pointer along 
        //& setting null
        leftSide.next = null;
        ListNode tail = rightSide; // 4 5
        while(tail != null &&  tail.next != null)
        {
            tail = tail.next;
        }
        if(tail != null)  // 5
        {
           tail.next = leftDummy.next;     // 5->    1, 2, 3     
        }
        return dummyNode.next; //  4 5 1, 2, 3 
    }

}
