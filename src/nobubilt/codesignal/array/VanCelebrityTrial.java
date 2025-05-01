package nobubilt.codesignal.array;

import java.util.Stack;

public class VanCelebrityTrial {

	/**
	 * In a party of N people, only one person is known to everyone. Such a person 
	 * may be present at the party, if yes, (s)he doesn’t know anyone at the party. 
	 * We can only ask questions like “does A know B? “. Find the stranger (celebrity)
	 *  in the minimum number of questions.
	We can describe the problem input as an array of numbers/characters representing 
	persons in the party. We also have a hypothetical function HaveAcquaintance(A, B)
	 which returns true if A knows B, and false otherwise. How can we solve the
	  problem? 

	Examples:  

	Input:
	MATRIX = { {0, 0, 1, 0},
			   {0, 0, 1, 0},
			   {0, 0, 0, 0}, 
			   {0, 0, 1, 0} }
	Output: id = 2
	Explanation: The person with ID 2 does not know anyone but everyone knows him

	Input:
	MATRIX = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0} }
	Output: No celebrity
	Explanation: There is no celebrity.
	 */

	//Java program to find celebrity using
	//stack data structure

	public static boolean knows(int candidateA, int candidateB, int[][] matrix)
	{
		return (matrix[candidateA][candidateB] == 1);
	}

	public static int findCelebrity(int[][] matrix, int n)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int candidate = -1;
		for(int inx = 0; inx < n; inx++)
		{
			stack.push(inx);
		}
// a 2       b  0      s 2
		while(stack.size() > 1)
		{
			int candidateA = stack.pop();
			int candidateB = stack.pop();

			if(knows(candidateA, candidateB, matrix))
			{
				stack.push(candidateB);
			}
			else
			{
				stack.push(candidateA);
			}
		}

		if(stack.isEmpty()) {return candidate;}
		if(!stack.isEmpty())
		{
			candidate = stack.pop();
		}
		
		for(int inx = 0; inx < matrix.length; inx++)
		{
			if(inx != candidate && (knows(candidate, inx, matrix) || !knows(inx, candidate, matrix)))
			{
				return -1; 
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		int[][] matrix = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };
		
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
