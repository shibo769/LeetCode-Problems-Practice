package 代码随想录;

public class day3_LinkedList_移除链表元素_203 {
	
	 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	 
	public ListNode removeElements(ListNode head, int val) {
		// 检查头节点是否为null并且是否是要删除的target
		// 用while而不是if， 因为e.g: [1,1,1,1,1]
		while (head != null && head.val == val) {
			head = head.next;
		}
		// 定义curr节点为head
		ListNode curr = head;
		// 若curr不为null并且curr.next也不为null时
		while (curr != null && curr.next != null) {
			// 如果curr.next是我们要删除的target
			if (curr.next.val == val) {
				// 删除操作
				curr.next = curr.next.next;
			} else {
				// 否则继续向前
				curr = curr.next;
			}
		}
		return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
