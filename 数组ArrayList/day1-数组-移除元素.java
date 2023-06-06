package 代码随想录;

public class 移除元素 {
	
	public static int removeElement(int[] nums, int val) {
		// 遍历数据过程中遇到等于目标值就直接跳过，
		// 不等于目标值就赋值，这样就能 过滤掉（也就是删除掉）目标值
		// slow = 新数组元素的下标位置
		// fast = 寻找新数组的元素 ，新数组就是不含有目标元素的数组
		int slow = 0;
		for(int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != val) {
				nums[slow] = nums[fast];
				slow++;
			}
		}
		return slow;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[]{3,2,2,3};
		System.out.println(removeElement(temp,3));
		
	}

}
