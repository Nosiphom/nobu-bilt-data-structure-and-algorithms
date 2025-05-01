package nobubilt.codesignal.interview.graph;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.*;

public class TopologicalSortInDegreeTest {


    @Test
    public void test1() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D"));
        graph.put("C", Arrays.asList("D"));
        graph.put("D", new ArrayList<>());
        List<String> result = TopologicalSortInDegree.topologicalSort(graph);
        assertTrue(result.equals(Arrays.asList("A", "B", "C", "D")) || result.equals(Arrays.asList("A", "C", "B", "D")));
    }

    @Test
    public void test2() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B"));
        graph.put("B", Arrays.asList("C"));
        graph.put("C", new ArrayList<>());
        List<String> result = TopologicalSortInDegree.topologicalSort(graph);
        assertTrue(result.equals(Arrays.asList("A", "B", "C")));
    }

    @Test
    public void test3() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B"));
        graph.put("B", Arrays.asList("A"));
        graph.put("C", Arrays.asList("D"));
        graph.put("D", Arrays.asList("C"));
        List<String> result = TopologicalSortInDegree.topologicalSort(graph);
        assertTrue(result.isEmpty());
    }

    @Test
    public void test4() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D"));
        graph.put("C", Arrays.asList("D"));
        graph.put("D", Arrays.asList("E"));
        graph.put("E", new ArrayList<>());
        List<String> result = TopologicalSortInDegree.topologicalSort(graph);
        assertTrue(result.equals(Arrays.asList("A", "B", "C", "D", "E")) || result.equals(Arrays.asList("A", "C", "B", "D", "E")));
    }

    @Test
    public void test5() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", new ArrayList<>());
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>());
        graph.put("D", new ArrayList<>());
        graph.put("E", new ArrayList<>());
        List<String> result = TopologicalSortInDegree.topologicalSort(graph);
        assertTrue(result.equals(Arrays.asList("A", "B", "C", "D", "E")) || result.equals(Arrays.asList("A", "C", "B", "D", "E")) || result.equals(Arrays.asList("B", "A", "C", "D", "E")) || result.equals(Arrays.asList("B", "C", "A", "D", "E")));
    }

    @Test
    public void test6() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C", "D", "E"));
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>());
        graph.put("D", new ArrayList<>());
        graph.put("E", new ArrayList<>());
        List<String> result = TopologicalSortInDegree.topologicalSort(graph);
        assertTrue(result.equals(Arrays.asList("A", "B", "C", "D", "E")) || result.equals(Arrays.asList("A", "C", "B", "D", "E")) || result.equals(Arrays.asList("A", "B", "E", "C", "D")) || result.equals(Arrays.asList("A", "C", "E", "B", "D")));
    }
}
