package nobubilt.codesignal.matrix;

public class SubmatrixSwapInMatrix {
	
	/**
	 *  int[][] matrix = {{1, 2, 3},
	                        {4, 5, 6},
	                        {7, 8, 9},
	                        {10, 11, 12}};
	                        
	      int[] coord_S1 = {0, 2, 0, 2};
	      int[] coord_S2 = {2, 4, 1, 3};
	      
	      int[][] expected = {{8, 9, 3},
	                          {11, 12, 6},
	                          {7, 1, 2},
	                          {10, 4, 5}};
	 * @param matrix
	 * @param coord_S1
	 * @param coord_S2
	 */
	  public void submatrixSwap(int[][] matrix, int[] coord_S1, int[] coord_S2) {
		    // TODO: Implement the function that swaps coord_S1 and coord_S2 in the matrix
		      int startRowA = coord_S1[0];
		      int endRowA = coord_S1[1] - 1;
		      int startColA = coord_S1[2];
		      int endColA = coord_S1[3] -1;
		      int startRowB = coord_S2[0];
		      int endRowB = coord_S2[1] - 1;
		      int startColB = coord_S2[2];
		      int endColB = coord_S2[3] -1;

		      int rowNums = endRowB - startRowB + 1;
		      int numColsA = endColA - startColA + 1;
		      int numColsB = endColB - startColB + 1;
		  
		      int[][] submatrixA = new int[rowNums][numColsA];
		      for(int row = 0; row < rowNums; row++)
		      {
		        for(int col = 0; col < numColsA; col++)
		        {
		          submatrixA[row][col] = matrix[startRowA + row][startColA + col];

		        }
		       
		      }
		      
		      int[][] submatrixB = new int[rowNums][numColsB];
		      for(int row = 0; row < rowNums; row++)
		      {
		        for(int col = 0; col < numColsB; col++)
		        {
		          submatrixB[row][col] = matrix[startRowB + row][startColB + col];
		        
		        }
		      }
		      
		      for(int row = 0; row < rowNums; row++)
		      {
		         for(int col = 0; col < numColsB; col++)
		         {
		            matrix[startRowA + row][startColA + col] = submatrixB[row][col];

		         }
		           
		      }
		      
		      for(int row = 0; row < rowNums; row++)
		      {
		         for(int col = 0; col < numColsA; col++)
		         {
		            matrix[startRowB + row][startColB + col] = submatrixA[row][col];

		         }
		      }
		  }
}
