package problem30未完成;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Solution
{
	public static void main(String[] args)
	{
		int [] input={1,2,3,4,5,6,7,8};
		
		System.out.println(GetLeastNumbers_Solution(input,8));
	}

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int start=0,end=input.length-1;
		int index=partation(input,start,end);
		k--;
		while(index!=k)
		{
			if(index>k)
			{
				end=index-1;
				index=partation(input,start,end);
			}
			if(index<k)
			{
				start=index+1;
				index=partation(input,start,end);
			}
		}
		for(int x=0;x<=index;x++)
			al.add(input[x]);
		
		return al;
	}
	public static int partation(int [] array,int start,int end)
	{
		int temp=array[start];
		int i=start;int j=end+1;
		while(true)
		{
			while(temp>array[++i])
			while(temp<array[--j]);
			//边界条件要处理好
			
			if(i>=j)
				break;
			swap(array,i,j);
		}
		swap(array,j,start);
		return j;
	}
	public static void swap(int []array,int x,int y)
	{
		int temp=array[x];
		array[x]=array[y];
		array[y]=temp;
	}
}
