package nobubilt.codesignal.interview.array;

import java.util.Stack;

public class CelebrityCheck {
	
	
	public static int findCelebrity(int[][] matrix, int size)
	{
		Stack<Integer> stack = new Stack<>();
		for(int inx = 0; inx < size; inx++)
		{
			stack.push(inx);
		}
		int candidate = -1;
		while(stack.size() > 1)
		{
			Integer canA = stack.pop();
			Integer canB = stack.pop();
			if(knows(canA, canB, matrix))
			{
				stack.push(canB);
			}
			else
			{
				stack.push(canA);
			}
		}
		if(stack.isEmpty()) {return candidate;}
		candidate = stack.pop();
		for(int inx = 0; inx < size; inx++)
		{
			if(inx != candidate && (knows(candidate, inx, matrix)|| !knows(inx, candidate, matrix)))
			{
				return -1;
			}
		}
		return candidate;
	}
	
	
	public static boolean knows(Integer canA, Integer canB, int[][] matrix)
	{
		if(matrix[canA][canB] == 1) {return true;}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] matrix = { {0, 0, 1, 0}, 
					   {0, 0, 1, 0}, 
					   {0, 0, 0, 0}, 
					   {0, 0, 1, 0} };
	
	int result= findCelebrity(matrix, 4);
	
	if(result != -1)
	{
		System.out.println("Matrix CelebrityID: " +result);
	}
	else
	{
		System.out.println("No solutions in Matrix");
	}

	int[][] table2 = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0} };
	int result2= findCelebrity(table2, 4);

	if(result2 != -1)
	{
		System.out.println("Table2 CelebrityID: " +result);
	}
	else
	{
		System.out.println("No solutions in Table");
	}
}
}
