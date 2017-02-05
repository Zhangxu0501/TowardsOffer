package problem18;

public class Solution
{
	public static void main(String[] args)
	{
		TreeNode root1=new TreeNode(1);
		root1.left=new TreeNode(2);
		root1.right=new TreeNode(3);
		root1.left.left=new TreeNode(4);
		TreeNode root2=new TreeNode(2);
		root2.left=new TreeNode(4);
		System.out.println(HasSubtree(root1,root2));
	}

	public static boolean HasSubtree(TreeNode root1, TreeNode root2)
	{
		boolean result=false;
		if(root1!=null&&root2!=null)
		{
			if(root1.val==root2.val)
				result=isSubTree(root1,root2);
			if(!result){
				result=HasSubtree(root1.left,root2);
			}
			if(!result)
				result=HasSubtree(root1.right,root2);
		}
		return result;
	}

	public static boolean isSubTree(TreeNode root1, TreeNode root2)
	{
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
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