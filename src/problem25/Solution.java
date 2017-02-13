package problem25;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public static Stack<TreeNode> s=new Stack<TreeNode>();
	static ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>> ();
//	public static void main(String [] args)
//	{
//		TreeNode t1=new TreeNode(10);
//		TreeNode t2=new TreeNode(5);
//		TreeNode t3=new TreeNode(12);
//		TreeNode t4=new TreeNode(4);
//		TreeNode t5=new TreeNode(7);
//		t1.left=t2;
//		t1.right=t3;
//		t2.left=t4;
//		t2.right=t5;
//		FindPath(t1,22);
//		
//	}
public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
			compute(root,target);
			return al;
	    }
	public static void compute(TreeNode root,int number)
	{
		s.push(root);
		if(root.left==null&&root.right==null)
		{
			juedge(s,number);
		}
		
		
		if(root.left!=null)
		{
			compute(root.left,number);
		}
		if(root.right!=null)
			compute(root.right,number);
		s.pop();
		
	}
	public static  void juedge(Stack<TreeNode> s,int number)
	{
		
		int count=0;
		Stack<TreeNode> s2=new Stack<TreeNode>();
		ArrayList<Integer> al2 = new ArrayList<Integer> ();
		while(!s.isEmpty())
		{
			TreeNode t =s.pop();
			count+=t.val;
			s2.push(t);
		}
		while(!s2.isEmpty())
		{
			TreeNode t=s2.pop();
			al2.add(t.val);
			s.push(t);
		}
		if(count==number)
		{
			al.add(al2);
		}
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