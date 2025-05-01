package nobubilt.codesignal.interview.hashmap;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapFindAnagramsInStringListTest {

	 @Test
	    public void test1() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("act", "cat", "tac"),
	            Arrays.asList("dog", "god")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"cat", "dog", "tac", "god", "act"}));
	    }

	    @Test
	    public void test2() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{""}));
	    }

	    @Test
	    public void test3() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("z", "z")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"z", "z"}));
	    }

	    @Test
	    public void test4() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("apple", "papel"),
	            Arrays.asList("dog", "god"),
	            Arrays.asList("food"),
	            Arrays.asList("good"),
	            Arrays.asList("tac")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"apple", "papel", "dog", "tac", "god", "good", "food"}));
	    }

	    @Test
	    public void test5() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("aimcne", "cinema", "iceman")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"cinema", "iceman", "aimcne"}));
	    }

	    @Test
	    public void test6() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("a")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"a"}));
	    }

	    @Test
	    public void test7() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("ab", "ba"),
	            Arrays.asList("abc", "bac", "cab"),
	            Arrays.asList("bad")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"ab", "ba", "abc", "cab", "bac", "bad"}));
	    }

	    @Test
	    public void test8() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("abcd", "dcba"),
	            Arrays.asList("jkl", "kjl", "lkj"),
	            Arrays.asList("llkj")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"abcd", "dcba", "llkj", "jkl", "lkj", "kjl"}));
	    }
	       
	    @Test
	    public void test9() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("xyz", "xzy", "yxz", "yxz", "zxy", "zyx")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"xyz", "zyx", "zxy", "xzy", "yxz", "yxz"}));
	    }

	    @Test
	    public void test10() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("hello", "loleh"),
	            Arrays.asList("helo", "oleh"),
	            Arrays.asList("lol", "oll")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"hello", "loleh", "lol", "oll", "helo", "oleh"}));
	    }

	    @Test
	    public void test11() {
	        List<List<String>> expected = Arrays.asList(
	            Arrays.asList("ball"), 
	            Arrays.asList("lab"),
	            Arrays.asList("llaab")
	        );
	        assertEquals(expected, HashMapFindAnagramsInStringList.findAnagrams(new String[]{"ball", "lab", "llaab"}));
	    }
	}
