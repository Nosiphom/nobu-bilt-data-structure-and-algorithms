package nobubilt.codesignal.matrix;

public class InterleavingMatrices {	
/**
 * Your task is to write a function, interleaveMatrices, that takes two matrices 
 * (2D arrays) and a start and end range for rows and columns for each matrix as inputs. 
 * Instead of concatenating submatrices together, this task requires interleaving the 
 * columns from the submatrices within the final matrix.

If A and B are your two matrices, and the respective submatrices selected from them 
based on the given ranges are sub_A and sub_B, then the task is to form a new matrix C 
by interleaving columns from sub_A and sub_B. Starting with the first column of sub_A, 
alternately include a column from sub_A and a column from sub_B until all columns from 
both submatrices are included.

All matrices are filled with integers. The size of each matrix, A and B, ranges between 
1×1 and 10×10, inclusive, and each element in the matrix is from the range of 
−100 to 100, inclusive. The start and end ranges for rows and columns for each matrix are 
provided as an array {start_row, end_row, start_column, end_column}, and these are 
1-based indices.

For example, if A is:

{{1, 2, 3, 4},
{5, 6, 7, 8},
{9, 10, 11, 12}}
and B is:

{{11, 12, 13},
{14, 15, 16},
{17, 18, 19}}
If we select 2x2 submatrices from each (comprising the 2nd to the 3rd rows and the 
2nd to the 3rd columns from A, and the 1st to the 2nd rows and the 1st to the 2nd 
columns from B), their interleaved combination would look like this:

Copy to clipboard
{{6, 11, 7, 12},
{10, 14, 11, 15}}
Note that in the output, columns from sub_A and sub_B are interwoven.

It is guaranteed that the given submatrices have pairwise equal dimensions.
 */
	 public int[][] interleaveMatrices(int[][] matrixA, int[][] matrixB, int[][] submatrixCoords)
	 {
		 int startRowA = submatrixCoords[0][0];
		 int endRowA = submatrixCoords[0][1];
		 int startColA = submatrixCoords[0][2];
		 int endColA = submatrixCoords[0][3];
		 int startRowB = submatrixCoords[1][0];
		 int endRowB = submatrixCoords[1][1];
		 int startColB = submatrixCoords[1][2];
		 int endColB = submatrixCoords[1][3];
		 
		 int numRows = endRowA - startRowA + 1;
		 int colsA = endColA - startColA + 1;
		 int colsB = endColB - startColB + 1;
		 
		 int[][] subA = new int[numRows][colsA];
		 int[][] subB = new int[numRows][colsB];
		 
		 for(int rowA = 0; rowA < numRows; rowA++)
		 {
			 for(int colA = 0; colA < colsA; colA++)
			 {
				 subA[rowA][colA] = matrixA[startRowA - 1 + rowA][startColA - 1 + colA];
			 }
		 }
		
		 for(int rowB = 0; rowB < numRows; rowB++)
		 {
			 for(int colB = 0; colB < colsB; colB++)
			 {
				 subB[rowB][colB] = matrixB[startRowB - 1 + rowB][startColB - 1 + colB];
			 }
		 }
		 int[][] result = new int[numRows][colsA + colsB];
		
		 for(int row = 0; row < numRows; row++)
		 {
			 int col = 0;
			 for(int colA = 0, colB = 0; colA < colsA && colB < colsB; colA++, colB++)
			 {
				 if(colA < colsA)
				 {
					 result[row][col] = subA[row][colA];
					 ++col;
				 }
				 if(colB < colsB)
				 {
					 result[row][col] = subB[row][colB];
					 ++col;
				 }
			 }
		 }
		 return result;
	 }
}
