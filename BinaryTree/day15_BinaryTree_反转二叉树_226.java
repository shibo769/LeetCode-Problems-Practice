package 代码随想录;

import javax.swing.tree.TreeNode;

public class day15_BinaryTree_反转二叉树_226 {
	
	public TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		
		swap(root);
		invertTree(root.left);
		invertTree(root.right);
		return root;
    }
	
	public void swap(TreeNode node) {
		TreeNode tempNode = node.left;
		node.left = node.right;
		node.right = tempNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
