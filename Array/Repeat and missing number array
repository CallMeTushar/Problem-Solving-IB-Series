public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> arr) {

		ArrayList<Integer> ans = new ArrayList<Integer>();

		long p = 0, q = 0;

				for (int i = 0; i < arr.size(); i++) {

			p += i + 1 - arr.get(i);

			long t1=(i+1);
			t1*=t1;
			
			long t2=arr.get(i);
			t2*=t2;
			
			q+=t1-t2;
			
		}

		long y = (p + (q / p)) / 2;
		long x = ((q / p) - p) / 2;

		ans.add((int) x);
		ans.add((int) y);

		return ans;
	}

}
