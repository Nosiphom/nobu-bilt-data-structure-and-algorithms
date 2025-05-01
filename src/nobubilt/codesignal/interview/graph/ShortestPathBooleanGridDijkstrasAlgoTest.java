package nobubilt.codesignal.interview.graph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ShortestPathBooleanGridDijkstrasAlgoTest {

	   @Test
	    public void testNoPath() {
	        boolean[][] grid = {
	            {true, true, false, true},
	            {false, true, true, false},
	            {true, true, false, true},
	            {true, false, true, true}
	        };
	        int[] source = {0, 0};
	        int[] destination = {3, 3};
	        List<int[]> expected = new ArrayList<>();
	        List<int[]> result = ShortestPathBooleanGridDijkstrasAlgo.shortestPath(grid, source, destination);

	        assertTrue(comparePaths(expected, result));
	    }

	    @Test
	    public void testComplexPath() {
	        boolean[][] grid = {
	            {true, false, false, false},
	            {true, true, true, true},
	            {false, false, false, true},
	            {false, false, false, true}
	        };
	        int[] source = {0, 0};
	        int[] destination = {3, 3};
	        List<int[]> expectedPath = Arrays.asList(
	            new int[]{0, 0}, new int[]{1, 0}, new int[]{1, 1}, 
	            new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 3}, 
	            new int[]{3, 3}
	        );
	        List<int[]> result = ShortestPathBooleanGridDijkstrasAlgo.shortestPath(grid, source, destination);

	        assertTrue(comparePaths(expectedPath, result));
	    }

	    @Test
	    public void testSingleCell() {
	        boolean[][] grid = {
	            {true}
	        };
	        int[] source = {0, 0};
	        int[] destination = {0, 0};
	        List<int[]> expectedPath = List.of(new int[]{0, 0});
	        List<int[]> result = ShortestPathBooleanGridDijkstrasAlgo.shortestPath(grid, source, destination);

	        assertTrue(comparePaths(expectedPath, result));
	    }

	    @Test
	    public void testSimpleCase() {
	        boolean[][] grid = {
	            {true, true},
	            {false, true}
	        };
	        int[] source = {0, 0};
	        int[] destination = {1, 1};
	        List<int[]> expectedPath = Arrays.asList(
	            new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 1}
	        );
	        List<int[]> result = ShortestPathBooleanGridDijkstrasAlgo.shortestPath(grid, source, destination);

	        assertTrue(comparePaths(expectedPath, result));
	    }

	    @Test
	    public void testNoPossiblePath() {
	        boolean[][] grid = {
	            {true, true, false, true},
	            {false, true, false, true},
	            {false, false, false, true},
	            {true, true, true, true}
	        };
	        int[] source = {0, 0};
	        int[] destination = {3, 3};
	        List<int[]> expected = new ArrayList<>();
	        List<int[]> result = ShortestPathBooleanGridDijkstrasAlgo.shortestPath(grid, source, destination);

	        assertTrue(comparePaths(expected, result));
	    }

	    private boolean comparePaths(List<int[]> expected, List<int[]> result) {
	        if (expected.size() != result.size()) {
	            return false;
	        }
	        
	        for (int i = 0; i < expected.size(); i++) {
	            if (!Arrays.equals(expected.get(i), result.get(i))) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}
