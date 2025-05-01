package nobubilt.codesignal.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class BiggestRhombus {
	public static boolean withinBounds(int row, int col, int rowLen, int colLen)
	{
		if(row >= 0 && row < rowLen && col >= 0 && col < colLen)
		{
			return true;
		}
		return false;
	}
	
	public static int calc(int row, int col, int[][] grid, int sideLen)
	{
		int sum = 0;
		for(int side = 0; side < sideLen && withinBounds(row, col, grid.length, grid[0].length); side++)
		{
			sum += grid[row][col];
			row++; col++;
		}
		for(int side = 0; side < sideLen && withinBounds(row, col, grid.length, grid[0].length); side++)
		{
			sum += grid[row][col];
			row++; col--;
		}
		for(int side = 0; side < sideLen && withinBounds(row, col, grid.length, grid[0].length); side++)
		{
			sum += grid[row][col];
			row--; col--;
		}
		for(int side = 0; side < sideLen && withinBounds(row, col, grid.length, grid[0].length); side++)
		{
			sum += grid[row][col];
			row--; col++;
		}
		return sum;
	}
	public static int[] getBiggestThree(int[][] grid)
	{
		TreeSet<Integer> sumSet = new TreeSet<>(Comparator.reverseOrder());
		int rowLen = grid.length;
		int colLen = grid[0].length;
		for(int row = 0; row < rowLen; row++)
		{
			for(int col = 0; col < colLen; col++)
			{
				if(!sumSet.contains(grid[row][col])) {sumSet.add(grid[row][col]);}
			}
		}
		
		int minSide = Math.min(rowLen, colLen);
		for(int side = 1; side <= minSide/2; side++)
		{
			for(int row = 0; row < rowLen - (side * 2); row++)
			{
				for(int col = side; col < colLen; col++)
				{
					int sum = calc(row, col, grid, side);
					if(!sumSet.contains(sum)) {sumSet.add(sum);}
				}
			}
		}
		return reduceSet(sumSet);
	}
	public static int[] reduceSet(TreeSet<Integer> sumSet)
	{
		int len = Math.min(3, sumSet.size());
		int[] arr = new int[len];
		int inx = 0;
		for(Integer rec: sumSet)
		{
			arr[inx] = rec;
			++inx;
			if(inx == len) {break;}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {
				{3, 4,  5,  1,3},
				{3, 3,  4,  2,3},
				{20,30,200,40,10},
				{1, 5,  5,  4,1},
				{4, 3,  2,  2,5}};
		
		
		int[] outcome = getBiggestThree(grid);
		
		for(int inx = 0; inx < outcome.length; inx++)
		{
			System.out.print(outcome[inx]+ " ");
		}
/**				
 * Output: [228,216,211]
   Explanation: The rhombus shapes for the three biggest distinct 
   rhombus sums are depicted above.
   - Blue: 20 + 3 + 200 + 5 = 228
   - Red: 200 + 2 + 10 + 4 = 216
 * - Green: 5 + 200 + 4 + 2 = 211
*/						
	
		System.out.println();
		int[][] grid2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[] outcome2 = getBiggestThree(grid2);
		
		for(int inx = 0; inx < outcome2.length; inx++)
		{
			System.out.print(outcome2[inx]+ " ");
		}
/**
Output: [20,9,8]
Explanation: The rhombus shapes for the three biggest 
 distinct rhombus sums are depicted above.
- Blue: 4 + 2 + 6 + 8 = 20
- Red: 9 (area 0 rhombus in the bottom right corner)
- Green: 8 (area 0 rhombus in the bottom middle)
*/	
	}

}
