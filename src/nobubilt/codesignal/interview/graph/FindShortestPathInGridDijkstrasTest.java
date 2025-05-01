package nobubilt.codesignal.interview.graph;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindShortestPathInGridDijkstrasTest {

	  
    @Test
    public void test_case_1() {
        assertEquals(13, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, 3, 1, 3}, {2, -1, 2, 4}, {3, 3, -1, 2}, {4, 2, 1, 1}}, new int[]{0, 0}, new int[]{3, 3}));
    }

    @Test
    public void test_case_2() {
        assertEquals(16, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{4, 3, 1, 3}, {2, -1, 2, 4}, {3, 3, -1, 2}, {1, 2, 4, 1}}, new int[]{0, 0}, new int[]{3, 2}));
    }

    @Test
    public void test_case_3() {
        assertEquals(22, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, -1, 1, 3}, {2, -1, 2, 1}, {3, 3, -1, 4}, {4, 2, 1, 2}}, new int[]{0, 0}, new int[]{0, 3}));
    }

    @Test
    public void test_case_4() {
        assertEquals(1, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1}}, new int[]{0, 0}, new int[]{0, 0}));
    }

    @Test
    public void test_case_5() {
        assertEquals(-1, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, 3, 1, 3}, {2, -1, 2, 4}, {3, 3, -1, 2}, {4, 2, 1, 1}}, new int[]{1, 1}, new int[]{0, 0}));
    }

    @Test
    public void test_case_6() {
        assertEquals(12, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, 1, 1, 3}, {2, -1, 2, 4}, {3, 3, -1, 2}, {4, 2, 1, 1}}, new int[]{0, 1}, new int[]{3, 2}));
    }

    @Test
    public void test_case_7() {
        assertEquals(10, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{-1, 3, -1, 3}, {2, -1, 2, 4}, {3, 3, -1, 2}, {4, 2, 1, 1}}, new int[]{0, 3}, new int[]{3, 3}));
    }

    @Test
    public void test_case_8() {
        assertEquals(7, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}, new int[]{0, 0}, new int[]{3, 3}));
    }

    @Test
    public void test_case_9() {
        assertEquals(13, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, 3, 1, 3}, {2, -1, 2, 1}, {3, 3, -1, 4}, {4, 2, -1, 1}}, new int[]{0, 0}, new int[]{3, 3}));
    }

    @Test
    public void test_case_10() {
        assertEquals(3, FindShortestPathInGridDijkstras.findShortestPath(new int[][]{{1, 3, 1, 3}, {2, -1, 2, 4}, {3, 3, 1, 2}, {4, 2, 1, 1}}, new int[]{2, 2}, new int[]{3, 3}));
    }
}
