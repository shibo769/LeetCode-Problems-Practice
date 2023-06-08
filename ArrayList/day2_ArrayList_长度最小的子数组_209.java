package 代码随想录;

public class day2_ArrayList_长度最小的子数组_209 {
	public static int minSubArrayLen(int target, int[] nums) {
		int i = 0;
		int sum = 0;
		// 初始result设定为Max长度，不能为0
		int result = Integer.MAX_VALUE;
		
		for (int j = 0; j < nums.length; j++) {
			// 窗口元素之和
			sum = sum + nums[j];
			// 不能为if, e.g: [1,1,1,1,100], 只移动窗口一次--错误
			while(sum >= target) {
				// length 为 j - i + 1
				// 取min值
				result = Math.min(result, j - i + 1);
				// 因为往前移动一位，所以sum需要减掉之前的i，然后i++
				sum = sum - nums[i];
				i++;
			}
		}
		// 如果不存在的情况的要想到
		return result == Integer.MAX_VALUE ? 0 : result;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[] {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, temp));

	}

}
