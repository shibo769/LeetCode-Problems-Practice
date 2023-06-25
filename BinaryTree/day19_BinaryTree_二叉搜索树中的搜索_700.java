package 代码随想录;

import javax.swing.tree.TreeNode;

public class day19_BinaryTree_二叉搜索树中的搜索_700 {
	
	public TreeNode searchBST(TreeNode root, int val) {
		// 递归，利用二叉搜索树特点，优化
		if (root == null || root.val == val) return root;
		if (val < root.val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
