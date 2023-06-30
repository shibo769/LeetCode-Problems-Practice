package 代码随想录;

import javax.swing.tree.TreeNode;

public class day21_BinaryTree_二叉搜索树的最近公共祖先_235 {
	
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
        	if (root.val > p.val && root.val > q.val) {
        		root = root.left;
        	} else if (root.val < p.val && root.val < q.val) {
        		root = root.right;
        	} else {
        		break;
        	}
        }
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
