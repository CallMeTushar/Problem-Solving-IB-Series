public class Solution {
  public static int[] plusOne(int[] arr) {

        int j = 0;

        while (j < arr.length && arr[j] == 0) {
            j++;
        }

        int c = 1;

        for (int i = arr.length - 1; i >= j; i--) {
            arr[i] += c;
            c = arr[i] / 10;
            arr[i] %= 10;
        }

        int size = arr.length - j;

        if (c > 0)
            size++;

        int[] ans = new int[size];

        int p = arr.length - 1;
        int q = ans.length - 1;

        while (p >= j && q >= 0) {
            ans[q--] = arr[p--];
        }

        if (c > 0) {
            ans[0] = c;
        }

        return ans;

    }
}
