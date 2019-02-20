package problem16;


public class Solution {
    public static ListNode ReverseList(ListNode head) {
    	if(head==null)
    		return null;
    	ListNode root=head;
    	ListNode now=head;
    	ListNode now_next=head.next;
    	head.next=null;
    	
    	while(now_next!=null)
    	{
    		now=now_next;
    		now_next=now_next.next;
    		now.next=root;
    		root=now;
    	}
		head.next=null;
    	return root;

    }
    public static void main(String[] args)
	{
		ListNode head=new ListNode(1);
		ListNode next=new ListNode(2);
		head.next=next;
		next.next=new ListNode(3);

		head=ReverseList(head);
		System.out.println(head);
	}
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

	@Override
	public String toString() {
		return "ListNode{" +
				"val=" + val +
				", next=" + next +
				'}';
	}
}