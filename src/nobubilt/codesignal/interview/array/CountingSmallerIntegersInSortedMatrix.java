package nobubilt.codesignal.interview.array;

public class CountingSmallerIntegersInSortedMatrix {
/**
 * You're given a matrix where each row is sorted in ascending order. The columns are 
 * also sorted in ascending order. This creates a special pattern where the values in 
 * the matrix increase as you move right or down but decrease as you move left or up.

Your task is to write a Java function that counts the number of integers in the matrix 
that are smaller than the given target. The function should return this count as an integer.

The expected complexity is O(n+m), where n is the number of rows and m is the number of 
columns in the matrix.For example, given a matrix:
[
  [1, 2, 3, 4],
  [2, 3, 4, 5],
  [3, 4, 5, 6],
  [4, 5, 6, 7]
]
and a target of 5, the function countLessThan(matrix, 5) should return 10 because there 
are 10 numbers in the matrix that are less than 5.
 */
	public static int countLessThan(int[][] matrix, int target) {
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int row = 0; row < rows; row++)
        {
            if(matrix[row][0] < target && matrix[row][cols-1] < target)
            {
                count += cols;
                continue;
            }
            if(matrix[row][0] >= target){break;}
            for(int col = cols -1; col >= 0; col--)
            {
                if(matrix[row][col] >= target)
                {
                    continue;
                }
                count += col + 1;
                break;
            }
        }
        
        // TODO: Implement countLessThan
        return count;
    }
}
