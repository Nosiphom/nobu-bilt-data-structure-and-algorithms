package nobubilt.codesignal.interview.sort;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeMulitSortedListsTest {

	   @Test
	    public void test1() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(1, 5, 9),
	                Arrays.asList(2, 3, 10),
	                Arrays.asList(4, 6, 8)
	        );
	        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 10);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test2() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(-3, 10, 27),
	                Arrays.asList(32, 50, 78),
	                Arrays.asList(98, 100, 110)
	        );
	        List<Integer> expected = Arrays.asList(-3, 10, 27, 32, 50, 78, 98, 100, 110);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test3() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(12, 15, 17, 20),
	                Arrays.asList(3, 7, 8, 10),
	                Arrays.asList(2, 9, 11, 30)
	        );
	        List<Integer> expected = Arrays.asList(2, 3, 7, 8, 9, 10, 11, 12, 15, 17, 20, 30);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test4() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(111, 125, 143, 145),
	                Arrays.asList(39, 128, 150, 160),
	                Arrays.asList(58, 130, 166, 198)
	        );
	        List<Integer> expected = Arrays.asList(39, 58, 111, 125, 128, 130, 143, 145, 150, 160, 166, 198);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test5() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(-5),
	                Arrays.asList(-4),
	                Arrays.asList(-3),
	                Arrays.asList(-2),
	                Arrays.asList(-1)
	        );
	        List<Integer> expected = Arrays.asList(-5, -4, -3, -2, -1);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test6() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(),
	                Arrays.asList(),
	                Arrays.asList(-3, -2, -1)
	        );
	        List<Integer> expected = Arrays.asList(-3, -2, -1);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test7() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(1),
	                Arrays.asList(2),
	                Arrays.asList(3),
	                Arrays.asList(4),
	                Arrays.asList(5)
	        );
	        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test8() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(10, 20, 30),
	                Arrays.asList(15, 25),
	                Arrays.asList(23, 24, 35)
	        );
	        List<Integer> expected = Arrays.asList(10, 15, 20, 23, 24, 25, 30, 35);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test9() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(-45, -40, -35),
	                Arrays.asList(-36, -32, -22),
	                Arrays.asList(-18, -9, -3)
	        );
	        List<Integer> expected = Arrays.asList(-45, -40, -36, -35, -32, -22, -18, -9, -3);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test10() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(100, 200, 300, 400),
	                Arrays.asList(150, 250),
	                Arrays.asList(500, 600, 700)
	        );
	        List<Integer> expected = Arrays.asList(100, 150, 200, 250, 300, 400, 500, 600, 700);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test11() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(3, 5, 7, 9),
	                Arrays.asList(2, 4, 6, 8, 10)
	        );
	        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test12() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(-1000, 0, 1000),
	                Arrays.asList(-500, 0, 500),
	                Arrays.asList(-50, 0, 50)
	        );
	        List<Integer> expected = Arrays.asList(-1000, -500, -50, 0, 0, 0, 50, 500, 1000);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }

	    @Test
	    public void test13() {
	        List<List<Integer>> input = Arrays.asList(
	                Arrays.asList(13, 26, 39),
	                Arrays.asList(14, 28, 42),
	                Arrays.asList(15, 30, 45)
	        );
	        List<Integer> expected = Arrays.asList(13, 14, 15, 26, 28, 30, 39, 42, 45);
	        assertEquals(expected, MergeMulitSortedLists.mergeNSortedLists(input));
	    }
	}
