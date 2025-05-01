package nobubilt.codesignal.interview.priorityqueue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MinHeapFindKshortestStringsInListTest {


    @Test
    public void test1() {
        List<String> strings = Arrays.asList("hello", "world", "python", "programming", "code", "keyboard", "computer", "algorithm", "software", "engineering");
        List<String> expected = Arrays.asList("code", "hello", "world");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 3));
    }

    @Test
    public void test2() {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 5));
    }

    @Test
    public void test3() {
        List<String> strings = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj");
        List<String> expected = Arrays.asList("aa", "bb", "cc", "dd");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 4));
    }

    @Test
    public void test4() {
        List<String> strings = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz");
        List<String> expected = Arrays.asList("yz", "abc", "def", "ghi");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 4));
    }

    @Test
    public void test5() {
        List<String> strings = Arrays.asList("an", "interesting", "array", "of", "strings", "to", "sort");
        List<String> expected = Arrays.asList("an");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 1));
    }

    @Test
    public void test6() {
        List<String> strings = Arrays.asList("duplicate", "duplicate", "duplicate", "a", "b", "c", "d");
        List<String> expected = Arrays.asList("a", "b");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 2));
    }

    @Test
    public void test7() {
        List<String> strings = Arrays.asList("the", "last", "string");
        List<String> expected = Arrays.asList("the");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 1));
    }

    @Test
    public void test8() {
        List<String> strings = Arrays.asList("this", "is", "a", "quite", "long", "list", "of", "strings", "that", "we", "need", "to", "sort", "based", "on", "their", "lengths");
        List<String> expected = Arrays.asList("a", "is", "of", "we", "to", "on", "this", "long");
        assertEquals(expected, MinHeapFindKshortestStringsInList.findKShortest(strings, 8));
    }
}
