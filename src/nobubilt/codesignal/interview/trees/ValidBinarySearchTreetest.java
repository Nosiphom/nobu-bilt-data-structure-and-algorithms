package nobubilt.codesignal.interview.trees;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidBinarySearchTreetest {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(false, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(8, new TreeNode(3, new TreeNode(1), new TreeNode(6)), new TreeNode(10, null, new TreeNode(14)));
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(10, new TreeNode(5), new TreeNode(15, new TreeNode(6), new TreeNode(20)));
        assertEquals(false, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test5() {
        TreeNode root = new TreeNode(30, new TreeNode(20, new TreeNode(10), new TreeNode(25)), new TreeNode(40));
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test6() {
        TreeNode root = new TreeNode(-1);
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test7() {
        TreeNode root = null;
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test8() {
        TreeNode root = new TreeNode(20, new TreeNode(10, new TreeNode(5), new TreeNode(15)), new TreeNode(30));
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test9() {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        assertEquals(true, ValidBinarySearchTree.isBinarySearchTree(root));
    }

    @Test
    public void test10() {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(5), null));
        assertEquals(false, ValidBinarySearchTree.isBinarySearchTree(root));
    }
}
