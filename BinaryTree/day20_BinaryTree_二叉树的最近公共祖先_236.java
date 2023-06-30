package 代码随想录;

import javax.swing.tree.TreeNode;

public class day20_BinaryTree_二叉树的最近公共祖先_236 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        // 碰到p和q节点返回root
        if (root == p || root == q) return root;
        
        //后序遍历
        TreeNode left = lowestCommonAncestor(root.left, p ,q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);
        // 一直向上返回root
        if (left != null && right != null) return root; // 下面左右叶子都有
        if (left == null && right != null) {
        	return right;
        } else if (left != null && right == null) {
        	return left;
        } else {
        	return null;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
