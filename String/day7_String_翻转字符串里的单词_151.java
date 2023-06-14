package 代码随想录;

import java.util.Arrays;
import java.util.Collections;

public class day7_String_翻转字符串里的单词_151 {
	
	public String reverseWords(String s) {
		// 先trim去掉两边空格在通过split分出words
        String words[] = s.trim().split(" +");
        // 用reverse，这个函数里面的input必须是list，所以Arrays.asList
        Collections.reverse(Arrays.asList(words));
        // 最后join
        return String.join(" ", words);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
