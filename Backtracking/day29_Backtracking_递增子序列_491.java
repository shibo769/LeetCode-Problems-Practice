package 代码随想录;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class day29_Backtracking_递增子序列_491 {
	
	List<List<Integer>> result = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();
	
	public List<List<Integer>> findSubsequences(int[] nums) {
		backtracking(nums, 0);
		return result;
    }
	
	private void backtracking(int[] nums, int startIndex) {
		if (path.size() >= 2) {
			result.add(new ArrayList<>(path));
		}
		HashSet<Integer> hs = new HashSet<>();
		for (int i = startIndex; i < nums.length; i++) {
			if (!path.isEmpty() && path.get(path.size() - 1) > nums[i] || hs.contains(nums[i])) {
				continue;
			}
			hs.add(nums[i]);
			path.add(nums[i]);
			backtracking(nums, i + 1);
			path.removeLast();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
