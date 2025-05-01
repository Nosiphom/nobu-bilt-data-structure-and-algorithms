package nobubilt.codesignal.interview.array;

public class ToeplitzMatrixValidator {
	/**
You are given a square matrix of n×n size. Your task is to write a Java function 
that indicates whether the matrix is a Toeplitz matrix.

In a Toeplitz matrix, each descending diagonal (from left to right) is constant. 
That is, elements in each descending diagonal are the exact same.

For example, if the given matrix is:
6 7 8
4 6 7
1 4 6
Your function should return true because all diagonals from top-left to bottom-right are:

[1], [4, 4], [6, 6, 6], [7, 7], [8]


	   4 6 7 8 9
	   1 4 6 7 8
	   5 1 4 6 7
	   8 5 1 4 6 
	   2 8 5 1 4
	*/
	
	/**
	{{4, 4, 4, 4}, 
	 {1, 4, 4, 4}, 
	 {4, 1, 4, 4}, 
	 {4, 4, 0, 4}};

	*/
	    public static boolean isToeplitzMatrix(int[][] matrix) {
	        // TODO: implement solution
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        if(rows == 1 || cols == 1){return true;}
	        int moveLeft = 1;
	        int row = 0;
	        int col = cols -1;
	        int counter = 0;
	        int currVal = -1;
	        int diagonalDirection = -1;
	        while(counter  < rows * cols)
	        {
	            counter++;
	            if(moveLeft == 1)
	            {
	                if(row == 0)
	                {
	                    if(col >= 0)
	                    {
	                        --col;
	                        currVal = matrix[row][col];
	                        moveLeft = -1;
	                        diagonalDirection = 1; /// going down
	                        continue;
	                    }
	                }
	                else if(row == rows -1 && col >= 0)
	                {
	                    --col;
	                    currVal = matrix[row][col];
	                    moveLeft = -1;
	                    diagonalDirection = 2; /// going up
	                    continue;
	                }
	            }
	            if(diagonalDirection == 1) // going down
	            {
	                if(col == cols -1)
	                {
	                    if(matrix[row][col] != currVal)
	                    {
	                        return false;
	                    }
	                    if(row < rows -1)
	                    {
	                       // moveDown;
	                        row++;
	                        currVal = matrix[row][col];
	                        diagonalDirection = 2; /// going up
	                        continue;
	                    }
	                    else if(row == rows -1)
	                    {
	                        // move left
	                        if(col -1 >= 0)
	                        {
	                            --col; 
	                            currVal = matrix[row][col];
	                            diagonalDirection = 2; /// going up
	                            continue;
	                        }                   
	                    }
	                }
	                else if(matrix[row][col] != currVal)
	                {
	                    return false;
	                }
	                else if(row == rows -1)
	                {
	                    // move left
	                    if(col -1 >= 0)
	                    {
	                        --col; 
	                        currVal = matrix[row][col];
	                        diagonalDirection = 2; /// going up
	                        continue;
	                    }                   
	                }
	                else
	                {
	                    ++row;
	                    ++col; 
	                    continue;                   
	                }
	            }
	            if(diagonalDirection == 2) //going up
	            {
	                if(matrix[row][col] != currVal)
	                {
	                    return false;
	                }
	                if(row == 0)
	                {
	                    if(col == 0)   // move down
	                    {
	                      //  moveDown;
	                        if(row + 1 < rows)
	                        {
	                            row++;
	                            currVal = matrix[row][col];
	                            diagonalDirection = 1; /// going DOWN
	                            continue;
	                        }
	                    }
	                    else if(col > 0)
	                    {
	                         //move left
	                         --col;
	                        currVal = matrix[row][col];
	                        moveLeft = -1;
	                        diagonalDirection = 1; /// going down
	                        continue;
	                    }
	                }
	                else if(col == 0)   // move down
	                {
	                  //  moveDown;
	                    if(row + 1 < rows)
	                    {
	                        row++;
	                        currVal = matrix[row][col];
	                        diagonalDirection = 1; /// going DOWN
	                        continue;
	                    }
	                }
	                else
	                {
	                    --col;
	                    --row;
	                    continue;
	                }
	            }
	        }
	        return true;
	    }
	}
	

