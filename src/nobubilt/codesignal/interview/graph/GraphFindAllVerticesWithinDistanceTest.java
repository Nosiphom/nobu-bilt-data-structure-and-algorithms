package nobubilt.codesignal.interview.graph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class GraphFindAllVerticesWithinDistanceTest {


    @Test
    public void test1() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(2));
        graph.put(5, Arrays.asList(2, 6));
        graph.put(6, Arrays.asList(5));
        int start = 1;
        int distance = 2;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test2() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(1, 3));
        graph.put(3, Arrays.asList(2));
        int start = 1;
        int distance = 2;
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }
    
    @Test
    public void test3() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(1, 3));
        graph.put(3, Arrays.asList(2));
        int start = 1;
        int distance = 1;
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }
    
    @Test
    public void test4() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(1, 3, 4));
        graph.put(3, Arrays.asList(2));
        graph.put(4, Arrays.asList(2));
        int start = 1;
        int distance = 2;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test5() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>());
        int start = 1;
        int distance = 0;
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test6() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3, 4, 5));
        int start = 1;
        int distance = 1;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test7() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(1));
        int start = 1;
        int distance = 0;
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test8() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(1));
        int start = 1;
        int distance = 1000;
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test9() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i < 1000; i++) {
            graph.put(i, Arrays.asList(i + 1));
        }
        int start = 1;
        int distance = 1;
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }

    @Test
    public void test10() {
        GraphFindAllVerticesWithinDistance solution = new GraphFindAllVerticesWithinDistance();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i < 1000; i++) {
            graph.put(i, Arrays.asList(i + 1));
        }
        graph.put(1000, new ArrayList<>());
        int start = 1;
        int distance = 1000;
        List<Integer> expected = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            expected.add(i);
        }
        assertEquals(expected, solution.findVerticesWithinDistance(graph, start, distance));
    }
}
