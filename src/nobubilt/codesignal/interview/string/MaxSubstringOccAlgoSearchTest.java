package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxSubstringOccAlgoSearchTest {

    @Test
    public void test1() {
        assertEquals(2, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abrakadabraka", 3));
    }

    @Test
    public void test2() {
        assertEquals(2, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("mississippi", 2));
    }

    @Test
    public void test3() {
        assertEquals(3, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("aaa", 1));
    }

    @Test
    public void test4() {
        assertEquals(1, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("a", 1));
    }

    @Test
    public void test5() {
        assertEquals(1, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcdefg", 3));
    }

    @Test
    public void test6() {
        assertEquals(3, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("banana", 1));
    }

    @Test
    public void test7() {
        assertEquals(3, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcabcabc", 3));
    }

    @Test
    public void test8() {
        assertEquals(3, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcabcabc", 2));
    }

    @Test
    public void test9() {
        assertEquals(1, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcdefghijklmnopqrstuvwxyz", 5));
    }

    @Test
    public void test10() {
        assertEquals(1, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcdefghijklmnopqrstuvwxyz", 1));
    }

    @Test
    public void test11() {
        assertEquals(5, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcdefghijklmnopqrstuvwxyz".repeat(5), 26));
    }

    @Test
    public void test12() {
        assertEquals(5, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcdefghijklmnopqrstuvwxyz".repeat(5), 10));
    }

    @Test
    public void test13() {
        assertEquals(2, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("repetitionsrepetitions", 10));
    }

    @Test
    public void test14() {
        assertEquals(5, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcabcabcabcabc", 1));
    }

    @Test
    public void test15() {
        assertEquals(5, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcabcabcabcabc", 2));
    }

    @Test
    public void test16() {
        assertEquals(4, MaxSubstringOccAlgoSearch.maxSubstringOccurrences("abcabcabcabcabc", 5));
    }
}
