package nobubilt.codesignal.interview.graph;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class EfficientPathSocialNetworkDijkstrasTest {
	
	 @Test
	    public void test1() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 1, "C", 2));
	        graph.put("B", Map.of("A", 1, "D", 2));
	        graph.put("C", Map.of("A", 2, "D", 1));
	        graph.put("D", Map.of("B", 2, "C", 1));
	        List<String> result = EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "D");
	        assertTrue(result.equals(Arrays.asList("A", "B", "D")) || result.equals(Arrays.asList("A", "C", "D")));
	    }

	    @Test
	    public void test2() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 1));
	        graph.put("B", Map.of("A", 1));
	        assertEquals(Arrays.asList("A", "B"), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "B"));
	    }

	    @Test
	    public void test3() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 1));
	        graph.put("B", Map.of());
	        graph.put("C", Map.of("D", 1));
	        graph.put("D", Map.of("C", 1));
	        assertEquals(Collections.emptyList(), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "C"));
	    }

	    @Test
	    public void test4() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 3, "C", 2));
	        graph.put("B", Map.of("A", 3, "D", 4));
	        graph.put("C", Map.of("A", 2, "D", 1, "E", 2));
	        graph.put("D", Map.of("B", 4, "C", 1));
	        graph.put("E", Map.of("C", 2, "F", 2));
	        graph.put("F", Map.of("E", 2));
	        assertEquals(Arrays.asList("A", "C", "E", "F"), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "F"));
	    }

	    @Test
	    public void test5() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 2, "C", 2));
	        graph.put("B", Map.of("A", 2, "D", 2, "E", 3));
	        graph.put("C", Map.of("A", 2, "F", 2));
	        graph.put("D", Map.of("B", 2, "G", 2));
	        graph.put("E", Map.of("B", 3, "G", 1));
	        graph.put("F", Map.of("C", 2, "G", 3));
	        graph.put("G", Map.of("D", 2, "E", 1, "F", 3));
	        assertEquals(Arrays.asList("A", "B", "D", "G"), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "G"));
	    }

	  @Test
	    public void test6() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        for (int i = 0; i < 25; i++) {
	            graph.put(String.valueOf((char) (65 + i)), Map.of(String.valueOf((char) (65 + i + 1)), 1));
	        }
	        graph.put("Z", Map.of());
	        assertEquals(Arrays.asList(
	            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
	            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	        ), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "Z"));
	    }

	    @Test
	    public void test7() {
	        List<String> alpha = new ArrayList<>();
	        for (int i = 0; i < 26; i++) {
	            alpha.add(String.valueOf((char) (65 + i)));
	        }
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        for (int i = 0; i < 26; i++) {
	            Map<String, Integer> neighbors = new HashMap<>();
	            for (int j = 0; j < 26; j++) {
	                if (j != 0) {
	                    neighbors.put(alpha.get((i + j + 1) % 26), 1);
	                } else {
	                    neighbors.put(alpha.get((i + j + 1) % 26), 1000);
	                }
	            }
	            graph.put(alpha.get(i), neighbors);
	        }
	        assertEquals(Arrays.asList("A", "Z"), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "Z"));
	    }

	    @Test
	    public void test8() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 2, "C", 2, "D", 3));
	        graph.put("B", Map.of("D", 2));
	        graph.put("C", Map.of("D", 1, "E", 3));
	        graph.put("D", Map.of("E", 4));
	        graph.put("E", Map.of());
	        assertEquals(Arrays.asList("A", "C", "E"), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "E"));
	    }

	    @Test
	    public void test9() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 1, "C", 4));
	        graph.put("B", Map.of("C", 2, "D", 5));
	        graph.put("C", Map.of("D", 1));
	        graph.put("D", Map.of());
	        assertEquals(Arrays.asList("A", "B", "C", "D"), EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "D"));
	    }

	    @Test
	    public void testMultipleShortestPaths() {
	        Map<String, Map<String, Integer>> graph = new HashMap<>();
	        graph.put("A", Map.of("B", 1, "C", 1));
	        graph.put("B", Map.of("A", 1, "D", 1));
	        graph.put("C", Map.of("A", 1, "D", 1));
	        graph.put("D", Map.of("B", 1, "C", 1));
	        List<String> result = EfficientPathSocialNetworkDijkstras.findFriend(graph, "A", "D");
	        assertTrue(result.equals(Arrays.asList("A", "B", "D")) || result.equals(Arrays.asList("A", "C", "D")));
	    }
	    
	}
