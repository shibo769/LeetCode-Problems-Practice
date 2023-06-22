package 代码随想录;

import javax.swing.tree.TreeNode;

public class day16_BinaryTree_二叉树的最小深度 {
	
	public int minDepth(TreeNode root) {
		/**
	     * 递归法，相比求MaxDepth要复杂点
	     * 因为最小深度是从根节点到最近**叶子节点**的最短路径上的节点数量
	     */
	    public int minDepth(TreeNode root) {
	        if (root == null) {
	            return 0;
	        }
	        int leftDepth = minDepth(root.left);
	        int rightDepth = minDepth(root.right);
	        if (root.left == null) {
	            return rightDepth + 1;
	        }
	        if (root.right == null) {
	            return leftDepth + 1;
	        }
	        // 左右结点都不为null
	        return Math.min(leftDepth, rightDepth) + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
