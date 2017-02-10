package problem24;

public class Solution
{
	public static void main(String[] args)
	{
		int [] a ={5,7,6,9,11,10,8};
		
		System.out.println(VerifySquenceOfBST(a));
	}

	public static boolean VerifySquenceOfBST(int[] sequence)
	{
		if (sequence == null || sequence.length == 0)
			return false;
		return see(sequence, 0, sequence.length - 1);

	}

	public static boolean see(int[] sequence, int start, int end)
	{
		int i=start;
		for(;i<end;i++)
			if(sequence[i]>=sequence[end])
				break;
		
		i=i-1;
		int j=i+1;
		for(;j<end;j++)
			if(sequence[j]<sequence[end])
				return false;
		boolean left=true;
		boolean right=true;
		if(i>=start)
			left=see(sequence,start,i);
		if(i<end-1)
			right=see(sequence,i+1,end-1);
		return left&&right;
	}
}
