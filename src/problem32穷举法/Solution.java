package problem32穷举法;


public class Solution {
	public static void main(String [] args)
	{
		System.out.println();
	}
	public int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
	while(n>0)
	{
		char [] chars=String.valueOf(n).toCharArray();
		for(int x=0;x<chars.length;x++)
		{
			if(chars[x]=='1')
				count++;
		}
		n=n-1;
	}
	return count;
    }
}
