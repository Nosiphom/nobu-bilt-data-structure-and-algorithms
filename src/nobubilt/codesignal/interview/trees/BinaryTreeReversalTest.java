package nobubilt.codesignal.interview.trees;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class BinaryTreeReversalTest {

	 private TreeNode constructTree(Integer[] values, int index) {
	        if (index < values.length) {
	            if (values[index] != null) {
	                TreeNode node = new TreeNode(values[index]);
	                node.left = constructTree(values, 2 * index + 1);
	                node.right = constructTree(values, 2 * index + 2);
	                return node;
	            }
	        }
	        return null;
	    }

	    private List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if (root != null) {
	            result.addAll(inorderTraversal(root.left));
	            result.add(root.val);
	            result.addAll(inorderTraversal(root.right));
	        }
	        return result;
	    }

	    @Test
	    void testCase1() {
	        TreeNode tree = constructTree(new Integer[]{1, 2, 5, 3, 4}, 0);
	        assertEquals(List.of(5, 1, 4, 2, 3), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase2() {
	        TreeNode tree = constructTree(new Integer[]{7, 3, 5, 2, 6, 9}, 0);
	        assertEquals(List.of(5, 9, 7, 6, 3, 2), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase3() {
	        TreeNode tree = constructTree(new Integer[]{1}, 0);
	        assertEquals(List.of(1), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase4() {
	        TreeNode tree = constructTree(new Integer[]{3, 9}, 0);
	        assertEquals(List.of(3, 9), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase5() {
	        TreeNode tree = constructTree(new Integer[]{-7, -8, -5}, 0);
	        assertEquals(List.of(-5, -7, -8), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase6() {
	        TreeNode tree = constructTree(new Integer[]{0}, 0);
	        assertEquals(List.of(0), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase7() {
	        TreeNode tree = constructTree(new Integer[]{4, null, 2, null, 1}, 0);
	        assertEquals(List.of(2, 4), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase8() {
	        TreeNode tree = constructTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 0);
	        assertEquals(List.of(15, 7, 14, 3, 13, 6, 12, 1, 11, 5, 10, 2, 9, 4, 8), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }

	    @Test
	    void testCase9() {
	        TreeNode tree = constructTree(new Integer[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 0);
	        assertEquals(List.of(1, 9, 2, 13, 3, 10, 4, 15, 5, 11, 6, 14, 7, 12, 8), inorderTraversal(BinaryTreeReversal.reverseTree(tree)));
	    }
	}
