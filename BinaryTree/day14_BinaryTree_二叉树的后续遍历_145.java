package 代码随想录;

public class day14_BinaryTree_二叉树的后续遍历_145 {
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);             // 注意这一句
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
