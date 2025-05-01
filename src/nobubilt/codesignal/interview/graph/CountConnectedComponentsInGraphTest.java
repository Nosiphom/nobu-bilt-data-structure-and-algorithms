package nobubilt.codesignal.interview.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
public class CountConnectedComponentsInGraphTest {
    @Test
    public void test1() {
        assertEquals(1, CountConnectedComponentsInGraph.solution(
            Arrays.asList(
                Arrays.asList(new int[][]{{0, 0}})
            )
        ));
    }

    @Test
    public void test2() {
        assertEquals(1, CountConnectedComponentsInGraph.solution(
            Arrays.asList(
                Arrays.asList(new int[][]{{1, 0}}),
                Arrays.asList(new int[][]{{0, 0}})
            )
        ));
    }

    @Test
    public void test3() {
        assertEquals(2, CountConnectedComponentsInGraph.solution(
            Arrays.asList(
                Arrays.asList(),
                Arrays.asList()
            )
        ));
    }

    @Test
    public void test4() {
        assertEquals(1, CountConnectedComponentsInGraph.solution(
            Arrays.asList(
                Arrays.asList(new int[][]{{1, 10}, {2, 30}}),
                Arrays.asList(new int[][]{{0, 10}, {3, 40}}),
                Arrays.asList(new int[][]{{0, 30}, {3, 20}}),
                Arrays.asList(new int[][]{{1, 40}, {2, 20}, {4, 30}}),
                Arrays.asList(new int[][]{{3, 30}})
            )
        ));
    }

    @Test
    public void test5() {
        assertEquals(3, CountConnectedComponentsInGraph.solution(
            Arrays.asList(
                Arrays.asList(new int[][]{{1, 10}}),
                Arrays.asList(new int[][]{{0, 10}}),
                Arrays.asList(new int[][]{}),
                Arrays.asList(new int[][]{{4, 30}}),
                Arrays.asList(new int[][]{{3, 30}})
            )
        ));
    }

    @Test
    public void test6() {
        assertEquals(6, CountConnectedComponentsInGraph.solution(
            Arrays.asList(
                Arrays.asList(new int[][]{{1, 10}}),
                Arrays.asList(new int[][]{{0, 10}}),
                Arrays.asList(),
                Arrays.asList(new int[][]{{4, 30}}),
                Arrays.asList(new int[][]{{3, 30}}),
                Arrays.asList(new int[][]{{6, 10}}),
                Arrays.asList(new int[][]{{5, 10}}),
                Arrays.asList(),
                Arrays.asList(new int[][]{{9, 30}}),
                Arrays.asList(new int[][]{{8, 30}})
            )
        ));
    }
}
