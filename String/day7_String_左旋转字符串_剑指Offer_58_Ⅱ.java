package 代码随想录;

public class day7_String_左旋转字符串_剑指Offer_58_Ⅱ {
	
	public String reverseLeftWords(String s, int n) {
		// 用substring
        return s.substring(n, s.length()) + s. substring(0, n);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
