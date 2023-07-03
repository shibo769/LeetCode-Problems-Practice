package 代码随想录;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class day28_Backtracking_子集2_90 {
	
	List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
	   LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
	   boolean[] used;
	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        if (nums.length == 0){
	            result.add(path);
	            return result;
	        }
	        Arrays.sort(nums);
	        used = new boolean[nums.length];
	        subsetsWithDupHelper(nums, 0);
	        return result;
	    }
	    
	    private void subsetsWithDupHelper(int[] nums, int startIndex){
	        result.add(new ArrayList<>(path));
	        if (startIndex >= nums.length){
	            return;
	        }
	        for (int i = startIndex; i < nums.length; i++){
	            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
	                continue;
	            }
	            path.add(nums[i]);
	            used[i] = true;
	            subsetsWithDupHelper(nums, i + 1);
	            path.removeLast();
	            used[i] = false;
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(75.6592073 * 2);
	}

}
