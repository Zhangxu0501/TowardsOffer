package problem6;


public class Solution {
public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root= new TreeNode(pre[0]);
	return root;
    }
	public int findRoot(int [] in,int rootval)
	{
		for(int x=0;x<in.length;x++)
		{
			if(in[x]==rootval)
				return x;
		}
		return -1;
	}
	public static void main(String [] args)
	{
		System.out.println();
	}
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 