public class Solution {
   
		public static ArrayList<Integer> maxset(ArrayList<Integer> arr) {

		long ms = Integer.MIN_VALUE;
		int si = -1, ei = -1;
		int li = 0;
		long cs = 0;

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i) >= 0) {
				cs += arr.get(i);
			}

			else {
				cs = 0;
				li = i + 1;
			}

			if (cs == ms) {

				if (i - li > ei - si) {
					si = li;
					ei = i;
				}

				else if (i - li == ei - si) {

					si = Math.min(si, li);
					ei = Math.min(ei, i);

				}

			}

			else if (cs > ms) {

				ms = cs;
				si = li;
				ei = i;
			}

		}

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = si; i <= ei && ei >= 0; i++) {
			ans.add(arr.get(i));
		}

		return ans;

	}
}
