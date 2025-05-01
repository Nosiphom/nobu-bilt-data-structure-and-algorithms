package nobubilt.codesignal.interview.graph;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.*;

public class DijkstrasAirportCityRoutesTest {

	   @Test
	    public void test1() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("JFK", new HashMap<String, Integer>() {{
	                put("LAX", 2500);
	                put("MIA", 2000);
	                put("ORD", 1200);
	            }});
	            put("LAX", new HashMap<String, Integer>() {{
	                put("SEA", 2000);
	                put("ORD", 3000);
	            }});
	            put("MIA", new HashMap<String, Integer>() {{
	                put("ORD", 1500);
	                put("ATL", 2000);
	                put("DFW", 1800);
	            }});
	            put("ORD", new HashMap<String, Integer>() {{
	                put("SEA", 2800);
	            }});
	            put("SEA", new HashMap<String, Integer>());
	            put("ATL", new HashMap<String, Integer>() {{
	                put("DFW", 1500);
	            }});
	            put("DFW", new HashMap<String, Integer>());
	        }};
	        assertEquals(4000, DijkstrasAirportCityRoutes.shortestPath(graph, "JFK", "SEA"));
	    }

	    @Test
	    public void test2() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("JFK", new HashMap<String, Integer>() {{
	                put("LAX", 2500);
	                put("MIA", 2000);
	                put("ORD", 1200);
	            }});
	            put("LAX", new HashMap<String, Integer>() {{
	                put("SEA", 2000);
	                put("ORD", 3000);
	            }});
	            put("MIA", new HashMap<String, Integer>() {{
	                put("ORD", 1500);
	                put("ATL", 2000);
	                put("DFW", 1800);
	            }});
	            put("ORD", new HashMap<String, Integer>() {{
	                put("SEA", 2800);
	            }});
	            put("SEA", new HashMap<String, Integer>());
	            put("ATL", new HashMap<String, Integer>() {{
	                put("DFW", 1500);
	            }});
	            put("DFW", new HashMap<String, Integer>());
	        }};
	        assertEquals(0, DijkstrasAirportCityRoutes.shortestPath(graph, "ORD", "ORD"));
	    }

	    @Test
	    public void test3() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("A", new HashMap<String, Integer>() {{
	                put("B", 10);
	            }});
	            put("B", new HashMap<String, Integer>() {{
	                put("A", 10);
	            }});
	        }};
	        assertEquals(10, DijkstrasAirportCityRoutes.shortestPath(graph, "A", "B"));
	    }

	    @Test
	    public void test4() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("A", new HashMap<String, Integer>() {{
	                put("B", 1);
	                put("C", 10);
	            }});
	            put("B", new HashMap<String, Integer>() {{
	                put("C", 1);
	            }});
	            put("C", new HashMap<String, Integer>());
	        }};
	        assertEquals(2, DijkstrasAirportCityRoutes.shortestPath(graph, "A", "C"));
	    }

	    @Test
	    public void test5() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("A", new HashMap<String, Integer>() {{
	                put("B", 3);
	                put("C", 2);
	            }});
	            put("B", new HashMap<String, Integer>() {{
	                put("D", 2);
	            }});
	            put("C", new HashMap<String, Integer>() {{
	                put("B", 1);
	                put("D", 1);
	            }});
	            put("D", new HashMap<String, Integer>());
	        }};
	        assertEquals(3, DijkstrasAirportCityRoutes.shortestPath(graph, "A", "D"));
	    }

	    @Test
	    public void test6() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("A", new HashMap<String, Integer>() {{
	                put("B", 30);
	                put("C", 20);
	                put("D", 10);
	            }});
	            put("B", new HashMap<String, Integer>() {{
	                put("E", 60);
	            }});
	            put("C", new HashMap<String, Integer>() {{
	                put("E", 50);
	            }});
	            put("D", new HashMap<String, Integer>() {{
	                put("E", 40);
	            }});
	            put("E", new HashMap<String, Integer>());
	        }};
	        assertEquals(50, DijkstrasAirportCityRoutes.shortestPath(graph, "A", "E"));
	    }

	    @Test
	    public void test7() {
	        Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>() {{
	            put("A", new HashMap<String, Integer>() {{
	                put("B", 5);
	                put("C", 10);
	            }});
	            put("B", new HashMap<String, Integer>() {{
	                put("C", 2);
	                put("D", 20);
	            }});
	            put("C", new HashMap<String, Integer>() {{
	                put("D", 10);
	            }});
	            put("D", new HashMap<String, Integer>());
	        }};
	        assertEquals(17, DijkstrasAirportCityRoutes.shortestPath(graph, "A", "D"));
	    }
	}
