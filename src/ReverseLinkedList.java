
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode next = head.next;
		ListNode pre = head;
		pre.next = null;
		ListNode nextNext;
		while (next != null) {
			nextNext = next.next;
			next.next = pre;
			pre = next;
			next = nextNext;
		}
		return pre;
	}
}
