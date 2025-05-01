package nobubilt.codesignal.interview.graph;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class GraphShortestPathCalculationUsingBFStest {


    @Test
    public void test1() {
        assertEquals(4, GraphShortestPathCalculationUsingBFS.shortestRoute(10, 3, Arrays.asList(3, 6, 8)));
    }

    @Test
    public void test2() {
        assertEquals(10, GraphShortestPathCalculationUsingBFS.shortestRoute(20, 2, Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17)));
    }

    @Test
    public void test3() {
        assertEquals(10, GraphShortestPathCalculationUsingBFS.shortestRoute(20, 2, Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18)));
    }

    @Test
    public void test4() {
        assertEquals(4, GraphShortestPathCalculationUsingBFS.shortestRoute(20, 5, Arrays.asList(2, 7, 9, 12, 17)));
    }

    @Test
    public void test5() {
        assertEquals(-1, GraphShortestPathCalculationUsingBFS.shortestRoute(20, 5, Arrays.asList(4, 9, 14, 19)));
    }

    @Test
    public void test6() {
        assertEquals(7, GraphShortestPathCalculationUsingBFS.shortestRoute(20, 3, Arrays.asList()));
    }

    @Test
    public void test7() {
        assertEquals(-1, GraphShortestPathCalculationUsingBFS.shortestRoute(100, 3, Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99)));
    }

    @Test
    public void test8() {
        assertEquals(10, GraphShortestPathCalculationUsingBFS.shortestRoute(100, 10, Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90)));
    }

    @Test
    public void test9() {
        assertEquals(50, GraphShortestPathCalculationUsingBFS.shortestRoute(100, 2, Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98)));
    }

    @Test
    public void test10() {
        assertEquals(1, GraphShortestPathCalculationUsingBFS.shortestRoute(4, 3, Arrays.asList(2)));
    }

    @Test
    public void test11() {
        assertEquals(1, GraphShortestPathCalculationUsingBFS.shortestRoute(4, 3, Arrays.asList()));
    }

    @Test
    public void test12() {
        assertEquals(1, GraphShortestPathCalculationUsingBFS.shortestRoute(2, 1, Arrays.asList()));
    }

    @Test
    public void test13() {
        assertEquals(-1, GraphShortestPathCalculationUsingBFS.shortestRoute(2, 1, Arrays.asList(1)));
    }
}
