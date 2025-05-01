package nobubilt.codesignal.interview.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {


    @Test
    public void test1() {
        List<Integer> l1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> l2 = Arrays.asList(2, 2, 3, 4, 6, 6);
        List<Integer> expected = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 9);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }
    
    @Test
    public void test2() {
        List<Integer> l1 = Arrays.asList(-100, 0, 50, 100);
        List<Integer> l2 = Arrays.asList(-75, -50, -25);
        List<Integer> expected = Arrays.asList(-100, -75, -50, -25, 0, 50, 100);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }
    
    @Test
    public void test3() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }

    @Test
    public void test4() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 1, 2, 2, 3, 3);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }

    @Test
    public void test5() {
        List<Integer> l1 = Arrays.asList(-1000, -900, -800, -700);
        List<Integer> l2 = Arrays.asList(-200, -100);
        List<Integer> expected = Arrays.asList(-1000, -900, -800, -700, -200, -100);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }

    @Test
    public void test6() {
        List<Integer> l1 = Arrays.asList(100, 200, 300);
        List<Integer> l2 = Arrays.asList(400, 500, 600, 700);
        List<Integer> expected = Arrays.asList(100, 200, 300, 400, 500, 600, 700);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }

    @Test
    public void test7() {
        List<Integer> l1 = Arrays.asList(-1000);
        List<Integer> l2 = Arrays.asList(1000);
        List<Integer> expected = Arrays.asList(-1000, 1000);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }

    @Test
    public void test8() {
        List<Integer> l1 = Arrays.asList(1);
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 5);
        assertEquals(expected, MergeTwoSortedLists.solution(l1, l2));
    }
}
