package nobubilt.codesignal.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpiralMatrixCharacters {
/**
 * Consider a grid of characters in the form of a 2D array, where each cell represents a 
 * distinct character selected from a-z. Your task is to process this grid following a 
 * specific order.

Start from the top-left cell of the grid and move in a clockwise spiral direction. Initially, 
go right until you hit the right boundary, then down until you reach the bottom boundary, 
then left until you encounter the left boundary, and finally, up until you hit the top 
boundary (note that the top boundary is now the first row since we already visited the 
first cell in the matrix). Once this cycle is complete, move inwards, i.e., one cell to 
the right, and repeat the spiral process within the remaining unvisited cells.

During this spiral traversal, you will generate a sequence of visited cell characters. 
Afterwards, identify the vowels (a, e, i, o, u) in the sequence and return their positions
 in a 1-indexed order.

Please implement the function spiralTraverseAndVowels(char[][] grid) to achieve this. 
This function takes a 2D array of characters (grid) as input and returns an array containing 
the 1-indexed positions of the vowels in the spirally traversed sequence.

For instance, consider the following 3x4 grid:

Copy to clipboard
{{'a', 'b', 'c', 'd'},
{'e', 'f', 'g', 'h'},
{'i', 'j', 'k', 'l'}}
Upon completing the spiral traversal, we will obtain the sequence: 
{'a', 'b', 'c', 'd', 'h', 'l', 'k', 'j', 'i', 'e', 'f', 'g'}. From this sequence, we 
observe that 'a', 'i', and 'e' are vowels and are located at the 1st, 9th, and 10th 
positions (1-indexed) in the sequence, so our function returns: {1, 9, 10}.

The size of the 2D array (grid) will not exceed 100x100, and each character will be a 
lowercase letter from 'a' to 'z'.
 */
	 public int[] spiralTraverseAndVowels(char[][] grid) {
	        List<Character> charList = new ArrayList<>();
	        int rows = grid.length;
	        int cols = grid[0].length;
	        int down = 0; //no
	        int right = 1; //yes
	        Set<String> visited= new HashSet<>();
	        int row = 0, col = 0;
	        int offset = 0;
	        for(int inx = 0; inx < rows * cols; inx++)
	        {
	            visited.add(row +":" +col);
	           System.out.println("row: " + row + " : col: " + col + " right: " + right + " : down: " + down + " :offset" + offset);
	            charList.add(grid[row][col]);
	            if(right == 1) // going right
	            {
	                if(col == cols - 1 - offset)
	                {
	                    down = 1;
	                    row +=1;
	                    right = 0;
	                     if(visited.contains(row +":" +col))
	                    {
	                        offset += 1;
	                        col -=1;
	                    }
	                }
	                else
	                {
	                    col += 1;                  
	                }
	                continue;
	            }
	            if(down == 1) //truly going down
	            {
	                if(row == rows -1 - offset)
	                {
	                    right = 0; //left
	                    col -= 1;
	                    down = 0;
	                    if(visited.contains(row +":" +col))
	                    {
	                        offset += 1;
	                        row -=1;
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
	                if(col == 0 + offset)
	                {
	                    down = 0; // up
	                    row -=1;
	                  
	                     if(visited.contains(row +":" +col))
	                    {
	                        offset += 1;
	                        col+=1;
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
	                if(row == 0 + offset)
	                {
	                    right = 1; // true right
	                    col += 1;
	                    down = 0;
	                    if(visited.contains(row +":" +col))
	                    {
	                        offset += 1;
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
	        System.out.print(charList.size() +" ");
	        List<Integer> result = new ArrayList<>();
	        for(int inx = 0; inx < charList.size(); inx++)
	        {
	            char  ch = charList.get(inx);
	            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
	            {
	               
	               System.out.print(ch +" ");
	                result.add(inx + 1);
	            }
	        }
	        int[] arr = result.stream().mapToInt(Integer::intValue).toArray();
	       
	        
	         System.out.print(arr.length +" ");
	        // TODO: implement
	        return arr;
	    }

	}
