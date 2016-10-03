package problem13;
public class Solution {
	public  static void deleteNode(ListNode root,ListNode delete)
	{
		ListNode now=root;
		if(delete.nextNode==null)
		{
			while(true)
			{
				if(now.nextNode.listValue==delete.listValue)
					{
					now.nextNode=null;
					break;
					}
				now=now.nextNode;
			}
		}
		delete.listValue=delete.nextNode.listValue;
		delete.nextNode=delete.nextNode.nextNode;
	}
	public static void main(String [] args)
	{
		System.out.println();
	}
}
class ListNode
{
	int listValue;
	ListNode nextNode;
}