package nobubilt.codesignal.interview.graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstrasAirportCityRoutes {
/**
 * Given the flight map of a city, represented as a HashMap, where the key represents the 
 * name of the airport (as a String) and the corresponding value is another HashMap. In 
 * the second HashMap, the key represents the name of an airport directly reachable from 
 * the first airport, and the corresponding value represents the air distance (in km) 
 * between these two airports. Implement Dijkstra’s Algorithm to find the air distance of 
 * the shortest path between any two given airports. The function should return the 
 * corresponding distance. It is guaranteed the path from start to end always exists.

For instance:

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
Here, JFK, LAX, MIA, and others are names of airports, and distances are in kilometers (km).
 * @param graph
 * @param start
 * @param end
 * @return
 */
	 
  public static int shortestPath(Map<String, Map<String, Integer>> graph, String start, String end) {
    // TODO: implement Dijkstra's algorithm //35
    PriorityQueue<AirportNode> minHeap = new PriorityQueue<AirportNode>(Comparator.comparingInt(node -> node.distance));
    Map<String, Integer> distanceMap = new HashMap<>();
    distanceMap.put(start, 0);
    minHeap.add(new AirportNode(start, 0));
    
    while(!minHeap.isEmpty())
    {
        AirportNode currentNode = minHeap.poll();
        if(currentNode.distance > distanceMap.getOrDefault(currentNode.code, Integer.MAX_VALUE))
        {
            continue;
        }
        if(currentNode.code.equals(end))
        {
            return currentNode.distance;
        }
        for(String routeKey : graph.get(currentNode.code).keySet())
        {
            Integer routeDistance = graph.get(currentNode.code).get(routeKey);
            int  newDistance = currentNode.distance + routeDistance;
            if(newDistance < distanceMap.getOrDefault(routeKey, Integer.MAX_VALUE))
            {
                distanceMap.put(routeKey, newDistance);
                minHeap.add(new AirportNode(routeKey, newDistance));
            }
        }
    }
    return -1;
    }
}

	class AirportNode
	{
	    String code;
	    int distance;
	    AirportNode(String cd, int dist)
	    {
	        this.code = cd;
	        this.distance = dist;
	    }
	}
