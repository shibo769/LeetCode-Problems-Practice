package 代码随想录;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class day14_BinaryTree_二叉树的中序遍历_94 {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);             // 注意这一句
        inorder(root.right, list);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
