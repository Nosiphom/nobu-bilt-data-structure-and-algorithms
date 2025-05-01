package nobubilt.codesignal.interview.trees;

public class BinaryTreeReversal {
	/**
	 * Given a binary tree, write a function in Java to reverse the given binary tree. 
	 * This means that for every node in the binary tree, you have to swap its left and 
	 * right child nodes. For example, for the following binary tree:
	# Original tree
	#      4
	#     / \
	#    2   5
	#   / \
	#  1   3
	The output should be:

	# After reversing
	#      4
	#     / \
	#    5   2
	#       / \
	#      3   1
	The time complexity for your function should be linear, i.e., O(n), where n is the number 
	of nodes in the binary tree.
	 * @param root
	 * @return
	 */
	public static TreeNode reverse(TreeNode root, TreeNode reverseTree)
	{
		if(root == null) {return root;}
		if(reverseTree == null)
		{
			reverseTree = new TreeNode(root.val);
		}
		TreeNode leftReverse = reverse(root.left, reverseTree.right);
		TreeNode rightReverse = reverse(root.right, reverseTree.left);
		
		reverseTree.left = rightReverse;
		reverseTree.right = leftReverse;
		return reverseTree;
	}
	
	  public static TreeNode reverseTree(TreeNode root) 
	  {
		  if(root == null) {return root;}
		  TreeNode reverseTree = new TreeNode(root.val);
		  return reverse(root, reverseTree);
	  }
}
