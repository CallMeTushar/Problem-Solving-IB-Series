public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> arr) {

        for (int i = 1; i < arr.size(); i++) {

            for (int j = 0; j < i; j++) {

                int t1 = arr.get(i).get(j);
                int t2 = arr.get(j).get(i);
                arr.get(i).set(j, t2);
                arr.get(j).set(i, t1);

            }

        }

        for (int i = 0; i < arr.size(); i++) {
            reverse(arr.get(i));
        }

    }

    public void reverse(ArrayList<Integer> arr) {

        int lo = 0, hi = arr.size() - 1;

        while (lo < hi) {

            int t1 = arr.get(lo);
            int t2 = arr.get(hi);
            arr.set(lo, t2);
            arr.set(hi, t1);

            lo++;
            hi--;

        }

    }
}
