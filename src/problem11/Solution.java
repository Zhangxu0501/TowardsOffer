package problem11;

public class Solution
{
	public static double Power(double base, int exponent)
	{
		double result = 0.0;
		if (Math.abs(base - 0.0) <= 0.000001)
			return 0.0;
		if (exponent == 0)
			return 1.0;
		if (exponent > 0)
		{
			result = base;
			for (int x = 0; x < exponent - 1; x++)
			{
				result *= base;
			}
		}
		else
		{
			exponent = -exponent;
			result = base;
			for (int x = 0; x < exponent - 1; x++)
			{
				result *= base;
			}
			result = 1 / result;

		}
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println(Power(-2.0, 3));
	}
}
