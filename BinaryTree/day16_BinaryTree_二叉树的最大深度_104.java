package 代码随想录;

import javax.swing.tree.TreeNode;

public class day16_BinaryTree_二叉树的最大深度_104 {
	
	/**
     * 递归法
     * 后序遍历: 左右中
     */
	
	public int maxDepth(TreeNode root) {
		if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
