package problem17;



class ListNode
{
	int val;
	ListNode next = null;

	ListNode(int val)
	{
		this.val = val;
	}
}

public class Solution
{
	public static ListNode Merge(ListNode list1, ListNode list2)
	{
		if(list1==null&&list2==null)
			return null;
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
		
		ListNode root=null;
		ListNode now=null;
		ListNode next=null;
		if(list1.val>=list2.val||list1==null)
		{
			root=list2;
			list2=list2.next;
			root.next=null;
		}
		else
		{
			root=list1;
			list1=list1.next;
			root.next=null;
		}
		next=root;
		while(list1!=null||list2!=null)
		{
			if(list1==null)
			{
				next.next=list2;
				list2=list2.next;
				next=next.next;
			}
			else if(list2==null)
			{
				next.next=list1;
				list1=list1.next;
				next=next.next;
			}
			else
			{
				if(list1.val>=list2.val||list1==null)
				{
					next.next=list2;
					list2=list2.next;
					next=next.next;
				}
				else
				{
					next.next=list1;
					list1=list1.next;
					next=next.next;
			}
			
			}
		}
		return root;
	}
	  public static void main(String[] args)
		{
			ListNode list1=new ListNode(1);
			list1.next=new ListNode(3);
			
			ListNode list2=new ListNode(2);
			list2.next=new ListNode(4);
			ListNode a=Merge(list1,list2);
			System.out.println(a.val);
		}
			
}