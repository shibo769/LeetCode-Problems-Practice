package 代码随想录;

import java.util.HashMap;
import java.util.Map;

public class day5_HashTable_两数之和_1 {
	
	public int[] twoSum(int[] nums, int target) {
		// 创建map用来记录遍历过的元素
		Map<Integer, Integer> map = new HashMap<>();
		// result
		int[] res = new int[2];
		
		if (nums == null || nums.length == 0) {
			return res;
		}
		
		for (int i = 0; i < nums.length; i++) {
			// temp是要找的（配对的元素）例如target是9，我们需要7和2
			int temp = target - nums[i];
			// 若map里有了这个元素就得到了res
			if (map.containsKey(temp)) {
				// 用map来的到第一个下表
				res[1] = i;
				res[0] = map.get(temp);
				break;
			}
			map.put(nums[i], i);
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
