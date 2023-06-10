package 代码随想录;

public class day4_LinkedList_链表相交_160 {
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		    ListNode curA = headA;
	        ListNode curB = headB;
	        int lenA = 0, lenB = 0;
	        while (curA != null) { // 求链表A的长度
	            lenA++;
	            curA = curA.next;
	        }
	        while (curB != null) { // 求链表B的长度
	            lenB++;
	            curB = curB.next;
	        }
	        curA = headA;
	        curB = headB;
	        // 让curA为最长链表的头，lenA为其长度
	        if (lenB > lenA) {
	            //1. swap (lenA, lenB);
	            int tmpLen = lenA;
	            lenA = lenB;
	            lenB = tmpLen;
	            //2. swap (curA, curB);
	            ListNode tmpNode = curA;
	            curA = curB;
	            curB = tmpNode;
	        }
	        // 求长度差
	        int gap = lenA - lenB;
	        // 让curA和curB在同一起点上（末尾位置对齐）
	        while (gap-- > 0) {
	            curA = curA.next;
	        }
	        // 遍历curA 和 curB，遇到相同则直接返回
	        while (curA != null) {
	            if (curA == curB) {
	                return curA;
	            }
	            curA = curA.next;
	            curB = curB.next;
	        }
	        return null;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
