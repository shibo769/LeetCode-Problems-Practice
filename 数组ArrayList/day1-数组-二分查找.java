package 代码随想录;

public class 二分查找 {
	
public static int search(int[] nums, int target) {
        
		// 左闭右闭写法
        if (target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        int left  = 0;
        int right = nums.length - 1;
        
        // 小于等于
        while (left <= right){
        	int middle = (left + right) / 2;
        	if (target == nums[middle]) {
        		return middle;
        	} else if (target <= nums[middle]) {
        		// target小于middle value时更新right index to middle-1
        		right = middle - 1;
        		// target大于middle value时更新right index to middle+1
        	} else if (target >= nums[middle]) {
        		left = middle + 1;
        	}
        } 
        return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] temp = new int[]{-1,0,3,5,9,12};
		
		System.out.println(search(temp, 9));
	}

}
