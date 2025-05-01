package nobubilt.codesignal.interview.linkedlist;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class LinkedListApalindromeCheckTest {
	   @Test
	    public void test1() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(2);
	        head.next.next.next = new ListNode(1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test2() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(1);

	        assertFalse(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test3() {
	        ListNode head = new ListNode(1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test4() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(2);
	        head.next.next.next.next = new ListNode(1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test5() {
	        ListNode head = new ListNode(-1);
	        head.next = new ListNode(-2);
	        head.next.next = new ListNode(-2);
	        head.next.next.next = new ListNode(-1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test6() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        assertFalse(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test7() {
	        ListNode head = new ListNode(5);
	        head.next = new ListNode(4);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(2);
	        head.next.next.next.next = new ListNode(1);

	        assertFalse(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test8() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(1);
	        head.next.next = new ListNode(1);
	        head.next.next.next = new ListNode(1);
	        head.next.next.next.next = new ListNode(1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test9() {
	        ListNode head = new ListNode(-1);
	        head.next = new ListNode(-1);
	        head.next.next = new ListNode(-1);
	        head.next.next.next = new ListNode(-1);
	        head.next.next.next.next = new ListNode(-1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test10() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(10);
	        head.next.next = new ListNode(100);
	        head.next.next.next = new ListNode(10);
	        head.next.next.next.next = new ListNode(1);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test11() {
	        ListNode head = new ListNode(10);

	        assertTrue(LinkedListApalindromeCheck.isPalindrome(head));
	    }

	    @Test
	    public void test12() {
	        ListNode head = new ListNode(10);
	        head.next = new ListNode(11);

	        assertFalse(LinkedListApalindromeCheck.isPalindrome(head));
	    }
	}

