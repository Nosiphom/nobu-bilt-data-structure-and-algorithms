package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class MergeTwoDescendingSortedListsTest {


    @Test
    public void test1() {
        assertEquals(Arrays.asList(10, 6, 5, 4, 3, 2, 1), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(2, 3, 5, 6, 10)));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(8, 7, 4, 3, 2, 1), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(2, 4, 8), Arrays.asList(1, 3, 7, 8)));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(10, 7, 6, 5, 3, 1, -2, -6), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(-6, -2, 1, 3), Arrays.asList(1, 5, 6, 7, 10)));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(200, 100, 50, 0, -50, -100, -200), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(-100, -50, 0, 50, 100), Arrays.asList(-200, -100, 0, 100, 200)));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList(1), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(1), Arrays.asList(1)));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList(30, 20, 10, -10, -20, -30), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(10, 20, 30), Arrays.asList(-30, -20, -10)));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList(500, 400, 300, 200, 100), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(100, 200, 300, 400, 500), Arrays.asList(100, 200, 300, 400, 500)));
    }

    @Test
    public void test8() {
        assertEquals(Arrays.asList(1000000, 500, 0, -500, -1000000), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(-1000000, -500, 0, 500, 1000000), Arrays.asList(-1000000, -500, 0, 500, 1000000)));
    }

    @Test
    public void test9() {
        assertEquals(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7, 8, 9, 10)));
    }

    @Test
    public void test10() {
        assertEquals(Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(-10, -9, -8, -7, -6), Arrays.asList(-5, -4, -3, -2, -1)));
    }

    @Test
    public void test11() {
        assertEquals(Arrays.asList(2500, 2000, 1500, 1000, 500, 5, 4, 3, 2, 1), MergeTwoDescendingSortedLists.mergeSortedListsDescendingUnique(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(500, 1000, 1500, 2000, 2500)));
    }
}
