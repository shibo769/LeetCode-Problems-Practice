package 代码随想录;

import javax.swing.tree.TreeNode;

public class day18_BinaryTree_路经总和_112 {
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
            return false;
        }
        targetsum -= root.val;
        // 叶子结点
        if (root.left == null && root.right == null) {
            return targetsum == 0;
        }
        if (root.left != null) {
            boolean left = haspathsum(root.left, targetsum);
            if (left) {      // 已经找到
                return true;
            }
        }
        if (root.right != null) {
            boolean right = haspathsum(root.right, targetsum);
            if (right) {     // 已经找到
                return true;
            }
        }
        return false;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
