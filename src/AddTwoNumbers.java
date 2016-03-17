/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int l1_sum = 0;
		int l2_sum = 0;
		int sum = 0;
		int l1_i = 0;
		int l2_i = 0;
		int l3_i;

		while (l1 != null) {
			l1_sum += l1.val * Math.pow(10, l1_i);
			l1_i++;
			l1 = l1.next;
		}

		while (l2 != null) {
			l2_sum += l2.val * Math.pow(10, l2_i);
			l2_i++;
			l2 = l2.next;
		}

		sum = l1_sum + l2_sum;
		System.out.println(sum);
		String num = sum + "";
		int length = num.length() - 1;
		if (length == 0) {
			l3_i = 0;
		} else {
			l3_i = length - 1;
		}
		ListNode l3 = new ListNode((int) num.charAt(length));
		while (l3 != null) {
			l3.val = (int) num.charAt(l3_i);
			l3_i--;
			l3 = l3.next;
			if (l3_i < 0) {
				l3 = null;
			}
		}
		return l3;
	}

	public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		l1.next = l2;
		l2.next = null;
		// l2.next = l3;
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(2);
		ListNode l6 = new ListNode(3);
		l4.next = l5;
		l5.next = null;
		// l5.next = l6;
		ListNode l = AddTwoNumbers.addTwoNumbers(l1, l2);
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}

	}

}