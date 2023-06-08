package 代码随想录;

import java.util.Arrays;

public class day2_ArrayList_有序数组的平方_977 {
	
	// 双指针写法
	public static int[] sortedSquares(int[] nums) {
		// return的新数组
		int[] result = new int[nums.length];
		// 新数组的下表，从最后一位开始用于更新
		int k = nums.length - 1;
		// i<=j 否则会遗漏最后一个元素
		for (int i = 0, j = nums.length-1; i <= j;) {
			if (nums[i] * nums[i] > nums[j] * nums[j]) {
				result[k--] = nums[i] * nums[i++];
			} else {
				result[k--] = nums[j] * nums[j--];
			}
		}
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[] {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(temp)));
	}
	
}
