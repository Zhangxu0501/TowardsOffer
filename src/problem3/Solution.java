package problem3;

public class Solution {
	public static boolean Find(int [][] array,int target) {
		boolean flag=false;
		int column_now=array[0].length-1;
		int row_now=0;
		while(row_now>=0&&column_now>=0&&row_now<array.length&&column_now<array[0].length)
		{
			if(target==array[row_now][column_now])
				return true;
			if(target<=array[row_now][column_now])
			{
				column_now-=1;
				continue;
			}
			if(target>array[row_now][column_now])
				row_now+=1;
		}
		return flag;
    }
	public static void main(String [] args)
	{
		int [] [] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(Find(a,-7));
	}
}
