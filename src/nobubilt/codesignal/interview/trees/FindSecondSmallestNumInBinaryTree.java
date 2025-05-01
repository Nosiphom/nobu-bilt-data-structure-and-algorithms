package nobubilt.codesignal.interview.trees;

public class FindSecondSmallestNumInBinaryTree {
/**
 * We have three primary ways to traverse a binary tree: 
 * Inorder (Left, Root, Right), 
 * Preorder (Root, Left, Right), 
 * Postorder (Left, Right, Root). 
 * 
 * Imagine we are given a binary tree in which each node contains an integer. Your task 
 * is to write a Java function that traverses this binary tree and returns the 
 * second smallest value among all the tree nodes. If there's no second smallest number 
 * (for example, if all the values in the tree are the same, or if there's only one 
 * node in the tree), the function should return null.

You are not allowed to use any built-in sorting methods in your solution. You should 
use Binary Tree Traversal techniques, which we have discussed in the lesson.

Expected complexity is (O(n)), where (n) is the number of vertices in the binary tree. 
The expected additional memory is (O(1)).
 */

	  public static Integer second_minimum_in_tree(TreeNode root) {
	        // TODO: implement the function
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;
	        secondSmallest = traverseTree(root, smallest, secondSmallest);
	        if(secondSmallest == Integer.MAX_VALUE)
	        {
	            return null;
	        }
	        
	        return secondSmallest;
	    }
	    
	    public static Integer traverseTree(TreeNode node, Integer smallest, Integer secondSmallest)
	    {
	        if(node == null){return secondSmallest;}
	        
	        if(smallest == Integer.MAX_VALUE)
	        {
	            smallest = node.val;
	        }
	        else 
	        {
	            if(node.val < smallest)
	            {
	                secondSmallest = smallest;
	                smallest = node.val;
	            }
	           else if(smallest != Integer.MAX_VALUE  && node.val > smallest && node.val < secondSmallest)
	            {
	                secondSmallest = node.val;
	            }
	        }
	        secondSmallest = traverseTree(node.left, smallest, secondSmallest);
	        secondSmallest = traverseTree(node.right, smallest, secondSmallest);
	        return secondSmallest;
	    }
	}
