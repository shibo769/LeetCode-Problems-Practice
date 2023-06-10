package 代码随想录;

public class day3_LinkedList_反转链表_206 {
	
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public ListNode reverseList(ListNode head) {
		// 初始化curr和pred节点
		ListNode curr = head;
		ListNode pred = null;
		
		while (curr != null) {
			// 先保存curr.next这个节点
			ListNode temp = curr.next;
			// 向后指
			curr.next = pred;
			// 先把pred移到curr的位置上
			pred = curr;
			// 再把curr向后移动一位
			curr = temp;
		}
		// pred是新链表的头节点
		return pred;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
