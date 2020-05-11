public class Solution {
    public int reverse(int n) {
    
    int ans = 0;
        boolean flag = false;

        if (n < 0) {
            n *= -1;
            flag = true;
        }

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;

            if (ans > Integer.MAX_VALUE / 10 && n > 0)
                return 0;

        }

        if (flag)
            ans *= -1;

        return ans;

        
    }
}
