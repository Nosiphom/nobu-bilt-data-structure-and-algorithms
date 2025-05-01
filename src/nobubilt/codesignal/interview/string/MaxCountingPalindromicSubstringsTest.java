package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxCountingPalindromicSubstringsTest {

	  @Test
	    public void test1() {
	        assertEquals(2, MaxCountingPalindromicSubstrings.countPalindromes("madamargentinamanitnegra", 5));
	    }

	    @Test
	    public void test2() {
	        assertEquals(1, MaxCountingPalindromicSubstrings.countPalindromes("racecar", 7));
	    }

	    @Test
	    public void test3() {
	        assertEquals(5, MaxCountingPalindromicSubstrings.countPalindromes("abcba", 1));
	    }

	    @Test
	    public void test4() {
	        assertEquals(1, MaxCountingPalindromicSubstrings.countPalindromes("a", 1));
	    }

	    @Test
	    public void test5() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("level", 2));
	    }

	    @Test
	    public void test6() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcd", 2));
	    }

	    @Test
	    public void test7() {
	        assertEquals(4, MaxCountingPalindromicSubstrings.countPalindromes("abcd", 1));
	    }

	    @Test
	    public void test8() {
	        assertEquals(1, MaxCountingPalindromicSubstrings.countPalindromes("racecar", 3));
	    }

	    @Test
	    public void test9() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("tocat", 5));
	    }

	    @Test
	    public void test10() {
	        assertEquals(1, MaxCountingPalindromicSubstrings.countPalindromes("abcdabcdabcddcba", 4));
	    }

	    @Test
	    public void test11() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("python", 2));
	    }

	    @Test
	    public void test12() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcdabcabcabcdabc", 3));
	    }

	    @Test
	    public void test13() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcdabcabcabcdabc", 4));
	    }

	    @Test
	    public void test14() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcdabcabcabcdabc", 5));
	    }

	    @Test
	    public void test15() {
	        assertEquals(1, MaxCountingPalindromicSubstrings.countPalindromes("abcdefghijklmnonmlkjihgfedcba", 5));
	    }

	    @Test
	    public void test16() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcdefghijklmnonmlkjihgfedcba", 26));
	    }

	    @Test
	    public void test17() {
	        assertEquals(1, MaxCountingPalindromicSubstrings.countPalindromes("abcdefghihgfedcba", 17));
	    }

	    @Test
	    public void test18() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcd", 5));
	    }

	    @Test
	    public void test19() {
	        assertEquals(0, MaxCountingPalindromicSubstrings.countPalindromes("abcdeedcba", 9));
	    }

	    @Test
	    public void test20() {
	        assertEquals(3, MaxCountingPalindromicSubstrings.countPalindromes("noonxnoonxnoon", 4));
	    }

	    @Test
	    public void test21() {
	        assertEquals(2, MaxCountingPalindromicSubstrings.countPalindromes("abaccabacca", 4));
	    }

	    @Test
	    public void test22() {
	        assertEquals(4, MaxCountingPalindromicSubstrings.countPalindromes("aabaaabaaa", 3));
	    }

	    @Test
	    public void test23() {
	        assertEquals(3, MaxCountingPalindromicSubstrings.countPalindromes("xyzyxyzy", 3));
	    }

	    @Test
	    public void test24() {
	        assertEquals(5, MaxCountingPalindromicSubstrings.countPalindromes("ababababa", 5));
	    }

	    @Test
	    public void test25() {
	        assertEquals(4, MaxCountingPalindromicSubstrings.countPalindromes("ababbbabba", 3));
	    }

	    @Test
	    public void test26() {
	        assertEquals(7, MaxCountingPalindromicSubstrings.countPalindromes("eeeeeeee", 2));
	    }

	    @Test
	    public void test27() {
	        assertEquals(2, MaxCountingPalindromicSubstrings.countPalindromes("racecarxeracecar", 7));
	    }

	    @Test
	    public void test28() {
	        assertEquals(5, MaxCountingPalindromicSubstrings.countPalindromes("xanaxxyxanaxyxana", 3));
	    }

	    @Test
	    public void test29() {
	        assertEquals(5, MaxCountingPalindromicSubstrings.countPalindromes("bbbbb", 1));
	        assertEquals(4, MaxCountingPalindromicSubstrings.countPalindromes("bbbbb", 2));
	        assertEquals(3, MaxCountingPalindromicSubstrings.countPalindromes("bbbbb", 3));
	    }
	}
