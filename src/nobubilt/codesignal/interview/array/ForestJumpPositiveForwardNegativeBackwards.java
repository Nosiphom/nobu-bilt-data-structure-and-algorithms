package nobubilt.codesignal.interview.array;

public class ForestJumpPositiveForwardNegativeBackwards {

	/**
	 * Consider an array that symbolizes a dense forest; each index is either 
	 * 1, indicating a tree, or 0, signifying a clear position. Starting from a 
	 * fixed initial index and given a specific direction, your objective is to 
	 * ascertain the smallest possible jump size that enables traversal from the 
	 * initial position to one of the ends of the array without hitting a tree. 
	 * Each move you make will be exactly the determined jump size in the given 
	 * direction.

Keep these pointers in mind:

The array of binary integers (0 and 1) depicts the forest.
The journey will always commence from a 0 index.
The direction is an integer. 1 implies jumping toward larger indices, while -1 
denotes jumping toward smaller ones.
In situations where there is no jump size that can avoid all trees, return -1 to 
indicate the impossibility of traversal under these conditions.
The ultimate objective? Identify the minimal jump size that ensures smooth 
navigation through the entire forest without hitting a single tree.

Example

For the input values forest = {0, 1, 0, 0, 0, 0, 1, 1}, start = 0, and 
direction = 1, the output should be 4.

If you take the jump size equal to 1, you immediately step on a tree.
If you choose 2, you step on a tree after three jumps at forest[6].
If you choose 3, you again step on a tree at forest[6].
For the jump size equal to 4, you first jump to the 4th position, which is 
a valid position, then jump outside of the array, thereby traversing the 
forest without hitting a tree.

	 * @param forest
	 * @param start
	 * @param direction
	 * @return
	 */
	
	public static int calculateJump(int[] forest, int start, int direction)
	{
		int jump = 1;
		while((direction * jump) + start >= 0 && (direction * jump) + start < 
				forest.length)
		{
			int position = start;
			while(position >= 0 && position < forest.length)
			{
				if(forest[position] == 1)//current position has a tree
				{
//If it does, break the loop and examine the next jump size. If it doesn't,
					//carry on jumping:
					break;
				}
				position += (direction * jump);
			}
			/**
			 * The condition on line 6 ensures the jumps stay within the boundary 
			 * of the forest array. The expression (direction * jump) + start 
			 * calculates the position index after executing a jump. When direction 
			 * is 1, you are jumping toward larger indices, and when it's -1, you are 
			 * jumping toward smaller indices.

The condition checks that this new position remains within the bounds of the forest 
(array). >=0 ensures you don't jump too far to the left to negative indices, 
and < forest.length checks that you don't jump beyond the array's length on the right.
			 */
			if(position < 0 || position >= forest.length)
			{
				return jump;
			}
			++jump;
		}
		/**
		 * Here, the function iterates over positive integers as potential jump 
		 * sizes, starting from 1. For each size, it starts from the initial position 
		 * and carries out jumps of that magnitude. If a tree is encountered, it halts,
		 *  adds 1 to the jump size, and tests again. If it doesn't encounter a tree 
		 *  and successfully jumps to one end of the forest, it promptly returns the 
		 *  jump size. If no viable jump size is found after checking numbers up to 
		 *  the length of the forest, it returns -1.
		 */
		return -1;
	}
	
	public static void main(String[] args) {
        int[] forest = {0, 1, 0, 0, 0, 0, 1, 1};
        System.out.println(calculateJump(forest, 0, 1));
        // Output: 4
    }
}
