public class Solution {
    public int coverPoints(int[] x, int[] y) {

        if (x.length == 0)
            return 0;

        int r = x[0];
        int c = y[0];

        int ans = 0;

        for (int i = 1; i < x.length; i++) {

            ans += Math.max(Math.abs(x[i] - r), Math.abs(y[i] - c));
            r = x[i];
            c = y[i];

        }

        return ans;

    }
}
