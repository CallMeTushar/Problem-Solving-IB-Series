public class Solution {
    public int findRank(String str) {

		int[] fact = new int[str.length()];
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

			ans = (ans + (c*fact[str.length() - i - 1]) % m) % m;
		}

		return (ans+1)%m;

	}


}
