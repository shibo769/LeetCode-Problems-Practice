package 代码随想录;

public class day6_HashTable_赎金信_383 {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		// shortcut
		if (ransomNote.length() > magazine.length()) return false;
		
		// 定义一个哈希映射数组
		int[] record = new int[26];
		
		// 遍历 使用的方法和有效字母异位词一致（ACSII值）
		for (char c : ransomNote.toCharArray()) {
			record[c - 'a'] -= 1;
		}
		
		for (char c : magazine.toCharArray()) {
			record[c - 'a'] += 1;
		}
		// 如果数组中存在负数，说明ransomNote字符串总存在magazine中没有的字符
		for (int i : record) {
			if (i < 0) return false; 
		}
		
		return true;
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
	}

}
