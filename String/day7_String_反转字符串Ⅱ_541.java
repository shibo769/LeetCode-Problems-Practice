package 代码随想录;

public class day7_String_反转字符串Ⅱ_541 {
	
	public String reverseStr(String s, int k) {
		
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i += 2*k) {
			int start = i;
			// 判断尾数够不够k个来取决end指针的位置.
			// i+k-1表示的是某一次反转的最后一个字符的下标，判断条件应该是i+k-1<=s.length-1。因为下标是从0开始的，
			// 所以字符串最后一个下标=s.size()-1的，所以就得到i+k<=s.size()的判断条件！
			int end   = Math.min(ch.length - 1, start + k - 1);
			
			while (start < end) {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				
				start++;
				end  --;
			}
		}
		
		return new String(ch);
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
