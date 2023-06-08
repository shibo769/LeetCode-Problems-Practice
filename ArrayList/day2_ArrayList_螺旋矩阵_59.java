package 代码随想录;

import java.util.Arrays;

public class day2_ArrayList_螺旋矩阵_59 {
	
	public static int[][] generateMatrix(int n) {
		// n为正方形矩阵的边长
		int startx = 0;
		int starty = 0;
		int offset = 1;
		int  count = 1;
		// 控制循环次数
		int loop = 0;
		int i,j;
		
		int[][] result = new int[n][n];
		// 区分n的奇偶性
		// 左闭右开
		while (loop++ < n / 2) {
			// 第一条边
			for (j = starty; j < n - offset; j++) {
				result[startx][j] = count++;
			}
			// 第二条边（顺时针）
			for (i = startx; i < n - offset; i++) {
				result[i][j] = count++;
			}
			// 第三条边
			for (; j > starty; j--) {
				result[i][j] = count++;
			}
			// 第四条边
			for(; i > startx; i--) {
				result[i][j] = count++;
			}
			offset++;
			startx++;
			starty++;
		}
		// 奇数情况需要对中心赋值
		if (n % 2 == 1) {
			result[startx][starty] = count;
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(Arrays.toString(generateMatrix(n)));
	}

}
