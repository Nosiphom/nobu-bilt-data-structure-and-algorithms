package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SelectionSortAlgorithmTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SelectionSortAlgorithm.selectionSort(new int[]{3, 1, 2, 4, 5}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SelectionSortAlgorithm.selectionSort(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, SelectionSortAlgorithm.selectionSort(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testCase4() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7, 9}, SelectionSortAlgorithm.selectionSort(new int[]{1, 7, 5, 2, 3, 9, 4}));
    }

    @Test
    public void testCase5() {
        assertArrayEquals(new int[]{-5, -1, 2, 4, 10}, SelectionSortAlgorithm.selectionSort(new int[]{10, -5, 2, 4, -1}));
    }

    @Test
    public void testCase6() {
        assertArrayEquals(new int[]{1}, SelectionSortAlgorithm.selectionSort(new int[]{1}));
    }

    @Test
    public void testCase7() {
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, SelectionSortAlgorithm.selectionSort(new int[]{-4, -5, -1, -2, -3}));
    }

    @Test
    public void testCase8() {
        assertArrayEquals(new int[]{10, 20, 30, 40, 50}, SelectionSortAlgorithm.selectionSort(new int[]{50, 40, 10, 20, 30}));
    }

    @Test
    public void testCase9() {
        assertArrayEquals(new int[]{10, 29, 45, 230, 340}, SelectionSortAlgorithm.selectionSort(new int[]{340, 29, 45, 10, 230}));
    }

    @Test
    public void testCase10() {
        assertArrayEquals(new int[]{10, 10, 10, 20, 20}, SelectionSortAlgorithm.selectionSort(new int[]{10, 20, 10, 10, 20}));
    }

    @Test
    public void testCase11() {
        assertArrayEquals(new int[]{-18, -5, 0, 4, 6}, SelectionSortAlgorithm.selectionSort(new int[]{-18, -5, 0, 4, 6}));
    }

    @Test
    public void testCase12() {
        assertArrayEquals(new int[]{-4, -3, -2, -1, 0}, SelectionSortAlgorithm.selectionSort(new int[]{0, -1, -2, -3, -4}));
    }

    @Test
    public void testCase13() {
        assertArrayEquals(new int[]{-10, -9, -8, -7, -6}, SelectionSortAlgorithm.selectionSort(new int[]{-10, -9, -8, -7, -6}));
    }

    @Test
    public void testCase14() {
        assertArrayEquals(new int[]{16, 17, 18, 19, 20}, SelectionSortAlgorithm.selectionSort(new int[]{20, 19, 18, 17, 16}));
    }

    @Test
    public void testCase15() {
        assertArrayEquals(new int[]{-20, -10, 100, 200, 300}, SelectionSortAlgorithm.selectionSort(new int[]{100, -10, 200, -20, 300}));
    }

    @Test
    public void testCase16() {
        assertArrayEquals(new int[]{100, 200, 300, 400, 500}, SelectionSortAlgorithm.selectionSort(new int[]{500, 400, 300, 200, 100}));
    }

    @Test
    public void testCase17() {
        assertArrayEquals(new int[]{-500, -400, -300, -200, -100}, SelectionSortAlgorithm.selectionSort(new int[]{-500, -400, -300, -200, -100}));
    }

    @Test
    public void testCase18() {
        assertArrayEquals(new int[]{}, SelectionSortAlgorithm.selectionSort(new int[]{}));
    }

}
