package 代码随想录;

import javax.swing.tree.TreeNode;

public class day22_BinaryTree_将有序数组转换为二叉搜索树_108 {
	
	// 递归: 左闭右开 [left,right)
	public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }
    
    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        if (right - left == 1) {
            return new TreeNode(nums[left]);
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
