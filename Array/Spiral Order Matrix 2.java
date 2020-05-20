public class Solution {
    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		ArrayList<Integer> t = new ArrayList<Integer>();

		for (int i = 0; i < A; i++) {
			t.add(0);
		}

		for (int i = 0; i < A; i++) {
			ans.add(new ArrayList<>(t));
		}

		int sr = 0, sc = 0, er = A - 1, ec = A - 1;

		int c = 1;

		while (c <= A * A) {

			for (int i = sc; i <= ec && c <= A * A; i++) {
				ans.get(sr).set(i, c++);
			}

			sr++;

			for (int i = sr; i <= er && c <= A * A; i++) {
				ans.get(i).set(ec, c++);
			}

			ec--;

			for (int i = ec; i >= sc && c <= A * A; i--) {
				ans.get(er).set(i, c++);
			}

			er--;

			for (int i = er; i >= sr && c <= A * A; i--) {
				ans.get(i).set(sc, c++);
			}

			sc++;

		}

		return ans;

	}
}
