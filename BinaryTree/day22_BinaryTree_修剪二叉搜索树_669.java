package 代码随想录;

import javax.swing.tree.TreeNode;

public class day22_BinaryTree_修剪二叉搜索树_669 {
	
	public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root == null) {
            return null;
        }
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        // root在[low,high]范围内
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
