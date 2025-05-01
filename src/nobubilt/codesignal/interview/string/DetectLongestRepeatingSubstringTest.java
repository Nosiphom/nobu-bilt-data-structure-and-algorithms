package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DetectLongestRepeatingSubstringTest {

	  @Test
	    public void test1() {
	        assertEquals("ab", DetectLongestRepeatingSubstring.repeatSubstring("ababab"));
	    }

	    @Test
	    public void test2() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("abcab"));
	    }

	    @Test
	    public void test3() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("abcdefg"));
	    }

	    @Test
	    public void test4() {
	        assertEquals("zz", DetectLongestRepeatingSubstring.repeatSubstring("zzzz"));
	    }

	    @Test
	    public void test5() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("#$#$$$#$#"));
	    }

	    @Test
	    public void test6() {
	        assertEquals("Python", DetectLongestRepeatingSubstring.repeatSubstring("PythonPythonPython"));
	    }

	    @Test
	    public void test7() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("0"));
	    }

	    @Test
	    public void test8() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("10011001100110011"));
	    }

	    @Test
	    public void test9() {
	        assertEquals("qwerty", DetectLongestRepeatingSubstring.repeatSubstring("qwertyqwertyqwerty"));
	    }

	    @Test
	    public void test10() {
	        assertEquals("aaaaa", DetectLongestRepeatingSubstring.repeatSubstring("aaaaaaaaaa"));
	    }

	    @Test
	    public void test11() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("abababcbcbcbc"));
	    }

	    @Test
	    public void test12() {
	        assertEquals("abab", DetectLongestRepeatingSubstring.repeatSubstring("abababab"));
	    }

	    @Test
	    public void test13() {
	        assertEquals("11111", DetectLongestRepeatingSubstring.repeatSubstring("1111111111"));
	    }

	    @Test
	    public void test14() {
	        assertEquals("xyzxyzxyz", DetectLongestRepeatingSubstring.repeatSubstring("xyzxyzxyzxyzxyzxyz"));
	    }

	    @Test
	    public void test15() {
	        assertEquals("a".repeat(5000), DetectLongestRepeatingSubstring.repeatSubstring("a".repeat(10000)));
	    }

	    @Test
	    public void test16() {
	        assertEquals("bmbmbmbmbmbmbmbmbmbmb", DetectLongestRepeatingSubstring.repeatSubstring("bmbmbmbmbmbmbmbmbmbmbbmbmbmbmbmbmbmbmbmbmb"));
	    }

	    @Test
	    public void test17() {
	        assertEquals("lololo", DetectLongestRepeatingSubstring.repeatSubstring("lololololololololo"));
	    }

	    @Test
	    public void test18() {
	        assertEquals("abcdefghij", DetectLongestRepeatingSubstring.repeatSubstring("abcdefghijabcdefghijabcdefghij"));
	    }

	    @Test
	    public void test19() {
	        assertEquals("", DetectLongestRepeatingSubstring.repeatSubstring("y".repeat(999) + "z"));
	    }

	    @Test
	    public void test20() {
	        assertEquals("tut", DetectLongestRepeatingSubstring.repeatSubstring("tuttuttuttuttut"));
	    }
	}
