public class Solution {
   static int m = 1000003;

    public static int findRank(String str) {

        int[] fact = new int[str.length()+1];
        fact[0] = 1;

        int m = 1000003;

        for (int i = 1; i < fact.length; i++)
            fact[i] = (fact[i - 1] * (i % m)) % m;

        int ans = 0;

        for (int i = 0; i < str.length(); i++) {

            int c = 0;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) < str.charAt(i))
                    c++;
            }
            
            HashMap<Character,Integer>map=new HashMap<>();
            
            for(int k=i;k<str.length();k++) {
                map.put(str.charAt(k),map.getOrDefault(str.charAt(k), 0)+1);
            }
            
            long d=1;
            
            for(int val:map.values()) {
                d=(d*fact[val])%m;
            }
            

            ans = (int) ((ans + ((c * fact[str.length() - i - 1]) % m)*pow((int)d,m-2)%m) % m);
        }

        return (ans + 1) % m;

    }

    private static long pow(int x, int p) {

        if (p == 0)
            return 1;

        long temp = pow(x, p / 2);

        temp = (temp * temp) % m;

        if (p % 2 == 1) {
            temp = (temp * x) % m;
        }

        return temp;

    }
}
