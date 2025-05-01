package nobubilt.codesignal.interview.graph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class BFSshortestPathBetweenCitiesTest {
    @Test 
    public void test1() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>(){{
            put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("C", "A")));
            put("C", new HashSet<>(Arrays.asList("B")));
            put("D", new HashSet<>(Arrays.asList("E")));
            put("E", new HashSet<>(Arrays.asList("D")));
        }};
        assertEquals(null, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "D"));
    }

    @Test
    public void test2() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("C", "A")));
            put("C", new HashSet<>(Arrays.asList("B")));
        }};
        assertEquals(2, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "C"));
    }

    @Test
    public void test3() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("A")));
        }};
        assertEquals(1, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "B"));
    }

    @Test
    public void test4() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("D", "C", "A")));
            put("C", new HashSet<>(Arrays.asList("B")));
            put("D", new HashSet<>(Arrays.asList("E", "B")));
            put("E", new HashSet<>(Arrays.asList("D")));
        }};
        assertEquals(3, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "E"));
    }

    @Test
    public void test5() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("C", "B")));
            put("B", new HashSet<>(Arrays.asList("A")));
            put("C", new HashSet<>(Arrays.asList("A")));
        }};
        assertEquals(2, BFSshortestPathBetweenCities.shortestDistance(roads, "B", "C"));
    }

    @Test
    public void test6() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("C", "B")));
            put("B", new HashSet<>(Arrays.asList("D", "A")));
            put("C", new HashSet<>(Arrays.asList("E", "A")));
            put("D", new HashSet<>(Arrays.asList("F", "B")));
            put("E", new HashSet<>(Arrays.asList("C")));
            put("F", new HashSet<>(Arrays.asList("D")));
        }};
        assertEquals(3, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "F"));
    }

    @Test
    public void test7() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("C", "A")));
            put("C", new HashSet<>(Arrays.asList("B")));
        }};
        assertEquals(0, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "A"));
    }

    @Test
    public void test8() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("D", "C", "B")));
            put("B", new HashSet<>(Arrays.asList("A")));
            put("C", new HashSet<>(Arrays.asList("A")));
            put("D", new HashSet<>(Arrays.asList("A")));
        }};
        assertEquals(1, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "D"));
    }
    
    @Test 
    public void test9() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("D", "C", "E", "A")));
            put("C", new HashSet<>(Arrays.asList("B")));
            put("D", new HashSet<>(Arrays.asList("B")));
            put("E", new HashSet<>(Arrays.asList("B")));
        }};
        assertEquals(2, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "E"));
    }

    @Test 
    public void test10() {
        Map<String, Set<String>> roads = new HashMap<String, Set<String>>() {{
            put("A", new HashSet<>());
            put("B", new HashSet<>());
            put("C", new HashSet<>());
            put("D", new HashSet<>());
            put("E", new HashSet<>());
        }};
        assertEquals(null, BFSshortestPathBetweenCities.shortestDistance(roads, "A", "E"));
    }
}