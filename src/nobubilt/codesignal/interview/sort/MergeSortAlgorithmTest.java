package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MergeSortAlgorithmTest {

    @Test
    public void test1() {
        int[] input = {10, 3, 2, 8, -1, 5, 1};
        int[] output = {-1, 1, 2, 3, 5, 8, 10};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test2() {
        int[] input = {100, -50, 200, -150, 50, -100};
        int[] output = {-150, -100, -50, 50, 100, 200};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test3() {
        int[] input = new int[500];
        int[] output = new int[500];
        for (int i = 0; i < 500; i++) {
            input[i] = 50;
            output[i] = 50;
        }
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }
  
    @Test
    public void test4() {
        int[] input = {-1000, -999, -998, 998, 999, 1000};
        int[] output = {-1000, -999, -998, 998, 999, 1000};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test5() {
        int[] input = new int[201];
        int[] output = new int[201];
        int j = -100;
        for (int i = 0; i < 201; i++) {
            input[i] = 100 - i;
            output[i] = j++;
        }
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test6() {
        int[] input = {1};
        int[] output = {1};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test7() {
        int[] input = {-1, -1, -1, 1, 1, 1};
        int[] output = {-1, -1, -1, 1, 1, 1};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test8() {
        int[] input = {5, 4, 3, 2, 1};
        int[] output = {1, 2, 3, 4, 5};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test9() {
        int[] input = {0, 0, 0, 0, 0};
        int[] output = {0, 0, 0, 0, 0};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test10() {
        int[] input = {2, 3, 6, 2, 7, 3, 9};
        int[] output = {2, 2, 3, 3, 6, 7, 9};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }

    @Test
    public void test11() {
        int[] input = {};
        int[] output = {};
        assertArrayEquals(MergeSortAlgorithm.mergeSort(input), output);
    }
}
