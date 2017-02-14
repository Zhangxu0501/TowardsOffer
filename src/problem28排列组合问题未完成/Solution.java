package problem28排列组合问题未完成;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
	public static void main(String[] args)
	{
		String s ="12345";
		ArrayList<String> al =Permutation(s);
		for(String i:al)
			System.out.println(i);
	}

	public static ArrayList<String> Permutation(String str)
	{
		if (str == null)
			return null;
		ArrayList<String> al = new ArrayList<String>();
		char[] chararray = str.toCharArray();
		if (chararray.length == 0)
			return al;
		Arrays.sort(chararray);
		get(chararray, al, 0);
		return al;
	}

	public static void get(char [] chars,ArrayList<String> al,int now)
	{
		if(now>=chars.length-1)
			return;
		for(int i=now;i<chars.length-2;i++)
		{
			
			al.add(new String(chars));
			swap(chars,i+1,i+2);
			get(chars,al,now++);
			
		}
		
		
	}

	public static void swap(char [] chars,int i,int j)
	{
		char a = chars[i];
		chars[i]=chars[j];
		chars[j]=a;
	}
}
