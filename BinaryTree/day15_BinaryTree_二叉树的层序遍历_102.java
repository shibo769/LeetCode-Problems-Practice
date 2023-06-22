package 代码随想录;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class day15_BinaryTree_二叉树的层序遍历_102 {
	
	//BFS--迭代方式--借助队列
	
	public List<List<Integer>> resList = new ArrayList<List<Integer>>();
	
	public void BFScheck(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(node);
        
        while (!que.isEmpty()) {
        	List<Integer> itemList = new LinkedList<Integer>();
        	int len = que.size();
        	while (len > 0) {
        		TreeNode tempNode = que.poll();
        		itemList.add(tempNode.val);
        		
        		if (tempNode.left != null) que.offer(tempNode.left);
        		if (tempNode.right != null) que.offer(tempNode.right);
        		len--;
        	}
        	resList.add(itemList);
        }
    }
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		BFScheck(root);
		return resList;

    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
