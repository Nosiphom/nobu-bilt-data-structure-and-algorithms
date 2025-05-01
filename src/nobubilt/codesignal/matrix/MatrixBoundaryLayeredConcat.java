package nobubilt.codesignal.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MatrixBoundaryLayeredConcat {
/**
 * You are tasked with creating a Java method named matrixBoundaryConcatenation(). This 
 * method should accept two 2D matrices, matrixA and matrixB, and the number of boundary 
 * layers, n, to extract from both matrices.

In this context, a boundary layer refers to the elements that form the outer contour of a 
matrix. For instance, the first layer of the following 4x4 matrix includes the 
elements 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, and 5:

1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16
Your method should extract the first n boundary layers from both matrixA and matrixB. 
It should then concatenate these extracted layers into a new list, ensuring that the 
layers from matrixA precede those from matrixB in the resultant list.

The matrices matrixA and matrixB will be square matrices, with each side's length ranging 
from 1 to 10. The number of layers n will be less than or equal to the side length of the 
square matrices.

The method signature should be:

Java
Copy to clipboard
public List<Integer> matrixBoundaryConcatenation(int[][] matrixA, int[][] matrixB, int n);
The elements in the input matrices can be any integer between -100 and 100.

Example

Consider the following input to our method:

Java
Copy to clipboard
int[][] matrixA = { {1, 2, 3, 4}, 
                    {5, 6, 7, 8}, 
                    {9, 10, 11, 12},
                    {13, 14, 15, 16} };

int[][] matrixB = { {17, 18, 19, 20}, 
                    {21, 22, 23, 24}, 
                    {25, 26, 27, 28}, 
                    {29, 30, 31, 32} };

int n = 2;
Our method matrixBoundaryConcatenation(matrixA, matrixB, n) should return:

Java
Copy to clipboard
Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10, 17, 18, 19, 20, 24, 
28, 32, 31, 30, 29, 25, 21, 22, 23, 27, 26)
Explanation:

In matrixA, the first boundary layer is composed of the elements 1, 2, 3, 4, 8, 12, 16, 
15, 14, 13, 9, and 5, taken in a clockwise direction from the top-left corner. Our second 
layer then includes the elements 6, 7, 11, and 10.

For matrixB, the corresponding boundary layers include the elements 17, 18, 19, 20, 24, 
28, 32, 31, 30, 29, 25, 21 for the first layer and 22, 23, 27, 26 for the second one.

The method outputs a list where the extracted layers from matrixA are followed by 
those from matrixB.
 */
	 public List<Integer> matrixBoundaryConcatenation(int[][] matrixA, int[][] matrixB, int n) {
	        // TODO: implement the function that extracts 'n' boundary layers from matrixA and matrixB,
	        // merges them into a single list and then returns this new list.
	        List<Integer> listA = getMatrixSpiral(matrixA, n);
	        List<Integer> listB = getMatrixSpiral(matrixB, n);
	        listA.addAll(listB);
	       
	        return listA;
	    }
	    
	    public List<Integer> getMatrixSpiral(int[][] matrix, int n)
	    {	        
	        List<Integer> result = new ArrayList<>();
	        if(matrix.length == n)
	        {
	            for(int rowInx = 0; rowInx < matrix.length; rowInx++)
	            {
	                for(int colInx = 0; colInx < matrix[0].length; colInx++)
	                {
	                    result.add(matrix[rowInx][colInx]);
	                }
	            }
	            return result;
	        }
	         int matrixRows = matrix.length;
	        int matrixCols = matrix[0].length;
	        int matrixElementCount= matrixCols * matrixRows; // 4x4=16
	        int numOfMiddleRowsToIgnore = matrixRows - (n * 2); // 4-(1*2)=2rows
	        int limit = matrixElementCount;
	        if(numOfMiddleRowsToIgnore > 0)
	        {
	            int middleLayerElementsToIgnore = numOfMiddleRowsToIgnore * n * 2; // 4 if n == 1
		        int discountedCells = matrixElementCount - (n * 2 * matrixCols) -middleLayerElementsToIgnore;
		        limit = matrixElementCount - discountedCells;
	        }
	       else
	       {
	    	   limit = matrixCols * matrixRows;
	       }
	       System.out.println("limit: " + limit);
	       int row = 0, col = 0;
	       int down = 2; // not active
	       int right = 1; // active
	       int offset = 0;
	        Set<String> visited = new HashSet<>();
	        for(int inx = 0; inx < limit; inx++)
	        {
	            visited.add(row +":"+col);
	            result.add(matrix[row][col]);  
	            if(right == 1) //true right
	            {
	                if(col == matrixCols - offset - 1)
	                {
	                    down = 1; // true down
	                    row +=1;
	                    right =2;  // not active
	                    if(visited.contains(row +":"+col))
	                    {
	                        col -=1;
	                        offset +=1;
	                    }
	                }
	                else
	                {
	                    col +=1;
	                }
	                continue;
	            }
	            if(down == 1)
	            {
	                if(row == matrixRows - offset - 1)
	                {
	                    right = 0; // left
	                    col -=1;
	                    down = 2;   // not active
	                    if(visited.contains(row +":"+col))
	                    {
	                        System.out.println("far");
	                        row -=1;  //up
	                        offset +=1;      
	                    }
	                }
	                else
	                {
	                    row +=1;
	                }
	                continue;
	            }
                if(right == 0) //left
                {
                    if(col == offset)
                    {
                        down = 0; //up
                        row -=1;
                        right = 2;   // not active
                        if(visited.contains(row +":"+col))
                        {
                            col +=1;
                            offset +=1;
                          right = 1; // true right
                        }
                    }
                    else
                    {
                        col -=1;
                    }
                    continue;
                }
	            if(down == 0) //up
	            {
	                if(row == offset || row == offset + 1)
	                {
	                    right = 1;  // true right
	                    col +=1;
	                    down = 2; // not active
	                    offset +=1; 
	                    if(visited.contains(row +":"+col))
	                    {
	                        row +=1; 
	                          
	                    }
	                }
	                else
	                {
	                    row -=1;
	                }
	                continue;
	            }
	        }
	        return result;
	    }
	}

