package nobubilt.codesignal.interview.linkedlist;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesInLinkedListTest {


    private List<Integer> linkedListToList(ListNode node) {
        List<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result;
    }

    private ListNode getLinkedList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode currentNode = head;
        for (int i = 1; i < values.length; i++) {
            currentNode.next = new ListNode(values[i]);
            currentNode = currentNode.next;
        }
        return head;
    }
    
    private void compare(int[] inputArr, int[] expectedArr) {
        ListNode inputList = getLinkedList(inputArr);
        ListNode expectedList = getLinkedList(expectedArr);
        assertEquals(linkedListToList(RemoveDuplicatesInLinkedList.removeDuplicates(inputList)), 
                     linkedListToList(expectedList));
    }

    @Test
    public void test1() {
        compare(new int[]{1, 2, 2, 3, 3, 4, 5, 5, 5}, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void test2() {
        compare(new int[]{1, 1, 1, 1}, new int[]{1});
    }

    @Test
    public void test3() {
        compare(new int[]{-1, -1, 2, 2, 3, 3}, new int[]{-1, 2, 3});
    }

    @Test
    public void test4() {
        compare(new int[]{-5, -5, -5, -4, -4, -4, -3, -3}, new int[]{-5, -4, -3});
    }

    @Test
    public void test5() {
        compare(new int[]{1000, 100, 10, 1, 1, 10, 100, 1000}, new int[]{1000, 100, 10, 1});
    }

    @Test
    public void test6() {
        compare(new int[]{34, 35, 35, 36, 37, 37, 37, 38, 39, 39}, new int[]{34, 35, 36, 37, 38, 39});
    }

    @Test
    public void test7() {
        compare(new int[]{0, 0, 0}, new int[]{0});
    }

    @Test
    public void test8() {
        compare(new int[]{100, 100, 200, 200, 300, 300, 400, 400}, new int[]{100, 200, 300, 400});
    }

    @Test
    public void test9() {
        compare(new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5, -5}, new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5, -5});
    }

    @Test
    public void test10() {
        compare(new int[]{10, 20, 10, 30, 20, 40, 30}, new int[]{10, 20, 30, 40});
    }

    @Test
    public void test11() {
        compare(new int[]{5, 15, 25, 5, 35, 25, 45}, new int[]{5, 15, 25, 35, 45});
    }

    @Test
    public void test12() {
        compare(new int[]{7, 8, 9, 8, 10, 9, 11}, new int[]{7, 8, 9, 10, 11});
    }

    @Test
    public void test13() {
        compare(new int[]{1, 4, 5, 4, 1, 6, 5}, new int[]{1, 4, 5, 6});
    }

    @Test
    public void test14() {
        compare(new int[]{0, 2, 4, 2, 6, 4, 8, 6}, new int[]{0, 2, 4, 6, 8});
    }

    @Test
    public void test15() {
        compare(new int[]{9, 7, 5, 3, 7, 1, 9}, new int[]{9, 7, 5, 3, 1});
    }

    @Test
    public void test16() {
        compare(new int[]{100, 200, 300, 100, 400, 300, 500, 200}, new int[]{100, 200, 300, 400, 500});
    }

    @Test
    public void test17() {
        compare(new int[]{50, 60, 70, 80, 90, 60, 70}, new int[]{50, 60, 70, 80, 90});
    }

    @Test
    public void test18() {
        compare(new int[]{21, 31, 41, 21, 51, 31, 61, 41}, new int[]{21, 31, 41, 51, 61});
    }

    @Test
    public void test19() {
        compare(new int[]{13, 23, 33, 13, 43, 23, 53}, new int[]{13, 23, 33, 43, 53});
    }

    @Test
    public void test20() {
        compare(new int[]{89, 78, 89, 67, 56, 45, 67}, new int[]{89, 78, 67, 56, 45});
    }
}
