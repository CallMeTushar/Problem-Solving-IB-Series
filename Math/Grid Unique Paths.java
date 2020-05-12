public class Solution {
   public static int uniquePaths(int m, int n) {

		if (n == 0)
			return 0;

		int[] arr = new int[n];
		Arrays.fill(arr, 1);

		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--)
				arr[j] += arr[j + 1];

		}

		return arr[0];
	}
}
