package 代码随想录;

import java.util.ArrayDeque;
import java.util.Deque;

public class day10_StackAndQueue_删除字符串中的所有相邻重复项_1047 {
	
	public String removeDuplicates(String s) {
		
		//ArrayDeque会比LinkedList在除了删除元素这一点外会快一点
        //参考：https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
        	// 先pop 再 + str
            str = deque.pop() + str;
        }
        return str;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
