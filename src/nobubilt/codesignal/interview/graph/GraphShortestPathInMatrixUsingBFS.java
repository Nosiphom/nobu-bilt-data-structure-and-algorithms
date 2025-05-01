package nobubilt.codesignal.interview.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class GraphShortestPathInMatrixUsingBFS {
	  /**
	   * You are provided with a matrix of nxm elements (0s and 1s). You can interpret 1 as a 
	   * passable cell and 0 as an obstacle. You need to implement a function 
	   * bfsMatrix(int[][] matrix, int[] start, int[] end), which returns the length of the 
	   * shortest path from the start point to the end. The start and end points are 
	   * arrays [int, int] indicating the matrix cell (e.g., [0, 0] for the top-left). 
	   * If the path is impossible, return 0. It is guaranteed the starting point always 
	   * contains 1 in the matrix, i.e. there is no obstacle there.

	  Note: You can only move vertically or horizontally; diagonal movement is forbidden.
	  The expected time complexity for the problem is O(n⋅m).


	      @Test
	      public void test8() {
	          assertEquals(6, .bfsMatrix(new int[][]
	          {{1, 1, 1, 1, 1}, 
	          {1, 0, 0, 0, 1}, 
	          {1, 1, 1, 1, 1}}, new int[]{0,0}, new int[]{2,4}));
	      }
	   * 
	   *
	   */

	public static int bfsMatrix(int[][] mat, int[] start, int[] end) {
	        
	        // right, down,left,up
	        int[] rowDirs = {0,1,0, -1};
	        int[] colDirs = {1,0,-1, 0};
	        // TODO: implement
	        Set<String> visited = new HashSet<>();
	        Queue<MatrixPair> queue = new ArrayDeque<>();
	        String initalPos = start[0] + ":"+ start[1];
	        queue.add(new MatrixPair(initalPos, 0, start[0], start[1]));
	        String endCoordinates = end[0] + ":"+ end[1];
	        while(!queue.isEmpty())
	        {
	        	MatrixPair current = queue.poll();
	            if(!visited.contains(current.coordinates))
	            {
	                visited.add(current.coordinates);
	                if(current.coordinates.equals(endCoordinates))
	                {
	                    return current.distance;
	                }
	                for(int dirInx = 0; dirInx < rowDirs.length; dirInx++)
	                {
	                    int nextRow = rowDirs[dirInx] + current.row;
	                    int nextCol = colDirs[dirInx] + current.col;
	                    String nextCoordinates = nextRow + ":"+nextCol;
	                    if(nextRow < 0 || nextRow >= mat.length || nextCol < 0 || nextCol >= mat[0].length ||
	                    visited.contains(nextCoordinates))
	                    {
	                        continue;
	                    }
	                    if(mat[nextRow][nextCol] == 0)
	                    {
	                        continue;
	                    }
	                    
	                    queue.add(new MatrixPair(nextCoordinates, current.distance + 1, nextRow, nextCol));
	                }
	            }
	        }
	        return 0;
	    }
	}

	class MatrixPair
	{
	    String coordinates;
	    int distance;
	    int row;
	    int col;
	    MatrixPair(String coord, int dist, int row, int col)
	    {
	        this.coordinates = coord;
	        this.distance = dist;
	        this.row = row;
	        this.col = col;
	    }
	}

