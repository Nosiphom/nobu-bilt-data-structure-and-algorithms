package nobubilt.codesignal.interview.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphFindAllVerticesWithinDistance {
	 
/**
 * You are given a graph represented as an adjacency list and a starting vertex, start. 
 * The graph is undirected and could be either connected or not connected. The vertices are labeled 
 * with unique positive integers starting from 1. The task is to implement a function, 
 * findVerticesWithinDistance(graph, start, distance), that returns a list of all vertices, 
 * sorted in ascending order by their numbers, whose distance is less than or equal to distance 
 * from the starting vertex. The distance is defined as the minimum number of edges traversed to 
 * get from one vertex to another.

Here is how the graph would be represented in Java:
Map<Integer, List<Integer>> graph = new HashMap<>();
graph.put(1, Arrays.asList(2, 3));
graph.put(2, Arrays.asList(1, 4, 5));
graph.put(3, Arrays.asList(1));
graph.put(4, Arrays.asList(2));
graph.put(5, Arrays.asList(2, 6));
graph.put(6, Arrays.asList(5));
Vertices 2 and 3 are adjacent to vertex 1. Vertices 1, 4, and 5 are adjacent to vertex 2, and so on. 
For example, if start = 1 and distance = 2, your function should return [1, 2, 3, 4, 5].

The expected time complexity is O(n+m), where n is the number of vertices and m is the number of 
edges in the graph.
 * @param graph
 * @param start
 * @param distance
 * @return
 */

    public List<Integer> findVerticesWithinDistance(Map<Integer, List<Integer>> graph, 
    		int start, int distance) {
        // TODO: Implement the breadth-first search algorithm to find all vertices within a
    	//given distance.
        Queue<Pair> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(new Pair(start, 0));
        List<Integer> result = new ArrayList<>();
        
        while(!queue.isEmpty())
        {
            Pair current = queue.poll();
            if(!visited.contains(current.id))
            {
                visited.add(current.id);
                
                if(current.distance <= distance)
                {
                    result.add(current.id);
                }
                else
                {
                    break;
                }
                List<Integer> neighbors = graph.get(current.id);
                if(neighbors != null)
                {
              
                    for(Integer nextInteger : neighbors)
                    {
                        if(!visited.contains(nextInteger))
                        {
                            queue.add(new Pair(nextInteger, current.distance + 1));
                        }
                    }
                }
            }
        }
        
        return result;
    }
}

class Pair
{
    int id;
    int distance;
    Pair(int identifier, int dist)
    {
        this.id = identifier;
        this.distance = dist;
    }
}
