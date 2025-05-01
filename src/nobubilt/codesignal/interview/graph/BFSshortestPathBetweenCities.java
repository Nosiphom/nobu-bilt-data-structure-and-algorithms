package nobubilt.codesignal.interview.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSshortestPathBetweenCities {
/**
 * You are provided with a representation of a network of cities and roads between them.
 * Each city can be identified by a unique string identifier, and for each city you are
 *  given a set of cities it is connected to by a road.

Your task is to create a function 
shortestDistance(Map<String, Set<String>> roads, String start, String destination) 
in Java that extracts the shortest distance from start to destination using the graph 
traversal algorithm we discussed in the lesson, the Breadth-First Search (BFS). 
If there are no roads leading to the destination, your function should return null.
          put("A", new HashSet<>(Arrays.asList("B")));
            put("B", new HashSet<>(Arrays.asList("C", "A")));
            put("C", new HashSet<>(Arrays.asList("B")));
            put("D", new HashSet<>(Arrays.asList("E")));
            put("E", new HashSet<>(Arrays.asList("D")));
        }};
        assertEquals(null, .shortestDistance(roads, "A", "D"));
    }
 * 
 * 
 * @param roads
 * @param start
 * @param destination
 * @return
 */
	  public static Integer shortestDistance(Map<String, Set<String>> roads, 
			  String start, String destination) {
	        // TODO: implement
	        if(start.equals(destination)){return 0;}
	        Queue<Pair> queue = new ArrayDeque<>();
	        Set<String> visited = new HashSet<>();
	        Integer shortestDistance = 0;
	        queue.add(new Pair(start, 0));
	        
	        while(!queue.isEmpty())
	        {
	            Pair current = queue.poll();
	            if(!visited.contains(current.city))
	            {
	                if(current.city.equals(destination))
	                {
	                    shortestDistance = current.distance;
	                    break;
	                }
	                visited.add(current.city);
	                Set<String> neighbors = roads.get(current.city);
	                if(neighbors != null)
	                {
	                    for(String neighbor : neighbors)
	                    {
	                        if(!visited.contains(neighbor))
	                        {
	                            queue.add(new Pair(neighbor, current.distance + 1));                            
	                        }
	                    }
	                }
	            }
	        }
	        if(shortestDistance == 0)
	        {
	            return null;
	        }
	        
	        return shortestDistance;
	    }

	    private static class Pair {
	        String city;
	        int distance;
	        
	        Pair(String city, int distance) {
	            this.city = city;
	            this.distance = distance;
	        }
	    }
	}
