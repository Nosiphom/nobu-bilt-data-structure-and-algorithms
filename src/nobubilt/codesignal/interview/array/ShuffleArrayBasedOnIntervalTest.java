package nobubilt.codesignal.interview.array;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ShuffleArrayBasedOnIntervalTest {


    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 2, 1, 6, 5, 4, 7}, ShuffleArrayBasedOnInterval.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1}, ShuffleArrayBasedOnInterval.solution(new int[]{1}, 1));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{3, 2}, ShuffleArrayBasedOnInterval.solution(new int[]{2, 3}, 2));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{50, 40, 30, 20, 10, 70, 60}, ShuffleArrayBasedOnInterval.solution(new int[]{10, 20, 30, 40, 50, 60, 70}, 5));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{-4, -5, -6, -7, -1, -2, -3}, ShuffleArrayBasedOnInterval.solution(new int[]{-7, -6, -5, -4, -3, -2, -1}, 4));
    }

    @Test
    public void test6() {
        assertArrayEquals(new int[]{70, 60, 50, 40, 30, 20, 10}, ShuffleArrayBasedOnInterval.solution(new int[]{10, 20, 30, 40, 50, 60, 70}, 10));
    }

    @Test
    public void test7() {
        assertArrayEquals(new int[]{100, -100, 100, -100, -100}, ShuffleArrayBasedOnInterval.solution(new int[]{-100, 100, -100, 100, -100}, 2));
    }

    @Test
    public void test8() {
        assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1, 10, 9, 8}, ShuffleArrayBasedOnInterval.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7));
    }

    @Test
    public void test9() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ShuffleArrayBasedOnInterval.solution(new int[]{1, 2, 3, 4, 5, 6}, 1));
    }
}
