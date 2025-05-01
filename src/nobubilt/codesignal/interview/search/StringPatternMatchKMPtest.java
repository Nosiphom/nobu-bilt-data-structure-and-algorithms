package nobubilt.codesignal.interview.search;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class StringPatternMatchKMPtest {

	  @Test
	    public void test1() {
	        List<String> texts = Arrays.asList("abcabcdabcde", "abcdabcabcde", "abcdfghabcdef");
	        List<Integer> expected = Arrays.asList(0, 0, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abc"));
	    }
	    
	    @Test
	    public void test2() {
	        List<String> texts = Arrays.asList("xyz", "abc", "defgh");
	        List<Integer> expected = Arrays.asList(-1, 0, -1);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abc"));
	    }
	    
	    @Test
	    public void test3() {
	        List<String> texts = Arrays.asList("abcabcabc", "abcabcabc", "abababcabc");
	        List<Integer> expected = Arrays.asList(0, 0, 4);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abc"));
	    }
	    
	    @Test
	    public void test4() {
	        List<String> texts = Arrays.asList("ggggggg", "ghjklo", "fghpo");
	        List<Integer> expected = Arrays.asList(-1, -1, -1);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abc"));
	    }
	    
	    @Test
	    public void test5() {
	        List<String> texts = Arrays.asList("abcdefgh", "abcdefgh");
	        List<Integer> expected = Arrays.asList(0, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abc"));
	    }
	    
	    @Test
	    public void test6() {
	        List<String> texts = Arrays.asList();
	        List<Integer> expected = Arrays.asList();
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abc"));
	    }
	    
	    @Test
	    public void test7() {
	        List<String> texts = Arrays.asList("ababc", "ababc");
	        List<Integer> expected = Arrays.asList(0, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "ab"));
	    }
	    
	    @Test
	    public void test8() {
	        List<String> texts = Arrays.asList("mississippi", "ippiisspiimissi");
	        List<Integer> expected = Arrays.asList(1, 11);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "issi"));
	    }
	    
	    @Test
	    public void test9() {
	        List<String> texts = Arrays.asList("a".repeat(1000), "a".repeat(1000) + "b");
	        List<Integer> expected = Arrays.asList(0, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "a".repeat(10)));
	    }
	    
	    @Test
	    public void test10() {
	        List<String> texts = Arrays.asList("aaaa", "aabb", "xxx", "yyy", "zzz", "xyy");
	        List<Integer> expected = Arrays.asList(0, 0, -1, -1, -1, -1);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "aa"));
	    }
	    
	    @Test
	    public void test11() {
	        List<String> texts = Arrays.asList("a".repeat(100) + "b" + "a".repeat(100));
	        List<Integer> expected = Arrays.asList(100);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "b"));
	    }
	    
	    @Test
	    public void test12() {
	        List<String> texts = Arrays.asList("", "", "");
	        List<Integer> expected = Arrays.asList(-1, -1, -1);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "pat"));
	    }
	    
	    @Test
	    public void test13() {
	        List<String> texts = Arrays.asList("patterninmiddle", "midpattern", "patternend");
	        List<Integer> expected = Arrays.asList(0, 3, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "pattern"));
	    }
	    
	    @Test
	    public void test14() {
	        List<String> texts = Arrays.asList("abababab", "bababa", "ababab");
	        List<Integer> expected = Arrays.asList(0, 1, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abab"));
	    }
	    
	    @Test
	    public void test15() {
	        List<String> texts = Arrays.asList("abcdefghij", "ghijabcdef", "defghij");
	        List<Integer> expected = Arrays.asList(3, -1, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "defg"));
	    }
	    
	    @Test
	    public void test16() {
	        List<String> texts = Arrays.asList("abccbaabccba", "aaabbbaaa", "bbbaaa", "cccbbb", "aaaa");
	        List<Integer> expected = Arrays.asList(-1, 0, 3, -1, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "aaa"));
	    }
	    
	    @Test
	    public void test17() {
	        List<String> texts = Arrays.asList("abcabcabcabc", "abcabcabcabc", "abcabcabcabc");
	        List<Integer> expected = Arrays.asList(0, 0, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "abcabc"));
	    }
	    
	    @Test
	    public void test18() {
	        List<String> texts = Arrays.asList("qwertyuiop", "zxcvbnmasd", "lkjhgfdsqwert");
	        List<Integer> expected = Arrays.asList(1, -1, 9);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "wert"));
	    }
	    
	    @Test
	    public void test19() {
	        List<String> texts = Arrays.asList("testtesting", "testingtest", "test");
	        List<Integer> expected = Arrays.asList(0, 0, 0);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "test"));
	    }
	    
	    @Test
	    public void test20() {
	        List<String> texts = Arrays.asList("nomatch", "anotherone", "thisonetoo");
	        List<Integer> expected = Arrays.asList(-1, -1, -1);
	        assertEquals(expected, StringPatternMatchKMP.findPatternInTexts(texts, "nomatchhere"));
	    }
	}
