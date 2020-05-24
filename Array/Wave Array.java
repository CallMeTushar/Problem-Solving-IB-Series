public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> arr) {

		Collections.sort(arr);

		for (int i = 0; i < arr.size() - 1; i += 2) {

			int t1 = arr.get(i);
			int t2 = arr.get(i + 1);

			arr.set(i, t2);
			arr.set(i + 1, t1);

		}

		return arr;

	}
}
