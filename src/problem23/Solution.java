package problem23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

public class Solution
{
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();

		if (root == null)
			return al;

		q.add(root);
		while (!q.isEmpty())
		{
			TreeNode t = q.poll();
			al.add(t.val);
			if (t.left != null)
				q.add(t.left);
			if (t.right != null)
				q.add(t.right);
		}
		return al;
	}
}