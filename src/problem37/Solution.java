package problem37;

public class Solution
{
	public static void main(String [] args)
	{
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		
		
		ListNode a1=new ListNode(6);
		ListNode a2=new ListNode(7);
		ListNode a3=new ListNode(8);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		a1.next=a2;
		a2.next=a3;
		a3.next=n4;
		System.out.println(new Solution().FindFirstCommonNode(a1, n1).val);
	}
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2)
	{
		if(pHead1==null||pHead2==null)
			return null;
		int count1=0;
		int count2=0;
		ListNode n1=pHead1;
		ListNode n2=pHead2;
		while(n1!=null)
		{
			n1=n1.next;
			count1++;
		}
		while(n2!=null)
		{
			n2=n2.next;
			count2++;
		}
		if(count1<count2)
		{
			ListNode temp=pHead1;
			pHead1=pHead2;
			pHead2=temp;
		}
		int step=Math.abs((count1-count2));
		for(int x=0;x<step;x++)
		{
			pHead1=pHead1.next;
		}
		while(pHead1!=null)
		{
			if(pHead1.val==pHead2.val)
				return pHead1;
			pHead1=pHead1.next;
			pHead2=pHead2.next;
		}
		return null;
		
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