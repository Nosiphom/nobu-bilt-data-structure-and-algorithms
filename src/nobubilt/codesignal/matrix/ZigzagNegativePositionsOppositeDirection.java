package nobubilt.codesignal.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ZigzagNegativePositionsOppositeDirection {
/**
 * Given a matrix of n x m integers, where n represents the number of rows and m 
 * represents the number of columns. Both n and m range from 1 to 100, inclusive.

The matrix cells may contain either a positive, a negative integer, or zero, with values 
ranging from -100 to 100, inclusive.

In this task, you are required to traverse the matrix diagonally from the top-left cell 
to the bottom-right cell in a zigzag pattern. Start from the top-left cell, move one cell
 to the right (if it exists), then move one step diagonally down-left. After reaching a 
 left (bottom) boundary, move one step down (right) and start moving diagonally up-right. 
 Continue this pattern until you reach the last cell of the matrix. Your task is to return 
 a list of tuples, each tuple containing the index pair (in 1-based indexing format) of 
 cells with negative integers encountered during your traversal.

For example, consider a 3 x 4 matrix:

{{1, -2,  3, -4},
{ 5, -6,  7,  8},
{-9, 10, -11, 12}}
The traversal in a zigzag pattern will result in: {1, -2, 5, -9, -6, 3, -4, 7, 10, -11,
 8, 12}.

The negative integers in this sequence and their corresponding positions in the matrix are:
 {-2, -9, -6, -4, -11}, with indices: {{1, 2}, {3, 1}, {2, 2}, {1, 4}, {3, 3}}.

Your function, solution(matrix), should then return these indices as a list of arrays: 
{{1, 2}, {3, 1}, {2, 2}, {1, 4}, {3, 3}}.

 */
	   // TODO: implement
    public List<int[]> solution(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int dir = 1; // going up right
    Map<Integer, int[]> diagonalsMap = new HashMap<>();
    List<Integer> diagonals = new ArrayList<>();
    int row = 0;
    int col = 0;
    for(int inx = 0; inx < rows * cols; inx++)
    {
        diagonals.add(matrix[row][col]);
        diagonalsMap.put(matrix[row][col], new int[]{row+1, col+1});
        if(dir == 1) //going up right
        {
           if(col == cols-1)
            {
                row +=1;
                dir = -1;
            }       
            else if(row == 0)
            {
                col +=1;
                dir = -1; // left down
            }
            else
            {
                row -=1;
                col +=1;
            }
        }
        else // going left down
        {
           
            if(row == rows -1)
            {
                col +=1;
                dir = 1;
            }
            else if(col == 0)
            {
                row +=1;
                dir = 1;
               
            }
            else
            {
                row +=1;
                col -=1;
            }           
        }
    }
    List<int[]> negatives = new ArrayList<>();
    for(int inx =0; inx < diagonals.size(); inx++)
    {
        if(diagonals.get(inx) < 0)
        {
            int negativeKey = diagonals.get(inx);
            negatives.add(diagonalsMap.get(negativeKey));
        }
    }
    return negatives;
}
}
