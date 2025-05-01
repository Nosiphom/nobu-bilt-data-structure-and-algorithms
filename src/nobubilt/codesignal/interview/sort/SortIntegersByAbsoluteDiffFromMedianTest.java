package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortIntegersByAbsoluteDiffFromMedianTest {

	  
    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 2, 4, 1, 5}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{1, 3, 5, 2, 4}));
    }
    
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{1, 2}));
    }
    
    @Test
    public void test4() {
        assertArrayEquals(new int[]{0, -50, 50, -100, 100, -200, 200}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{-100, -200, -50, 0, 50, 100, 200}));
    }
    
    @Test
    public void test5() {
        assertArrayEquals(new int[]{-100000, -10000, -1000, -1000000}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{-1000, -10000, -100000, -1000000}));
    }
    
    @Test
    public void test6() {
        assertArrayEquals(new int[]{2, 3, 1, 4}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{1, 2, 3, 4}));
    }
    
    @Test
    public void test7() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 2, 2, 2, 2}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{1, 1, 1, 1, 2, 2, 2, 2}));
    }

    @Test
    public void test8() {
        assertArrayEquals(new int[]{3, 2, 4, 1, 5}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{3, 5, 1, 2, 4}));
    }
    
    @Test
    public void test9() {
        assertArrayEquals(new int[]{24, 25, 23, 26, 22, 27, 21, 28, 20, 29, 19, 30, 18, 31, 17, 32, 16, 33, 15, 34, 14, 35, 13, 36, 12, 37, 11, 38, 10, 39, 9, 40, 8, 41, 7, 42, 6, 43, 5, 44, 4, 45, 3, 46, 2, 47, 1, 48, 0, 49}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49}));
    }
    
    @Test
    public void test10() {
        assertArrayEquals(new int[]{25, 26, 24, 27, 23, 28, 22, 29, 21, 30, 20, 31, 19, 32, 18, 33, 17, 34, 16, 35, 15, 36, 14, 37, 13, 38, 12, 39, 11, 40, 10, 41, 9, 42, 8, 43, 7, 44, 6, 45, 5, 46, 4, 47, 3, 48, 2, 49, 1, 50}, SortIntegersByAbsoluteDiffFromMedian.sortByMedian(new int[]{50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }
}
