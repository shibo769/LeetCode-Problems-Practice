package 代码随想录;

public class day7_String_反转字符串_344 {
	
	public void reverseString(char[] s) {
		
		int left = 0;
		int right = s.length - 1;
		
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
