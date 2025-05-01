package nobubilt.codesignal.interview.array;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class KnightMinimumMovesChessBoardBFS {
/**
 * In this problem, you are given a standard 8×8 chessboard and two cells on the board — 
 * the start and the end cells. The aim is to calculate the minimum number of moves it 
 * would take for a chess knight to get from the given start cell to the end cell.
Your function should return the minimum number of moves the knight needs to get from 
the start cell to the end cell. Both start and end points are given 0-based 
(all coordinates are from 0 to 7).
 * @param board
 * @param start
 * @param end
 * @return
 */
	  public static int knightMoves(int[][] board, int[] start, int[] end) {
	        // TODO: implement the function
	        int[] rowDirs = {-2, -1,  1, 2, 2, 1, -1,  -2};
	        int[] colDirs = {-1, -2, -2,-1, 1, 2,  2,   1};
	        Set<String> visited = new HashSet<>();
	        Queue<ChessPair> queue = new ArrayDeque<>();
	        String startPos = start[0] + ":"+start[1];
	        String endPos =  end[0] + ":"+end[1];
	        queue.add(new ChessPair(startPos, start[0], start[1], 0));
	        
	        while(!queue.isEmpty())
	        {
	            ChessPair current = queue.poll();
	            if(!visited.contains(current.coordiates))
	            {
	                visited.add(current.coordiates);
	                if(current.coordiates.equals(endPos))
	                {
	                    return current.distance;
	                }
	                for(int inx = 0; inx < rowDirs.length; inx++)
	                {
	                    int nextRow = rowDirs[inx] + current.row;
	                    int nextCol = colDirs[inx] + current.col;
	                    String nextCoord = nextRow+":"+nextCol;
	                    if(visited.contains(nextCoord) || nextRow < 0 || nextRow > board.length 
	                    		|| nextCol < 0 || nextCol > board[0].length)
	                    {
	                       continue;
	                    }
	                    queue.add(new ChessPair(nextCoord, nextRow, nextCol, current.distance + 1));
	                }
	            }
	        }
	        return 0;
	    }
	    
	    
	}
	class ChessPair
	{
	    String coordiates;
	    int row;
	    int col;
	    int distance;
	    ChessPair(String coord, int n, int ch, int dist)
	    {
	        this.coordiates = coord;
	        this.row = n;
	        this.col = ch;
	        this.distance = dist;
	    }
	}
