package nobubilt.codesignal.interview.trees;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
public class FindSecondSmallestNumInBinaryTreeTest {

	 @Test
	    public void test1() {
	        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
	        assertEquals(2, FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test2() {
	        TreeNode root = new TreeNode(1, new TreeNode(1), new TreeNode(1));
	        assertNull(FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test3() {
	        TreeNode root = new TreeNode(1, null, new TreeNode(2));
	        assertEquals(2, FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test4() {
	        TreeNode root = new TreeNode(2, new TreeNode(1), null);
	        assertEquals(2, FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test5() {
	        TreeNode root = new TreeNode(0, null, new TreeNode(-1));
	        assertEquals(0, FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test6() {
	        TreeNode root = new TreeNode(-1000000000, new TreeNode(1000000000), null);
	        assertEquals(1000000000, FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test7() {
	        TreeNode root = new TreeNode(2);
	        assertNull(FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }

	    @Test
	    public void test8() {
	        TreeNode root = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null);
	        assertEquals(2, FindSecondSmallestNumInBinaryTree.second_minimum_in_tree(root));
	    }
	}
