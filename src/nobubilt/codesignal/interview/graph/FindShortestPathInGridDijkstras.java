package nobubilt.codesignal.interview.graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindShortestPathInGridDijkstras {
/**
 * You are provided with a rectangular grid represented as a matrix, where each cell 
 * has an integer. The cells with positive integers represent clear paths that can 
 * be passed, and the number in the cell denotes the amount of effort required to 
 * pass through that cell. The cells with -1 represent obstacles that cannot be passed.

Your task is to write a function, findShortestPath(int[][] grid, int[] start, int[] end), where:
grid is a 2D array where grid[x][y] denotes the property of the cell at row x and column y. 
The top-left corner of the grid is (0, 0), and the bottom-right corner is 
(grid.length - 1, grid[0].length - 1). start and end are arrays, each having two elements representing 
the row and column coordinates, respectively. If the start cell or the end cell is an obstacle, 
or if the end cell cannot be reached from the start cell, the function should return -1.
 * @param grid
 * @param start
 * @param end
 * @return
 */	
	public static int findShortestPath(int[][] grid, int[] start, int[] end) {
        // TODO: implement solution 
        if(grid.length == 0 || grid[0].length == 0){return -1;}
        if(grid[start[0]][start[1]] == -1 || grid[end[0]][end[1]] == -1 ){return -1;}
        
        PriorityQueue<GridCellOnPath> minHeap = new PriorityQueue<>(Comparator.comparingInt(rec -> rec.dist));
        minHeap.add(new GridCellOnPath(start[0], start[1], grid[start[0]][start[1]]));
        Map<String, Integer> distMap = new HashMap<>();
        distMap.put(start[0] + ":" + start[1], grid[start[0]][start[1]]);
        // up right down left
        int[] rowDir = {-1, 0, 1, 0};        
        int[] colDir = {0, 1, 0, -1};
        
        while(!minHeap.isEmpty())
        {
            GridCellOnPath current = minHeap.poll();
            String currentPos = current.row + ":" + current.col;
            if(current.dist > distMap.getOrDefault(currentPos, Integer.MAX_VALUE)){continue;}
            if(current.row == end[0] && current.col == end[1])
            {
                return current.dist;
            }
            for(int inx  = 0; inx < rowDir.length; inx++)
            {
                int nextRow = rowDir[inx] + current.row;
                int nextCol = colDir[inx] + current.col;
                if(nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length)
                {
                    continue;
                }
                if(grid[nextRow][nextCol] == -1)
                {
                    continue;
                }
                
                String nextPos = nextRow +":"+nextCol;
                int nextDistance = grid[nextRow][nextCol] + current.dist;
                if(nextDistance > distMap.getOrDefault(nextPos, Integer.MAX_VALUE)){continue;}
                 
                distMap.put(nextPos, nextDistance);
                minHeap.add(new GridCellOnPath(nextRow, nextCol, nextDistance));
            }
        }
        return -1;
        
    }
}

class GridCellOnPath
{
    int row;
    int col;
    int dist;
 GridCellOnPath(int r, int c, int d)
 {
    this.row = r;
    this.col = c;
    this.dist = d;
 }
    
}
