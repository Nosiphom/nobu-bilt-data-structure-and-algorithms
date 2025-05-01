package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedListsRemoveCommonsTest {


    @Test
    public void test1() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(2, 5, 7, 10), Arrays.asList(1, 5, 9));
        assertEquals(Arrays.asList(1, 2, 7, 9, 10), res);
    }

    @Test
    public void test2() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), res);
    }

    @Test
    public void test3() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        assertEquals(Arrays.asList(), res);
    }

    @Test
    public void test4() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(), Arrays.asList(-1, 0, 1));
        assertEquals(Arrays.asList(-1, 0, 1), res);
    }

    @Test
    public void test5() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4));
        assertEquals(Arrays.asList(1, 4), res);
    }

    @Test
    public void test6() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(-3, -2, -1), Arrays.asList(1, 2, 3));
        assertEquals(Arrays.asList(-3, -2, -1, 1, 2, 3), res);
    }

    @Test
    public void test7() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(-3, -2, -1, 0), Arrays.asList(0, 1, 2, 3));
        assertEquals(Arrays.asList(-3, -2, -1, 1, 2, 3), res);
    }

    @Test
    public void test8() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(-3, -1), Arrays.asList(-2, -1));
        assertEquals(Arrays.asList(-3, -2), res);
    }

    @Test
    public void test9() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(1, 2, 3, 4, 5, 6, 7), Arrays.asList(2, 4, 6));
        assertEquals(Arrays.asList(1, 3, 5, 7), res);
    }

    @Test
    public void test10() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(1, 3, 5, 7), Arrays.asList(2, 4, 6, 8, 10, 12));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12), res);
    }

    @Test
    public void test11() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(2, 4, 6, 8, 10, 12), Arrays.asList(1, 3, 5, 7));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12), res);
    }

    @Test
    public void test12() {
        List<Integer> res = MergeTwoSortedListsRemoveCommons.removeCommonElements(Arrays.asList(10, 20, 30), Arrays.asList(5, 15, 20, 25));
        assertEquals(Arrays.asList(5, 10, 15, 25, 30), res);
    }

}
