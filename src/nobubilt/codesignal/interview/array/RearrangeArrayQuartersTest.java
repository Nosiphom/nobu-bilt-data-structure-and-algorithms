package nobubilt.codesignal.interview.array;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RearrangeArrayQuartersTest {


    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{2, 3, 1, 4}, arr);
    }

    @Test
    public void test2() {
        int[] arr = {9, 7, 5, 1, 2, 3, 4};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{7, 5, 1, 2, 3, 9, 4}, arr);
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 3, 4, 6, 7, 9, 11};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{3, 4, 6, 7, 1, 2, 9, 11}, arr);
    }

    @Test
    public void test4() {
        int[] arr = {-100, -50, 0, 50, 100};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{-50, 0, 50, -100, 100}, arr);
    }

    @Test
    public void test5() {
        int[] arr = {5, 10, 15, 20, 25, 30};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{10, 15, 20, 25, 5, 30}, arr);
    }

    @Test
    public void test6() {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{1, 1, 2, 2, 1, 1, 2, 2}, arr);
    }

    @Test
    public void test7() {
        int[] arr = {123, 456, 789, 101112, 131415, 161718, 192021, 222324};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{789, 101112, 131415, 161718, 123, 456, 192021, 222324}, arr);
    }

    @Test
    public void test8() {
        int[] arr = {100, 200, 300, 400, 500, 600, 700, 800};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{300, 400, 500, 600, 100, 200, 700, 800}, arr);
    }

    @Test
    public void test9() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -8};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{-3, -4, -5, -6, -1, -2, -7, -8}, arr);
    }

    @Test
    public void test10() {
        int[] arr = {1000, 2000, 3, 4000, 5000, 6000, 7000, 8000};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{3, 4000, 5000, 6000, 1000, 2000, 7000, 8000}, arr);
    }

    @Test
    public void test11() {
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 5};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 1, 1, 4, 5}, arr);
    }

    @Test
    public void test12() {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{34, 45, 56, 67, 12, 23, 78, 89}, arr);
    }

    @Test
    public void test13() {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{5, 7, 9, 2, 4, 1, 3, 6, 8}, arr);
    }

    @Test
    public void test14() {
        int[] arr = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{-5, -3, -1, 0, 1, 3, 5, -9, -7, 7, 9}, arr);
    }

    @Test
    public void test15() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 1, 6}, arr);
    }

    @Test
    public void test16() {
        int[] arr = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2, 3, -6, -5, -4, 4, 5, 6}, arr);
    }

    @Test
    public void test17() {
        int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{300, 400, 500, 600, 700, 100, 200, 800, 900}, arr);
    }

    @Test
    public void test18() {
        int[] arr = {11, 12, 13, 14, 15, 16};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{12, 13, 14, 15, 11, 16}, arr);
    }

    @Test
    public void test19() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        new RearrangeArrayQuarters().rearrangeArray(arr);
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 8, 1, 2, 9, 10}, arr);
    }
}
