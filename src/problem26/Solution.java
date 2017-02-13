package problem26;

public class Solution
{
	public static void main(String[] args)
	{
		RandomListNode p1 = new RandomListNode(1);
		RandomListNode p2 = new RandomListNode(2);
		RandomListNode p3 = new RandomListNode(3);
		p1.random = p3;
		p1.next = p2;
		p2.next = p3;
		Clone(p1);
		System.out.println();
	}

	public static RandomListNode Clone(RandomListNode pHead)
	{
		if (pHead == null)
			return null;
		RandomListNode now = pHead;

		// 复制节点以及前后顺序
		while (now != null)
		{
			RandomListNode nownext = now.next;
			now.next = new RandomListNode(now.label);
			now.next.next = nownext;
			now = nownext;
		}
		now = pHead;
		// 复制random属性
		while (now != null)
		{
			if (now.random != null)
				now.next.random = now.random.next;
			now = now.next.next;
		}

		// 拆成两个链表
		RandomListNode clonehead=null;
		RandomListNode clonenode=null;
		RandomListNode pnode=pHead;
		clonehead=clonenode=pnode.next;
		pnode.next=clonenode.next;
		pnode=pnode.next;
		while(pnode!=null)
		{
			clonenode.next=pnode.next;
			clonenode=clonenode.next;
			pnode.next=clonenode.next;
			pnode=pnode.next;
		}
		return clonehead;
	}
}

class RandomListNode
{
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label)
	{
		this.label = label;
	}
}
