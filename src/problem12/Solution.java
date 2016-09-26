package problem12;

public class Solution
{
	public static void printMaxN(int n)
	{
		char[] number = new char[n];
		char [] test=new char[n];
		for (int x = 0; x < n; x++)
		{
			number[x] = '0';
			test[x]='9';
		}
		while(addOne(number,n))
		{
			print(number);
		}
	}

	public static boolean addOne(char [] number,int n)
	{
		for(int x=0;x<n;x++)
		{
		number[n-x-1]=(char)(number[n-x-1]+1);
		if(number[n-x-1]>'9')
		{
			number[n-x-1]='0';
			if(x==n-1)
				return false;
		}
		else
			break;
		}
		return true;
	}
	

	public static void print(char[] number)
	{
		int flag = 0;
		for (int x = 0; x < number.length; x++)
		{
			if(x==number.length-1)
			{
				flag=x;
				break;
			}
				
			if (number[x] != '0')
			{
				flag = x;
				break;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int x = flag; x < number.length; x++)
		{
			sb.append(number[x]);
		}
		System.out.println(sb);
	}

	public static void main(String[] args)
	{
		// printMaxN(10);
		 char [] a={'0','0','0','0','0','0','0','0','0','0'};
		 printMaxN(10);
	}
}
