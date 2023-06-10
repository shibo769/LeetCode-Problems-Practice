package 代码随想录;

import 代码随想录.day3_LinkedList_反转链表_206.ListNode;

public class day4_LinkedList_环形链表_142 {
	
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast != null && fast.next != null) {
			// 定义快慢指针
			fast = fast.next.next; // fast一次走两步
			slow = slow.next;      // slow一次走一步
			// 快慢指针相遇，此时从head 和 相遇点，同时查找直至相遇
			if (fast == slow) { // 有环
				ListNode index1 = fast;
				ListNode index2 = head;
				while (index1 != index2) {
					index1 = index1.next;
					index2 = index2.next;
				}
				return index2; // 返回环的入口
			}
		}
		return null;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
