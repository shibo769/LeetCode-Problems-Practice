package 代码随想录;

import javax.swing.tree.TreeNode;

public class day21_BinaryTree_删除二叉搜索树中的节点_450 {
	
	// 笔记未记
	public TreeNode deleteNode(TreeNode root, int key) {
		root = delete(root,key);
        return root;
    }
	
	private TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key) {
            root.left = delete(root.left,key);
        } else if (root.val < key) {
            root.right = delete(root.right,key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode tmp = root.right;
            while (tmp.left != null) {
                tmp = tmp.left;
            }
            root.val = tmp.val;
            root.right = delete(root.right,tmp.val);
        }
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
