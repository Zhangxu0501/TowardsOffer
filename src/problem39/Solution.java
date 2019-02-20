package problem39;

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
	public int TreeDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		return TreeDepth(root.left)+1>TreeDepth(root.right)+1?TreeDepth(root.left)+1:TreeDepth(root.right)+1;
	}

}