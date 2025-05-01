package nobubilt.codesignal.interview.hashmap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindPairsWithGivenSumHashMapTest {

    @Test
    public void test1() {
        assertEquals(5, FindPairsWithGivenSumHashMap.sumPairs(new int[]{1, 2, 3, 4, 5}, new int[]{5, 6, 7, 8, 9}, 10));
    }

    @Test
    public void test2() {
        assertEquals(2, FindPairsWithGivenSumHashMap.sumPairs(new int[]{1, -2, 3, -4, 5}, new int[]{-5, 6, -7, 8, -9}, -2));
    }

    @Test
    public void test3() {
        assertEquals(25, FindPairsWithGivenSumHashMap.sumPairs(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}, 0));
    }

    @Test
    public void test4() {
        assertEquals(5, FindPairsWithGivenSumHashMap.sumPairs(new int[]{-1000, -500, 0, 500, 1000}, new int[]{1000, 500, 0, -500, -1000}, 0));
    }

    @Test
    public void test5() {
        assertEquals(5, FindPairsWithGivenSumHashMap.sumPairs(new int[]{-100, -200, -300, -400, -500}, new int[]{500, 400, 300, 200, 100}, 0));
    }

    @Test
    public void test6() {
        assertEquals(0, FindPairsWithGivenSumHashMap.sumPairs(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 10}, 10));
    }

    @Test
    public void test7() {
        int[] array1 = new int[1000];
        int[] array2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array1[i] = i + 1;
            array2[i] = -1000 + i;
        }
        assertEquals(999, FindPairsWithGivenSumHashMap.sumPairs(array1, array2, 1));
    }

    @Test
    public void test8() {
        assertEquals(1, FindPairsWithGivenSumHashMap.sumPairs(new int[]{-1, 0, 1}, new int[]{10, -10, 0}, 10));
    }

    @Test
    public void test9() {
        assertEquals(2, FindPairsWithGivenSumHashMap.sumPairs(new int[]{500, -500}, new int[]{500, -500}, 0));
    }

    @Test
    public void test10() {
        assertEquals(16, FindPairsWithGivenSumHashMap.sumPairs(new int[]{1, 1, 1, 1}, new int[]{9, 9, 9, 9}, 10));
    }
}
