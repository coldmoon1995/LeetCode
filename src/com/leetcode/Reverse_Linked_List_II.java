package com.leetcode;

public class Reverse_Linked_List_II {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null || m == n)
			return head;
		int num = 1;
		ListNode temp = head;
		ListNode left = null;
		ListNode right = null;
		if (m == 1) {
			right=head;
			temp = head;
			ListNode current = temp.next;
			num = m;
			while (num < n) {
				num++;
				ListNode tempNode = current.next;
				current.next = temp;
				temp = current;
				current = tempNode;
			}
			right.next = current;
			return temp;
		} else {
			while (num < m - 1) {
				num++;
				temp = temp.next;
			}
			left = temp;
			right = temp.next;
			temp = temp.next;
			ListNode current = temp.next;
			num = m;
			while (num < n) {
				num++;
				ListNode tempNode = current.next;
				current.next = temp;
				temp = current;
				current = tempNode;
			}
			left.next = temp;
			right.next = current;
			return head;
		}

	}
}
