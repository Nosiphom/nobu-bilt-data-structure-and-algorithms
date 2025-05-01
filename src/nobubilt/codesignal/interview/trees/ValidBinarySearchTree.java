package nobubilt.codesignal.interview.trees;

public class ValidBinarySearchTree {
/**
 * Your task is to implement a function isBinarySearchTree(TreeNode root) that takes the 
 * root of a binary tree as input and returns a boolean, indicating whether the input 
 * tree is a binary search tree. In a binary search tree, for each node, its value 
 * is greater than or equal to the values of all nodes in its left subtree and less than 
 * or equal to the values of all nodes in its right subtree. It's guaranteed that all node 
 * values are distinct.

For example, the following tree is a binary search tree:
    4
   / \
  2   6
 / \ / \
1  3 5  7
The expected time complexity of your solution is (O(n)), where (n) is the number of nodes 
in the binary tree. Make sure to implement the solution that goes through every tree's 
node only once. Note that you should implement a recursive solution.
 */
	
    public static boolean isBinarySearchTree(TreeNode root) {
        // TODO: implement the function     
     return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public static boolean isBST(TreeNode node, int min, int max)
    {
        if(node == null){return true;}
        if(node.val < min || node.val > max){return false;}
        return isBST(node.left, min, node.val) && isBST(node.right, node.val, max);
        
    }
}
