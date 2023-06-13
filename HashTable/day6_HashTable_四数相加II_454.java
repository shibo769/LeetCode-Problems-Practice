package 代码随想录;

import java.util.HashMap;
import java.util.Map;

public class day6_HashTable_四数相加II_454 {
	
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		
		 Map<Integer, Integer> record = new HashMap<>();
		 int count = 0;
		 
		//统计两个数组中的元素之和，同时统计出现的次数，放入map
		 for (int i = 0; i < nums1.length; i++) {
			 for (int j = 0; j < nums2.length; j++) {
				 int sum = nums1[i] + nums2[j];
				 // getOrDefault: 如果sum（Key）在Map里return sum对应的value，如果没有就return 0
				 record.put(sum, record.getOrDefault(sum, 0) + 1);
			 }
		 }
		 
		//统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数
		 for (int i = 0; i < nums3.length; i++) {
			 for (int j = 0; j < nums4.length; j++) {
				 // a + b = 0 - (c + d)
				 int temp = 0 - (nums3[i] + nums4[j]);
				 count = count + record.getOrDefault(temp, 0);
			 }
		 }
		
		return count;

   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
