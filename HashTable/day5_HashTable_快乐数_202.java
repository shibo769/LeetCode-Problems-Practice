package 代码随想录;

import java.util.HashSet;
import java.util.Set;

public class day5_HashTable_快乐数_202 {
	
	private int getSum(int n){
        int res = 0;
        // 
        while (n > 0){
        	// 取这一位上的值
            int temp = n % 10;
            // 计算加和
            res = res + temp * temp;
            n = n / 10; // 取下一位的值，如果数小，则直接变0
        }
        return res;
    }
	
	public boolean isHappy(int n) {
		// 用来记录的set，如果重复返回false
		Set<Integer> record = new HashSet<>();
		
		// 若n不为1并且 set里不存在n
		while (n != 1 && !record.contains(n)) {
			record.add(n);
			n = getSum(n);
		}
		// return n是否是1,也就是快乐数
		return n == 1;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
