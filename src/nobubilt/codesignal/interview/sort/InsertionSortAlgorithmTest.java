package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class InsertionSortAlgorithmTest {

	  @Test
	    public void test1() {
	        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, InsertionSortAlgorithm.insertionSort(new int[]{5, 2, 4, 6, 1, 3}));
	    }

	    @Test
	    public void test2() {
	        assertArrayEquals(new int[]{1, 2, 3, 4}, InsertionSortAlgorithm.insertionSort(new int[]{4, 3, 2, 1}));
	    }

	    @Test
	    public void test3() {
	        assertArrayEquals(new int[]{0, 0, 0, 0}, InsertionSortAlgorithm.insertionSort(new int[]{0, 0, 0, 0}));
	    }

	    @Test
	    public void test4() {
	        assertArrayEquals(new int[]{-100, -75, -50, -25}, InsertionSortAlgorithm.insertionSort(new int[]{-50, -75, -25, -100}));
	    }

	    @Test
	    public void test5() {
	        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1}, InsertionSortAlgorithm.insertionSort(new int[]{-1, -2, -3, -4, -5, -6}));
	    }

	    @Test
	    public void test6() {
	        assertArrayEquals(new int[]{254, 325, 450, 623, 754, 765, 908, 985}, InsertionSortAlgorithm.insertionSort(new int[]{450, 325, 765, 985, 254, 754, 908, 623}));
	    }

	    @Test
	    public void test7() {
	        assertArrayEquals(new int[]{1}, InsertionSortAlgorithm.insertionSort(new int[]{1}));
	    }

	    @Test
	    public void test8() {
	        assertArrayEquals(new int[]{1, 2}, InsertionSortAlgorithm.insertionSort(new int[]{2, 1}));
	    }

	    @Test
	    public void test9() {
	        assertArrayEquals(new int[]{-1000, 0, 1000}, InsertionSortAlgorithm.insertionSort(new int[]{-1000, 1000, 0}));
	    }

	    @Test
	    public void test10() {
	        assertArrayEquals(new int[]{10, 234, 348, 432, 456, 543, 654, 678, 764, 890, 985, 987}, InsertionSortAlgorithm.insertionSort(new int[]{234, 678, 348, 987, 432, 764, 985, 543, 456, 654, 890, 10}));
	    }

	    @Test
	    public void test11() {
	        assertArrayEquals(new int[]{993, 994, 995, 996, 997, 998, 999, 1000}, InsertionSortAlgorithm.insertionSort(new int[]{1000, 999, 998, 997, 996, 995, 994, 993}));
	    }

	    @Test
	    public void test12() {
	        assertArrayEquals(new int[]{-1000, -1000, 1000, 1000, 1000}, InsertionSortAlgorithm.insertionSort(new int[]{1000, -1000, 1000, -1000, 1000}));
	    }

	    @Test
	    public void test13() {
	        assertArrayEquals(new int[]{0, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9}, InsertionSortAlgorithm.insertionSort(new int[]{5, 2, 4, 6, 1, 2, 5, 6, 4, 7, 8, 9, 0, 3, 2, 1}));
	    }

	    @Test
	    public void test14() {
	        assertArrayEquals(new int[]{}, InsertionSortAlgorithm.insertionSort(new int[]{}));
	    }
	}
