package nobubilt.codesignal.matrix;

public class CombineTwoSubmatrices {
/**
 * Imagine having two different 2D arrays, A and B. Our job is to devise a Java method — 
 * let's name it submatrixConcatenation() — which takes these two matrices as inputs, 
 * along with the coordinates specifying submatrices within A and B. This method is 
 * expected to stitch the two chosen submatrices together, forming a new one, C. Notably,
 *  the submatrices from A and B should have the same number of rows, and in the final 
 *  matrix C, elements from A's submatrix should be on the left and those from B's submatrix 
 *  on the right.
 */

	    public static int[][] submatrixConcatenation(
	        int[][] matrixA, 
	        int[][] matrixB, 
	        int[][] submatrixCoords) {

	        int startRowA = submatrixCoords[0][0];
	        int endRowA = submatrixCoords[0][1];
	        int startColA = submatrixCoords[0][2];
	        int endColA = submatrixCoords[0][3];
	        int startRowB = submatrixCoords[1][0];
	        int endRowB = submatrixCoords[1][1];
	        int startColB = submatrixCoords[1][2];
	        int endColB = submatrixCoords[1][3];

	        int numRows = endRowA - startRowA + 1;
	        int numColsA = endColA - startColA + 1;
	        int numColsB = endColB - startColB + 1;

	        int[][] submatrixA = new int[numRows][numColsA];
	        for (int row = 0; row < numRows; row++) {
	            for (int col = 0; col < numColsA; col++) {
	                submatrixA[row][col] = matrixA[startRowA + row - 1][startColA + col - 1];
	            }
	        }

	        int[][] submatrixB = new int[numRows][numColsB];
	        for (int row = 0; row < numRows; row++) {
	            for (int col = 0; col < numColsB; col++) {
	                submatrixB[row][col] = matrixB[startRowB + row - 1][startColB + col - 1];
	            }
	        }

	        // The part for the concatenation process
	        int[][] resultMatrix = new int[numRows][numColsA + numColsB];
	        for (int row = 0; row < numRows; row++) {
	            for (int colA = 0; colA < numColsA; colA++) {
	                resultMatrix[row][colA] = submatrixA[row][colA];
	            }
	            for (int colB = 0; colB < numColsB; colB++) {
	                resultMatrix[row][colB + numColsA] = submatrixB[row][colB];
	            }
	        }

	        return resultMatrix;
	    }
    
	    public static void main(String[] args) {
	        int[][] matrixA = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };

	        int[][] matrixB = {
	            {11, 12, 13},
	            {14, 15, 16},
	            {17, 18, 19}
	        };

	        int[][] submatrixCoords = {
	            {2, 3, 2, 3},
	            {1, 2, 1, 2}
	        };

	        int[][] result = submatrixConcatenation(matrixA, matrixB, submatrixCoords);
	        for (int[] row : result) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	        /**
	         * 6 7 11 12 
			  10 11 14 15 
	         */
	    }
	}

