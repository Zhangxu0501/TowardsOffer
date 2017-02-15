package problem33;

import java.util.Comparator;

public class Solution
{
	public static void main(String[] args)
	{
		
		int [] a={3,32,321};
		System.out.println(PrintMinNumber(a));
	}

	public static String PrintMinNumber(int[] numbers)
	{
		if(numbers==null)
			return null;
		if(numbers.length==0)
			return "";
		quicksort(numbers,0,numbers.length-1);
		String s="";
		for(int x=0;x<numbers.length;x++)
			s+=String.valueOf(numbers[x]);
		return s;
	}
	public static void quicksort(int [] numbers,int start,int end)
	{
		if(start>=end)
			return;
		int j=part(numbers,start,end);
		quicksort(numbers,start,j-1);
		quicksort(numbers,j+1,end);
		
	}
	public static int part(int [] numbers,int start,int end)
	{
		int k=numbers[start];
		int i=start;
		int j=end+1;
		while(true)
		{
			while(compareto(k,numbers[++i])>0&&i<end);
			while(compareto(k,numbers[--j])<0&&j>start);
			if(i>=j)
				break;
			swap(numbers,i,j);
		}
		swap(numbers,start,j);
		return j;
	}
	public static void swap(int []  numbers,int i,int j)
	{
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}
	public static int compareto(int i,int j)
	{
		String a=String.valueOf(i);
		String b=String.valueOf(j);
		char [] c=(a+b).toCharArray();
		char [] d=(b+a).toCharArray();
		for(int x=0;x<c.length;x++)
			if(c[x]>d[x])
				return 1;
			else if(c[x]<d[x])
				return -1;
		return 0;
	}
}
