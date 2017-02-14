package problem27;

import java.util.LinkedList;
import java.util.Queue;

public class Solution
{
	public static void main(String[] args)
	{
		TreeNode t1=new TreeNode(5);
		TreeNode t2=new TreeNode(4);
		TreeNode t3=new TreeNode(6);
		t1.left=t2;
		t1.right=t3;
		Convert(t1);
		System.out.println();
	}

	public static TreeNode Convert(TreeNode pRootOfTree)
	{
		if(pRootOfTree==null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		convert1(pRootOfTree,q);
		TreeNode listnode =q.poll();
		listnode.left=null;
		TreeNode now=listnode;
		
		while(!q.isEmpty())
		{
		
			TreeNode n1=q.poll();
			now.right=n1;
			n1.left=now;
			now=n1;
		}
		now.right=null;
		return listnode;
	}
	public static void convert1(TreeNode root,Queue q)
	{
		if(root==null)
			return;
		if(root.left!=null)
			convert1(root.left,q);
		q.add(root);
		if(root.right!=null)
			convert1(root.right,q);
	}
}

class TreeNode
{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val)
	{
		this.val = val;

	}

}