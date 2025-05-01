package nobubilt.codesignal.interview.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class EfficientPathSocialNetworkDijkstras {

	/**
	 * Let's say you are part of a social network, represented as an undirected graph where you 
	 * and every other user are nodes, and any interaction between users forms edges. The edge 
	 * weight represents the interaction frequency, with a lower weight indicating more 
	 * frequent interaction. Your task is to write a Java function findFriend that takes a 
	 * social network graph, your ID (a node in the graph), and a potential friend’s ID
	 *  (another node in the graph). The function should return a list of friends to get 
	 *  introduced to in order to meet your potential friend efficiently, taking into account
	 *   interaction frequency (i.e., the weights on the edges). If no friends are found, return
	 *    an empty list. 
	 *  Track the Path: Instead of adding nodes to the friends list as you 
	 *  visit them, maintain a map to track the predecessor of each node. This will help you 
	 *  reconstruct the path once you reach the potential friend.
        Reconstruct the Path: Once you reach the potentialFriendId, backtrack using the 
        predecessor map to build the path from yourId to potentialFriendId.
        Avoid Adding Nodes Prematurely: Only add nodes to the path once you've confirmed 
        the shortest path to them.
	 */
	
    public static List<String> findFriend(Map<String, Map<String, Integer>> graph, 
    		String yourId, String potentialFriendId) {
        // TODO: implement the function using Dijkstra's algorithm
        PriorityQueue<SocialNetworkNode> minHeap = new PriorityQueue<>(
        		Comparator.comparingInt(rec -> rec.distance));
        Map<String, Integer> distMap = new HashMap<>();
        distMap.put(yourId, 0);
        minHeap.add(new SocialNetworkNode(yourId, 0));
        List<String> friends = new ArrayList<>();
        Map<String, String> predecessorMap = new HashMap<>();
        
        while(!minHeap.isEmpty())
        {
            SocialNetworkNode current = minHeap.poll();
            if(current.distance > distMap.get(current.node)){continue;}
            
            if(current.node == potentialFriendId)
            {
                break;
            }
            Map<String, Integer> networkMap = graph.get(current.node);
            if(networkMap != null)
            {
                for(String key : networkMap.keySet())
                {
                    int nextDistance = networkMap.get(key);
                    if(nextDistance + current.distance < 
                    		distMap.getOrDefault(key, Integer.MAX_VALUE))
                    {
                         distMap.put(key, nextDistance + current.distance);
                         minHeap.add(new SocialNetworkNode(key, 
                        		 nextDistance + current.distance));
                         predecessorMap.put(key, current.node);                  
                    }    
                }
            }
        }
       
       if(!predecessorMap.isEmpty() && predecessorMap.values().contains(yourId))
       {
          String key = potentialFriendId;
          
          if(predecessorMap.containsKey(key))
          {
                friends.add(potentialFriendId);
                while(predecessorMap.get(key) != null && 
                		!predecessorMap.get(key).equals(yourId))
                {
                    friends.add(predecessorMap.get(key));
                    key = predecessorMap.get(key);
                }
                if(predecessorMap.get(key) != null)
                {
                    friends.add(yourId);
                    Collections.reverse(friends);
                }
          }     
       }
       
       return friends;
    }
}
class SocialNetworkNode
{
    String node;
    int distance;
    SocialNetworkNode(String n, int dist)
    {
        this.node = n;
        this.distance = dist;
    }
}

