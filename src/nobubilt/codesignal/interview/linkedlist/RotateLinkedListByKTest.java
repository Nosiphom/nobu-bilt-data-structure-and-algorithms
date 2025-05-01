package nobubilt.codesignal.interview.linkedlist;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RotateLinkedListByKTest {

	   // No need to redefine ListNode here, use the ListNode from the solution package 

    private RotateLinkedListByK solution = new RotateLinkedListByK();

    private ListNode constructListNode(int[] values) {
        ListNode currentNode = new ListNode(values[values.length - 1]);
        for (int i = values.length - 2; i >= 0; i--) {
            ListNode newNode = new ListNode(values[i]);
            newNode.next = currentNode;
            currentNode = newNode;
        }
        return currentNode;
    }

    private List<Integer> convertToList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list;
    }

    @Test
    public void test1() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.rotateRight(head, 2);
        assertEquals(List.of(4, 5, 1, 2, 3), convertToList(result));
    }

    @Test
    public void test2() {
        ListNode head = constructListNode(new int[]{1});
        ListNode result = solution.rotateRight(head, 0);
        assertEquals(List.of(1), convertToList(result));
    }

    @Test
    public void test3() {
        ListNode head = constructListNode(new int[]{1, 2});
        ListNode result = solution.rotateRight(head, 1);
        assertEquals(List.of(2, 1), convertToList(result));
    }

    @Test
    public void test4() {
        ListNode head = constructListNode(new int[]{1, 2, 3});
        ListNode result = solution.rotateRight(head, 2);
        assertEquals(List.of(2, 3, 1), convertToList(result));
    }

    @Test
    public void test5() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4});
        ListNode result = solution.rotateRight(head, 3);
        assertEquals(List.of(2, 3, 4, 1), convertToList(result));
    }

    @Test
    public void test6() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.rotateRight(head, 4);
        assertEquals(List.of(2, 3, 4, 5, 1), convertToList(result));
    }

    @Test
    public void test7() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.rotateRight(head, 5);
        assertEquals(List.of(1, 2, 3, 4, 5), convertToList(result));
    }

    @Test
    public void test8() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.rotateRight(head, 6);
        assertEquals(List.of(5, 1, 2, 3, 4), convertToList(result));
    }

    @Test
    public void test9() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.rotateRight(head, 7);
        assertEquals(List.of(4, 5, 1, 2, 3), convertToList(result));
    }

    @Test
    public void test10() {
        ListNode head = constructListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.rotateRight(head, 1001);
        assertEquals(List.of(5, 1, 2, 3, 4), convertToList(result));
    }

    @Test
    public void test11() {
        ListNode head = constructListNode(new int[]{1});
        ListNode result = solution.rotateRight(head, 999);
        assertEquals(List.of(1), convertToList(result));
    }
    
    @Test
    public void test12() {
        ListNode head = constructListNode(new int[]{1, 2});
        ListNode result = solution.rotateRight(head, 1002);
        assertEquals(List.of(1, 2), convertToList(result));
    }

    @Test
    public void test13() {
        ListNode head = constructListNode(new int[]{1, 1, 1, 1, 2, 2, 2});
        ListNode result = solution.rotateRight(head, 3);
        assertEquals(List.of(2, 2, 2, 1, 1, 1, 1), convertToList(result));
    }

    @Test
    public void test14() {
        ListNode head = constructListNode(new int[]{5, 5, 5, 4, 4, 4});
        ListNode result = solution.rotateRight(head, 2);
        assertEquals(List.of(4, 4, 5, 5, 5, 4), convertToList(result));
    }
}
