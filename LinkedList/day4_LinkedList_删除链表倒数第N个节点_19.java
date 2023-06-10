package 代码随想录;

public class day4_LinkedList_删除链表倒数第N个节点_19 {
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode dummyhead = new ListNode(-1);
		dummyhead.next = head;
		ListNode fast = dummyhead;
		ListNode slow = dummyhead;
		n++;
		// 先让快指针走n+1步，因为需要让慢指针指向要删除节点的前一个结点
		while (n != 0 && fast != null) {
			fast = fast.next;
			n--;
		}
		
		// 同时向前走，直到fast走到null
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		// 删除操作
		slow.next = slow.next.next;
		
		return dummyhead.next;
		
		
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
