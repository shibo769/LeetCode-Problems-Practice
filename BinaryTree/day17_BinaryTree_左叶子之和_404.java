package 代码随想录;

import javax.swing.tree.TreeNode;

public class day17_BinaryTree_左叶子之和_404 {
	
	public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int leftValue = sumOfLeftLeaves(root.left);    // 左
        int rightValue = sumOfLeftLeaves(root.right);  // 右
                                                       
        int midValue = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) { 
            midValue = root.left.val;
        }
        int sum = midValue + leftValue + rightValue;  // 中
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
