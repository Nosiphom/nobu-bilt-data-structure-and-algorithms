package nobubilt.codesignal.matrix;

public class TransposeMatrixAtoBdiffDimensions {
public static void main(String[] args) {
    // Initial matrix (2D array)
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };

    // Call our function on the matrix and output the result
    int[][] transposed = transformMatrix(matrix);
    for (int[] row : transposed) {
        for (int elem : row) {
            System.out.print(elem + " ");
        }
        System.out.println();
        
        /**
         * expected outcome after rotation/transposing:
         * int[][] transposed = {
            {1, 4},
            {2, 5},
            {3, 6}
        };
         */
    }
    
    //////////////////////////////
    
    int[][] squareMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
      
        // TODO: Call the function on squareMatrix and store the result in 
    	//transformedMatrix.
        // Print the transformed matrix.
    System.out.println();
    System.out.println(" //////flipped along diagonal/////");
        int[][] transformed = reflectOverSecondaryDiagonal(squareMatrix);
        for(int row = 0; row < transformed.length; row++)
        {
            for(int col = 0; col < transformed[0].length; col++)
            {
                System.out.print(transformed[row][col] + " ");
            }
            System.out.println();
        }
        /**
         * int[][] transformed = {
    {9, 6, 3},
    {8, 5, 2},
    {7, 4, 1}
};

		1  2  3  4  5
		6  7  8  9  10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25

         */
        
}


public static int[][] transformMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = rows > 0 ? matrix[0].length : 0;
    int[][] result = new int[cols][rows];

    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            result[j][i] = matrix[i][j];
        }
    }
    return result;
}

public static int[][] reflectOverSecondaryDiagonal(int[][] matrix) {
    // TODO: Complete the code to obtain the reflected square matrix in newMatrix.

	int size = matrix.length;
    int[][] newMatrix = new int[size][size];
    int revCol = size -1;
    for (int i = 0; i < size; ++i) {      
       for(int row = 0; row < size; row++ )
       {
            int revRow = size -1; 
            for(int col = 0; col < size && revCol >= 0 && revRow >= 0; col++)
            {
                newMatrix[revRow][revCol] = matrix[row][col];
                revRow--;
            }
           revCol--;
            
       }
    }
    return newMatrix;
    /**
    {, 6, 3},
    {, 5, 2},
    {, 4, 1}
    row = 0, col = 0; 
    row=0; matrix[0][0] => newMatrix[2][2]; revRow = 2 revCol = 2
        col=1; revRow=1  matrix[0][1] => newMatrix[1][2]; revRow = 1 revCol = 2  --revRow
        col=2; revRow=0  matrix[0][2] => newMatrix[0][2]; revRow = 0 revCol = 2  --revRow
        
        revRow = size -1
        --revCol
    row=1; matrix[1][0] => newMatrix[2][1]; revRow = 2 revCol = 1
        col=1; revRow=1  matrix[1][1] => newMatrix[1][1]; revRow = 1 revCol = 1  --revRow
        col=2; revRow=0  matrix[1][2] => newMatrix[0][1]; revRow = 0 revCol = 1  --revRow
    revRow = size -1
        --revCol
    row=2; matrix[2][0] => newMatrix[2][0]; revRow = 2 revCol = 0
        col=1; revRow=1  matrix[2][1] => newMatrix[1][0]; revRow = 1 revCol = 0  --revRow
        col=2; revRow=0  matrix[2][2] => newMatrix[0][0]; revRow = 0 revCol = 0  --revRow
  
    */
    
}
    
}