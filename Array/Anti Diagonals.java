public class Solution {
     public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> arr) {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int j = 0; j < arr.get(0).size(); j++) {

			int cr = 0, cc = j;

			ArrayList<Integer> temp = new ArrayList<Integer>();

			while (cr < arr.size() && cc >= 0) {
				temp.add(arr.get(cr++).get(cc--));
			}

			ans.add(temp);

		}
		
		for (int i = 1; i < arr.size(); i++) {

			int cr = i, cc = arr.get(0).size()-1;

			ArrayList<Integer> temp = new ArrayList<Integer>();

			while (cr < arr.size() && cc >= 0) {
				temp.add(arr.get(cr++).get(cc--));
			}

			ans.add(temp);

		}

		

		return ans;

	}
}
