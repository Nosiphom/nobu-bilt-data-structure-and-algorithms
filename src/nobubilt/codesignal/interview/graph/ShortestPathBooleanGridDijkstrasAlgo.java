package nobubilt.codesignal.interview.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class ShortestPathBooleanGridDijkstrasAlgo {
/**
 * Your task is to write a Java function shortestPath(boolean[][] grid, int[] source, int[] destination) 
 * that takes a given grid of size nxn, a start cell, and a destination cell and determines the 
 * shortest path using Dijkstra’s Algorithm. The function should return a list of coordinates 
 * representing the path from the source to the destination. The grid is given as a 2D array of 
 * booleans representing the intersections. true means that there is an intersection, and false 
 * means that the intersection is blocked. From any intersection, it is possible to move to any 
 * directly neighboring intersection (top, bottom, left, or right) if there is a path (true). 
 * All paths have the same weight, i.e., 1. If the path doesn't exist, return an empty list.
 * @param grid
 * @param source
 * @param destination
 * @return
 */

    public static List<int[]> shortestPath(boolean[][] grid, int[] source, int[] destination) {
        // TODO: Implement function
        List<int[]> resultPath = new ArrayList<>();
        // up right down left
        int[] rowDir = {-1, 0, 1, 0};
        int[] colDir = {0,  1, 0,-1};
        resultPath.add(source);
        
        if(source[0] == destination[0] && source[1] == destination[1])
        {
            return resultPath;
        }
        
        PriorityQueue<GraphNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.dist));
        minHeap.add(new GraphNode(source[0], source[1], 0));
        Map<String, Integer> distMap = new HashMap<>();
        distMap.put(source[0] + ":" + source[1], 0);
        while(!minHeap.isEmpty())
        {
            GraphNode currentNode = minHeap.poll();
            int currRow = currentNode.row;
            int currCol = currentNode.col;
            int currDistance = currentNode.dist;
            if(currRow == destination[0] && currCol == destination[1])
            {
                break;
            }
            String currKey = currRow + ":" + currCol;
            if(distMap.containsKey(currKey))
            {
                if(currDistance > distMap.get(currKey)){ continue;}
            }
            
            for(int dirInx = 0; dirInx < rowDir.length; dirInx++)
            {
                int nextRow = rowDir[dirInx] + currRow;
                int nextCol = colDir[dirInx] + currCol;
                if(nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length)
                {
                    continue;
                } 
                if(!grid[nextRow][nextCol])
                {
                    continue;
                }
                int nextDistance = currDistance + 1;
                String nextKey = nextRow +":"+nextCol;
              
                if(nextDistance < distMap.getOrDefault(nextKey, Integer.MAX_VALUE))
                {
                    minHeap.add(new GraphNode(nextRow, nextCol, nextDistance));
                    distMap.put(nextKey, nextDistance);
                    resultPath.add(new int[]{nextRow, nextCol});
                }
                

            }
        }
        
        int lastRow = resultPath.size()-1;
        if(resultPath.get(lastRow)[0] != destination[0] || resultPath.get(lastRow)[1] != destination[1])
        {
            return new ArrayList<>();
        }
        return resultPath;
    }
}

class GraphNode
{
    int row;
    int col;
    int dist;
    GraphNode(int r, int c, int d)
    {
        this.row = r;
        this.col = c;
        this.dist = d;
    }
    
}

