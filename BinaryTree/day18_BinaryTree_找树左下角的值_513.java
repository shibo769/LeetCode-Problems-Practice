package 代码随想录;

import javax.swing.tree.TreeNode;

public class day18_BinaryTree_找树左下角的值_513 {
	
	private int Deep = -1;
    private int value = 0;
    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root,0);
        return value;
    }

    private void findLeftValue (TreeNode root,int deep) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (deep > Deep) {
                value = root.val;
                Deep = deep;
            }
        }
        // 迭代用+1不能用++
        if (root.left != null) findLeftValue(root.left,deep + 1);
        if (root.right != null) findLeftValue(root.right,deep + 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
