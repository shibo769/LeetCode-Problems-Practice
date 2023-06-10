package 代码随想录;

public class day4_LinkedList_两两交换链表中的节点_24 {
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public ListNode swapPairs(ListNode head) {
		// 创建虚拟头节点和curr
		ListNode dummyhead = new ListNode(-1);
		ListNode curr = dummyhead;
		// 将虚拟头节点指向head，这样方面后面做删除操作
		dummyhead.next = head;
		
		while (curr.next != null && curr.next.next != null) {
			// e.g [dummyhead] -> [1] -> [2] -> [3] -> [4] -> [5] -> null;
			// 储存元素1和3
			ListNode temp = curr.next;
			ListNode temp1 = curr.next.next.next;
			
			// 开始操作指针
			// 先把curr.next指向[2]
			curr.next = curr.next.next;
			// 再把[2]指向[1]
			curr.next.next = temp;
			// 再把[1]指向[3]
			temp.next = temp1;
			// curr前进到现在[1]的位置: [2] -> [1] -> [3] -> [4] -> [5] -> null
			curr = curr.next.next;
		}
		return dummyhead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
