package 代码随想录;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class day20_BinaryTree_二叉搜索树中的众数_25 {
	
	private int count = 0;
	private int maxCount = 0;
	private TreeNode pred;
	ArrayList<Integer> resList;
	
	public int[] findMode(TreeNode root) {
		resList = new ArrayList<>();
        maxCount = 0;
        count = 0;
        pred = null;
        traversal(root);
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
        	res[i] = resList.get(i);
        }
        return res;
    }
	
	void traversal(TreeNode curr) {
		if (curr == null) return;
		// 左
		traversal(curr.left);
		//中：判断逻辑
		// 计数
		if (pred == null) {
			count = 1;
		} else if (pred.val == curr.val) {
			count++;
		} else {
			count = 1;
		}
		// update
		pred = curr;
		// 更新结果以及maxCount
		if (count == maxCount) resList.add(curr.val);
		if (count > maxCount) {
			maxCount = count;
			resList.clear();
			resList.add(curr.val);
		}
		// 右
		traversal(curr.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
