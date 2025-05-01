package nobubilt.codesignal.interview.graph;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;


public class DijkstrasAlgo {
   public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", Map.of("B", 1, "C", 4));
        graph.put("B", Map.of("A", 1, "C", 2, "D", 5));
        graph.put("C", Map.of("A", 4, "B", 2, "D", 1));
        graph.put("D", Map.of("B", 5, "C", 1));

        System.out.println(dijkstra(graph, "A")); // Output: {A=0, B=1, C=3, D=4}
    }
	
    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, 
    		String start) {
        PriorityQueue<VanBidNode> minHeap = new PriorityQueue<>(
        		Comparator.comparingInt(node -> node.distance));
        minHeap.add(new VanBidNode(start, 0));
        Map<String, Integer> dist = new HashMap<>();
        dist.put(start, 0);

        while (!minHeap.isEmpty()) {
        	VanBidNode currentNode = minHeap.poll();
            String u = currentNode.id;
            int current_dist = currentNode.distance;

            if (current_dist > dist.getOrDefault(u, Integer.MAX_VALUE)) {
                continue;
            }

            for (Map.Entry<String, Integer> neighbor : graph.getOrDefault(u,
            		new HashMap<>()).entrySet()) {
                String v = neighbor.getKey();
                int weight = neighbor.getValue();
                int distance = current_dist + weight;

                if (distance < dist.getOrDefault(v, Integer.MAX_VALUE)) {
                    dist.put(v, distance);
                    minHeap.add(new VanBidNode(v, distance));
                }
            }
        }

        return dist;
    }
	
}
class VanBidNode {
    String id;
    int distance;

    VanBidNode(String id, int distance) {
        this.id = id;
        this.distance = distance;
    }
}