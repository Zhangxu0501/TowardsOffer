package problem9;

public class Solution {
	public static int Fibonacci(int n) {
		int one = 0;
		int two = 1;
		int result = 0;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		for (int x = 0; x < n - 1; x++) {
			result = one + two;
			one = two;
			two = result;
		}
		return result;
	}

	public static int JumpFloor(int n) {
		int one = 1;
		int two = 2;
		int result = 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		for (int x = 0; x < n - 2; x++) {
			result = one + two;
			one = two;
			two = result;
		}
		return result;
	}

	public int JumpFloorII(int n) {
		int one = 1;
		int two = 2;
		int result = 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		return (int) Math.pow(2.0, (double) (n - 1));

	}

	public int RectCover(int n) {
		int one = 1;
		int two = 2;
		int result = 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		for (int x = 0; x < n - 2; x++) {
			result = one + two;
			one = two;
			two = result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
}
