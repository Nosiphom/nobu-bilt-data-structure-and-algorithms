package nobubilt.codesignal.interview.linkedlist;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SwappingNodesInLinkedListTest {


    private ListNode createLinkedListFromArray(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] extractLinkedListValues(ListNode head) {
        int[] values = new int[100]; // Assume maximum list length for simplicity
        int index = 0;
        while (head != null) {
            values[index++] = head.val;
            head = head.next;
        }
        int[] result = new int[index];
        System.arraycopy(values, 0, result, 0, index);
        return result;
    }

    @Test
    public void test1() {
        ListNode head = createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 4));
        assertEquals(java.util.Arrays.toString(new int[]{5, 2, 3, 4, 1}), java.util.Arrays.toString(result));
    }

    @Test
    public void test2() {
        ListNode head = createLinkedListFromArray(new int[]{5, 4, 3, 2, 1});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 1, 3));
        assertEquals(java.util.Arrays.toString(new int[]{5, 2, 3, 4, 1}), java.util.Arrays.toString(result));
    }

    @Test
    public void test3() {
        ListNode head = createLinkedListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 8));
        assertEquals(java.util.Arrays.toString(new int[]{9, 2, 3, 4, 5, 6, 7, 8, 1}), java.util.Arrays.toString(result));
    }

    @Test
    public void test4() {
        ListNode head = createLinkedListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 3, 5));
        assertEquals(java.util.Arrays.toString(new int[]{1, 2, 3, 6, 5, 4, 7, 8, 9}), java.util.Arrays.toString(result));
    }

    @Test
    public void test5() {
        ListNode head = createLinkedListFromArray(new int[]{1, 2, 3});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 2));
        assertEquals(java.util.Arrays.toString(new int[]{3, 2, 1}), java.util.Arrays.toString(result));
    }

    @Test
    public void test6() {
        ListNode head = createLinkedListFromArray(new int[]{1, 2, 3});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 1, 1));
        assertEquals(java.util.Arrays.toString(new int[]{1, 2, 3}), java.util.Arrays.toString(result));
    }

    @Test
    public void test7() {
        ListNode head = createLinkedListFromArray(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 0});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 9));
        assertEquals(java.util.Arrays.toString(new int[]{0, -8, -7, -6, -5, -4, -3, -2, -1, -9}), java.util.Arrays.toString(result));
    }

    @Test
    public void test8() {
        ListNode head = createLinkedListFromArray(new int[]{2});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 0));
        assertEquals(java.util.Arrays.toString(new int[]{2}), java.util.Arrays.toString(result));
    }

    @Test
    public void test9() {
        ListNode head = createLinkedListFromArray(new int[]{-5, 0, 5});
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 2));
        assertEquals(java.util.Arrays.toString(new int[]{5, 0, -5}), java.util.Arrays.toString(result));
    }

    @Test
    public void test10() {
        ListNode head = createLinkedListFromArray(java.util.stream.IntStream.range(1, 101).toArray());
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 0, 99));
        int[] expected = new int[100];
        expected[0] = 100;
        for (int i = 1; i < 100; i++) {
            if (i == 99) {
                expected[i] = 1;
            } else {
                expected[i] = i + 1;
            }
        }
        assertEquals(java.util.Arrays.toString(expected), java.util.Arrays.toString(result));
    }

    @Test
    public void test11() {
        ListNode head = createLinkedListFromArray(java.util.stream.IntStream.range(1, 101).toArray());
        int[] result = extractLinkedListValues(SwappingNodesInLinkedList.swapLinkedListNodes(head, 50, 50));
        int[] expected = java.util.stream.IntStream.range(1, 101).toArray();
        assertEquals(java.util.Arrays.toString(expected), java.util.Arrays.toString(result));
    }
}
