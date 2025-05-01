package nobubilt.codesignal.interview.graph;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.*;

public class LongestPathGraphTest {

	  @Test
	    public void test1() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 3}));
	        graph.put(1, List.of(new int[]{3, 4}));
	        graph.put(2, new ArrayList<>());
	        int numVertices = 3;
	        int expected = 4;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test2() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 3}));
	        graph.put(1, new ArrayList<>());
	        graph.put(2, List.of(new int[]{2, 1}));
	        graph.put(3, List.of(new int[]{3, 2}));
	        int numVertices = 4;
	        int expected = 3;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test3() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, new ArrayList<>());
	        graph.put(1, List.of(new int[]{3, 1}));
	        graph.put(2, List.of(new int[]{3, 2}));
	        graph.put(3, new ArrayList<>());
	        int numVertices = 4;
	        int expected = 3;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test4() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 1}));
	        graph.put(1, new ArrayList<>());
	        graph.put(2, new ArrayList<>());
	        graph.put(3, new ArrayList<>());
	        int numVertices = 4;
	        int expected = 1;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test5() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        int numVertices = 4;
	        int expected = 0;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test6() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 2}));
	        graph.put(1, new ArrayList<>());
	        graph.put(2, new ArrayList<>());
	        graph.put(3, new ArrayList<>());
	        int numVertices = 4;
	        int expected = 2;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test7() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 3}));
	        graph.put(1, List.of(new int[]{3, 4}));
	        graph.put(2, List.of(new int[]{4, 1}));
	        graph.put(3, new ArrayList<>());
	        int numVertices = 4;
	        int expected = 8;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test8() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 1}));
	        graph.put(1, List.of(new int[]{3, 1}));
	        graph.put(2, List.of(new int[]{4, 1}));
	        graph.put(3, new ArrayList<>());
	        int numVertices = 4;
	        int expected = 3;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test9() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 1}));
	        graph.put(1, List.of(new int[]{3, 2}));
	        graph.put(2, List.of(new int[]{4, 3}));
	        graph.put(3, new ArrayList<>());
	        graph.put(4, List.of(new int[]{2, 1}));
	        int numVertices = 5;
	        int expected = 6;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }

	    @Test
	    public void test10() {
	        Map<Integer, List<int[]>> graph = new HashMap<>();
	        graph.put(0, List.of(new int[]{2, 5}));
	        graph.put(1, List.of(new int[]{3, 6}));
	        graph.put(2, List.of(new int[]{4, 7}));
	        graph.put(3, List.of(new int[]{5, 8}));
	        graph.put(4, List.of(new int[]{6, 1}));
	        graph.put(5, List.of(new int[]{7, 2}));
	        graph.put(6, new ArrayList<>());
	        int numVertices = 7;
	        int expected = 29;
	        assertEquals(expected, LongestPathGraph.longestPath(graph, numVertices));
	    }
	}

