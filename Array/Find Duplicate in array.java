public class Solution {
    // Duplicate always exists (Pigeon Hole Principle)
   public int repeatedNumber(final List<Integer> arr) {

		int slow = arr.get(0);
		int fast = arr.get(0);

		do {
			slow = arr.get(slow);
			fast = arr.get(arr.get(fast));
		} while (slow != fast);

		slow = arr.get(0);

		while (slow != fast) {
			slow = arr.get(slow);
			fast = arr.get(fast);
		}

		return slow;

	}
}
