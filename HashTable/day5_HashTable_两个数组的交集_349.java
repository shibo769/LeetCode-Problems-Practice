package 代码随想录;

import java.util.HashSet;
import java.util.Set;

public class day5_HashTable_两个数组的交集_349 {
	
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		
		
		Set<Integer> res = new HashSet<>();
		Set<Integer> numsSet = new HashSet<>();
		
		//遍历数组1
		for (int i = 0; i < nums1.length; i++) {
			numsSet.add(nums1[i]);
		}
		//遍历数组2的过程中判断哈希表中是否存在该元素
		for (int j = 0; j < nums2.length; j++) {
			if (numsSet.contains(nums2[j])) {
				res.add(nums2[j]);
			}
		}
		// 将结果集合转为数组
		return res.stream().mapToInt(x -> x).toArray();
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
