package problem29;

public class Solution
{
	public static void main(String[] args)
	{
		int [] a={1,2,3,2,4,2,5,2,3};
		
		System.out.println();
	}

	public int MoreThanHalfNum_Solution(int[] array)
	{
		if(array==null||array.length==0)
			return 0;
		int num=array[0];
		int count=1;
		for(int x=1;x<array.length;x++)
		{
			if(array[x]==num)
				count+=1;
			else
			{
				if(count==0)
				{
					num=array[x];
					count+=1;
				}
				else
					count-=1;
			}
		}
		if(confirm(array,num))
		return num;
		return 0;
	}
	public boolean confirm(int [] array,int num)
	{
		int count=0;
		for(int x=0;x<array.length;x++)
			if(array[x]==num)
				count++;
		if(count*2>array.length)
			return true;
		else
			return false;
	}
}
