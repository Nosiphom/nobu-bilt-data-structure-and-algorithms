package nobubilt.codesignal.interview.trees;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode nextRight;
	TreeNode(){}
	public TreeNode(int val) {this.val = val;}
	public TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(int val, TreeNode left, TreeNode right, TreeNode nextR){
		this.val = val;
		this.left = left;
		this.right = right;
		this.nextRight = nextR;
	}
	
	public int getVal()
	{
		return val;
	}
	
}
