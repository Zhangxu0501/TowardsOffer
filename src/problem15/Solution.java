package problem15;

public class Solution
{

	public static ListNode FindKthToTail(ListNode head, int k)
	{
		ListNode result=head;
		ListNode now=head;
		if(k==0)
			return null;
		if(head==null)
			return null;
		for(int x=1;x<k;x++)
		{
			if(now.next==null)
			{
				if(x<=k-1)
					return null;
			}
			else
				now=now.next;
		}
		while(now.next!=null)
		{
			now=now.next;
			result=result.next;
		}
		return result;
	}

	public static void main(String[] args)
	{
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		System.out.println(FindKthToTail(head,3).val);
	}
}

class ListNode
{
	int val;
	ListNode next = null;

	ListNode(int val)
	{
		this.val = val;
	}
}