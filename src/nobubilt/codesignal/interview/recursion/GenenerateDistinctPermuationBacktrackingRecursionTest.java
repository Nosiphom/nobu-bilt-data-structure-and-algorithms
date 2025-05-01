package nobubilt.codesignal.interview.recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.*;

public class GenenerateDistinctPermuationBacktrackingRecursionTest {

    @Test
    public void test1() {
        assertEquals(Arrays.asList(
            Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2),
            Arrays.asList(2, 1, 3), Arrays.asList(2, 3, 1),
            Arrays.asList(3, 1, 2), Arrays.asList(3, 2, 1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(
            Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 4, 3), 
            Arrays.asList(1, 3, 2, 4), Arrays.asList(1, 3, 4, 2), 
            Arrays.asList(1, 4, 2, 3), Arrays.asList(1, 4, 3, 2), 
            Arrays.asList(2, 1, 3, 4), Arrays.asList(2, 1, 4, 3), 
            Arrays.asList(2, 3, 1, 4), Arrays.asList(2, 3, 4, 1), 
            Arrays.asList(2, 4, 1, 3), Arrays.asList(2, 4, 3, 1), 
            Arrays.asList(3, 1, 2, 4), Arrays.asList(3, 1, 4, 2), 
            Arrays.asList(3, 2, 1, 4), Arrays.asList(3, 2, 4, 1), 
            Arrays.asList(3, 4, 1, 2), Arrays.asList(3, 4, 2, 1),
            Arrays.asList(4, 1, 2, 3), Arrays.asList(4, 1, 3, 2), 
            Arrays.asList(4, 2, 1, 3), Arrays.asList(4, 2, 3, 1), 
            Arrays.asList(4, 3, 1, 2), Arrays.asList(4, 3, 2, 1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(
            Arrays.asList(1, 1, 2, 2), Arrays.asList(1, 2, 1, 2), 
            Arrays.asList(1, 2, 2, 1), Arrays.asList(2, 1, 1, 2), 
            Arrays.asList(2, 1, 2, 1), Arrays.asList(2, 2, 1, 1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {1, 1, 2, 2}));
    }

    @Test
    public void test4() {
        assertEquals(Collections.singletonList(Arrays.asList(1, 1, 1, 1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {1, 1, 1, 1}));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList(
            Arrays.asList(-1, 0, 0, 0), Arrays.asList(0, -1, 0, 0), 
            Arrays.asList(0, 0, -1, 0), Arrays.asList(0, 0, 0, -1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {0, 0, 0, -1}));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList(
            Arrays.asList(-1, -1, -1, 0), Arrays.asList(-1, -1, 0, -1), 
            Arrays.asList(-1, 0, -1, -1), Arrays.asList(0, -1, -1, -1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {-1, -1, -1, 0}));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList(
            Arrays.asList(-7, -7, 7, 7), Arrays.asList(-7, 7, -7, 7), 
            Arrays.asList(-7, 7, 7, -7), Arrays.asList(7, -7, -7, 7), 
            Arrays.asList(7, -7, 7, -7), Arrays.asList(7, 7, -7, -7)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {7, -7, 7, -7}));
    }

    @Test
    public void test8() {
        assertEquals(Arrays.asList(
            Arrays.asList(2, 2, 2, 3), Arrays.asList(2, 2, 3, 2), 
            Arrays.asList(2, 3, 2, 2), Arrays.asList(3, 2, 2, 2)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {2, 3, 2, 2}));
    }

    @Test
    public void test9() {
        assertEquals(Arrays.asList(
            Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), 
            Arrays.asList(2, 1, 1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {1, 2, 1}));
    }

    @Test
    public void test10() {
        assertEquals(Arrays.asList(
            Arrays.asList(-10, -10, 10, 10, 10), Arrays.asList(-10, 10, -10, 10, 10), 
            Arrays.asList(-10, 10, 10, -10, 10), Arrays.asList(-10, 10, 10, 10, -10), 
            Arrays.asList(10, -10, -10, 10, 10), Arrays.asList(10, -10, 10, -10, 10), 
            Arrays.asList(10, -10, 10, 10, -10), Arrays.asList(10, 10, -10, -10, 10), 
            Arrays.asList(10, 10, -10, 10, -10), Arrays.asList(10, 10, 10, -10, -10)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {10, -10, 10, -10, 10}));
    }
    
    @Test
    public void test11() {
        assertEquals(Arrays.asList(
            Arrays.asList(-5, -3, 4), Arrays.asList(-5, 4, -3), 
            Arrays.asList(-3, -5, 4), Arrays.asList(-3, 4, -5), 
            Arrays.asList(4, -5, -3), Arrays.asList(4, -3, -5)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {-5, 4, -3}));
    }

    @Test
    public void test12() {
        assertEquals(Arrays.asList(
            Arrays.asList(-10, -9, -8), Arrays.asList(-10, -8, -9), 
            Arrays.asList(-9, -10, -8), Arrays.asList(-9, -8, -10), 
            Arrays.asList(-8, -10, -9), Arrays.asList(-8, -9, -10)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {-10, -9, -8}));
    }

    @Test
    public void test13() {
        assertEquals(Arrays.asList(
            Arrays.asList(-10, 0, 10), Arrays.asList(-10, 10, 0), 
            Arrays.asList(0, -10, 10), Arrays.asList(0, 10, -10), 
            Arrays.asList(10, -10, 0), Arrays.asList(10, 0, -10)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {-10, 0, 10}));
    }
    
    @Test
    public void test14() {
        assertEquals(Arrays.asList(
            Arrays.asList(-10, 0, 10), Arrays.asList(-10, 10, 0), 
            Arrays.asList(0, -10, 10), Arrays.asList(0, 10, -10), 
            Arrays.asList(10, -10, 0), Arrays.asList(10, 0, -10)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {10, 0, -10}));
    }
    
    @Test
    public void test15() {
        assertEquals(Arrays.asList(
            Arrays.asList(1, 1, 1, 1, 2, 2), Arrays.asList(1, 1, 1, 2, 1, 2), 
            Arrays.asList(1, 1, 1, 2, 2, 1), Arrays.asList(1, 1, 2, 1, 1, 2), 
            Arrays.asList(1, 1, 2, 1, 2, 1), Arrays.asList(1, 1, 2, 2, 1, 1), 
            Arrays.asList(1, 2, 1, 1, 1, 2), Arrays.asList(1, 2, 1, 1, 2, 1), 
            Arrays.asList(1, 2, 1, 2, 1, 1), Arrays.asList(1, 2, 2, 1, 1, 1), 
            Arrays.asList(2, 1, 1, 1, 1, 2), Arrays.asList(2, 1, 1, 1, 2, 1), 
            Arrays.asList(2, 1, 1, 2, 1, 1), Arrays.asList(2, 1, 2, 1, 1, 1), 
            Arrays.asList(2, 2, 1, 1, 1, 1)), 
            GenenerateDistinctPermuationBacktrackingRecursion.solution(new int[] {1, 1, 2, 2, 1, 1}));
    }

}
