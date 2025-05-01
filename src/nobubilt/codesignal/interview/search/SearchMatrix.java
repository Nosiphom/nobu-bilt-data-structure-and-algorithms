package nobubilt.codesignal.interview.search;

public class SearchMatrix {

	public class Solution {
 /**
  * One practical exercise that we will cover is, given a sorted matrix where 
  * each row and column is sorted in ascending order, we have to search for a 
  * particular target value. This exercise enhances your problem-solving skills
  *  and deepens your understanding of matrix traversal.

 Since the matrix is sorted both row-wise and column-wise, we can leverage this 
 property for an efficient search. Start from the top-right corner of the matrix:

 If the current element equals the target, you've found the value.
 If the current element is greater than the target, move left (one column back).
 If the current element is less than the target, move down (one row forward).
 Continue these steps until you either find the target or exhaust the search space. 
 This method ensures that each step narrows down the potential search area efficiently.
  * 
  *
  */
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 4,   7, 11, 15},
	            {2, 5,   8, 12, 19},
	            {3, 6,   9, 16, 22},
	            {10, 13, 14, 17, 24},
	            {18, 21, 23, 26, 30}
	        };

	        int target = 15;
	        boolean found = searchMatrix(matrix, target);

	        if (found) {
	            System.out.println("Target found");
	        } else {
	            System.out.println("Target not found");
	        }
	    }
	    
	    public static boolean searchMatrix(int[][] matrix, int target) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        // Start from the top-right corner
	        int row = 0, col = cols - 1;

	        while (row < rows && col >= 0) {
	            if (matrix[row][col] == target) {
	                return true;
	            } else if (matrix[row][col] > target) {
	                col--; // Move left
	            } else {
	                row++; // Move down
	            }
	        }

	        return false; // Target not found
	    }
	}
}
