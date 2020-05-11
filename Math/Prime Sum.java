public class Solution {
    public int[] primesum(int n) {
        
        int[]arr=new int[2];
        
        for(int i=2;i<=n/2;i++){
            if(isPrime(i) && isPrime(n-i)){
                arr[0]=i;
                arr[1]=n-i;
                return arr;
            }
        }
        
        return arr;
        
    }
    
    public boolean isPrime(int n) {

        if (n < 2)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;

    }
}
