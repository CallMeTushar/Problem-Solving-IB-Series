public class Solution {
   static class Pair {
		int val;
		int i;

		Pair(int v, int id) {
			val = v;
			i = id;
		}
	}

	public static ArrayList<Integer> flip(String str) {

		ArrayList<Integer> ans = new ArrayList<Integer>();

		int cs = 0, ms = Integer.MIN_VALUE;
		int anss = -1, anse = -1;
		int si = -1;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '0') {
				cs++;
				if (si == -1)
					si = i;
			}

			else {
				cs--;
			}

			if (cs > ms) {
				ms = cs;

				anss = si;
				anse = i;

			}

			if (cs < 0) {
				si = -1;
				cs = 0;
			}
		}

		if (anss != -1) {
			ans.add(anss + 1);
			ans.add(anse + 1);
		}

		return ans;
	}

}
