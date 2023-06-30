package 代码随想录;

import javax.swing.tree.TreeNode;

public class day22_BinaryTree_把二叉搜索树转换为累加树_538 {
	
	private int pred = 0;
	
	public TreeNode convertBST(TreeNode root) {
		
		if (root == null) return null;
		traversal(root);
		return root;
		
    }
	// 右中左
	void traversal(TreeNode curr) {
		if (curr == null) return;
		
		traversal(curr.right);
		
		curr.val += pred;
		pred = curr.val;
		
		traversal(curr.left);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
