package problem38;

public class Solution
{
	public static void main(String[] args)
	{
		int [] a={1,3,3,3,3,4,5};
		System.out.println(new Solution().GetNumberOfK(a, 2));
	}

	public int GetNumberOfK(int[] array, int k)
	{
		if(array.length==0||array==null)
			return 0;
		int start = findFirstk(array, k,0,array.length-1);
		int end = findLastk(array, k,0,array.length-1);
		if(start==-1)
			return 0;
		return end - start + 1;
	}

	public int findFirstk(int[] array, int k,int start,int end)
	{
		if(start==end&&array[start]==k)
			return start;
		if(start==end&&array[start]!=k)
			return -1;
		int mid=(start+end)/2;
		if(mid==start&&array[mid]==k)
			return 0;
		if(array[mid]==k&&array[mid]>array[mid-1])
			return mid;
		if(array[mid]>k||(array[mid]==k&&array[mid-1]==k))
		{
			end=mid-1;
			return findFirstk(array,k,start,end);
		}
		else
		{
			start=mid+1;
			return findFirstk(array,k,start,end);
		}
		
	}

	public int findLastk(int[] array, int k,int start,int end)
	{
		if(start==end&&array[start]==k)
			return start;
		if(start==end&&array[start]!=k)
			return -1;
		
		
		int mid=(start+end)/2;
		if(array[mid]==k&&array[mid+1]!=k)
			return mid;
		
		if(array[mid]<k||(array[mid]==k))
		{
			start=mid+1;
			if(array[mid+1]!=k)
				return mid;
			return findLastk(array,k,start,end);
		}
		else
		{
			end=mid-1;
			return findLastk(array,k,start,end);
		}
		
	}

}
