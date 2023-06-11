package 代码随想录;

public class day5_HashTable_有效的字母异位词_242 {
	
	public boolean isAnagram(String s, String t) {
		int[] record = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			// 并不需要记住字符a的ASCII，只要求出一个相对数值就可以了
			record[s.charAt(i) - 'a']++;
		}
		for (int j = 0; j < t.length(); j++) {
			record[t.charAt(j) - 'a']--;
		}
		
		for (int i = 0; i < 26; i++) {
			// record数组如果有的元素不为零0，说明字符串s和t 一定是谁多了字符或者谁少了字符。
			if (record[i] != 0) return false;
		}
		// record数组所有元素都为零0，说明字符串s和t是字母异位词
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
