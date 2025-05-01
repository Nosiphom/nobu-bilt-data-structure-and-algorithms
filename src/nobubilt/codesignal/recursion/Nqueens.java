package nobubilt.codesignal.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Complexity Analysis

Given N as the number of queens (which is the same as the width and height of the 
board),

Time complexity: O(N!)  

Unlike the brute force approach, we will only place queens on squares that aren't 
under attack. For the first queen, we have N options. For the next queen, we won't
attempt to place it in the same column as the first queen, and there must be at 
least one square attacked diagonally by the first queen as well. Thus, the maximum 
number of squares we can consider for the second queen is N−2. For the third queen, 
we won't attempt to place it in 2 columns already occupied by the first 2 queens, 
and there must be at least two squares attacked diagonally from the first 2 queens. 
Thus, the maximum number of squares we can consider for the third queen is N−4. 
This pattern continues, resulting in an approximate time complexity of N!.

While it costs O(N^2) to build each valid solution, the amount of valid solutions
S(N) does not grow nearly as fast as N!, so O(N! + S(N) * N^2)=O(N!)

Space complexity: O(N^2)

Extra memory used includes the 3 sets used to store board state, as well as the 
recursion call stack. All of this scales linearly with the number of queens. 
However, to keep the board state costs O(N^2), since the board is of size N * N. 
Space used for the output does not count towards space complexity.
 */

public class Nqueens {
	
	public static List<String> createRows(char[][] grid, int size)
	{
		List<String> result = new ArrayList<>();
		for(int inx = 0;  inx < size; inx++)
		{
			result.add(new String(grid[inx]));
		}
		
		return result;
	}
	
	public static void solve(int row, Set<Integer> currColumns, Set<Integer> diagonals,
			Set<Integer> antidiagonals, int size, char[][] grid, List<List<String>> outcome)
	{
		if(row == size)
		{
			outcome.add(createRows(grid, size));
			return;
		}
		
		for(int col = 0; col < size; col++)
		{
			int currDiagonals = row-col;
			int currAntidiagonals = row + col;
			if(currColumns.contains(col) || diagonals.contains(currDiagonals) 
					|| antidiagonals.contains(currAntidiagonals))
			{
				continue;
			}
			currColumns.add(col);
			diagonals.add(currDiagonals);
			antidiagonals.add(currAntidiagonals);
			grid[row][col] = 'Q';
			solve(row + 1, currColumns, diagonals, antidiagonals, size, grid, outcome);
			grid[row][col] = '.';
			currColumns.remove(col);
			diagonals.remove(currDiagonals);
			antidiagonals.remove(currAntidiagonals);
			
		}
	}
	public static List<List<String>> solveNQueens(int size)
	{
		 List<List<String>> outcome = new ArrayList<>();
		char[][] grid = new char[size][size];
		for(char[] row: grid)
		{
			Arrays.fill(row, '.');
		}
		
	   solve(0, new HashSet<>(), new HashSet<>(), new HashSet<>(), size
					, grid, outcome);
		
		return outcome;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> outcome = solveNQueens(4);
		
		for(List<String> subset : outcome)
		{
			for(String rec : subset)
			{
				System.out.print(rec+" ");
			}
			System.out.println();
		}
		
		// For n=4 => [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
		// acutual =>    .Q..   ...Q   Q...   ..Q. and ..Q.   Q...   ...Q   .Q.. 
	}
	
	
	/**
	 * 
.Q.. 
...Q 
Q... 
..Q. 

..Q. 
Q... 
...Q 
.Q.. 
	 */
	
}
