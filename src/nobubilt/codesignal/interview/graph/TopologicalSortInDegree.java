package nobubilt.codesignal.interview.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TopologicalSortInDegree {
	 
/**
 * Given a directed acyclic graph (DAG) as an adjacency list, where keys represent nodes 
 * and values represent edges from that node to other nodes, implement a function, 
 * topologicalSort(Map<String, List<String>> graph), that performs a topological sort on this 
 * graph. 
 * The function should return a list containing all the nodes of the graph in topological order.

If multiple topological orders are possible, the function can return any one of them. 
If you are unfamiliar, a topological order of a DAG is a linear ordering of its nodes such that 
for every directed edge u -> v from node u to node v, u comes before v in the ordering.
For example:
Map<String, List<String>> graph = new HashMap<>();
graph.put("A", Arrays.asList("B", "C"));
graph.put("B", Arrays.asList("D"));
graph.put("C", Arrays.asList("D"));
graph.put("D", new ArrayList<>());

List<String> result = Solution.topologicalSort(graph);
System.out.println(result);
Expected Output: [A, C, B, D] or [A, B, C, D].

The expected time complexity is O(n+m), where n is the number of vertices and 
m is the number of edges in the graph.
Pointers:
Initialize In-Degree Map: Create a map to track the in-degree (number of incoming edges) for 
each node. 
Initialize all nodes with an in-degree of zero.
Calculate In-Degrees: Iterate over the graph to calculate the in-degree for each node. 
For every edge u -> v, increment the in-degree of v.
Queue for Zero In-Degree Nodes: Use a queue to process nodes with zero in-degree. 
These nodes can be added to the topological order immediately since they have no dependencies.
Process Nodes: While the queue is not empty, remove a node, add it to the topological order, 
and decrease the in-degree of its neighbors. If a neighbor's in-degree becomes zero, add it to 
the queue.

Check for Completion: If the topological order contains all nodes, the sort is successful. 
Otherwise, there might be an issue with the graph input.
	
 * This approach ensures that all nodes, including those with no incoming edges, are 
 * processed correctly. 
 * @param graph
 * @return
 */
    public static List<String> topologicalSort(Map<String, List<String>> graph) {
        // TODO: implement
        Map<String, Integer> inDegreeMap = new HashMap<>();
        for(String nodeKey : graph.keySet())
        {
            inDegreeMap.put(nodeKey, 0);
        }
        
        for(String nodeKey : graph.keySet())
        {
            for(String neighbor : graph.get(nodeKey))
            {
                inDegreeMap.put(neighbor, inDegreeMap.get(neighbor) + 1);
            }
        }
        Queue<String> queue = new ArrayDeque<>();
        for(String nodeKey : inDegreeMap.keySet())
        {
            if(inDegreeMap.get(nodeKey) == 0)
            {
                queue.add(nodeKey);
            }
        }
        List<String> topologicalList = new ArrayList<>();
        while(!queue.isEmpty())
        {
            String currentNode = queue.poll();
            topologicalList.add(currentNode);
            for(String neighbor : graph.get(currentNode))
            {
                inDegreeMap.put(neighbor, inDegreeMap.get(neighbor)-1);
                if(inDegreeMap.get(neighbor) == 0)
                {
                    queue.add(neighbor);
                }
            }
        }
        return topologicalList;
    }
}
