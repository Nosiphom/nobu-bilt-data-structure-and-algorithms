package nobubilt.codesignal.interview.graph;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphShortestPathInMatrixUsingBFStest {


    @Test
    public void test1() {
        assertEquals(4, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 1, 1}, {0, 1, 0}, {1, 1, 1}}, new int[]{0,0}, new int[]{2,2}));
    }

    @Test
    public void test2() {
        assertEquals(1, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 1, 0}, {0, 1, 0}, {1, 1, 1}}, new int[]{0,0}, new int[]{0,1}));
    }

    @Test
    public void test3() {
        assertEquals(2, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 0}, {1, 1}}, new int[]{0,0}, new int[]{1,1}));
    }

    @Test
    public void test4() {
        assertEquals(1, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 1}, {1, 1}}, new int[]{0,0}, new int[]{1,0}));
    }

    @Test
    public void test5() {
        assertEquals(2, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{0, 1}, {1, 1}}, new int[]{0,1}, new int[]{1,0}));
    }

    @Test
    public void test6() {
        assertEquals(0, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{0, 0}, {0, 0}}, new int[]{0,0}, new int[]{1,1}));
    }

    @Test
    public void test7() {
        assertEquals(0, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1}}, new int[]{0,0}, new int[]{0,0}));
    }

    @Test
    public void test8() {
        assertEquals(6, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}}, new int[]{0,0}, new int[]{2,4}));
    }

    @Test
    public void test9() {
        assertEquals(0, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{0, 1}, {1, 0}}, new int[]{0,1}, new int[]{1,0}));
    }

    @Test
    public void test10() {
        assertEquals(1, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{0, 1}, {0, 1}}, new int[]{0,1}, new int[]{1,1}));
    }

    @Test
    public void test11() {
        assertEquals(4, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 1, 1}, {0, 0, 1}, {1, 1, 1}}, new int[]{0,0}, new int[]{2,2}));
    }

    @Test
    public void test12() {
        assertEquals(1, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 0}, {1, 1}}, new int[]{1,0}, new int[]{0,0}));
    }

    @Test
    public void test13() {
        assertEquals(0, GraphShortestPathInMatrixUsingBFS.bfsMatrix(new int[][]{{1, 0, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 0, 1, 0, 0}}, new int[]{0,0}, new int[]{2,4}));
    }
}
