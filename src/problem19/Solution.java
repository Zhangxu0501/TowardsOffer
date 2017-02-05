package problem19;

public class Solution
{
	public static void main(String[] args)
	{
		TreeNode root1=new TreeNode(1);
		root1.left=new TreeNode(2);
		root1.right=new TreeNode(3);
		root1.left.left=new TreeNode(4);
		Mirror(root1);
		System.out.println(root1);
	}

	public static void Mirror(TreeNode root)
	{
		if(root==null)
			return ;
		if(root.left==null&&root.right==null)
			return	 ;
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		if(root.left!=null)
			Mirror(root.left);
		if(root.right!=null)
			Mirror(root.right);
		
					
					
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