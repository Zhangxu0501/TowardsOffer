package problem8;
//{3,4,5,1,2}为{1,2,3,4,5}

public class Solution {
	public static int minNumberInRotateArray(int [] array) {
	 int result=findmin(array,0,array.length-1);
	 return result;
    }
	public static int findmin(int [] array,int start,int end)
	{
		if(end<=0)
			return 0;
		if((end-start)==1)
			return array[end];
		int mid=(start+end)/2;
		if(array[start]==array[mid]&&array[start]==array[end])
			return find(array);
		if(array[mid]>=array[start]&&array[mid]>=array[end])
			return findmin(array,mid,end);
		if(array[mid]<=array[start]&&array[mid]<=array[end])
			return findmin(array,start,mid);
		return 0;
	}
	public static int find(int [] array)
	{
		int result=array[0];
		for(int x=0;x<array.length;x++)
		{
			if(result>array[x])
				result=array[x];
		}
		return result;
	}
	public static void main(String [] args)
	{
		int [] array={3,4,5,1,2,};
		
		System.out.println(minNumberInRotateArray(array));
	}
}
