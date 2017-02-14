package problem31;

public class Solution
{
	public static void main(String[] args)
	{
		System.out.println();
	}

	public int FindGreatestSumOfSubArray(int[] array)
	{
		if(array==null||array.length==0)
			return 0;
		int nowsum = array[0];
		int current = array[0];
		for (int x = 1; x < array.length; x++)
		{
			if (current <= 0)
				current = array[x];
			else
				current += array[x];
			if (current > nowsum)
				nowsum = current;
		}
		return nowsum;
	}
}
