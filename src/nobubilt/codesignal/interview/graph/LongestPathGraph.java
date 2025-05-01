package nobubilt.codesignal.interview.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LongestPathGraph {

/**
 * You are given a Directed Acyclic Graph (DAG) with n vertices and m edges. 
 * Each edge has an associated weight. Your task is to implement an algorithm 
 * that finds the longest path in the graph. A path is a series of vertices in
 *  a graph such that each vertex is connected to the next vertex by an edge.

The DAG will be represented as an adjacency list in the form of a 
Map<Integer, List<int[]>>. In this representation:

The key of the map is the current node. Each entry in the list is an array of 
two integers, where the first integer is another node (the destination node) 
that is connected by an edge from the current node, and the second integer is 
the weight of that edge. For example, consider the following graph:

 0   ->   (5)   ->   2
 |					 ^
 ~					 |
(3)   ->   1   ->   (2) 
In this graph:
Node 0 has an edge to node 1 with a weight of 3.
Node 0 also has an edge to node 2 with a weight of 5.
Node 1 has an edge to node 2 with a weight of 2.
This graph can be represented as:

Map<Integer, List<int[]>> graph = new HashMap<>();
graph.put(0, List.of(new int[]{1, 3}, new int[]{2, 5}));
graph.put(1, List.of(new int[]{2, 2}));
graph.put(2, new ArrayList<>());
Your solution should have a time complexity of O(n⋅(n+m)).
 * @param graph
 * @param numVertices
 * @return
 */

    public static int longestPath(Map<Integer, List<int[]>> graph, int numVertices) {
        // TODO: implement the solution here.
        Map<Integer, Integer> inDegreeMap = new HashMap<>();
        for(int inx = 0; inx < numVertices; inx++)
        {
            inDegreeMap.put(inx, 0);
        }
        for(Integer key : graph.keySet())
        {
            for(int[] row : graph.get(key))
            {
                if(row[0] < numVertices)
                {
                    inDegreeMap.put(row[0], inDegreeMap.getOrDefault(row[0], 0) + 1);  
                }
                
            }
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for(Integer key : inDegreeMap.keySet())
        {
            if(inDegreeMap.get(key) == 0)
            {
                queue.add(key);
            }
        }
        
        List<Integer> topologicalSortList = new ArrayList<>();
        while(!queue.isEmpty())
        {
            Integer current = queue.poll();
            topologicalSortList.add(current);
            List<int[]> edgeList = graph.get(current);
            if(edgeList != null)
            {
                for(int[] row : edgeList)
                {
                    int rowNode = row[0];
                    if(inDegreeMap.containsKey(rowNode))
                    {
                        inDegreeMap.put(rowNode, inDegreeMap.get(rowNode) - 1);
                        if(inDegreeMap.get(rowNode) == 0)
                        {
                            queue.add(rowNode);
                        }           
                    }
                }
            }
        }
        
        Integer[] distance = new Integer[numVertices];
        Arrays.fill(distance, Integer.MIN_VALUE);
        for(int currentNode : topologicalSortList)
        {          
            if(distance[currentNode] == Integer.MIN_VALUE)
            {
                distance[currentNode] = 0;
            }
            List<int[]> edgeList = graph.get(currentNode);
            if(edgeList != null)
            {
                for(int[] row : edgeList)
                {
                    int rowNode = row[0];
                    int rowWeight = row[1];
                    if(rowNode < numVertices && distance[rowNode] < rowWeight + distance[currentNode])
                    {
                        distance[rowNode]=rowWeight + distance[currentNode];
                    }
                }
            }
        }
        
        int longestDistance = Integer.MIN_VALUE;
        
        for(int dist : distance)
        {
            longestDistance = Math.max(longestDistance, dist);
        }
        return longestDistance == Integer.MIN_VALUE ? 0 :  longestDistance;
    }
}
