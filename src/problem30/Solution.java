package problem30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Solution
{
	public static void main(String[] args)
	{
		int[] input =
		{ 4, 5, 1, 6, 2, 7, 3, 8 };

		System.out.println(GetLeastNumbers_Solution(input, 8));
	}

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		if (input == null)
			return null;
		if (input.length == 0||k>input.length)
			return al;

		Arrays.sort(input);
		for (int x = 0; x < k; x++)
			al.add(input[x]);
		return al;


	}

	
}
