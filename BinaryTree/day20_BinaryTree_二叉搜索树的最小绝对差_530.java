package 代码随想录;

import javax.swing.tree.TreeNode;

public class day20_BinaryTree_二叉搜索树的最小绝对差_530 {
	
	//双指针法
	
	private int res = Integer.MAX_VALUE;
	private TreeNode pred = null;
	// 中序遍历
	public int getMinimumDifference(TreeNode root) {
		if (root == null) return 0;
		traversal(root);
		return res;
    }
	
	void traversal(TreeNode curr) {
		if (curr == null) return;
		// 左
		traversal(curr.left);
		// 中
		if (pred != null) {
			// 更新result
			res = Math.min(res, curr.val - pred.val);
		}
		//* 把pred往上移动到curr的位置
		pred = curr;
		// 右
		traversal(curr.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
