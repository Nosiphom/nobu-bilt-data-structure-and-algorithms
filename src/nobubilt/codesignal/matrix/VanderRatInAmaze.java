package nobubilt.codesignal.matrix;

import java.util.ArrayList;
import java.util.List;

public class VanderRatInAmaze {
	public static boolean isSafe(int row, int col, int size, int[][] maze)
	{
		if(row >= 0 && row < size && col >= 0 && col < size && maze[row][col] == 1)
		{
			return true;
		}
		return false;
	}
	public static void createRoute(int row, int col, int[][] maze, List<String> routes,
			int size, StringBuilder sb)
	{
		String dirs = "DRUL";
		int[] rowDir = {1,0,-1,0};
		int[] colDir = {0,1,0,-1};
		if(row == size-1 && col == size-1) 
		{
			routes.add(sb.toString());
			return;
		}
		maze[row][col] = 0;
		for(int inx = 0; inx < dirs.length(); inx++)
		{
			int nextRow = rowDir[inx] + row;
			int nextCol = colDir[inx] + col;
			if(isSafe(nextRow, nextCol, size, maze))
			{
				sb.append(dirs.charAt(inx));
				createRoute(nextRow, nextCol, maze, routes, size, sb);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
		maze[row][col] = 1;
	}
	
	public static void printRoute(List<String> routes)
	{
		for(String route: routes)
		{
			System.out.println(route);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size = 4;
		 int[][] maze = { 
				 { 1, 0, 0, 0 },
                 { 1, 1, 0, 1 },
                 { 1, 1, 0, 0 },
                 { 0, 1, 1, 1 } };
		 
		 List<String> routes = new ArrayList<>();
		 
		 createRoute(0, 0, maze, routes, size, new StringBuilder());
		 
		 if(routes.isEmpty())
		 {
			 System.out.println("No solution");
		 }
		 else
		 {
			 printRoute(routes);
		 }
	}

}
