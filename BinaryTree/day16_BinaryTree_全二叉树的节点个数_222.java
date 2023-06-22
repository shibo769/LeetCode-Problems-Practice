package 代码随想录;

import javax.swing.tree.TreeNode;

public class day16_BinaryTree_全二叉树的节点个数_222 {
	// 通用递归解法
	public int countNodes(TreeNode root) {
		if(root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
		
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
