/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
public static ArrayList<Interval> insert(ArrayList<Interval> arr, Interval ni) {

		ArrayList<Interval> ans = new ArrayList<>();

		if (arr.size() == 0) {
			ans.add(ni);
			return ans;
		}

		int i = 0;

		while (i < arr.size() && !containsLesser(ni, arr.get(i))) {
			ans.add(arr.get(i));
			i++;
		}

		// loop

		if (i < arr.size()) {

			int lo = Math.min(arr.get(i).start, ni.start);

			while (i < arr.size() && containsLesser(ni, arr.get(i)) && containsGreater(ni, arr.get(i))) {
				i++;
			}

			int hi;
			if (i > 0) {
				hi = Math.max(ni.end, arr.get(i - 1).end);
			}

			else {
				hi = ni.end;
			}

			ans.add(new Interval(lo, hi));

		}

		else {
			ans.add(ni);
		}

		while (i < arr.size()) {
			ans.add(arr.get(i));
			i++;
		}

		return ans;

	}

	public static boolean containsLesser(Interval ni, Interval oi) {

		// does oi contain ni

		if (oi.end < ni.start)
			return false;

		return true;

	}

	public static boolean containsGreater(Interval ni, Interval oi) {

		// does oi contain ni
		if (oi.start > ni.end)
			return false;

		return true;

	}
}
