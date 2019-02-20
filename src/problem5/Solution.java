package problem5;

import java.util.ArrayList;
		import java.util.Stack;

public class Solution {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Stack<Integer> s = new Stack();
		while (listNode != null) {
			s.push(listNode.val);
			listNode = listNode.next;
		}
		while (!s.isEmpty()) {
			al.add(s.pop());
		}
		return al;
	}

	public static void main(String[] args) {
		System.out.println();
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
