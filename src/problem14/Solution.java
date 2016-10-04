package problem14;

public class Solution
{
	public static int[] reOrderArray(int[] a)
	{
		int [] result= new int [a.length];
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==1)
				result[count++]=a[x];
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
				result[count++]=a[x];
		}
		for(int x=0;x<a.length;x++)
			a[x]=result[x];
		return a;
	}

	public static void main(String[] args)
	{
		int [] a={1,2,3,4,5,6,7};
		int [] result=reOrderArray(a);
		for(int i:result)
		System.out.println(i);
	}
}
