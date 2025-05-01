package nobubilt.codesignal.interview.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountConnectedComponentsInGraph {
/**
You are given the adjacency list representation of an undirected graph containing nodes 
labeled 0 to n - 1, where n indicates the number of nodes. Each node's adjacency list will 
contain the neighboring nodes along with the length of the path to the neighboring nodes. 

Your task is to implement an algorithm that calculates and returns the number of distinct 
connected components in the given graph. Connected components of a graph are subgraphs in 
which any two vertices are connected to each other by paths, and which are connected to no 
additional vertices in the supergraph. In other words, a connected component is a maximal 
set of nodes where there is a path between any pair of nodes within the set.

The expected time complexity is O(n+m), where n is the number of vertices and 
m is the number of edges in the graph.

*/
   public static int solution(List<List<int[]>> graph) {
        // TODO: implement the function to find the number of connected components in the graph
        int numberOfNodes = graph.size();
        Set<Integer> visited = new HashSet<>();
        int counter = 0;
        for(int inx = 0; inx < numberOfNodes; inx++)
        {
            if(dfst(graph, inx, visited))
            {
                ++counter;
            }
        }
        return counter;
    }
    
    public static boolean dfst(List<List<int[]>> graph, int index, Set<Integer> visited)
    {
        if(visited.contains(index)){return false;}
        visited.add(index);
        
        List<int[]> subList = graph.get(index);
        if(subList != null)
        {
            for(int[] arr : subList)
            {
                int node = arr[0];
                if(!visited.contains(node))
                {
                    boolean explored = dfst(graph, node, visited);
                    if(!explored)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
