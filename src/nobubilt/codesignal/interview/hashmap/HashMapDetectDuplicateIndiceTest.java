package nobubilt.codesignal.interview.hashmap;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class HashMapDetectDuplicateIndiceTest {
    @Test
    public void test1() {
        assertFalse(HashMapDetectDuplicateIndice.solution(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void test2() {
        assertFalse(HashMapDetectDuplicateIndice.solution(new int[]{1}, 1));
    }

    @Test
    public void test3() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{4, 3, 4}, 2));
    }

    @Test
    public void test4() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{-7, 9, -7}, 3));
    }

    @Test
    public void test5() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{-100, 100, -100}, 3));
    }

    @Test
    public void test6() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{0, 0, 0}, 1));
    }

    @Test
    public void test7() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{3498, 323, -202, -202, -123, -439438}, 3));
    }

    @Test
    public void test8() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{1, 2, 3, 4, 5, 1}, 5));
    }

    @Test
    public void test9() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{1, 2, 3, 4, 5, 1}, 6));
    }

    @Test
    public void test10() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{1, 2, 3, 3, 5, 6}, 1));
    }

    @Test
    public void test11() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1)); // 5000 elements with the value of 1
    }

    @Test
    public void test12() {
        int[] largeArray = new int[5000];
        for (int i = 0; i < 5000; i++) largeArray[i] = i;
        assertFalse(HashMapDetectDuplicateIndice.solution(largeArray, 5000));
    }

    @Test
    public void test13() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000}, 2000)); // 5000 elements with the value of 10^9
    }

    @Test
    public void test14() {
        assertTrue(HashMapDetectDuplicateIndice.solution(new int[]{-1000000000, 1000000000, -1000000000, 1000000000, -1000000000, 1000000000}, 1000)); // alternates -10^9 and 10^9 for 2500 pairs
    }
}